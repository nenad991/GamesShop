<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<base href="/GamesShop/"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Games/AT\neT</title>
       <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="resources/bootJS.js"></script>  
        <link href="resources/indexStyle.css" rel="stylesheet" type="text/css" />
        <link href="resources/reglog.css" rel="stylesheet" type="text/css"/>
    </head>
    <body id="back">
        <%@include file="navBars.jsp"%>
        <center id="g1">Games/AT\neT</center>
        <br/>
        <%@include file="Avatar.jsp" %>

        <h3 style="color: orange" font-style="fantasy">${success}</h3>
        <center>
            <iframe  width="425" height="344" src="https://www.youtube.com/embed/eYNCCu0y-Is" frameborder="0" allowfullscreen></iframe>
        </center>
       

    </body>
</html>
