<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	button{
		margin:10px;
		padding:5px;
	
	}
	form{
		position: relative;
		left: 40%;
	}
	#r,#r1{
		color:red
	}
</style>
</head>
<body>
	<img src="/pic/D2.jpg" id="img">
	<form id='form' action="/example/result" method="POST" >
		暗黑破換神: ${message}
		<p>ID:</p>
		<p id="r">${id}</p>
		<p>NAME:</p>
		<p id="r1">${name}</p>
		<input type="hidden" name="id" value="${id}">
		<input type="hidden" name="name" value="${name}">
		<button  type="submit" value="yes">確認</button>
	</form>
</body>
</html>