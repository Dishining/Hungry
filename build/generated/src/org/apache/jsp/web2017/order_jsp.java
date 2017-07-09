package org.apache.jsp.web2017;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

public final class order_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write(" \n");
      out.write("<html lang=\"zh\" class=\"no-js\">\n");
      out.write("    ");
      cuc.web2017.datautil happy = null;
      synchronized (request) {
        happy = (cuc.web2017.datautil) _jspx_page_context.getAttribute("happy", PageContext.REQUEST_SCOPE);
        if (happy == null){
          happy = new cuc.web2017.datautil();
          _jspx_page_context.setAttribute("happy", happy, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("<head>\n");
      out.write("   \n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"> \n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>hungry</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\"> <!-- CSS reset -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/zzsc-demo.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\"> <!-- Resource style -->\n");
      out.write("<script src=\"js/modernizr-custom.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" <style>\n");
      out.write("* { margin: 0; padding: 0;}\n");
      out.write("ul { list-style-type: none;}\n");
      out.write("body { font: 14px \"Microsoft Yahei\"; overflow-x: hidden;   \n");
      out.write("background-image: url(img/bg.jpg);\n");
      out.write("\tbackground-size:100%;\n");
      out.write("\tbackground-repeat:no-repeat;\n");
      out.write("a {\n");
      out.write("\tfont-size: 36px;\n");
      out.write("\tcolor: #000000;\n");
      out.write("}\n");
      out.write("a:link {\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("a:visited {\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("a:hover {\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("a:active {\n");
      out.write("\ttext-decoration: none;\n");
      out.write("}\n");
      out.write("\tbackground-size:100%;\n");
      out.write("\tbackground-repeat:no-repeat;\n");
      out.write("} \n");
      out.write("</style>   \n");
      out.write("\n");
      out.write("     ");

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
                 
                 
                 
                 
      out.write("\n");
      out.write("<h1 style=\"color: #F2ECEC; font-style: italic; font-weight: bolder; font-size: 80px;margin: 200px auto 10px;text-align: left;margin-left:200px\">Hungry</h1>            \n");
      out.write("<div style=\"text-align:center;clear:both\">\n");
      out.write("<script src=\"/gg_bd_ad_720x90.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"/follow.js\" type=\"text/javascript\"></script>\n");
      out.write("</div>\n");
      out.write("<div class=\"cd-svg-clipped-slider\" data-selected=\"M780,0H20C8.954,0,0,8.954,0,20v760c0,11.046,8.954,20,20,20h760c11.046,0,20-8.954,20-20V20\n");
      out.write("C800,8.954,791.046,0,780,0z\" data-lateral=\"M795.796,389.851L410.149,4.204c-5.605-5.605-14.692-5.605-20.297,0L4.204,389.851\n");
      out.write("c-5.605,5.605-5.605,14.692,0,20.297l385.648,385.648c5.605,5.605,14.692,5.605,20.297,0l385.648-385.648\n");
      out.write("C801.401,404.544,801.401,395.456,795.796,389.851z\">\n");
      out.write("  ");
 for(int i=0;i<image.size();i++)
                 {
                       if(i==0){
      out.write("    \n");
      out.write(" \n");
      out.write("\t<div class=\"gallery-wrapper\">\n");
      out.write("                     <ul class=\"gallery\">  \n");
      out.write("\t\t\t<li class=\"left\">\n");
      out.write("\t\t\t\t<div class=\"svg-wrapper\">\n");
      out.write("\t\t\t\t\t<svg viewBox=\"0 0 800 800\">\n");
      out.write("\t\t\t\t\t\t<title>Animated SVG</title>\n");
      out.write("\t\t\t\t\t\t<defs>\n");
      out.write("\t\t\t\t\t\t\t<clipPath id=\"cd-image-1\">\n");
      out.write("\t\t\t\t\t\t\t\t<path id=\"cd-morphing-path-1\" d=\"M795.796,389.851L410.149,4.204c-5.605-5.605-14.692-5.605-20.297,0L4.204,389.851 c-5.605,5.605-5.605,14.692,0,20.297l385.648,385.648c5.605,5.605,14.692,5.605,20.297,0l385.648-385.648 C801.401,404.544,801.401,395.456,795.796,389.851z\"/>\n");
      out.write("\t\t\t\t\t\t\t</clipPath>\n");
      out.write("\t\t\t\t\t\t</defs>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<image height='800px' width=\"800px\" clip-path=\"url(#cd-image-1)\" xlink:href=\"");
      out.print(image.get(i));
      out.write("\"></image>\n");
      out.write("\t\t\t\t\t\t<use xlink:href=\"#cd-morphing-path-1\" class=\"cover-layer\" />\n");
      out.write("\t\t\t\t\t</svg>\n");
      out.write("\t\t\t\t</div> <!-- .svg-wrapper -->\n");
      out.write("\t\t\t</li>\n");
      out.write("                     ");
}else if(i==1){

      out.write("\n");
      out.write(" \n");
      out.write("\t\t\t<li class=\"selected\">\n");
      out.write("\t\t\t\t<div class=\"svg-wrapper\">\n");
      out.write("\t\t\t\t\t<svg viewBox=\"0 0 800 800\">\n");
      out.write("\t\t\t\t\t\t<title>Animated SVG</title>\n");
      out.write("\t\t\t\t\t\t<defs>\n");
      out.write("\t\t\t\t\t\t\t<clipPath id=\"cd-image-2\">\n");
      out.write("\t\t\t\t\t\t\t\t<path id=\"cd-morphing-path-2\" d=\"M780,0H20C8.954,0,0,8.954,0,20v760c0,11.046,8.954,20,20,20h760c11.046,0,20-8.954,20-20V20 C800,8.954,791.046,0,780,0z\"/>\n");
      out.write("\t\t\t\t\t\t\t</clipPath>\n");
      out.write("\t\t\t\t\t\t</defs> \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<image height='800px' width=\"800px\" clip-path=\"url(#cd-image-2)\" xlink:href=\"");
      out.print(image.get(i));
      out.write("\"></image>\n");
      out.write("\t\t\t\t\t\t<use xlink:href=\"#cd-morphing-path-2\" class=\"cover-layer\" />\n");
      out.write("\t\t\t\t\t</svg>\n");
      out.write("\t\t\t\t</div> <!-- .svg-wrapper -->\n");
      out.write("\t\t\t</li>\n");
      out.write("                                                 \n");
      out.write("            ");
}else if(i==2){
      out.write("\n");
      out.write(" <li class=\"right\">\n");
      out.write("          <div class=\"svg-wrapper\">\n");
      out.write("\t\t\t\t\t<svg viewBox=\"0 0 800 800\">\n");
      out.write("\t\t\t\t\t\t<title>Animated SVG</title>\n");
      out.write("\t\t\t\t\t\t<defs>\n");
      out.write("\t\t\t\t\t\t\t<clipPath id=\"cd-image-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<path id=\"cd-morphing-path-3\" d=\"M795.796,389.851L410.149,4.204c-5.605-5.605-14.692-5.605-20.297,0L4.204,389.851 c-5.605,5.605-5.605,14.692,0,20.297l385.648,385.648c5.605,5.605,14.692,5.605,20.297,0l385.648-385.648 C801.401,404.544,801.401,395.456,795.796,389.851z\"/>\n");
      out.write("\t\t\t\t\t\t\t</clipPath>\n");
      out.write("\t\t\t\t\t\t</defs>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<image height='800px' width=\"800px\" clip-path=\"url(#cd-image-3)\" xlink:href=\"");
      out.print(image.get(i));
      out.write("\"></image>\n");
      out.write("\t\t\t\t\t\t<use xlink:href=\"#cd-morphing-path-3\" class=\"cover-layer\" />\n");
      out.write("\t\t\t\t\t</svg>\n");
      out.write("\t\t\t\t</div> <!-- .svg-wrapper -->\n");
      out.write("\t\t\t</li>");
}else{
      out.write("\n");
      out.write("             \n");
      out.write("\t\t\t<li>\n");
      out.write("\t\t\t\t<div class=\"svg-wrapper\">\n");
      out.write("\t\t\t\t\t<svg viewBox=\"0 0 800 800\">\n");
      out.write("\t\t\t\t\t\t<title>Animated SVG</title>\n");
      out.write("\t\t\t\t\t\t<defs>\n");
      out.write("\t\t\t\t\t\t\t<clipPath id=\"cd-image-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<path id=\"cd-morphing-path-4\" d=\"M795.796,389.851L410.149,4.204c-5.605-5.605-14.692-5.605-20.297,0L4.204,389.851 c-5.605,5.605-5.605,14.692,0,20.297l385.648,385.648c5.605,5.605,14.692,5.605,20.297,0l385.648-385.648 C801.401,404.544,801.401,395.456,795.796,389.851z\"/>\n");
      out.write("\t\t\t\t\t\t\t</clipPath>\n");
      out.write("\t\t\t\t\t\t</defs>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<image height='800px' width=\"800px\" clip-path=\"url(#cd-image-4)\" xlink:href=\"");
      out.print(image.get(i));
      out.write("\"></image>\n");
      out.write("\t\t\t\t\t\t<use xlink:href=\"#cd-morphing-path-4\" class=\"cover-layer\" />\n");
      out.write("\t\t\t\t\t</svg>\n");
      out.write("\t\t\t\t</div> <!-- .svg-wrapper -->\n");
      out.write("\t\t\t</li>\n");
      out.write("\t</ul>\n");
      out.write("\t\t\t \n");
      out.write("\t</div> <!-- .gallery-wrapper -->\n");
      out.write("   ");
}}    
     for(int j=0;j<image.size();j++)
                 {
                       if(j==0){
      out.write("   \n");
      out.write("        <ul class=\"caption\">\t\t \n");
      out.write("\t\t<li class=\"left\">");
      out.print(name.get(j));
      out.write(':');
      out.write('￥');
      out.print(price.get(j));
      out.write(" </li>\n");
      out.write("\t\t\n");
      out.write("                 ");
}else if(j==1){
      out.write("\n");
      out.write("             \n");
      out.write("\t\t<li class=\"selected\">");
      out.print(name.get(j));
      out.write(':');
      out.write('￥');
      out.print(price.get(j));
      out.write(" </li>\n");
      out.write("\t\t ");
}else if(j==2){
      out.write("\n");
      out.write("                \n");
      out.write("\t\t<li class=\"right\">");
      out.print(name.get(j));
      out.write(':');
      out.write('￥');
      out.print(price.get(j));
      out.write(" </li>\n");
      out.write("\t\t ");
}else{
      out.write("\n");
      out.write("        <li>");
      out.print(name.get(j));
      out.write(':');
      out.write('￥');
      out.print(price.get(j));
      out.write(" </li>\n");
      out.write("        </ul>\n");
      out.write("                 ");
}}
      out.write("\n");
      out.write("               \n");
      out.write("               </div> <!-- .cd-svg-clipped-slider -->\n");
      out.write("              <p style=\"text-align: center; font-size: 40px;color:#FFF;background-color: black\">总金额：");
      out.print(totalprice);
      out.write("\n");
      out.write("              </p>\n");
      out.write("               \n");
      out.write(" \n");
      out.write("     <form action=\"order.jsp?value=1\" method=\"post\"style=\"text-align: center;background-color: black\">\n");
      out.write("  <input type=\"submit\" name=\"button\" id=\"button\" value=\"提交订单\" style=\"width: 100px;\n");
      out.write("    height: 50px;\n");
      out.write("    background-color: #070a0c;\n");
      out.write("    font-size: 15pt;\n");
      out.write("    color: #f9f9f9;\" > </form>\n");
      out.write("      ");
      out.write("\n");
      out.write("\n");
      out.write("               \n");
      out.write("               \n");
      out.write("               \n");
}else{
happy.delete();

      out.write("\n");
      out.write("<p>\n");
      out.write("    <h1 style=\"color: #F2ECEC; font-style: italic; font-weight: bolder; font-size: 80px;margin: 200px auto 10px;text-align: left;margin-left:200px\">下单成功！</h1> \n");
      out.write("</p>\n");
}
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"js/jquery-2.1.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/snap.svg-min.js\"></script>\n");
      out.write("<script src=\"js/main.js\"></script> <!-- Resource jQuery -->\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
