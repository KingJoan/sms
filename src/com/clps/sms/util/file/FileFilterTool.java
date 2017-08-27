package com.clps.sms.util.file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

public class FileFilterTool implements FilenameFilter{
	
	List<String> types;
	
	protected FileFilterTool() {
		// TODO Auto-generated constructor stub
		types=new ArrayList<>();
	}
	
	protected FileFilterTool(List<String> types){
		super();
		this.types=types;
	}
	
//	List<String> types;  
//	  
//	    protected FileFilterTool() {  
//	        types = new ArrayList<String>();  
//	    }  
//	  
//	    protected FileFilterTool(List<String> types) {  
//	        super();  
//	        this.types = types;  
//	    }  
	
	
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
