<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Speclialization</title>
</head>
<body>
<style>
.Speclialization{
background-color: gray;
	padding: 90px;
	margin-top: 50px;
	margin-left: 25%;
	width: 30%; 
	color; white;
	font-size: 24px;
	boder: 2px solid black;
}
.button {
position: absolute;
	width: 10%;
	margin-left:90px;
	margin-top:30px;
	font-size: 20px;
	background-color: #008CBA;
	color: white;
	boder-radius: 50%;
}
.button:hover {
	background-color: green;
	}
	.Speclialization.input{
	align-content: flex-start;
	
	}
	h1{
	text-align: center;
	margin-top: 30px;
	}
</style>
	<form action="Specialization" method="post">
		<h1>Speclialization</h1>
		<div class="Speclialization">
			<label for=Code> Code :</label> <input type="text" name="code">
			<br><br> <label for="Name">Name :</label> <input type="text"
				name="name"><br>
			<br> <label for="note"> Note :</label><br>
			<textarea rows="5" cols="33" name="note"></textarea><br>
			<button class="button" type="submit">Create</button>
		</div>
	</form>
</body>
</html>