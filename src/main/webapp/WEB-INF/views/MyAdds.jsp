<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category Product</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/style.css"> 

</head>
<body>
	<%@include file="header.jsp"%>
	<%-- <a href="<c:url value="/j_spring_security_logout" />">logout</a> --%>

   <div class="container space">
	<div class=" col-md-offset-4 col-md-6 ">
		<div class="panel panel-danger">
			<div class="panel-heading">publish your ad</div>
			<div class="panel-body">
				<div id="formProd" class="form">

					<f:form modelAttribute="prod" method="post"
						action="saveAds" enctype="multipart/form-data">
						<table class="table striped">
                           <tr>
								<td><f:hidden path="idProduct" /></td>
								<td><f:errors path="idProduct" cssClass="error"></f:errors></td>
							</tr>
							<tr class="bg-warning">
								<td>Name of Product</td>
								<td><f:input path="nameProduct" /></td>
								<td><f:errors path="nameProduct" class="text-danger"></f:errors></td>
							</tr>
							<tr class="bg-info" >
								<td>Describe your Product!!</td>
								<td><f:textarea path="description" /></td>
								<td><f:errors path="description" class="text-danger"></f:errors></td>
							</tr>

							<tr class="bg-danger">
								<td>Price for day</td>
								<td><f:textarea path="pricePerDay" /></td>
								<td><f:errors path="pricePerDay" class="text-danger"></f:errors></td>
							</tr>
							<tr class="bg-danger">
								<td>Price for Week</td>
								<td><f:textarea path="price" /></td>
								<td><f:errors path="price" class="text-danger"></f:errors></td>
							</tr>
							<tr class="bg-info">
								<td>Quantity in stock</td>
								<td><f:textarea path="quantityStock" /></td>
								<td><f:errors path="quantityStock" class="text-danger"></f:errors></td>
							</tr>
							<tr>
								<td>Please Select the category for product to rent</td>

								<td>
									<%--  <f:select path="category.idCategory">
                <f:option value="0">SELECT</f:option>
                   <f:option value=category.IdCategory>"${nameCategory}" </f:option>
                 <f:options items="${categories}"></f:options>
                       </f:select>  --%>
                       <f:select path="category.idCategory" items="${categorys}"
										itemValue="idCategory" itemLabel="nameCategory">
									</f:select>
								<td>
							</tr>
							<tr>
								<td>On discount??</td>
								<td><f:checkbox path="isPopular" /></td>
							</tr>
							<tr>
								<td> picture</td>
								<td>
								<c:if test="${prod.idProduct!=0}">
									
									<img src="adPicture?idAd=${prod.idProduct }">
									
								</c:if>
								</td>
							</tr>
							<tr>
								<td>Pictures</td>
								<td><input class="btn btn-default" type="file" name="file"></td>
							</tr>
							<tr>
								<td><input type="submit" 
									class="btn btn-success" value="save ad" " /></td>
							</tr>

						</table>

					</f:form>
				</div>
				</div>
				<hr>
				
				
			</div>
			</div>
			</div>
</body>
</html>