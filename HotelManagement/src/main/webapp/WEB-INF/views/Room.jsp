<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/resources/css/style.css">
<!-- Static content -->
<script type="text/javascript" src="/resources/js/app.js"></script>
<script src="/webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="/webjars/bootstrap/3.3.6/css/bootstrap.min.css" />
<title>Spring Boot</title>
<style>
body {
	position: relative;
}

#section1 {
	padding-top: 50px;
	height: 500px;
	color: #fff;
	background-color: #1E88E5;
}

#section2 {
	padding-top: 50px;
	height: 500px;
	color: #fff;
	background-color: #673ab7;
}

#section3 {
	padding-top: 50px;
	height: 500px;
	color: #fff;
	background-color: #ff9800;
}

#section4 {
	padding-top: 50px;
	height: 500px;
	color: #fff;
	background-color: #00bcd4;
}

#section5 {
	padding-top: 50px;
	height: 500px;
	color: #fff;
	background-color: #009688;
}
</style>
</head>
<body data-spy="scroll" data-target=".navbar" data-offset="50">

	<form action="roomType" method="post">
		<nav class="navbar navbar-inverse navbar-fixed-top">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#myNavbar">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">My Stay</a>
				</div>
				<div>
					<div class="collapse navbar-collapse" id="myNavbar">
						<ul class="nav navbar-nav">
							<li><a href="#section1">Luxury Rooms</a></li>
							<li><a href="#section2">Semi-Luxury Rooms</a></li>
							<li><a href="#section3">Budget Friendly Rooms</a></li>
							<li><a href="#section4">Medium-Range Rooms</a></li>
							<li><a href="#section5">Delux Roomms</a></li>
						</ul>
					</div>
				</div>
			</div>
		</nav>

		<div id="section1" class="container-fluid">
			<h1>Luxury Rooms</h1>
			<p>Try to scroll this section and look at the navigation bar
				while scrolling! Try to scroll this section and look at the
				navigation bar while scrolling!</p>
			
			<button type="submit" class="btn btn-primary" value="luxury" name ="roomType">BOOK ROOM</button>
		</div>
		<div id="section2" class="container-fluid">
			<h1>Semi-Luxury Rooms</h1>
			
			<button type="submit" class="btn btn-primary" value="semi_luxury" name ="roomType">BOOK ROOM</button>
		</div>
		<div id="section3" class="container-fluid">
			<h1>Budget Friendly Rooms</h1>
			
			<button type="submit" class="btn btn-primary" value="budget_friendly" name ="roomType">BOOK ROOM</button>
		</div>
		<div id="section4" class="container-fluid">
			<h1>Medium-Range Rooms</h1>
			
			<button type="submit" class="btn btn-primary" value="medium_range" name ="roomType">BOOK ROOM</button>
		</div>
		<div id="section5" class="container-fluid">
			<h1>Delux Rooms</h1>
			
			<button type="submit" class="btn btn-primary" value="delux" name ="roomType">BOOK ROOM</button>
		</div>
	</form>
</body>
</html>