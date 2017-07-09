<%-- 
    Document   : success1
    Created on : 2017-7-9, 15:20:28
    Author     : ThinkPad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <jsp:useBean id="happy" scope="request" class="cuc.web2017.datautil"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="refresh" content="3;url=happyJune.jsp"/> 
        <title>success</title>
    </head>
    <body>
        <%
        happy.delete();%>
         <style>
* { margin: 0; padding: 0;}
ul { list-style-type: none;}
body { font: 14px "Microsoft Yahei"; overflow-x: hidden;   
background-image: url(img/bg.jpg);
	background-size:100%;
	background-repeat:no-repeat;
a {
	font-size: 36px;
	color: #000000;
}
a:link {
	text-decoration: none;
}
a:visited {
	text-decoration: none;
}
a:hover {
	text-decoration: none;
}
a:active {
	text-decoration: none;
}
	background-size:100%;
	background-repeat:no-repeat;
} 
</style>   
        <h1 style="color: #F2ECEC; font-style: italic; font-weight: bolder; font-size: 80px;margin: 200px auto 10px;text-align:left;margin-left:200px">下单成功！</h1>
    </body>
</html>
