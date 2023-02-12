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
	<form action="egg" method="post">
	<h1>Wealcome to Egg</h1>

		<div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">
					Hotel Name </label> <input type="text" class="form-control"
					id="exampleFormControlInput1" 
					name="hotelName"/>
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Egg Dish Name
				</label> <select class="form-control"
					id="exampleFormControlInput1" 
					name="dishName">
					<option>Select</option>
					<option>Omelet</option>
					<option>Egg-Rice</option>
					<option>Egg Fried Rice</option>
					<option>Half Boil</option>
					<option>Egg Bhurji</option>
					<option>Egg Puff</option>
					<option>Egg Masala</option>
					<option>Egg Bonda</option>
					<option>Egg Chilli</option>
					<option>Egg Maggi</option>
					<option>Egg Parata</option>
					<option>Egg Curry</option>
					<option>Egg Butter Masala</option>
					<option>Egg Biryani</option>
					<option>Egg Toast Recipe</option>
					<option>Egg Dosa</option>
					<option>Egg Kurma</option>
					<option>Egg Pulao</option>
					</select>
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Egg Type
					</label> <select class="form-control"
					id="exampleFormControlInput1" 
					name="type">
					<option>Select</option>
					<option>Nati</option>
					<option>Farm</option>
					<option>Boiler</option>
					<option>Duck</option>
					<option>Ostrich</option>
					</select>
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">
					Price </label> <input type="text" class="form-control"
					id="exampleFormControlInput1" 
					name="price"/>
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">
					Quantity </label> <select class="form-control"
					id="exampleFormControlInput1" 
					name="quantity">
					<option>Select</option>
					<option>1</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
					<option>5</option>
					<option>6</option>
					<option>8</option>
					<option>9</option>
					<option>10</option>
					</select>
			</div>

			<div class="mb-3">
				Take Away yes:<input type="radio" value="true" name="takeAway" /> No: <input
					type="radio" name="takeAway" value="false"/>
			</div>

			<div>
				<input type="submit" class="btn btn-dark" value="click"
					name="click" />
			</div>
</body>
</html>