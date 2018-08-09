<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="/goods/"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

	<form action="GoodsServlet?method=doUpdate" method="post">

	<table>
	<tr><th></th><td><input type="hidden" name="goodsId" value="${goods.goodsId }"></td></tr>
		<tr><th>商品名称：</th><td><input type="text" name="goodsName" value="${goods.goodsName}"></td></tr>
		<tr><th>商品类型：</th><td><input type="text" name="goodsType" value="${goods.goodsType}"></td></tr>
		<tr><th>商品分类：</th><td><select name="goodsClassId">
  	<option value="1">家电</option>
  	<option value="2">洗护用品</option>
  	<option value="3">奶粉</option>
  </select></td></tr>
	<tr><th>商品单价：</th><td><input type="text" name="goodsPrice" value="${goods.goodsPrice}"></td></tr>
		<tr><td><input type="submit" value="修改"></td> </tr>
	</table>
	</form>
	
</body>
</html>