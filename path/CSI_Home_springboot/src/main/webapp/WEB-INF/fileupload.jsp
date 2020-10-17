<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/spring_study/upload/method01" 
	method="post" enctype="multipart/form-data">
		<intpu type="text" name="name"/>
		<input type="file" name="file">
		<input  type="submit" value="submit">
	</form>
</body>
</html>