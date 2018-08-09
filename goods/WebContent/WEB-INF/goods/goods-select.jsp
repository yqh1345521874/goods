<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="/goods/"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<a href="goods-insert.jsp">新增信息</a>
	<table>
		<thead>
			<tr>
			<td>编号</td>
			<td>商品名称</td>
			<td>分类</td>
			<td>型号</td>
			<td>单价</td>
			<td>操作</td>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${list }" var="s">
			<tr>
				<td>${s.goodsId}</td>
				<td>${s.goodsName}</td>
				<td>${s.goodsType}</td>
				<td><c:choose>
				<c:when test="${s.goodsClassId==1}">家电</c:when>
				<c:when test="${s.goodsClassId==2}">洗护用品</c:when>
				<c:when test="${s.goodsClassId==3}">奶粉</c:when></c:choose></td>
				<td>${s.goodsPrice}</td>
				<td><a href="GoodsServlet?method=delete&goodsId=${s.goodsId}" onclick="return confirm('确定删除吗')">删除</a>
					<a href="GoodsServlet?method=update&goodsId=${s.goodsId}">修改</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	<script type="text/javascript" src="jquery-1.12.4.js"></script>
	<script type="text/javascript">
		$(function(){
			 
		});
	</script>
</body>
</html>