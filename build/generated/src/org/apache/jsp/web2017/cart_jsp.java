package org.apache.jsp.web2017;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      cuc.web2017.datautil happy = null;
      synchronized (request) {
        happy = (cuc.web2017.datautil) _jspx_page_context.getAttribute("happy", PageContext.REQUEST_SCOPE);
        if (happy == null){
          happy = new cuc.web2017.datautil();
          _jspx_page_context.setAttribute("happy", happy, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <p> \n");
      out.write("             ");
  
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
                 {
      out.write("\n");
      out.write("                <img src=\"");
      out.print(image.get(i));
      out.write("\"/>\n");
      out.write("            </p>\n");
      out.write("             <p>\n");
      out.write("                  商品名称：\n");
      out.write("               ");
      out.print(name.get(i));
      out.write("    \n");
      out.write("              </p> \n");
      out.write("              <p>\n");
      out.write("                  商品价格：\n");
      out.write("               ");
      out.print(price.get(i));
      out.write("    \n");
      out.write("              </p> \n");
      out.write("               \n");
      out.write("              ");
}
      out.write("\n");
      out.write("                <p>\n");
      out.write("                  总额：\n");
      out.write("               ");
      out.print(totalprice);
      out.write("    \n");
      out.write("              </p> \n");
      out.write("               <form action=\"cart.jsp?value=1\" method=\"post\">\n");
      out.write("                  <input type=\"submit\" value=\"下订单\" />\n");
      out.write("              </form>\n");
      out.write("              \n");
      out.write("              ");
}else{
happy.delete();

      out.write("\n");
      out.write("<p>\n");
      out.write("    下单成功\n");
      out.write("</p>\n");
}
      out.write("\n");
      out.write("              \n");
      out.write("            \n");
      out.write("    </body>\n");
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
