<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="/goodsSys/"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title> 注册 </title>
  <meta name="generator" content="editplus" />
  <meta name="author" content="" />
  <meta name="keywords" content="" />
  <meta name="description" content="" />
  <style type="text/css">
		body{
			margin:0;
			padding:0;
		}
		a{text-decoration:none;}

		#header{
			height:60px;
			padding:30px 0 10px 0;
			border-bottom:0px solid #339933;
		}
		#logo{
			width:960px;
			margin:0 auto;
		}
		
		#logo_sou{
			float:left;
		}
		#logo_sou dl{
			
			padding:0;margin:0;
		}
		#logo_sou dd{
			line-height:20px;
			margin-left:-120px;
		}
		#logo_sou dd h2{
			margin:7px;
		}
		.mbb{
			margin-right:150px;
			float:left;
		}
		.gou{
			padding-top:5px;
			float:right:
			margin-right:20px;
			width:350px;
			float:right;
			padding-top:10px;
		}
		img{border:0;}
		/*菜单*/
		#menu{
			background:#f53810;
			line-height:35px;
			clear:both;
			border:0px solid #000;
		}
		.nav{
			margin:0 auto;
			width:960px;
		}
		.nav ul{
			margin:0;
			padding:0;
			list-style:none;
		}
		.nav li{
			float:left;
			text-align:center;
			
		}
		.nav a{
			display:block;
			padding:0 20px;
			color:#fff;
			text-decoration:none;
		}
		.nav a:hover{
			background:#b5442d;
			
		}
		/*商品列表部分*/
		#container{
			margin:0 auto;
			width:960px;
			padding:20px;
		}
		#container .detail{
			margin-top:30px;
			
		}
		#container .img{
			width:479px;
			float:left;
			height:500px;
		}
		#container .info{
			display:inline;
			float:left;
			width:478px;
			height:400px;
			border:1px solid #8e8e8e;
			background:#efefef;

			
		}

		.info ul{
			
			margin:60px 0;
			list-style:none;

		}

		.info li{
			height:30px;
		}
		
		.info .title{
			display:inline-block;
			width:120px;
			text-align:right;
			padding-right:20px;
		}

		.info .input input{
			line-height:20px;
			height:20px;
			width:200px;
		}
		.info .msdl{
			padding:8px 10px;
			background:#ff3300;
			color:#fff;
		}

		/*页面底部 */
		#footer{
			clear:both;
			width:960px;
			margin:20px auto;
		}

  </style>
 </head>

 <body>
  <!-- 头部logo -->
  <div id="header" class="">
	<div id="logo" class="">
		<div id="" class="mbb">
			<img src="images/logo.png" alt="" />
		</div>
		<div id="logo_sou" class="">
			
		</div>
		
	</div>
  </div>
  <!-- 导航菜单 -->
  <div id="menu" class="">
	<div id="" class="nav">
		<ul>
			<li><a href="GoodsServlet?method=select">首页</a></li>
			<li><a href="CustomersServlet?method=select">登陆</a></li>
			<li><a href="goods-register.jsp">注册</a></li>
		</ul>
		<div style="clear:both"></div>
	</div>
  </div>
  <!-- 显示商品详情 -->
  <div id="container" class="">
	<div id="" class="detail">
		<div id="" class="img">
			<img src="images/11010401_01_m.jpg" />
		</div>
		<div id="" class="info">
			<form method="post" action="CustomersServlet?method=doinser">
				<ul>
					<li>
						<span class="title">用户名</span>
						<span class="input">
							<input type="text" id="name" name="userName"/>
						</span>
					</li>
					<li></li>
					<li>
						<span class="title">设置密码</span>
						<span class="input">
							<input type="password" id="pass" name="userPass"/>
						</span>
					</li>
					<li></li>
					<li>
						<span class="title">确认密码</span>
						<span class="input">
							<input type="password" id="pass2" name="userPass2" />
						</span>
					</li>
					<li></li>
					<li>
						<span class="title"></span>
						<span class="input">
							<a  class="msdl">马上注册</a>
						</span>
					</li>
				</ul>
			</form>
		</div>
	</div>
  </div>
   <!-- 页面底部 -->
  <div id="footer" class="">
	<img src="images/footer.PNG" width="960" height="162" alt="" />
  </div>
  <script type="text/javascript" src="jquery-1.12.4.js"></script>
  <script type="text/javascript">
  		$(function(){
			$(".msdl").click(function() {
				var yhm=$("[name=userName]").val();
				var mima=$("[name=userPass]").val();
				var mima2=$("[name=userPass2]").val();
				if(yhm=="" || mima==""  || mima2=="" ){
					alert("请输入内容");
						return false;
				}else if(mima!=mima2){
						alert("两次密码不对！！");
						return false;
					}else if(mima.length<6){
				alert("密码不能少于6位");
					}
				else{
					
					location.href="CustomersServlet?method=doinsert&userName="+yhm+"&userPass="+mima;
					
				}
			})
		})
  
  </script>
 </body>
</html>