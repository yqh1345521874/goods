<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="/BaiDuyun/">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
   <link href="css/bootstrap.min.css" rel="stylesheet">
<style>
	body {
				background-color: #EFF4F8;
				width: 100%;
				height: 100%;
				overflow: hidden;
			}
			
			.undeline {
				padding: 20px 0 0 0;
			}
			
			.img {
				padding: 20px;
			}
			
			.active2 {
				padding: 0 0 10px 0;
				border-bottom: 4px solid blue;
			}
			
			.left {
				padding: 20px 0 0 350px;
			}
			
			.a_one {
				color: red;
				text-decoration: underline;
				font-size: 13px;
			}
			
			.tyeo {
				border: 1px solid gray;
				border-radius: 50%;
				padding: 5px;
				background-color: #2AABD2;
				color: white;
				font-size: 20px;
			}
			
			.size {
				font-size: 13px;
				color: dimgray;
			}
			
			.VIP {
				color: white;
				padding: 5px;
				border-radius: 15px;
				background-color: red;
				opacity: 0.7;
				margin-left: 20px;
			}
			.down{
				width: 70%;
				margin: 10px auto;
				height: 585px;
				
				display: flex;
				justify-content: space-between;
			}
			.left_1{
				width: 30%;
				
			}
			.right_1{
				width: 69%;
			}
			.down>div{
				height: 585px;
				background-color: white;
				border: 1px solid gainsboro;
				border-radius:5px ;
				}
	.ul_1{
		margin: 10px auto;
		padding-left: 30px;
		border-right:2px solid gainsboro ;
		width: 150px;
	}
	.ul_2{
		margin: 10px auto;
		padding-left: 30px;
	}
	.left_top{
		border-bottom: 1px solid gainsboro;
	}
	.huihua_img{
		width: 40px;
		height: 40px;
	}
	.huihua{
		border: 1px solid gainsboro;
		padding: 10px;
	}
	.huihua:hover{
		background-color: #B9DEF0;
	}
	.left_down{
		background-color: ghostwhite;
		height: 50px;
		width: 285px;
		position: fixed;
		top: 615px;
		line-height: 50px;
	}
	.rigth_top{
		height: 60px;
		background-color: beige;
		margin-top: -10px;
		
	}
	.rigth_top>h4{
		line-height: 60px;
		padding-left: 300px;
	}
	.chuangjianTime{
		padding:20px 0 0 300px ;
		opacity: 0.8;
	}
	.jilu{
		border: 1px solid red;
		height: 150px;
	}
	#rigth_reirong{
		overflow: auto;
		height: 470px;
	}
	.rigth_down{
		position: fixed;
		top: 615px;
		background-color: ghostwhite;
		height: 50px;
		width: 658px;
		padding: 10px;
	}
	.input{
		border: 1px solid gainsboro;
		border-radius: 3px;
		height: 30px;
		outline: none;
		width: 450px;
	}
	.addfriend{
		background-color:#f2f6fd;
		height: 40px;
		border-radius: 4px;
		line-height: 40px;
		padding-left: 10px;
	}
	.add{
		height: 300px;
		border-radius: 4px;
	}
	.number{
		padding:20px 0 0 40px ;
	}
	.inputNum{
		width: 400px;
		height: 35px;
		border-radius: 3px;
		outline: none;
		border: 1px solid gainsboro;
	}
	.serand{
		margin-left: 40px;
		margin-top: 20px;
	}
	.yesAdd{
		margin-left: 250px;
		margin-top: 100px;
	}
	.info{
		padding: 10px 0 0 40px;
	}
	.fen{
		height: 400px;
		overflow: auto;
	}
	.fen_top{
		background-color:#f2f6fd;
		height: 50px;
		padding-left: 20px;
		line-height: 50px;
		border-radius: 4px;
	}
	.fen_top_info{
		margin-bottom: 10px;
		padding-left: 20px;
	}
	.fen_info{
		padding-left: 20px;
		padding-bottom: 10px;
		border-bottom: 1px solid gainsboro;
		
	}
	.fen_size{
		padding-left: 230px;
	}
	.fen_time{
		padding-left: 50px;
	}
	.fen_down{
		position: fixed;
		top: 340px;
		height: 50px;
		border-top: 1px solid gray;
		width: 100%;
		line-height: 50px;
	}
	.fen_down button{
		margin-left: 500px;
		}
</style>
  </head>
  <body>
    <div>
    	<div class="row">
				<div class="col-lg-2"><img src="img/logo2.png" class="img" /></div>
				<div class="col-lg-2">
					<h4 class="col-lg-4 undeline"><a href="#"><span>网盘</span></a></h4>
					<h4 class="col-lg-4 undeline"><span class="active2">分享</span></h4>
					<h4 class="col-lg-4 undeline"><span>更多</span></h4>
				</div>
				<div class="col-lg-8 left">
					<a href="" class="a_one">超级会员 超低价</a>
					&nbsp;&nbsp;
					<span class="glyphicon glyphicon-user tyeo" aria-hidden="true"></span> &nbsp;
					<span><%=session.getAttribute("nickName") %></span> &nbsp;
					<span class="size">退出</span> &nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
					<a href="" class="size">客户端下载</a>
					&nbsp;&nbsp;
					<img src="img/top.PNG" />
					<a href="#" class="size VIP">会员中心</a>
				</div>
			</div>
			<div class="down">
				<div class="left_1">
					<div class="row">
						<div class="col-lg-6">
							<ul class="media-list ul_1">
							  <li class="media">
							    <div class="media-left">
							      <a href="#">
							        <img class="media-object" src="img/huihua.PNG" alt="...">
							      </a>
							    </div>
							    <div class="media-body">
							      <h4 class="media-heading">会话</h4>
							    </div>
							  </li>
							</ul>
						</div>
						<div class="col-lg-6">
							<ul class="media-list ul_2">
							  <li class="media">
							    <div class="media-left">
							      <a href="#">
							        <img class="media-object" src="img/haoyou.PNG" alt="...">
							      </a>
							    </div>
							    <div class="media-body">
							      <h4 class="media-heading">好友</h4>
							    </div>
							  </li>
							</ul>
						</div>
					</div>
					<div>
						<ul class="media-list huihua">
						<c:forEach items="${slist}" var="s">
						  <li class="media">
						    <div class="media-left">
						      <a href="#">
						        <img class="media-object" src="img/ec4128d0.jpg" height="40">
						      </a>
						    </div>
						    <div class="media-body">
						      <h4 class="media-heading">${s.receiveName}</h4>
						     	${s.foldName}
						    </div>
						  </li>
						  </c:forEach>
						</ul>
					</div>
					<div class="left_down">
						&nbsp;&nbsp;&nbsp;&nbsp;<span>创建群组</span>&nbsp;&nbsp;&nbsp;&nbsp;|
						&nbsp;&nbsp;&nbsp;&nbsp;<span>
						<a href="content.html" data-toggle="modal" data-target="#myModal">添加好友</a>
						
						</span>&nbsp;&nbsp;&nbsp;&nbsp;|
						&nbsp;&nbsp;&nbsp;&nbsp;<span>设置</span>
					</div>
				</div>
				<div class="right_1">
					<div class="rigth_top">
						<h4>发送者</h4>
					</div>
					<div id="rigth_reirong">
					<span class="chuangjianTime">2018-2-3</span>
					
					<div class="jilu">
						
					</div>
					
				</div>
				<div class="rigth_down">
					<a href="content2.html" data-toggle="modal" data-target="#myModal" class="btn btn-primary">分享文件</a>
					<input type="text" placeholder="请输入" class="input"/>
					<button type="button" class="btn btn-primary" aria-label="Left Align">
						<span>发送</span>
					</button>
				
				</div>
			</div>
    	</div>
    </div>

<button data-toggle="modal" data-target="#myModal">点....</button>
		
		
		<div class="modal fade" id="myModal">
		  <div class="modal-dialog">
		    <div class="modal-content">
		    </div>
		  </div>
		</div>
   <script src="js/jquery-3.2.1.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script>
			$("#myModal").on("hidden.bs.modal",function(){
			//alert();
			//清空modal的内容
			$(this).removeData("bs.modal");
		});
		</script>
  </body>
</html>