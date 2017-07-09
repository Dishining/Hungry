package org.apache.jsp.web2017;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class success1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>success</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <style>\n");
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
      out.write("        <h1 style=\"color: #F2ECEC; font-style: italic; font-weight: bolder; font-size: 80px;margin: 200px auto 10px;text-align:left;margin-left:200px\">下单成功！</h1>\n");
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
