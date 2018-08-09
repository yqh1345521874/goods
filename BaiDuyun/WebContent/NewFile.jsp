<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<h2>欢迎你<%=session.getAttribute("nickName") %></h2>
	<c:forEach items="${flolist}" var="f">
	<table>
		<thead>
			<tr>
				<th>名字</th>
				<th>时间</th>
			</tr>
		</thead>
	</table>
	<ul>
		<li>${f.foldName}</li>
	
		<li>${f.createTime}</li>
		
		
	</ul>
	</c:forEach>
	
	文件
		<table>
		<c:forEach items="${wjlist}" var="wj">
			<ul>
				<li>${wj.fileName }</li>
				<li>${wj.uploadTime}</li>
				
			</ul>
			</c:forEach>
		</table>
	
	
	
	  <form action="FileServlet" method="post" enctype="multipart/form-data">
        上传文件：<input type="file" name="file"><br>
        <label>标题</label><input type="text" name="title"/><br/>
        <input type="submit" value="上传">
    </form>
</body>
</html>