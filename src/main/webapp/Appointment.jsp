<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Appointment</title>
</head>
<body>
<style>
.appointmnet{
background-color: gray;
	padding: 110px;
	margin-top: 50px;
	margin-left: 25%;
	width: 40%; 
	color; white;
	font-size: 24px;
	boder: 2px solid black;
}
.button {
position: absolute;
	width: 10%;
	margin-left:190px;
	margin-top:30px;
	font-size: 20px;
	background-color: #008CBA;
	color: white;
	boder-radius: 50%;
}
.button:hover {
	background-color: green;
	}
</style>
<form action="AppoientServlet" method="post">
<div class="appointmnet">
<label for="doctor">Doctor :</label>
<input type="text"  name="doctor">
<br>
<label for="Date">Date :</label>
<input type="date" name="date"><br>
<label for="No.of Slots">No.of Slots :</label>
<input type="number" name="slots">
<br>
<br>
<label for="Details">Details :</label>
<textarea rows="5" cols="50" name="details"></textarea>
<br>
<label for="Consultation fee">Consultation fee :</label>
<input type="number" name="fee" ><br>
<button class="button" type="submit">Add</button>
</div>

</form>
</body>
</html>