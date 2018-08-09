<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>注册百度账号</title>
		<link rel="stylesheet" href="css/bootstrap.css" /> 
		<link rel="stylesheet" href="css/register.css" />
	</head>
	
	<body>
		<div class="container  modal-body con-width">
			<div class="row">
				<div class="col-md-6 col-sm-6 col-xs-6 col-lg-6">
					<div  class="flex"> 
						<div><img src="img/baidu.gif"></div> 
						<div class="left-x"></div>
						<div class="register-text"><h4>注册百度账号</h4></div>
					</div>
				</div> 
				<div class="col-md-6 col-sm-6 col-xs-6 col-lg-6 login-left"> 
					<div class="text-muted">我已注册，现在就 <button class="btn login-btn"><a href="login.html">登陆</a></button></div>
				</div>  
			</div> 
			<div class="bottom-x"><img src="img/border-bottom.png.png"></div>
			<!-- 注册 -->
			<div class="m-30">
				<div class="col-md-6 col-sm-6 col-lg-6 col-xs-6">   
					<form class="form-horizontal" action="UsersServlet?method=zhuce" method="post">
						<div class="form-group">
						    <label for="inputPassword1" class="col-sm-2 control-label">手机号</label>
						    <div class="col-sm-6 col-md-6 col-lg-6">
						      <input name="userName" type="text" class="form-control" id="inputPassword1" placeholder="可用于登陆和找回密码"/>
						    </div>
						</div>
						<div class="form-group">
						    <label for="inputPassword2" class="col-sm-2 control-label">昵称</label>
						    <div class="col-sm-6 col-md-6 col-lg-6">
						      <input name="nickName" type="text" class="form-control" id="inputPassword2" placeholder="请设置用户名"/>
						    </div>
						</div>
						<div class="form-group">
						    <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
						    <div class="col-sm-6 col-md-6 col-lg-6">
						      <input name="password" type="password" class="form-control" id="inputPassword3" placeholder="请设置登录密码"/>
						    </div>
						</div> 
						<div class="form-group">
						    <label for="inputPassword4" class="col-sm-2 control-label">验证码</label>
						    <div class="col-sm-4 col-md-4 col-lg-4">
						      <input type="text"  class="form-control"  id="inputPassword4" placeholder="请输入验证码" />
						    </div>
						   	<button class="btn btn-default login-width">获取短信验证码</button>
						</div> 
						 <div class="checkbox">
						    <label>
						        <input type="checkbox">阅读并接受<a href="#">《百度用户协议》</a>及<a href="#">《百度隐私权保护声明》</a>
						    </label>
	    				</div>
	    				<input type="submit" value="注册" class="but-register">
					</form>
				</div>
				<div class="col-md-6 col-sm-6 col-lg-6 col-xs-6 col-md-offset-3 phone-box">
					<div class="phone-logo">
						<div><span class="glyphicon glyphicon-phone"></span> </div>
						<div><span class="reg-sms-title">手机快速注册</span></div> 
					</div>
					<div class="k-b-x"></div>
					<div class="num-box">
						<p class="m-20">请使用中国大陆手机号，编辑短信：<br/><span class="text-num">6-14位字符（支持数字/字母/符号）</span></p> 
						<p></p> 
						<br/>
						<p>作为登录密码，发送至:<br/><span class="text-num">1069 0691 036590</span><br/>即可注册成功，手机号即为登录帐号。</p> 
						<br/>
						<p class="er-img"><img src="img/upreg.png" width="168"><br/>请使用手机百度进行扫码</p> 
					</div>
				</div>
			</div> 
		</div>  
		<div class="blue">2018 ©Baidu</div>
		<script type="text/javascript" src="../jquery-3.2.1.min.js" ></script>
		<script>
			 $(function(){
			 	<!-- $(function(){
				 	$(".but-register").on("click",function(){
				 		location.href="login.jsp";
				 	});
				 });-->
			 	$(".phone-input input").focus("click",function(){
			 		$(this).css("border","1px solid blue");
			 	});
			 	$(".phone-input input").blur("click",function(){
			 		$(".phone-input input").css("border","1px solid #ddd");
			 	});
			 });
		</script>
	</body>
</html>