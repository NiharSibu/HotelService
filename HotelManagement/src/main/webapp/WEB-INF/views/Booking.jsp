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
		<div>
			<br>
			<br>
			<br>
			<h3>Your Generated User ID is</h3>
			<h2>${id}</h2>
			<h3>Use this ID to book your room.</h3>
		</div>
		<form action="booked " method="post" onsubmit="">
			<div class="form-group">
				<label for="usr">User Id:</label> <input type="text" width=276
					class="form-control" name="userId">
			</div>
			<div class="form-group">
				<label for="usr">Date:</label> <input type="date" width=276
					class="form-control" name="date">
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label> <input type="password"
					class="form-control" name="password">
			</div>
			<button type="submit" class="btn btn-primary" id="submit">Submit</button>
		</form>
	</div>
</body>
</html>