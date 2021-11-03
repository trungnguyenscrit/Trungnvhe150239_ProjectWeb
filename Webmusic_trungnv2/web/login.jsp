<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Created By CodingNepal -->
<html lang="en" dir="ltr">
   <head>
      <meta charset="utf-8">
      <title>Login and Registration Form in HTML | CodingNepal</title>
      <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
   <body>
      <div class="wrapper">
         <div class="title-text">
            <div class="title login">
               Login Form
            </div>
            <div class="title signup">
               Signup Form
            </div>
         </div>
         <div class="form-container">
            <div class="slide-controls">
               <input type="radio" name="slide" id="login" checked>
               <input type="radio" name="slide" id="signup">
               <label for="login" class="slide login">Login</label>
               <label for="signup" class="slide signup">Signup</label>
               <div class="slider-tab"></div>
            </div>
            <div class="form-inner">
                <c:set var="cookie" value="${pageContext.request.cookies}"/>
               <form action="user?action=login" class="login" method="POST">
                   <h4 style="color: #c41a16; align-content: center">${pass}</h4>
                   <h4 style="color: #c41a16; align-content: center">${mailerror}</h4>
                   <h4 style="color: #c41a16; align-content: center">${error}</h4>
                  <div class="field">
                     <input type="text" placeholder="Email Address" value="${cookie.user_email.value}" name="email" required>
                  </div>
                  <div class="field">
                     <input type="password" placeholder="Password" value="${cookie.user_pass.value}" name="pass" required>
                  </div>
                  <div class="pass-link">
                     <label>
                         <input name="remember" ${(cookie.rem.value eq 'ON')?"checked":""} type="checkbox" value="ON">
                         Keep me signed in
                      </label>
                  </div>
                  <div class="field btn">
                     <div class="btn-layer"></div>
                     <input type="submit" value="Login">
                  </div>
                  <div class="signup-link">
                     Not a member? <a href="">Signup now</a>
                  </div>
               </form>
               <form action="user?action=register" method="POST" class="signup">
                   
                   <div class="field">
                     <input type="text" placeholder="Your Name" name="name" required>
                  </div>
                  <div class="field">
                     <input type="text" placeholder="Email Address" name="email" required>
                  </div>
                  <div class="field">
                     <input type="password" placeholder="Password" name="pass" required>
                  </div>
                  <div class="field">
                     <input type="password" placeholder="Confirm password" name="repass" required>
                  </div>
                  <div class="field btn">
                     <div class="btn-layer"></div>
                     <input type="submit" value="Signup">
                  </div>
               </form>
            </div>
         </div>
      </div>
      <script>
         const loginText = document.querySelector(".title-text .login");
         const loginForm = document.querySelector("form.login");
         const loginBtn = document.querySelector("label.login");
         const signupBtn = document.querySelector("label.signup");
         const signupLink = document.querySelector("form .signup-link a");
         signupBtn.onclick = (()=>{
           loginForm.style.marginLeft = "-50%";
           loginText.style.marginLeft = "-50%";
         });
         loginBtn.onclick = (()=>{
           loginForm.style.marginLeft = "0%";
           loginText.style.marginLeft = "0%";
         });
         signupLink.onclick = (()=>{
           signupBtn.click();
           return false;
         });
      </script>
   </body>
</html>
