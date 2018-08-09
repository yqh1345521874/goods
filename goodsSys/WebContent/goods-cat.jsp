<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title> 购物车 </title>
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
			width:920px;
			padding:20px;
		}
		#container table{
			width:920px;font-size:13px;
		}
		#container table .td3{
			width:10%;
			text-align:center;
		}
		#container table .td3 img{
			width:90%;
		}
		#container table .td2{
			width:40%;
			text-align:left;
		}
		#container table .td2 p{
			margin:0;
			line-height:20px;
			
		}
		#container table .input{
			text-align:center;
			width:30px;
		}
		#container table th,#container table td{
			border-spacing:0;
			border-collapse : collapse ;
			line-height:20px;
			padding:10px 0;
		}
		#container table th{
			border-bottom:2px solid #222;
		}

		#container table tbody td{
			border-bottom:1px dashed #999;
		}

		#container table tfoot td{
			text-align:right;
			padding:20px 0;
			border-bottom:2px solid #222;
		}
		#container table tfoot td span.price{
			font-size:30px;
			color:#ff0000;
			font-weight:bold;
			
		}
		#container .tijiao{
			text-align:right;
		}
		#container .tijiao a{
			color:#fff;
			display:inline-block;
			width:150px;
			height:40px;
			line-height:40px;
			font-weight:bold;
			background:#f53810;
			text-align:center;
		}
		#container .tijiao a:active{
			background:#d53810;
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
			<dl>
				<dd><h2>购物车</h2></dd>
				<dd>您好，欢迎光临!</dd>
			</dl>
		</div>
		<div id="" class="gou">
			<img src="images/1.png" width="335" height="30" alt="" />
		</div>
	</div>
  </div>
  <!-- 导航菜单 -->
  <div id="menu" class="">
	<div id="" class="nav">
		<ul>
			<li><a href="GoodsServlet?method=select">首页</a></li>
			<li><a href="CustomersServlet?method=select">登陆</a></li>
			<li><a href="register.html">注册</a></li>
		</ul>
		<div style="clear:both"></div>
	</div>
  </div>
  <!-- 显示商品详情 -->
  <div id="container" class="">
	<table cellspacing="0">
		<thead>
			<tr>
				<th class="td3"></th>
				<th class="td2">商品名称</th>
				<th class="td3">麦包价</th>
				<th class="td3">数量</th>
				<th class="td3">优惠</th>
				<th class="td3">小计</th>
				<th class="td3">操作</th>
			</tr>
		</thead>
		<tbody>
			
			<c:forEach items="${list}" var="li">
			<tr>
				<td class="td3"><img src="images/${li.image}"/></td>
				<td  class="td2">
					<p>${li.goodsType}${li.descrption} ${li.color}</p>
					
				</td> 
				<td class="td3">￥<span id="jg">${li.price}</span></td>
				<td class="td3">
					<a class="jian">-</a>
					<input onclick=""  class="input"  value="${li.cont}"/>
					<a class="jia">+</a>
				
				</td>
				<td class="td3">-￥0.00</td>
				<td class="td3">￥288.00</td>
				<td class="td3"><a href="CatServlet?method=delete&id=${li.id}">删除</a></td>
			</tr>
			</c:forEach>
		</tbody>
		
		<tfoot>
			<tr>
				<td colspan="7">
					<span class="">应付金额:</span>
					<span class="price">￥250.00</span>
				</td>
			</tr>
		</tfoot>
	</table>
	<p class="tijiao">
		<a href="#">提交订单</a>
	</p>
  </div>
   <!-- 页面底部 -->
  <div id="footer" class="">
	<img src="images/footer.PNG" width="960" height="162" alt="" />
  </div>
 </body>
 <script type="text/javascript" src="jquery-1.12.4.js"></script>
 <script >
 
	$(function() {
	$(".jia").click(function(){
		var a=$(".input").val();
		a++;
		var qian=$("#jg").html();
		var bh=$("#bh").html();
		location.href="CatServlet?method=doupdate&cont="+a+"&price="+qian+"&bh="+bh;
		$(".input").val(a);
	})
	
	$(".jian").click(function(){
		var a=$(".input").val();
		a--;
		var qian=$("#jg").html();
		var bh=$("#bh").html();
		location.href="CatServlet?method=doupdate&cont="+a+"&price="+qian+"&bh="+bh;
		$(".input").val(a);
	})
	
	})
 </script>
</html>