<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<base href="/GamesShop/"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Starting page</title>
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="resources/bootJS.js"></script>  
        <link href="resources/indexStyle.css" rel="stylesheet" type="text/css" />
        <link href="resources/reglog.css" rel="stylesheet" type="text/css"/>
    </head>

    <body id="back">

        <%@include file="navBars2.jsp"%>  
        
        <center id="g1">Games/AT\neT</center>
        <br/>
         <%@include file="Avatar.jsp"%>
        <div id="body"> 
            <div  class="leftbox" >
                <center>
                    <h3>${game.gameNames}</h3>
                    <img src="${game.picture}" width="113" height="115" alt="photo 1" class="left" />
                    <p><b>Price: </b> <b> ${game.price}</b> &amp;</p>
                    <p><b>Availability: </b> ${game.availability}</p>
                    <p><b>Game type: </b>${game.gameType}</p>
                    <p><b>Publisher: </b>${game.producer}</p>

                    <div class="clear"></div>
                    <form methot="post" action="cart">
                        <input type="hidden" name="id" value="${g.gameId}"/>
                        <input type="number" min="1" name="quantity" value="1"/>
                        <input type="submit" value="Add to cart"/>
                    </form>
                </center>
            </div> 
        </div>

    </body>
</html>