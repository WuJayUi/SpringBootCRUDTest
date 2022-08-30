<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="BIG5">
<title></title>
<style type="text/css">
	#img{
		width:800px;
		height:300px;
		position: relative;
		left: 18%;
	}
	form{
		position: relative;
		left: 40%;
	}
	button{
		margin:10px;
		padding:5px;
	}
</style>
</head>
<body>
	<img src="/pic/D2.jpg" id="img"><br>
	
	<form action="/example/exUpdate" method="POST">
		暗黑破換神: ${message}
	 	<p>ID:</p><input type="text" name="id" value="${id}" required>
	 	<p>NAME:</p><input type="text" name="name" value="${name}" required><br><br>
	 	<button  type="submit" value="update">確認修改</button>
	</form>
</body>
</html>