<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="css/bootstap.css">
      <link rel="stylesheet" href="css/custom.css">
      <title> Jsp Ajax 실시간 회원제 채팅 서비스</title>
      <script type="http://code.jquery.com/jquery-3.1.1.min.js"></script>
      
   </head>
   <body>
      <%
       String userID = null;
       if (session.getAttribute("userID") != null){
           userID = (String) session.getAttribute("userID");
       }
      %>
      <nav class="navbar navbar-default">
        <div class="navbar-header">
      
         <button type="button" class="navbar-toggle collapsed"
             data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
             aria-expanded="false">
             <span class="icon-bar"></span>
             <span class="icon-bar"></span>
             <span class="icon-bar"></span>
         버튼</button>
        </div>
      </nav>
   </body>
</html>