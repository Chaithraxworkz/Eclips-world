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

<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<a class="navbar-brand" href="#"> <img
			src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
			width="50" height="50" alt="">
		</a> <a class="navbar-brand" href="#">Navbar</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>


		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="#">Action</a> <a
							class="dropdown-item" href="#">Another action</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#">Something else here</a>
					</div></li>
				<li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a>
				</li>
			</ul>
		</div>
	</nav>
<form action="snaks" method="post">
	<h1>Wealcome to Bakery</h1>

		<div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">
					Name </label> <input type="text" class="form-control"
					id="exampleFormControlInput1" placeholder="Enter bakery name "
					name="name">
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Owner Name
				</label> <input type="text" class="form-control"
					id="exampleFormControlInput1" placeholder="Enter bakery owner Name"
					name="ownerName">
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Owner WifeName
					</label> <input type="text" class="form-control"
					id="exampleFormControlInput1" placeholder="Enter bakery wife Name"
					name="wifeName">
			</div>

			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Owner Married
					 </label>: yes<input type="radio" value="true" name="married" /> No<input
					type="radio" name="married" value="false"/>
			</div>

			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Famous For
					</label> <textarea rows="3" cols="10"></textarea>
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Since
					</label> <input type="text" class="form-control"
					id="exampleFormControlInput1" placeholder="Enter the since"
					name="since">
			</div>
			<div>
				<input type="submit" class="btn btn-dark" value="click"
					name="click" />
			</div>
</body>
</html>