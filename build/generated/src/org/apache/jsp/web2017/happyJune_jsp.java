package org.apache.jsp.web2017;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class happyJune_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"zh-CN\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("<title>hungry</title>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("<style>\n");
      out.write("* { margin: 0; padding: 0;}\n");
      out.write("ul { list-style-type: none;}\n");
      out.write("body { font: 14px \"Microsoft Yahei\"; overflow-x: hidden;background-color: #9E9490;  \n");
      out.write("background-image: url(img/bg.jpg);\n");
      out.write("\n");
      out.write("\tbackground-size:100%;\n");
      out.write("\tbackground-repeat:no-repeat;\n");
      out.write("}\n");
      out.write(" h1 { width: 900px; margin: 40px auto 100px; font: 32px \"Microsoft Yahei\"; text-align:center; color: #D3D3D3; }\n");
      out.write("</style>\n");
      out.write(" \n");
      out.write(" \n");
      out.write("<script src=\"js/jquery-1.8.3.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("$(function(){\n");
      out.write("\tvar $animate = $('#animate');\n");
      out.write("\tvar $opposite = $('#opposite');\n");
      out.write("\t$(\".wrap\").hover(function(){\n");
      out.write("\t\t$animate.removeClass();\n");
      out.write("\t\t$opposite.removeClass();\n");
      out.write("\t\t$animate.addClass(\"test\");\n");
      out.write("\t\t$opposite.addClass('test2');\n");
      out.write("\t},function(){\n");
      out.write("\t\t$animate.removeClass();\n");
      out.write("\t\t$opposite.removeClass();\n");
      out.write("\t\t$animate.addClass(\"test2\");\n");
      out.write("\t\t$opposite.addClass('test');\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\t$(\".well-item\").hover(function(){\n");
      out.write("\t\t$(this).find(\".correct\").children().removeClass();\n");
      out.write("\t\t$(this).find(\".opposite\").children().removeClass();\n");
      out.write("\t\t$(this).find(\".correct\").children().addClass(\"test\");\n");
      out.write("\t\t$(this).find(\".opposite\").children().addClass('test2');\n");
      out.write("\t},function(){\n");
      out.write("\t\t$(this).find(\".correct\").children().removeClass();\n");
      out.write("\t\t$(this).find(\".opposite\").children().removeClass();\n");
      out.write("\t\t$(this).find(\".correct\").children().addClass(\"test2\");\n");
      out.write("\t\t$(this).find(\".opposite\").children().addClass('test');\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  \n");
      out.write("<style>\n");
      out.write(" .nav ul{\n");
      out.write("width:1000px;\n");
      out.write("margin:0px auto;\n");
      out.write("height:38px;\n");
      out.write("padding:0;\n");
      out.write("}\n");
      out.write(".nav ul li{\n");
      out.write("float:left;\n");
      out.write("}\n");
      out.write(".nav ul li a{\n");
      out.write("width:180px;\n");
      out.write("height:35px;\n");
      out.write("line-height:28px;\n");
      out.write("background:black;\n");
      out.write("color:#FFF;\n");
      out.write("margin:10px 35px;\n");
      out.write("font-size:15px;\n");
      out.write("display:block;\n");
      out.write("text-align:center;\n");
      out.write("text-decoration:none;\n");
      out.write("}\n");
      out.write(" \n");
      out.write(".nav ul li a:hover{\n");
      out.write("width:178px;\n");
      out.write("height:33px;\n");
      out.write("line-height:28px;\n");
      out.write("border:1px solid black;\n");
      out.write("color:black;\n");
      out.write("background:#FFF;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<h1 style=\"color: #F2ECEC; font-style: italic; font-weight: bolder; font-size: 80px;margin: 150px auto 10px;text-align: left;\">Hungry</h1>\n");
      out.write("<div class=\"nav\">\n");
      out.write("<ul>\n");
      out.write("\t\t\t<li id=\"home\"><a href=\"\"><b>HOW</b></a></li>\n");
      out.write("\t\t\t<li id=\"single\"><a href=\"\"><b>TO</b></a></li>\n");
      out.write("\t\t\t<li id=\"dropdown\"><a href=\"order.jsp\"><b>BECOME</b></a></li>\n");
      out.write("\t\t\t<li id=\"dropline\"><a href=\"echarts/index.html\"><b>FAT</b></a></li>\n");
      out.write("\t\t\t \n");
      out.write("</ul></div>\n");
      out.write(" \n");
      out.write("<script>\n");
      out.write("//For Demo only\n");
      out.write("var links = document.getElementsByClassName('link')\n");
      out.write("for(var i = 0; i <= links.length; i++)\n");
      out.write("   addClass(i)\n");
      out.write("\n");
      out.write("\n");
      out.write("function addClass(id){\n");
      out.write("   setTimeout(function(){\n");
      out.write("      if(id > 0) links[id-1].classList.remove('hover')\n");
      out.write("      links[id].classList.add('hover')\n");
      out.write("   }, id*750) \n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<div style=\"text-align:center;clear:both\">\n");
      out.write("<script src=\"/gg_bd_ad_720x90.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"/follow.js\" type=\"text/javascript\"></script>\n");
      out.write("</div> \n");
      out.write("<body>\n");
      out.write("<div class=\"well\">\n");
      out.write("\t<div class=\"well-item\">\n");
      out.write("\t\t<div class=\"correct\"><img  class=\"\" src=\"img/pro5.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("\t\t\t\t\t<div class=\"opposite-content-text\"><a href=\"success.jsp?a=1\">\n");
      out.write("\t\t\t\t\t\t哇，鳗鱼饭没有刺哎！\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    <div class=\"well-item\">\n");
      out.write("\t\t<div class=\"correct\"><img  class=\"\" src=\"img/pro7.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("\t\t\t\t\t<div class=\"opposite-content-text\"><a href=\"success.jsp?a=2\">\n");
      out.write("\t\t\t\t\t\t想和你一起被裹在里面。\n");
      out.write("                                                那你先被吃掉好不好。\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    <div class=\"well-item\">\n");
      out.write("        <div class=\"correct\"><img  class=\"\" src=\"img/pro8.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("\t\t\t\t\t<div class=\"opposite-content-text\"><a href=\"success.jsp?a=3\">\n");
      out.write("                                            每一根面都像我对你的思念。\n");
      out.write("                                            红烧还是酸菜味啊？\n");
      out.write("                                            </a>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</ a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    <div class=\"well-item\">\n");
      out.write("\t\t<div class=\"correct\"><img  class=\"\" src=\"img/pro9.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("\t\t\t\t\t<div class=\"opposite-content-text\"><a href=\"success.jsp?a=4\">\n");
      out.write("\t\t\t\t\t\t想让你请我吃一辈子雪糕~\n");
      out.write("                                             你走开。\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    <div class=\"well-item\">\n");
      out.write("\t\t<div class=\"correct\"><img  class=\"\" src=\"img/pro10.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("\t\t\t\t\t<div class=\"opposite-content-text\"><a href=\"success.jsp?a=5\">\n");
      out.write("\t\t\t\t\t\t你的嘴角又沾到酱汁啦，傻瓜。\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    <div class=\"well-item\">\n");
      out.write("\t\t<div class=\"correct\"><img  class=\"\" src=\"img/pro11.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("\t\t\t\t\t<div class=\"opposite-content-text\"><a href=\"success.jsp?a=6\">\n");
      out.write("\t\t\t\t\t\t你想当红油里面的脆骨吗？\n");
      out.write("                                                不要，辣眼睛。。。\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    <div class=\"well-item\">\n");
      out.write("\t\t<div class=\"correct\"><img  class=\"\" src=\"img/pro12.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("\t\t\t\t\t<div class=\"opposite-content-text\"><a href=\"success.jsp?a=7\">\n");
      out.write("\t\t\t\t\t\t来，让我尝一口你的奶茶。\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    <div class=\"well-item\">\n");
      out.write("\t\t<div class=\"correct\"><img  class=\"\" src=\"img/pro13.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("                                    <div class=\"opposite-content-text\"><a href=\"success.jsp?a=8\">\n");
      out.write("                                                红虾跑的快还是青虾跑的得快？\n");
      out.write("                                        </a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    <div class=\"well-item\">\n");
      out.write("\t\t<div class=\"correct\"><img  class=\"\" src=\"img/pro1.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("\t\t\t\t\t<div class=\"opposite-content-text\"><a href=\"success.jsp?a=9\">\n");
      out.write("\t\t\t\t\t\t想把所有的鱼肚子都给你吃\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"well-item\">\n");
      out.write("\t\t<div class=\"correct\"><img  class=\"\" src=\"img/pro2.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("\t\t\t\t\t<div class=\"opposite-content-text\"><a href=\"success.jsp?a=10\">\n");
      out.write("\t\t\t\t\t\t要麻将还是油碟？\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"well-item\">\n");
      out.write("\t\t<div class=\"correct\"><img  class=\"\" src=\"img/pro3.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("\t\t\t\t\t<div class=\"opposite-content-text\"><a href=\"success.jsp?a=11\">\n");
      out.write("\t\t\t\t\t\t你愿意吃我的披萨边吗？\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"well-item\">\n");
      out.write("\t\t<div class=\"correct\"><img  class=\"\" src=\"img/pro4.jpg\" /></div>\n");
      out.write("\t\t<div class=\"opposite\">\n");
      out.write("\t\t\t<div class=\"\">\n");
      out.write("\t\t\t\t<div class=\"opposite-content\">\n");
      out.write("\t\t\t\t\t<div class=\"opposite-content-text\"><a href=\"success.jsp?a=12\">\n");
      out.write("\t\t\t\t\t\t来，我帮你切肉，顺便帮你吃了好了。\t\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div style=\"text-align:center;clear:both;margin-top:50px;\">\n");
      out.write("<script src=\"/gg_bd_ad_720x90.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"/follow.js\" type=\"text/javascript\"></script>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
