<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
</head>
<style>
a{
	text-decoration: none;
}</style>
<link rel="stylesheet" href="css/main.css" />
<body>
<div id="login-container">
			<div class="ibg-bg index-banner-0"></div>
			<div class="header-container">
				<div id="login-header">
					<div class="logo">
						<a class="yun-logo" href="#" target="_blank" title="百度网盘">百度网盘</a>
						<a class="pan-logo" href="#" title="网盘">网盘</a>
					</div>
					<span class="login-title">
<a class="b-no-ln" href="#" id="top_menu_other" target="_blank"></a>
<span id="departForAd"></span>
					<a class="b-no-ln" hidefocus="true" href="#" target="_blank">百度首页</a>
					<a class="b-no-ln" hidefocus="true" href="#" id="loginHeadDlink" target="_blank">客户端下载</a>
					<a class="b-no-ln" hidefocus="true" href="#" target="_blank">官方贴吧</a>
					<a class="b-no-ln" hidefocus="true" href="#" target="_blank">官方微博</a>
					<a class="b-no-ln" hidefocus="true" href="#" target="_blank">问题反馈</a>
					<a class="b-no-ln center-entry" hidefocus="true" href="#" target="_blank">会员中心</a>
					</span>
				</div>
			</div>
			<div class="login-main" style="height: 393px;width: 353px; background: white;  margin-left: 850px; margin-top: 70px;">
				<h2 style="font-size: 20px; text-align: center; padding: 30px 0 12px 0; font-weight: 100;color: #333;background: 0;margin-left: 0;">帐号密码登录</h2>
				<form action="UsersServlet?method=denglu" method="post" style="margin-top: 40px; line-height: 20px;">
					
					<input type="text" name="userName" style="height: 37px; width: 247px; margin-left: 50px;" placeholder="手机/邮箱/用户名" /><br /><br />
					<input type="password" name="password" style="height: 37px; width: 247px; margin-left: 50px;" placeholder="QQ密码" /><br /><br />
					<input type="checkbox" style="margin-left: 50px;" />下次自动登录
					
					<input type="submit" value="登&nbsp;录" style="border: 0; height: 43px; width: 247px; background-color: #3582f8; margin-left: 51px; margin-top: 20px;  color: #EFF4FA;" /><br />
				</form>
			</div>
			
			<div class="login-sdk-v4">
				<div class="loginmain">

				</div>
				<div id="login-middle">
				</div>

			</div>
		</div>
		</div>
		<img src="img/icon.png"style="margin-left: 190px;"/>
		<div class="footer">
			<div>©2018 Baidu
				<a class="b-lnk-gy" href="#" target="_blank">移动开放平台</a> |
				<a class="b-lnk-gy" href="#" target="_blank">服务协议</a> |
				<a class="b-lnk-gy" href="#" target="_blank">权利声明</a> |
				<a class="b-lnk-gy" href="#" target="_blank">版本更新</a> |
				<a class="b-lnk-gy" href="#" target="_blank">帮助中心</a> |
				<a class="b-lnk-gy" href="#" target="_blank">版权投诉</a>
			</div>
		</div>
		<div class="canvas-bg hidden"></div>
		<div style="height:0;width:0"><span class="index-banner-1"></span><span class="index-banner-2"></span><span class="index-banner-3"></span></div>

</body>
</html>