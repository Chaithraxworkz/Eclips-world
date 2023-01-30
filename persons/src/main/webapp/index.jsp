<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>
	<h1>Details of the Fav persons</h1>
	<form action="fav" method="Post">
	<pre>
	FistName <input type="text" name="fistName"/>
	LastName <input type="text" name="lastName"/>
	<div>
	Gender
	 Male<input type="radio" name="gender" value="male"/>
	 FeMale<input type="radio" name="gender" value="female"/> 
	 Other<input type="radio" name="gender" value="others"/>
	 </div>
	Reason <textarea rows="5" cols="20" name="reason"></textarea>
	Address <textarea rows="3" cols="30" name="address"></textarea>
	<input type="submit" value="send"/>
	</pre>
	</form>
</body>
</html>