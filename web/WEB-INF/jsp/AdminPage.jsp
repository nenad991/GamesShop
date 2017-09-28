<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<base href="/GamesShop/"/>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Starting page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <link href="resources/indexStyle.css" rel="stylesheet" type="text/css" />
        <script src="resources/JS/bootJS.JS"></script>    
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>


    <body id="back2">

        <%@include file="navBars2.jsp"%>
        <h3 style="color: orange" font-style="fantasy">Welcome,${name}</h3>
        <center id="g1">Games/AT\neT</center>
        <br/>


    <audio controls autoplay hidden="true">
        <source src="resources/welcome.wav" type="audio/wav"/>
    </audio>
</body>
</html>