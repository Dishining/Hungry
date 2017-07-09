

<%@page import="java.util.List"%>
<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" %> 
<html lang="zh" class="no-js">
    <jsp:useBean id="happy" scope="request" class="cuc.web2017.datautil"/>
<head>
   
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>hungry</title>
<link rel="stylesheet" href="css/reset.css"> <!-- CSS reset -->
<link rel="stylesheet" type="text/css" href="css/zzsc-demo.css">
<link rel="stylesheet" href="css/style.css"> <!-- Resource style -->
<script src="js/modernizr-custom.js"></script>

</head>
<body>
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

     <%
                 
               
                 List image=happy.getImage();
                 List name=happy.getName();
                 List price=happy.getPrice();
                double totalprice=0;
                 for(int i=0;i<price.size();i++)
                 {
                 double total=new Double((price.get(i)).toString());
                  totalprice=totalprice+total;   
                     
                 }
                 
                 
                 
                 %>
<h1 style="color: #F2ECEC; font-style: italic; font-weight: bolder; font-size: 80px;margin: 200px auto 10px;text-align: left;margin-left:200px">Hungry</h1>            
<div style="text-align:center;clear:both">
<script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
<script src="/follow.js" type="text/javascript"></script>
</div>
<div class="cd-svg-clipped-slider" data-selected="M780,0H20C8.954,0,0,8.954,0,20v760c0,11.046,8.954,20,20,20h760c11.046,0,20-8.954,20-20V20
C800,8.954,791.046,0,780,0z" data-lateral="M795.796,389.851L410.149,4.204c-5.605-5.605-14.692-5.605-20.297,0L4.204,389.851
c-5.605,5.605-5.605,14.692,0,20.297l385.648,385.648c5.605,5.605,14.692,5.605,20.297,0l385.648-385.648
C801.401,404.544,801.401,395.456,795.796,389.851z">
  <% for(int i=0;i<image.size();i++)
                 {
                       if(i==0){%>    
 
	<div class="gallery-wrapper">
                     <ul class="gallery">  
			<li class="left">
				<div class="svg-wrapper">
					<svg viewBox="0 0 800 800">
						<title>Animated SVG</title>
						<defs>
							<clipPath id="cd-image-1">
								<path id="cd-morphing-path-1" d="M795.796,389.851L410.149,4.204c-5.605-5.605-14.692-5.605-20.297,0L4.204,389.851 c-5.605,5.605-5.605,14.692,0,20.297l385.648,385.648c5.605,5.605,14.692,5.605,20.297,0l385.648-385.648 C801.401,404.544,801.401,395.456,795.796,389.851z"/>
							</clipPath>
						</defs>
						
						<image height='800px' width="800px" clip-path="url(#cd-image-1)" xlink:href="<%=image.get(i)%>"></image>
						<use xlink:href="#cd-morphing-path-1" class="cover-layer" />
					</svg>
				</div> <!-- .svg-wrapper -->
			</li>
                     <%}else if(i==1){
%>
 
			<li class="selected">
				<div class="svg-wrapper">
					<svg viewBox="0 0 800 800">
						<title>Animated SVG</title>
						<defs>
							<clipPath id="cd-image-2">
								<path id="cd-morphing-path-2" d="M780,0H20C8.954,0,0,8.954,0,20v760c0,11.046,8.954,20,20,20h760c11.046,0,20-8.954,20-20V20 C800,8.954,791.046,0,780,0z"/>
							</clipPath>
						</defs> 
						
						<image height='800px' width="800px" clip-path="url(#cd-image-2)" xlink:href="<%=image.get(i)%>"></image>
						<use xlink:href="#cd-morphing-path-2" class="cover-layer" />
					</svg>
				</div> <!-- .svg-wrapper -->
			</li>
                                                 
            <%}else if(i==2){%>
 <li class="right">
          <div class="svg-wrapper">
					<svg viewBox="0 0 800 800">
						<title>Animated SVG</title>
						<defs>
							<clipPath id="cd-image-3">
								<path id="cd-morphing-path-3" d="M795.796,389.851L410.149,4.204c-5.605-5.605-14.692-5.605-20.297,0L4.204,389.851 c-5.605,5.605-5.605,14.692,0,20.297l385.648,385.648c5.605,5.605,14.692,5.605,20.297,0l385.648-385.648 C801.401,404.544,801.401,395.456,795.796,389.851z"/>
							</clipPath>
						</defs>
						
						<image height='800px' width="800px" clip-path="url(#cd-image-3)" xlink:href="<%=image.get(i)%>"></image>
						<use xlink:href="#cd-morphing-path-3" class="cover-layer" />
					</svg>
				</div> <!-- .svg-wrapper -->
			</li><%}else{%>
             
			<li>
				<div class="svg-wrapper">
					<svg viewBox="0 0 800 800">
						<title>Animated SVG</title>
						<defs>
							<clipPath id="cd-image-4">
								<path id="cd-morphing-path-4" d="M795.796,389.851L410.149,4.204c-5.605-5.605-14.692-5.605-20.297,0L4.204,389.851 c-5.605,5.605-5.605,14.692,0,20.297l385.648,385.648c5.605,5.605,14.692,5.605,20.297,0l385.648-385.648 C801.401,404.544,801.401,395.456,795.796,389.851z"/>
							</clipPath>
						</defs>
						
						<image height='800px' width="800px" clip-path="url(#cd-image-4)" xlink:href="<%=image.get(i)%>"></image>
						<use xlink:href="#cd-morphing-path-4" class="cover-layer" />
					</svg>
				</div> <!-- .svg-wrapper -->
			</li>
	</ul>
			 
	</div> <!-- .gallery-wrapper -->
   <%}}    
     for(int j=0;j<image.size();j++)
                 {
                       if(j==0){%>   
        <ul class="caption">		 
		<li class="left"><%=name.get(j)%>:￥<%=price.get(j)%> </li>
		
                 <%}else if(j==1){%>
             
		<li class="selected"><%=name.get(j)%>:￥<%=price.get(j)%> </li>
		 <%}else if(j==2){%>
                
		<li class="right"><%=name.get(j)%>:￥<%=price.get(j)%> </li>
		 <%}else{%>
        <li><%=name.get(j)%>:￥<%=price.get(j)%> </li>
        </ul>
                 <%}}%>
               
               </div> <!-- .cd-svg-clipped-slider -->
              <p style="text-align: center; font-size: 40px;color:#FFF;background-color: black">总金额：<%=totalprice%>
              </p>
               
 
     <form action="success1.jsp" method="post"style="text-align: center;background-color: black">
  <input type="submit" name="button" id="button" value="提交订单" style="width: 100px;
    height: 50px;
    background-color: #070a0c;
    font-size: 15pt;
    color: #f9f9f9;" > </form>

<script src="js/jquery-2.1.1.min.js" type="text/javascript"></script>
<script src="js/snap.svg-min.js"></script>
<script src="js/main.js"></script> <!-- Resource jQuery -->
</body>
</html>
