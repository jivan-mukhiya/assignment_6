<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doctor</title>
</head>
<body>
<style>
.Doctor{
background-color: gray;
	padding: 90px;
	margin-top: 50px;
	margin-left: 25%;
	width: 30%; 
	color; white;
	font-size: 24px;
	boder: 2px solid black;
}
.buttton {
position: absolute;
	width: 10%;
	margin-left:90px;
	margin-top:30px;
	font-size: 20px;
	background-color: #008CBA;
	color: white;
	boder-radius: 50%;
}
.buttton :hover {
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
<h1>Doctor</h1>
<form action="DoctorServlet" method="post">
<div class="Doctor">
<label for="name"> Name :</label>
<input type="text" name="name"><br><br>
<label for="emailid"> Email Id :</label>
<input type="email" name="email"><br><br>

<label for="address"> Address  :</label>
<input type="text" name="address"><br><br>

<label for="Speclialization"> Speclialization : </label>
<select name="Speclialization" >
   <option value="">Select Specialization</option>
            <c:forEach  var="spec" items="${list}">
                <option value="${spec.code}">${spec.name}</option>
            </c:forEach>
  
</select><br>
<label for="Number">Number :</label>
<input type="text" name="number">
<br>
<label for="gender">Gender :</label>
<input type="radio" name="Gender" value="M">M
<input type="radio" name="Gender" value="F">F
<br>
<label for="note">Note :</label>
<textarea rows="5" cols="50" name="note"></textarea><br>
<label for="photo">Photo :</label>
<input type="file" name="photo"><br>
<button class="buttton" type="submit">Create</button>
</div>
</form>
</body>
</html>