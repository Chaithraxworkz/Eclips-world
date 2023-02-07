<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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
			width="30" height="30" alt="">
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
	<h1>welcome to Chaithra</h1>
	<form method="get" action="email">
	<button>click</button>
	<h5>Display String :${email}</h5>
	<input type="submit"/>
	</form>
	
	<form method="get" action="mobNumber">
	<button>MobileNo</button>
	<h5>Display String :${mobNumber}</h5>
	</form>
	
	<form method="get" action="adhar">
	<button>Adhar No</button>
	<h5>Display String :${adhar}</h5>
	</form>
	
	<form method="get" action="age">
	<button>Age</button>
	<h5>Display String :${age}</h5>
	</form>
	
	<form method="get" action="dob">
	<button>DOB</button>
	<h5>Display String :${dob}</h5>
	
	</form>
	
	<form method="get" action="salary">
	<button>Salary</button>
	<h5>Display String :${salary}</h5>
	
	</form>
	
	<form method="get" action="friends">
	<button>BestFriends</button>
	<h5>Display String :${friends}</h5>
	<input type="submit" value="click">
	<ul>
	<c:forEach items="${name}" var="item">
	<li>${item}</li>
	</c:forEach>
	</ul>
	</form>
	
	<form method="get" action="places">
	<button>visited places</button>
	<h5>Display String :${places}</h5>
	<ul>
	<c:forEach items="${visit}" var="item">
	<li>${item}</li>
	</c:forEach>
	</ul>
	</form>
	
	<form method="get" action="skills">
	<button>List of Skills</button>
	<h5>Display String :${skills}</h5>
	<ul>
	<c:forEach items="${softSkills}" var="item">
	<li>${item}</li>
	</c:forEach>
	</ul>
	</form>
	<form action="dto" method="get">
	<h6>Display education DTO :${data}</h6>
	<input type="submit" value="click"/></br>
	<label>collegeName: ${data.collegeName}</label></br>
	<label>fees: ${data.fees}</label></br>
	<label>location: ${data.location}</label></br>
	<label>campus: ${data.campus}</label></br>
	<label>phoneNo: ${data.phoneNo}</label></br>
  	<label>joiningDate: ${data.joiningDate}</label></br>
 	<label>district: ${data.district}</label></br>  
	<label>pinCode: ${data.pinCode}</label></br>
	<label>taluk: ${data.taluk}</label></br>
	<label>openingYear: ${data.openingYear}</label></br> 
	</form>
	
	<form action="family" mathod="get">
	<h6>Display family DTO : ${home}</h6>
	<input type="submit" value="click"/>
	<label>fatherName : ${home.fatherName}</label></br>
	<label>motherName: ${home.motherName}</label></br>
	<label>sisterName: ${home.sisterName}</label></br>
	<label>location: ${home.location}</label></br>
	<label>phoneNo: ${home.phoneNo}</label></br>
  	<label>taluk: ${home.taluk}</label></br>
 	<label>district: ${home.district}</label></br>  
	<label>pinCode: ${home.pinCode}</label></br>
	<label>fatherOccupation: ${home.fatherOccupation}</label></br>
	<label>working: ${Fam.working}</label></br> 
	</form>
	
	<form action="mobile" method="get">
	<h6>Display Mobile DTO : ${mobile}</h6>
	<input type="submit" value="click"/>
	<label>brand : ${mobile.brand}</label></br>
	<label>color: ${mobile.color}</label></br>
	<label>price: ${mobile.price}</label></br>
	<label>dualCamera: ${mobile.dualCamera}</label></br>
	<label>Moile ram: ${mobile.ram}</label></br>
	</form>
	
	<form action="beverage" mathod="get">
	<h6>Display Beverage DTO : ${Beverage}</h6>
	<input type="submit" value="click"/>
	<label> brand : ${Beverage.brand}</label></br>
	<label> name: ${Beverage.name}</label></br>
	<label> cold: ${Beverage.cold}</label></br>
	<label> price: ${Beverage.price}</label></br>
	<label> location: ${Beverage.location}</label></br>
  	<label> cash: ${Beverage.cash}</label></br>
 	<label> quantity: ${Beverage.quantity}</label></br>  
	<label> ownerName: ${Beverage.ownerName}</label></br>
	</form>
	
	<form action="chat" method="get">
	<h6>Display Chats DTO :${chats}</h6>
	<input type="submit" value="click"/>
	<label> chatName: ${chats.chatName}</label></br>
	<label> price: ${chats.price}</label></br>
	<label> spicy: ${chats.spicy}</label></br>
	<label> salty: ${chats.salty}</label></br>
	<label> location: ${chats.location}</label></br>
  	<label> phNo: ${chats.phNo}</label></br>
 	<label> famousChat: ${chats.famousChat}</label></br>  
	<label> noOfChats: ${chats.noOfChats}</label></br>
	<label> noOfPeoples: ${chats.noOfPeoples}</label></br>
	<label> started: ${chats.started}</label></br> 
	<label> openingTime: ${chats.openingTime}</label></br>
	</form>
</body>
</html>