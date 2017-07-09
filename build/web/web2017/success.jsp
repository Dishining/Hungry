<%--
    Document   : newjsp1
    Created on : 2017-7-7, 15:38:40
    Author     : ThinkPad
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="happy" scope="request" class="cuc.web2017.datautil"/>
<!DOCTYPE html>
<html lang="zh">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="refresh" content="3;url=happyJune.jsp"/> 
        <title>success</title>
        <link rel="stylesheet" type="text/css" href="css/zzsc.css">
    </head>
    <body>
        <div class="container">
	<div class="item" id="pink">
		<div class="chewing">
			<div class="eye left"><span></span></div>
			<div class="eye right"><span></span></div>
			<div class="mounth"></div>
				<div class="arm left"></div>
				<div class="arm right"></div>
			</div>
			<div class="shadow"></div>
		</div>

	<div class="item" id="orange">
		<div class="chewing">
			<div class="eye left"><span></span></div>
			<div class="eye right"><span></span></div>
			<div class="mounth"></div>
			<div class="arm left"></div>
			<div class="arm right"></div>
		</div>
		<div class="shadow"></div>
	</div>

	<div class="item" id="blue">
		<div class="chewing">
			<div class="eye left"><span></span></div>
			<div class="eye right"><span></span></div>
			<div class="mounth"></div>
			<div class="arm left"></div>
			<div class="arm right"></div>
		</div>
		<div class="shadow"></div>
	</div>
            </div>
<h1 style="color: #F2ECEC; font-style: italic; font-weight: bolder; font-size:40px;margin: 300px auto 10px;text-align:center;">成功加入订单!</h1>
        <%String  a=request.getParameter("a");
        happy.changetag(a);
        %>

    </body>
</html>
