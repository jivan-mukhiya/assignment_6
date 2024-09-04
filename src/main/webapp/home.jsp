<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
<style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }

        /* Navbar styles */
        .navbar {
            background-color: #4CAF50; /* Green background */
            overflow: hidden;
            position: fixed;
            top: 0;
            width: 100%;
        }

        .navbar a {
            float: left;
            display: block;
            color: white;
            text-align: center;
            padding: 14px 20px;
            text-decoration: none;
            font-size: 17px;
        }

        .navbar a:hover {
            background-color: #ddd;
            color: black;
        }

        /* Main content styles */
        .main {
            margin-top: 60px; /* To avoid overlap with the navbar */
            padding: 16px;
            text-align: center;
        }

        .main h1 {
            color: #333;
        }

        .main p {
            color: #666;
        }
    </style>
</head>
<body>
    <!-- Navbar -->
    <div class="navbar">
        <a href="patientServlet">Patient</a>
        <a href="DoctorServlet">Doctor</a>
        <a href="AppoientServlet">Appointment</a>
        <a href="Specialization">Specialization</a>
        <a href="SearchAndBookAppointment">Search and Book Appointment</a>
        <a href="ApproveAppointment">Approve Appointment </a>
        <a href="ViewAppointmentStatusServlet">View Appointment status</a>
        
    </div>

    <!-- Main content -->
    <div class="main">
        <h1>Welcome to Healthcare</h1>
        <p>Your health, our priority.</p>
    </div>
</body>

</html>