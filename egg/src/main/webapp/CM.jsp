<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
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
		</a> <a href="index.jsp">Home</a>
		</nav>
	<form action="cm" method="post">
	<h1>Wealcome to CM Info</h1>

		<div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">
					CM Name </label> <input type="text" class="form-control"
					id="exampleFormControlInput1" 
					name="name"/>
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Party
				</label> <select class="form-control"
					id="exampleFormControlInput1" 
					name="party">
					<option>Select</option>
					<option>BJP</option>
					<option>JDS</option>
					<option>Congress</option>
					<option>AAP</option>
					<option>KJP</option>
					<option>Prajakiya</option>
					</select>
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">State
					</label> <select class="form-control"
					id="exampleFormControlInput1" 
					name="state">
					<option>Select</option>
					<option>Karnataka</option>
					<option>Uttar Pradesh</option>
					<option>Telangana</option>
					<option>Andhra Pradesh</option>
					<option>TamilNadu</option>
					<option>Goa</option>
					<option>Chattisgarh</option>
					<option>Assam</option>
					<option>Arunachal Pradesh</option>
					</select>
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">
					Tenure </label> <select class="form-control"
					id="exampleFormControlInput1" 
					name="tenure">
					<option>Select</option>
					<option>1</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
					<option>5</option>
					</select>
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">
					PortFolio </label> <textarea rows="3" cols="10" name="portfolio"></textarea>
			</div>

			<div>
				<input type="submit" class="btn btn-dark" value="save"
					name="save" />
			</div>
</body>
</html>