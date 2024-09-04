<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>patient</title>
</head>
<body>
<style>
.patient{
background-color: gray;
	padding: 90px;
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
	
	h1{
	text-align: center;
	margin-top: 30px;
	}
</style>
<h1>patient</h1>
<form action="patientServlet" method="post">
<div class="patient">
<label for="first name">First Name :</label>
<input type="text" name="firstname"><br>
<label for="lastName">Last name :</label>
<input type="text" name="lastname">
<br>
<label for="gender">Gender :</label>
<input type="radio" name="Gender" value="M">M
<input type="radio" name="Gender" value="F">F
<br>
<label for="dob">DOB :</label>
<input type="date" name="dob"><br>

<label for="phone">Phone :</label>
<input type="text" name="phone"><br>

<label for="married status">Married Status :</label>
<input type="radio" name="married_status" value="M">M
<input type="radio" name="married_status" value="U">US
<input type="radio" name="married_status" value="D">D
<input type="radio" name="married_status" value="LS">LS
<br>
<label for="present address">Present Address</label>
<textarea rows="3" cols="30" name="present_address"></textarea>
<br>
<label for="communication address">Communication Address</label>
<textarea rows="3" cols="30" name="communication_address"></textarea>
<br>
<label for="history">Past Medical History :</label><br>
<input type="checkbox" name="history" value="Anemia">Anemia
<input type="checkbox" name="history" value="Asthma">Asthma
<input type="checkbox" name="history" value="Daibetes">Daibetes
<br>
<input type="checkbox" name="history" value="Cancer">Cancer
<input type="checkbox" name="history" value="Ulcer">Ulcer
<input type="checkbox" name="history" value="Chickenpox">Chickenpox
<br>
<input type="text" name="history" value="Other">Other
<br>
<label for="other details">other details</label>
<textarea rows="5" cols="50" name="other"></textarea>
<br>
<button class=button type="submit">Regester</button>
</div>
</form>
</body>
</html>