<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/resources/css/HotelStyle.css">
<!-- Static content -->
<script type="text/javascript" src="/resources/js/app.js"></script>
<script src="/webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="/webjars/bootstrap/3.3.6/css/bootstrap.min.css" />
<title>Spring Boot</title>
</head>
<body class="center"> 
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">My Stay</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">BOOKINGS</a></li>
    </ul>
  </div>
</nav>
	<div class="form">
	<br><br><br>
	<h2>
	  BOOKING ID  : ${bookingDto.getBookingId()}<br>
	  USER ID	  : ${bookingDto.getCustomerId()}<br>
	  USER NAME	  : ${bookingDto.getCustomerName()}<br>
	  BOOKING DATE:	${bookingDto.getDate()}<br>
	  HOTEL NAME  :	${bookingDto.getHotelName()}<br>
	  ROOM ID     :	${bookingDto.getRoomID()}<br>
	  ROOM TYPE   :	${bookingDto.getRoomType()}<br>
	  ROOM PRICE  :	${bookingDto.getRoomPrise()}<br>
	</h2>
	</div>
</body>
</html>