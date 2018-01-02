<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp"%>
<p></p>
<p></p>
<p></p>

	
<div class="container">
			
		<div class="col-md-8">
			
			<div class="table">		
					<table class="table table-striped">
					
							<tr class="txt-info">
								
								<th scope="col">Name for your Product</th>
								<th scope="col">Price for day</th>
								<th scope="col">Price for week</th>
								<th scope="col">Discount</th>
								<th scope="col">Quantity in Stock</th>
								<th scope="col">Description</th>
								<th scope="col">your pictures</th>
							</tr>
						
						
							<c:forEach items="${prods}" var="p">
								<tr class="bg-info">
									
									<td>${p.nameProduct}</td>
									<td class="text-danger">${p.pricePerDay}$cad</td>
									<td class="text-danger">${p.price}$cad</td>
									<td>${p.isPopular}</td>
									<td>${p.quantityStock}</td>
									<td>${p.description }</td>
									<td> <img src="adPicture?idAd=${p.idProduct}"
									class=" img-responsive img-thumbnail "
					width="1200px" height="120px"/></td>
									<td><a onclick="return confirm('are you sure')" href="deleteAd?idAd=${p.idProduct }">Delete</a></td>
									<td><a href="display?idAd=${p.idProduct }">Display</a></td>
								</tr>

							</c:forEach>
						
					</table>
			</div>	
			
				</div>	
			</div>	
				
</body>
</html>