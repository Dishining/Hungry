<%--
    Document   : newjsp1
    Created on : 2017-7-7, 15:38:40
    Author     : ThinkPad
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="happy" scope="request" class="cuc.web2017.datautil"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="refresh" content="3;url=happyJune.jsp"/> 
        <title>JSP Page</title>
    </head>
    <body>
        <%String  a=request.getParameter("a");
        happy.changetag(a);
        %>
       
        <h1>菜品已加入订单</h1>
        
       
  


    </body>
</html>
