<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</head>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<body>
<div>
		<nav class="navbar navbar-green bg-dark">
			<div class="container-fluid">
				<img
					src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
					class="img-fluid" hight="80px" width="80px">

				<form class="d-flex">
					<input class="form-control me-3" type="search" placeholder="Search"
						aria-label="Search"> <a class="btn btn-outline-primary"
						href="index.jsp">Home</a>

				</form>
			</div>
		</nav>
	</div>


	<form action="send" method="post">
	<h1>Wealcome to Casino</h1>

		<div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Casino
					Name </label> <input type="text" class="form-control"
					id="exampleFormControlInput1" placeholder="name "
					name="name">
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Cruise
				</label> <input type="text" class="form-control"
					id="exampleFormControlInput1" placeholder="cruise"
					name="cruise">
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Entry
					fee </label> <input type="text" class="form-control"
					id="exampleFormControlInput1" placeholder="fee"
					name="fee">
			</div>

			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Free
					Food </label>: yes<input type="radio" value="true" name="food" /> No<input
					type="radio" name="food" value="false">:
			</div>

			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Free
					alcohol :yes</label> <input type="radio" value="true" name="alcohol" /> No<input
					type="radio" name="alcohol" value="false" />:
			</div>
			<div>
				<input type="submit" class="btn btn-dark" value="submit"
					name="submit" />

			</div>


		</div>
	
	
</body>
</html>