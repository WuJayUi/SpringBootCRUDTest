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
</style>
</head>
<body>
	<img src="/pic/D2.jpg" id="img">
 	<form id='testform' action="/example/confirm" method="POST">
        暗黑破換神: ${message} ${error}<br> 
        <input type='hidden' name='num'>
        <input type='hidden' id='act' name='act' value='add'> 
        <p>ID:</p><input type='text' id='id' name='id' required><br> 
        <p>NAME:</p><input type='text' name='name' required><br>
        <button  type="submit" value="提交">送出</button>
   	</form>
    <form action="/example/all" method="POST">
    		<button  type="submit" value="提交">查看</button>
    </form>
</body>
</html>