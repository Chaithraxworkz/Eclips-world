<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
  rel="stylesheet" 
  integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
  
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" 
     integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" 
     crossorigin="anonymous"></script>
</head>
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
<form action="submit" method="post">
	<h1>Wealcome to Beach</h1>

		<div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Beach
					Name </label> <input type="text" class="form-control"
					id="exampleFormControlInput1" placeholder="beachName "
					name="name">
			</div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Location
				</label> <input type="text" class="form-control"
					id="exampleFormControlInput1" name="location"
					name="cruise">
			

			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Clean
					 </label>: yes<input type="radio" value="true" name="clean" /> No<input
					type="radio" name="clean" value="false">:
			</div>

			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">Games
					</label> <input type="text"  name="games" /> 
			</div>
			<div>
				<input type="submit" class="btn btn-dark" value="submit"
					name="submit" />

			</div>


		</div>
	
</body>
</html>