var uk ="_uk_",pk="_pk_",rk="_rk_";
$(function(){
	layui.use("layer");
	$("#loginname").focus();
	$("#loginname").val($.localStorage.get(uk));
	$("#password").val($.localStorage.get(pk));
	if($.localStorage.get(rk)){
		$("#rememberPwd").attr("checked",true);
	}
	    /** 按了回车键 */
   $(document).keydown(function(event){
	   if(event.keyCode == 13){
		   $("#login-submit-btn").trigger("click");
	   }
   })

   /** 给登录按钮绑定点击事件  */
   $("#login-submit-btn").on("click",function(){
	   console.log("aaa");
	   /** 校验登录参数 ctrl+K */
	   var loginname = $("#loginname").val();
	   var password = $("#password").val();
	   
	   var msg = "";
	   
	   if(!/^\w{4,20}$/.test(loginname)){
		     msg = "登录名长度必须是6~20之间";
	   }else if(!/^\w{4,20}$/.test(password)){
		     msg = "密码长度必须是6~20之间";
	   }
	   if(msg !=""){
		   $("#tishi").html(msg);
		   return;
	   }
	   
	   if( $("#rememberPwd").is(':checked')){
	   	$.localStorage.set(uk, loginname);
	   	$.localStorage.set(pk, password);
	   	$.localStorage.set(rk, true);
	   }else{
	   	$.localStorage.remove(uk);
	   	$.localStorage.remove(pk);
	   	$.localStorage.remove(rk);
	   }
	   $.ajax({
           url:"/user/login",
           data:{
        	   loginname:loginname
        	   ,password:password
        	   },
           async:true,
           cache:false,
           type:"POST",
           success:function(result){
        	  // alert(result);
        	 // console.log(result);
              /* alert(result.name+result.passwd);*/
               if(result){
            	   console.log(result);
                   console.log('true');
                   window.location.replace("main.html?id="+result.id+"&loginname="+result.loginname+"&password="+result.password);
                   
                   //window.location.href="http://localhost:8080/user/loginforward";
                   //$("#welcomeUser").html("欢迎登陆："+loginname);
               }else{
            	   $("#tishi").html("用户名或密码错误");
            	   window.location.reload();
                   return false;
               }
           }
	   });
	   
	   
		   
   })
	   
})
