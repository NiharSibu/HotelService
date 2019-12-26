<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
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
<body class="back">
<form action="roomId" method="post">
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">My Stay</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">ROOMS OF YOUR CHOICE</a></li>
    </ul>
  </div>
</nav>
<div class="container" style="margin-top:50px">
  <div class="row">
	<c:forEach items="${rooms}" var="item">
      <div class="col-md-4">
	  <div class = "rooms">
       <h3> <input type = "radio" value="${item.getRoomId()}" name ="roomId"> </h3>
        <h3>
         Room ID   : ${item.getRoomId()}<br>
         Room Type : ${item.getType()}<br>
         Room Price: ${item.getPrice()}<br>
         Hotel     : ${item.getHotel().getHotelName()}
        </h3>
	  </div> 
      </div>
    </c:forEach>
  </div>
</div>
     <div class= "center">       
        <button type="submit" class="btn btn-primary" name ="roomID"><h4>Select</h4></button>       
     </div>
  </form>
</body>
</html>