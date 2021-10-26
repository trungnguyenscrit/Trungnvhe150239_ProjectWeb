package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div id=\"preloader\">\n");
      out.write("        <div class=\"loader\">\n");
      out.write("            <svg class=\"circular\" viewBox=\"25 25 50 50\">\n");
      out.write("                <circle class=\"path\" cx=\"50\" cy=\"50\" r=\"20\" fill=\"none\" stroke-width=\"3\" stroke-miterlimit=\"10\" />\n");
      out.write("            </svg>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"main-wrapper\">\n");
      out.write("        <div class=\"nav-header\">\n");
      out.write("            <div class=\"brand-logo\">\n");
      out.write("                <a href=\"index.html\">\n");
      out.write("                    <b class=\"logo-abbr\"><img src=\"images/logo.png\" alt=\"\"> </b>\n");
      out.write("                    <span class=\"logo-compact\"><img src=\"./images/logo-compact.png\" alt=\"\"></span>\n");
      out.write("                    <span class=\"brand-title\">\n");
      out.write("                        <img src=\"images/mi.png\" alt=\"\">\n");
      out.write("                    </span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"header-content clearfix\">\n");
      out.write("\n");
      out.write("                <div class=\"nav-control\">\n");
      out.write("                    <div class=\"hamburger\">\n");
      out.write("                        <span class=\"toggle-icon\"><i class=\"icon-menu\"></i></span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"header-left\">\n");
      out.write("                    <div class=\"input-group icons\" style=\"\n");
      out.write("    display: none;\n");
      out.write("\" >\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("                            <span class=\"input-group-text bg-transparent border-0 pr-2 pr-sm-3\" id=\"basic-addon1\"><i\n");
      out.write("                                    class=\"mdi mdi-magnify\"></i></span>\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"search\" class=\"form-control\" placeholder=\"Tìm kiếm\"\n");
      out.write("                            aria-label=\"Search Dashboard\">\n");
      out.write("                        <div class=\"drop-down animated flipInX d-md-none\">\n");
      out.write("                            <form action=\"#\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"header-right\">\n");
      out.write("                    <ul class=\"clearfix\">\n");
      out.write("                        <li class=\"icons dropdown\">\n");
      out.write("                            <div class=\"user-img c-pointer position-relative\" data-toggle=\"dropdown\">\n");
      out.write("                                <span class=\"activity active\"></span>\n");
      out.write("                                <img src=\"images/users/trung.jpg\" height=\"40\" width=\"40\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"drop-down dropdown-profile animated fadeIn dropdown-menu\">\n");
      out.write("                                <div class=\"dropdown-content-body\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"login.html\"><i class=\"icon-key\"></i> <span>Logout</span></a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                <div class=\"nk-sidebar\">\n");
      out.write("            <div class=\"nk-nav-scroll\">\n");
      out.write("                <ul class=\"metismenu\" id=\"menu\">\n");
      out.write("                    <li class=\"nav-label\">Tổng quan</li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"./index.html\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"icon-speedometer\"></i><span class=\"nav-text\">Tổng quan</span>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-label\">Bài Hát </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"icon-note menu-icon\"></i><span class=\"nav-text\">Bài Hát</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul aria-expanded=\"false\">\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/music/song/list\">Danh sách bài hát</a></li>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/music/song/insert\">Thêm mới</a></li>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/music/song/update\">Cập nhật</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-label\">THỂ LOẠI</li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"icon-menu menu-icon\"></i><span class=\"nav-text\">Thể Loại</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul aria-expanded=\"false\">\n");
      out.write("                            <li><a href=\"./bill-list.html\" aria-expanded=\"false\">Danh sách thể loại</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-label\">CA SĨ & USER</li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"icon-notebook menu-icon\"></i><span class=\"nav-text\">Ca Sĩ</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul aria-expanded=\"false\">\n");
      out.write("                            <li><a href=\"./customer-list.html\">Danh sách ca sĩ</a></li>\n");
      out.write("                             <li><a href=\"./page-register.html\">Thêm ca sĩ mới</a></li> \n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"icon-notebook menu-icon\"></i><span class=\"nav-text\">User</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul aria-expanded=\"false\">\n");
      out.write("                            <li><a href=\"./staff-list.html\">Danh sách User</a></li>\n");
      out.write("                             <li><a href=\"./page-register.html\">Thêm danh sách User mới</a></li> \n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content-body\">\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid mt-3\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-3 col-sm-6\">\n");
      out.write("                        <div class=\"card gradient-1\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h3 class=\"card-title text-white\">Số lượng các bài hát</h3>\n");
      out.write("                                <div class=\"d-inline-block\">\n");
      out.write("                                    <h2 class=\"text-white\">50+</h2>\n");
      out.write("                                    <p class=\"text-white mb-0\"></p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-sm-6\">\n");
      out.write("                        <div class=\"card gradient-2\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h3 class=\"card-title text-white\">Số lượng ca sĩ</h3>\n");
      out.write("                                <div class=\"d-inline-block\">\n");
      out.write("                                    <h2 class=\"text-white\">32+</h2>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-sm-6\">\n");
      out.write("                        <div class=\"card gradient-3\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h3 class=\"card-title text-white\">Số lượng thể loại nhạc</h3>\n");
      out.write("                                <div class=\"d-inline-block\">\n");
      out.write("                                    <h2 class=\"text-white\">7+</h2>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-3 col-sm-6\">\n");
      out.write("                        <div class=\"card gradient-4\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h3 class=\"card-title text-white\">Số lượng ablum</h3>\n");
      out.write("                                <div class=\"d-inline-block\">\n");
      out.write("                                    <h2 class=\"text-white\">24+</h2>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"copyright\">\n");
      out.write("                <p>Copyright &copy; Designed & Developed by Trung Nguyen . Special thanks to <a href=\"https://themeforest.net/user/quixlab\">Quixlab</a>\n");
      out.write("                    </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"plugins/common/common.min.js\"></script>\n");
      out.write("    <script src=\"js/custom.min.js\"></script>\n");
      out.write("    <script src=\"js/settings.js\"></script>\n");
      out.write("    <script src=\"js/gleek.js\"></script>\n");
      out.write("    <script src=\"js/styleSwitcher.js\"></script>\n");
      out.write("    <script src=\"./js/dashboard/dashboard-1.js\"></script>\n");
      out.write("\n");
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
