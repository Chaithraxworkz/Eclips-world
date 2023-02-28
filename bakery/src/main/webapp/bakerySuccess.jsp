<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" 
crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-dark bg-primary">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> 
			Bakery Success Page
			</a>
			<a href="index.jsp" style="color:Blue">Home</a>	
		</div>
	</nav>
	
	
	<h1>Bakery Success</h1>
	<h4>name : ${name}</h4>
	<h4>ownerName :${ownerName}</h4>
	<h4>ownerWifeName :${ownerWifeName}</h4>
	<h4>married : ${married}</h4>
	<h4>famousFor : ${famousFor} </h4>
	<h4>since : ${since}</h4>
</body>
</html>