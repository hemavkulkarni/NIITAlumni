<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
   pageEncoding="ISO-8859-1"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <script>
  function myFunction() {
   var pass1 = document.getElementById("pass1").value;
   var pass2 = document.getElementById("pass2").value;
   var ok = true;
   if (pass1 != pass2) {
       alert("Passwords Do not match");
       document.getElementById("pass1").style.borderColor = "#E34234";
       document.getElementById("pass2").style.borderColor = "#E34234";
       ok = false;
   }
   //else {
      // alert("Passwords Match!!!");
  // }
   return ok;
}
  
  </script>
  </head>
<body >
<%@include file="Header1.jsp"%>
 <div class="container">
  <div class="row">
    <div class="Absolute-Center is-Responsive">
      <div id="logo-container"></div>
      <div class="col-sm-12 col-md-10 col-md-offset-1">
      <br/>
      <div style="border:2px solid;padding:25px;border-radius:5px 5px 5px 5px;box-shadow:2px 2px 2px 2px;background-color:#e6ebff">
      <div class="form-group input-group">
          
            <center><h3><a>New User? Register Here</a></h3></center>          
          </div>

        <form:form method="POST" action="saveUser" class="login-form" commandName="userData">  
         
         <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
            <form:input class="form-control" type="text" path='username'  placeholder="User Name"/>   
            <form:errors path="username" cssStyle="color: #ff0000;"/>       
          </div>
          <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
            <form:input class="form-control" id="pass1" type="password" path='password' placeholder="Password"/>   
            <form:errors path="password" cssStyle="color: #ff0000;"/>     
          </div>
          <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
            <form:input class="form-control" id="pass2" type="password" path='rpassword' placeholder="Confirm Password"/>    
            <form:errors path="rpassword" cssStyle="color: #ff0000;"/>    
          </div>
          <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
            <form:input class="form-control" type="text" path='fullname'  placeholder="Surname Firstname Middle"/>   
            <form:errors path="fullname" cssStyle="color: #ff0000;"/>       
          </div>
          <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
            <form:input class="form-control" path='email' placeholder="Alternate Email ID"/>
            <form:errors path="email" cssStyle="color: #ff0000;"/>        
          </div>          
          <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
            <form:input class="form-control" path='phone' placeholder="Mobile Number"/>
            <form:errors path="phone" cssStyle="color: #ff0000;"/>        
          </div>          
          <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
            <select path="gender"  id="gender" name="gender" class="form-control">
			   <option value="select">--- Select ---</option> 
			   <option value="Male">Male</option>
			   <option value="Female">Female</option>		 
			</select>			      
          </div>
          <div class="form-group input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
            <form:input class="form-control" type="text" path='city'  placeholder="City"/>   
            <form:errors path="city" cssStyle="color: #ff0000;"/>       
          </div> 
          <div class="form-group">
            <button class="btn btn-def btn-block"  onClick="return myFunction()">Register</button>
          </div>          
        </form:form>      </div>  
    </div>    
  </div>
</div>
</div>
<%@include file="Footer.jsp"%>
</body>
</html>