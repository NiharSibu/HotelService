<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/resources/css/HotelStyle.css">
<!-- Static content -->
<script type="text/javascript" src="/resources/js/HotelApp.js"></script>
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
		<form action="user" method="post" onsubmit="">
		<br><br><br>
		<h2>REGISTRATION:</h2>
			<div class="form-group">
				<label for="usr">Name:</label> <input type="text" width=276
					class="form-control" name="name">
			</div>
			<div class="form-group">
				<label for="usr">Phone Number:</label> <input type="text"
					class="form-control" name="phoneNo">
			</div>
			<div class="form-group">
				<label for="email">Email address:</label> <input type="email"
					class="form-control" name="email">
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label> <input type="password"
					class="form-control" name="password">
			</div>
			<button type="submit" class="btn btn-primary" id="submit">Submit</button>
		</form>
		
		<form action="bookingPage" method="post" onsubmit="">
		<br><br>
		<h2>LOGIN:</h2>
		<div class="form-group">
		
			<label for="email">Email address:</label> <input type="email"
				class="form-control" name="email">
		</div>
		<div class="form-group">
			<label for="pwd">Password:</label> <input type="password"
				class="form-control" name="password">
		</div>
		<button type="submit" class="btn btn-primary" id="submit">Login</button>
		</form>
	</div>
</body>
</html>