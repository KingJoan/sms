package com.clps.sms.util.file;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.log4j.Logger;

/**
 * 
 * @author Luffy.yang
 *
 * 2017年8月22日 上午8:55:28
 * 
 * @since 1.0
 */
public class FileUtil {
	static Logger logger=Logger.getLogger(FileUtil.class);

	/**
	 * 文件上传
	 * 
	 * @param request  	HttpServletRequest
	 * @param path			保存文件夹
	 * @return					true：成功        false ：失败
	 */
	public static boolean upload(HttpServletRequest request, String path) {
		// 获得磁盘文件条目工厂
		DiskFileItemFactory factory = new DiskFileItemFactory();
		// 获取文件需要上传到的路径
		// String path = request.getRealPath("/upload");
		logger.info("上传路径："+path);
		// 如果没以下两行设置的话，上传大的 文件 会占用 很多内存，
		// 设置暂时存放的 存储室 , 这个存储室，可以和 最终存储文件 的目录不同
		/**
		 * 原理 它是先存到 暂时存储室，然后在真正写到 对应目录的硬盘上， 按理来说 当上传一个文件时，其实是上传了两份，第一个是以 .tem
		 * 格式的 然后再将其真正写到 对应目录的硬盘上
		 */
		factory.setRepository(new File(path));
		// 设置 缓存的大小，当上传文件的容量超过该缓存时，直接放到 暂时存储室
		factory.setSizeThreshold(1024 * 1024);

		// 高水平的API文件上传处理
		ServletFileUpload upload = new ServletFileUpload(factory);
		try {
			// 可以上传多个文件
			List<FileItem> list = (List<FileItem>) upload.parseRequest(request);
			System.out.println("上传文件数： "+list.size());
			for (FileItem item : list) {
				// 获取表单的属性名字
				String name = item.getFieldName();
				// 如果获取的 表单信息是普通的 文本 信息
				if (item.isFormField()) {
					System.out.println("item.isFormField()");
					// 获取用户具体输入的字符串 ，名字起得挺好，因为表单提交过来的是 字符串类型的
					String value = item.getString();

					request.setAttribute(name, value);
					logger.info("普通的 文本 信息");
				}
				// 对传入的非 简单的字符串进行处理 ，比如说二进制的 图片，电影这些
				else {
					/**
					 * 以下三步，主要获取 上传文件的名字
					 */
					System.out.println(4);
					// 获取路径名
					String value = item.getName();
					// 索引到最后一个反斜杠
					int start = value.lastIndexOf("\\");
					// 截取 上传文件的 字符串名字，加1是 去掉反斜杠，
					String filename = value.substring(start + 1);

					request.setAttribute(name, filename);

					// 真正写到磁盘上
					// 它抛出的异常 用exception 捕捉

					// item.write( new File(path,filename) );//第三方提供的

					// 手动写的
					OutputStream out = new FileOutputStream(new File(path, filename));

					InputStream in = item.getInputStream();

					int length = 0;
					byte[] buf = new byte[1024];

					logger.info("获取上传文件的总共的容量：" + item.getSize());

					// in.read(buf) 每次读到的数据存放在 buf 数组中
					while ((length = in.read(buf)) != -1) {
						// 在 buf 数组中 取出数据 写到 （输出流）磁盘上
						out.write(buf, 0, length);

					}
					logger.info("上传文件成功");
					in.close();
					out.close();
					return true;
				}
			}

		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.info("上传文件失败");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.info("上传文件失败");
		}
		return false;
	}

	/**
	 * 下载文件
	 * 
	 * @param response
	 *            HttpServletResponse
	 * @param filepath
	 *            文件路径
	 */
	public static void download(HttpServletResponse response, String filepath) {
		File file = new File(filepath);
		if (file.exists()) {
			FileInputStream fis = null;
			ServletOutputStream out = null;
			try {
				fis = new FileInputStream(file);
				String filename = URLEncoder.encode(file.getName(), "utf-8"); // 解决中文文件名下载后乱码的问题
				byte[] b = new byte[fis.available()];
				fis.read(b);
				response.setCharacterEncoding("utf-8");
				response.setHeader("Content-Disposition", "attachment; filename=" + filename);
				// 获取响应报文输出流对象
				out = response.getOutputStream();
				// 输出
				out.write(b);

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				// TODO: handle exception
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					out.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * 
	 * @param filepath 欲复制文件路径
	 * @param folder	目的文件夹
	 * @return				true：success		false：failed
	 */
	public boolean copyFile(String filepath,String folder){
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			File file=new File(filepath);
			if(!file.exists()){
				return false;
			}
			File folderFile = new File(folder);
			if(!folderFile.exists()){
				folderFile.mkdir();
			}
			File outFile = new File(folderFile,file.getName());
			fis = new FileInputStream(file);
			fos = new FileOutputStream(outFile);
			int data = fis.read();
			while(data != -1){
				fos.write(data);
				data = fis.read();
			}
			fos.flush();
			
			return true;
			
		} catch (FileNotFoundException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
		}finally {
			try{
				if(fis!=null){
					fis.close();
				}
			}catch(IOException ie){
				ie.printStackTrace();
			}
			try{
				if(fos!=null){
					fos.close();	
				}
			}catch(IOException ie){
				ie.printStackTrace();
			}
		}
		return false;
	}
	
	
	/**
	 * 获取文件名前缀
	 * @param fileName
	 * @return
	 */
	public static String getFileNamePrefix(String fileName){
		int num=getFileNameSuffix( fileName ).length();
		String fileNamePrefix= fileName.substring(0, fileName.length()-num-1);
		return fileNamePrefix;
	}
	
	/**
	 * 获取文件名后缀
	 * @param fileName
	 * @return
	 */
	public static String getFileNameSuffix(String fileName){
		return fileName.substring(fileName.lastIndexOf(".")+1);
	}
	
	

	public static void fileProcess(Part part) throws IOException {
		System.out.println("part.getName(): " + part.getName());

		if (part.getName().equals("fileUploader")) {
			String cd = part.getHeader("Content-Disposition");
			String[] cds = cd.split(";");
			String filename = cds[2].substring(cds[2].indexOf("=") + 1).substring(cds[2].lastIndexOf("//") + 1)
					.replace("\"", "");
			String ext = filename.substring(filename.lastIndexOf(".") + 1);

			System.out.println("filename:" + filename);
			System.out.println("ext:" + ext);

			InputStream is = part.getInputStream();

			if (Arrays.binarySearch(ImageIO.getReaderFormatNames(), ext) >= 0)
				imageProcess(filename, ext, is);
			else {
				commonFileProcess(filename, is);
			}

		}
	}

	public static void commonFileProcess(String filename, InputStream is) {
		FileOutputStream fos = null;
		try {
			String path = FileUtil.class.getResource("/").getPath() + filename;
			System.out.println("路径" + path);
			fos = new FileOutputStream(new File("e://upload/" + filename));
			int b = 0;
			while ((b = is.read()) != -1) {
				fos.write(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void imageProcess(String filename, String ext, InputStream is) throws IOException {
		Iterator<ImageReader> irs = ImageIO.getImageReadersByFormatName(ext);
		ImageReader ir = irs.hasNext() ? irs.next() : null;
		if (ir == null)
			return;
		ir.setInput(ImageIO.createImageInputStream(is));// 必须转换为ImageInputStream，否则异常

		ImageReadParam rp = ir.getDefaultReadParam();
		Rectangle rect = new Rectangle(0, 0, 200, 200);
		rp.setSourceRegion(rect);

		int imageNum = ir.getNumImages(true);// allowSearch必须为true，否则有些图片格式imageNum为-1。

		System.out.println("imageNum:" + imageNum);

		for (int imageIndex = 0; imageIndex < imageNum; imageIndex++) {
			BufferedImage bi = ir.read(imageIndex, rp);
			ImageIO.write(bi, ext, new File("e://upload/" + filename));
		}
	}
}
