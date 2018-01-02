<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
<%@include file="header.jsp"%>

<div class="container space">
	<div class=" col-md-offset-3 col-md-6 ">
		<div class="panel panel-danger">
			<div class="panel-heading-dnager">List category posts</div>
			<div class="panel-body">
		   <table class="table pre-scrollable">
		<thead class="thead-dark">
			<tr class="bg-danger">
				
				<th>Category Name</th>
				<th>Desciption</th>
				<th>Pictures</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach items="${categorys }" var="c">
				<tr class="bg-info">
					<td>${c.nameCategory}</td>
					<td>${c.description}</td>
					<td>${c.namePicture}</td>
					<td><img src="catPicture?idCat=${c.idCategory }"></td>
					<td><a  onclick="return confirm('are you sure')" href="deleteCat?idCat=${c.idCategory }">Delete</a></td>
					<td><a href="display?idCat=${c.idCategory }">Edit</a></td>
			   </tr>
             
			</c:forEach>
		</table>

	</div>
	</div>
	</div>
	</div>
	



</body>
</html>