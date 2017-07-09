package org.apache.jsp.web2017;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class success_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"zh\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"refresh\" content=\"3;url=happyJune.jsp\"/> \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/zzsc.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\t<div class=\"item\" id=\"pink\">\n");
      out.write("\t\t<div class=\"chewing\">\n");
      out.write("\t\t\t<div class=\"eye left\"><span></span></div>\n");
      out.write("\t\t\t<div class=\"eye right\"><span></span></div>\n");
      out.write("\t\t\t<div class=\"mounth\"></div>\n");
      out.write("\t\t\t\t<div class=\"arm left\"></div>\n");
      out.write("\t\t\t\t<div class=\"arm right\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"shadow\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"item\" id=\"orange\">\n");
      out.write("\t\t<div class=\"chewing\">\n");
      out.write("\t\t\t<div class=\"eye left\"><span></span></div>\n");
      out.write("\t\t\t<div class=\"eye right\"><span></span></div>\n");
      out.write("\t\t\t<div class=\"mounth\"></div>\n");
      out.write("\t\t\t<div class=\"arm left\"></div>\n");
      out.write("\t\t\t<div class=\"arm right\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"shadow\"></div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"item\" id=\"blue\">\n");
      out.write("\t\t<div class=\"chewing\">\n");
      out.write("\t\t\t<div class=\"eye left\"><span></span></div>\n");
      out.write("\t\t\t<div class=\"eye right\"><span></span></div>\n");
      out.write("\t\t\t<div class=\"mounth\"></div>\n");
      out.write("\t\t\t<div class=\"arm left\"></div>\n");
      out.write("\t\t\t<div class=\"arm right\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"shadow\"></div>\n");
      out.write("\t</div>\n");
      out.write("            </div>\n");
      out.write("<h1 style=\"color: #F2ECEC; font-style: italic; font-weight: bolder; font-size:40px;margin: 300px auto 10px;text-align:center;\">成功加入订单!</h1>\n");
      out.write("        ");
String  a=request.getParameter("a");
        happy.changetag(a);
        
      out.write("\n");
      out.write("\n");
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
