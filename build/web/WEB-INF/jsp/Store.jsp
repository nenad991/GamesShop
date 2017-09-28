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

        <%@include file="navBars.jsp"%>       
        <center id="g1">Games/AT\neT</center>
        <br/>
         <%@include file="Avatar.jsp"%>
        <dl id="browse" >
            <form action="" method="get">
                <dt><input type="text" name="search" id="search" placeholder="Search games" style="color: black"> <span class="glyphicon glyphicon-search"></span></dt>
            </form>
            <dt>Game type category list</dt>
            <c:forEach items="${gamet}" var="gat">

                <dd><a href="${gat.gameTypeId}">${gat.typeName}</a></dd>
                </c:forEach>
        </dl> 
        <div id="body"> 
            <c:forEach items="${game}" var="g" varStatus="counter">
                <center>
                    <div   class="${counter.count%2==0?"rightbox":"leftbox"}" >
                        <h3>${g.gameNames}</h3>
                        <img src="${g.picture}" width="113" height="115" alt="photo 1" class="left" />
                        <p><b>Price: </b> <b> ${g.price}</b> $</p>
                        <p><b>Availability: </b> ${g.availability}</p>
                        <p><b>Game type: </b>${g.gameType}</p>
                        <p><b>Publisher: </b>${g.producer}</p>
                        <p  class="readmore"><a  class="login" style="color: red">BUY <b>NOW</b></a></p>
                        <div class="clear"></div>
                    </div>
                </center>
            </c:forEach>               
        </div>
    </body>
</html>