<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<%@include file="header.jsp"%>
	
	<div>
	${errors}
	</div>
	<div class="container spacer">
	<p></p>
	<p></p>
	<p></p>
	<div class="panel panel-info col-md-6 col-offset-3">
	<div class="panel-heading">Add or update your Catogory</div>
	<div class="panel-body">
	<div class="table table-striped class="col-md-offset-3 col-md-6">


		<f:form modelAttribute="category" method="post" action="saveIt" 
			enctype="multipart/form-data">
			<table class="table table-striped">
				<tr >
				   <td><f:hidden path="idCategory" /></td>
					<td><f:errors path="idCategory" class="error"></f:errors></td>
				</tr >
				<tr class="text-primary">
					<td >Name of Category</td>
					<td><f:input path="nameCategory" autocomplete=""/></td>
					</tr>
					<tr>
					<td><f:errors path="nameCategory" class="alert text-danger"></f:errors></td>
				</tr>
				<tr>
					<td>Description</td>
					<td><f:textarea path="description" /></td>
					</tr>
					<tr>
					<td>
					<f:errors path="description" class="text-danger"></f:errors>
					</td>
				</tr >
				<tr>
			     <!--  <td>Name of picture</td> -->
					<%-- <td><f:input path="namePicture" /></td>
					<td><f:errors path="namePicture" cssClass="error"></f:errors></td> --%>
					<c:if test="${category.namePicture!=null}">
					<td><img src="catPicture?idCat=${category.idCategory }"
					class=" img-responsive img-thumbnail "
					width="80px" height="80"></td>
					</c:if>
				    </tr>
				<tr>
					<td>Pictures</td>
					<td><input class="btn btn-default" type="file" name="file"></td>
				</tr>
				<tr>
					<td><input  class="btn btn-success" type="submit" value="save " /></td>
				</tr>
			
			</table>

		</f:form>
	</div>
	</div>
	</div>
	</div>
	
