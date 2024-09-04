<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search and book appointment</title>
</head>
<body>

<h2>Search and book appointment</h2>

<hr>
 <form action="SearchAndBookAppointment" method="post">

<label for="Speclialization"> Speclialization : </label>
<select name="Speclialization" >
   <option value="">Select Specialization</option>
            <c:forEach  var="spec" items="${doctor}">
                <option value="${spec.specialization}">${spec.specialization}</option>
            </c:forEach>
  
</select><br>

<label for="Doctor"> Doctor : </label>
<select name="doctor" >
   <option value="">Select Doctor</option>
            <c:forEach  var="spec" items="${doctor}">
                <option value="${spec.name}">${spec.name}</option>
            </c:forEach>
  
</select><br>

<input type="submit" value="Search">
 
 </form>
 
 
 <hr>
 
 <div bgcolor="dark">
 <c:forEach  var="dlist" items="${doctorList}">
 <div bgcolor="yellow">
<p>Name : Dr. ${dlist.name} </p>
<p>Email:${dlist.emialId} </p>
<p>Specialization:  ${dlist.specialization} </p>
<p>Address:  ${dlist.address} </p>
<p>Mobile:  ${dlist.mobile} </p>
<p>Gender:  ${dlist.gender} </p>

<input type="submit" value="book">
</div>
  </c:forEach>
 
 </div>
</body>
</html>