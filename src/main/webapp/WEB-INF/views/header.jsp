<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Take it easy- Best offer for rent</title>
    <link rel="stylesheet" type="text/css" href=../css/bootstrap.min.css"/> 
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
    <nav class="navbar navbar-inverse ">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand">Best offer for Rent just for you</a>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                     <li><a >login</a></li>
                   
                    <li><a href ="<c:url value = "/admin/index"/>">Admin save Category</a> </li>
                     <li><a href ="<c:url value = "/admin/listCat"/>">Admin  List Category</a> </li>
                       <li><a href ="<c:url value = "/adminad/home"/>">Annoncer save Ad</a> </li>
                        <li><a href ="<c:url value = "/adminad/listAd"/>">Annoncer list Ads</a> </li>
                       <li><a href ="<c:url value = "/j_spring_security_logout "/>">Log out</a> </li>     
                     


                      </ul>
                      <ul class="nav navbar-nav navbar-right">
                     <li><a > Register </a></li>
       
    </ul>


            </div>
        </div>
    </nav>
    

    

   
</body>
</html>
