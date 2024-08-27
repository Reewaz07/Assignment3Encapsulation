<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<style type="text/css">
*{
padding: 0;
margin:0;

}
body{



background-image: url("https://img.freepik.com/free-vector/blood-donation-symbol-with-hand-blood-bag_1308-115904.jpg");
background-repeat: no-repeat;
background-size: cover;


}
h1
{
display: flex;
justify-content: center;
align-items: center;
font-size:50px;
font-style:normal;
font-family: sans-serif;
color:black;
height: 100px;


}
.anchor{
margin-top: 20px;
font-size: 20px;
margin-left:10px;


}

	

</style>
</head>

<body>
<h1>Texas Blood Bank:${uname}</h1>
<p>Name: ${ame}
email: ${mail }
date:${dete}
gender:${ex }</p>
<div class="anchor">
<a href="login.jsp" >Login Page</a>
<br>
<a href="register.jsp" >Register</a>



</div>


</body>
</html>