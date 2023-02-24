<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>

<style>
table, th, td {
 
  text-align: center;
}

.b {
  border: 1px solid black;
  padding: 40px;
  margin-top : 40px;
  margin-left : 100px;
  width : 500px;
}

</style>
</head>
<body>

<div class="b">
<h1> Jelly Beans </h1>


<table class="table">
			<thead>
				<tr>
					<th>Style</th><th>Rating</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="jellybean" items="${jellybeans}">
				<tr>
					<td>${jellybean.style}</td>
					<td>${jellybean.rating}</td>
				</tr>
				</c:forEach>
			</tbody>
</table>



<h2> Add a Jelly Bean </h2>
  
<form action="/create-jelly" method="POST">
	    
		  <label for="style"> Style :</label>   
	 	  <input type="text" id="style" name="style">
		  <br> <br>

		  <label for="rating"> Rating : </label>
	 	  <input type="text" id="rating" name="rating">
		  <br> <br> 
		  
  	  	  <input type="submit" value="Add">
      
</form>


</div>

</body>
</html>