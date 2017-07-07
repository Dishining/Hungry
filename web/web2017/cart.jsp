<%-- 
    Document   : cart
    Created on : 2017-7-7, 21:39:34
    Author     : ThinkPad
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="happy" scope="request" class="cuc.web2017.datautil"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <p> 
             <%  
                  if(request.getParameter("value")==null)
                  {
               
                 List image=happy.getImage();
                 List name=happy.getName();
                 List price=happy.getPrice();
                double totalprice=0;
                 for(int i=0;i<price.size();i++)
                 {
                 double total=new Double((price.get(i)).toString());
                  totalprice=totalprice+total;   
                     
                 }
                 
                 
                 
                 
                 for(int i=0;i<image.size();i++)
                 {%>
                <img src="<%=image.get(i)%>"/>
            </p>
             <p>
                  商品名称：
               <%=name.get(i)%>    
              </p> 
              <p>
                  商品价格：
               <%=price.get(i)%>    
              </p> 
               
              <%}%>
                <p>
                  总额：
               <%=totalprice%>    
              </p> 
               <form action="cart.jsp?value=1" method="post">
                  <input type="submit" value="下订单" />
              </form>
              
              <%}else{
happy.delete();
%>
<p>
    下单成功
</p>
<%}%>
              
            
    </body>
</html>
