<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="/goods/"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="GoodsServlet?method=doInsert" method="post">
	商品名称：<input type="text" name="goodsName"></br>
	商品类型：<input type="text" name="goodsType"></br>
	商品分类：<select name="goodsClassId">
  	<option value="1">家电</option>
  	<option value="2">洗护用品</option>
  	<option value="3">奶粉</option>
  </select></br>
	商品单价：<input type="text" name="goodsPrice"></br>
		<input type="submit"> 
	</form>
</body>
</html>