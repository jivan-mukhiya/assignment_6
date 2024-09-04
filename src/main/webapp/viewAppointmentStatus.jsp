<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Appointment Status</title>
</head>
<body>
 
 <h1>View Appointment</h1>
 
 <hr>
 <table>
  
  <thead bgColor="yellow">
  
  <th>Date</th>
  <th>Doctor</th>
  <th>Status</th>
  
  </thead>
  
  <c:forEach  var="l" items="${list}">
      <tbody bgcolor="green">
  <td>${ l.date}</td>
  <td>${ l.doctor}</td>
  <td>${ l.status}</td>
  
  </tbody>    
</c:forEach> 
  
 </table>
</body>
</html>