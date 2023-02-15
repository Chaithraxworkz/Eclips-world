<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link 
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	 rel="stylesheet" 
	 integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" 
	 crossorigin="anonymous">
	 
<script 
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" 
	crossorigin="anonymous"></script>
	
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<a class="navbar-brand" href="#"> <img
			src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
			width="50" height="50" alt="">
		</a>
		<a href="index.jsp">Home</a>
		</nav>
	<h1>Welcome to valentine day special...</h1>
	
	<c:forEach items="${errors}" var="e">
	<br>
	<span style="color:red;">${e.message}</span>
	</c:forEach>
	
	<form action="valentine" method="post">
	<pre>
	Name <input type="text" name="name"/>
	Valentine Name <input type="text" name="valentineName"/>
	Place <select name="places">
		<option value="">SELECT</option>
		<c:forEach items="${places}" var="p">
			<option value="${p}">${p}</option>
		</c:forEach>
		</select>
	Gift <select name="gifts">
		<option value="">SELECT</option>
		<c:forEach items="${gifts}" var="g">
			<option value="${g}">${g}</option>
		</c:forEach>
	</select>
	<input type="submit" value="save" class="btn-btn-primary"/>
	</pre>
	
	</form>
</body>
</html>