$(document).ready(function(){
	check();

 	$('#username').blur(function(){
  		check();
  	});
  	$('#password').blur(function(){
  		check();
  	});
})

function check(){
//	if($('#username').val().trim()==""){
//			$('#username').css("border-color","#EE0000");
//	}else{
//		$('#username').css("border-color","#00EE00");
//	}
//	
//	if($('#password').val().trim()==""){
//		$('#password').css("border-color","#EE0000");
//	}else{
//		$('#password').css("border-color","#00EE00");
//	}
	
	if($('#username').val().trim()=="" ||$('#password').val().trim()==""){
		$('#loginButton').attr("disabled","true");
		
	}else{
		$('#loginButton').removeAttr("disabled");
	}
}
