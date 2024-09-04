<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Approve Appointment</title>
</head>
<body>


<table>
<thead bgcolor="yellow">  
<th>Patient</th>
<th>Doctor</th>
<th>Date</th>
<th>Action</th> 
</thead>           
 
 
 <c:forEach  var="spec" items="${list}">
<tbody bgcolor="green">
<td>spec.patient</td>
<td>spec.doctor</td>
<td>spec.date</td>
<td>spec.status</td>
<td>
<input type="submit" value="accept" color="green">
<input type="submit" value="reject" color="red">
</td>

</tbody>           
</c:forEach> 

</table>
</body>
</html>