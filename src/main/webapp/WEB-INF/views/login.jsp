

<html>
<head>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<title>Login page</title>
</head>
<body>


<div class='container'>
        <div class='container'>
        <div class='col-md-4'></div>
         <div class='col-md-4'>
               <div class="jumbotron" style='margin-top: 150px'>
					<h4 class='bg-danger'>Welcome to yoU!!</h4><br>
					
					<div class="form">
               <form action="j_spring_security_check" method="POST">
                     <div class="from-group">
                       <input type="text" name="j_username" class='form-control'placeholder='username' autofocus>
                       <span class='error'></span>
                       </div> <br>
                   <div class="from-group">
                       <input type="password" name="j_password" class='form-control' placeholder="password">
                          <span class='error'></span>
                      
                    </div><br>
                    <input type="submit" class="btn btn-primary form-control" value="login">
               </form>
                </div>
                
         </div>
          <div class='col-md-4'></div>
    </div>
</body>
</html>