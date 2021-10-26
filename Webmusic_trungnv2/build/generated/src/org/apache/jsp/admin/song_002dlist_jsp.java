package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class song_002dlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <!-- Favicon icon -->\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"images/favicon.png\">\n");
      out.write("        <!-- Pignose Calender -->\n");
      out.write("        <link href=\"./plugins/pg-calendar/css/pignose.calendar.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Chartist -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"./plugins/chartist/css/chartist.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./plugins/chartist-plugin-tooltips/css/chartist-plugin-tooltip.css\">\n");
      out.write("        <!-- Custom Stylesheet -->\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <script> \n");
      out.write("            function doUpdate(id_song)\n");
      out.write("            {\n");
      out.write("                window.location.href = \"update?id_song=\" + id_song;\n");
      out.write("            }\n");
      out.write("            function doDelete(id_song)\n");
      out.write("            {\n");
      out.write("                var c = confirm(\"are you sure?\");\n");
      out.write("                if(c)\n");
      out.write("                {\n");
      out.write("                    window.location.href = \"delete?id_song=\" + id_song;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--*******************\n");
      out.write("            Preloader start\n");
      out.write("        ********************-->\n");
      out.write("        <div id=\"preloader\">\n");
      out.write("            <div class=\"loader\">\n");
      out.write("                <svg class=\"circular\" viewBox=\"25 25 50 50\">\n");
      out.write("                    <circle class=\"path\" cx=\"50\" cy=\"50\" r=\"20\" fill=\"none\" stroke-width=\"3\" stroke-miterlimit=\"10\" />\n");
      out.write("                </svg>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--*******************\n");
      out.write("            Preloader end\n");
      out.write("        ********************-->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("        <!--**********************************\n");
      out.write("        Main wrapper start\n");
      out.write("    ***********************************-->\n");
      out.write("    <div id=\"main-wrapper\">\n");
      out.write("\n");
      out.write("        <!--**********************************\n");
      out.write("            Nav header start\n");
      out.write("        ***********************************-->\n");
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
      out.write("        <!--**********************************\n");
      out.write("            Nav header end\n");
      out.write("        ***********************************-->\n");
      out.write("\n");
      out.write("        <!--**********************************\n");
      out.write("            Header start\n");
      out.write("        ***********************************-->\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"header-content clearfix\">\n");
      out.write("\n");
      out.write("                <div class=\"nav-control\">\n");
      out.write("                    <div class=\"hamburger\">\n");
      out.write("                        <span class=\"toggle-icon\"><i class=\"icon-menu\"></i></span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"header-left\">\n");
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
      out.write("        <!--**********************************\n");
      out.write("            Header end ti-comment-alt\n");
      out.write("        ***********************************-->\n");
      out.write("\n");
      out.write("        <!--**********************************\n");
      out.write("            Sidebar start\n");
      out.write("        ***********************************-->\n");
      out.write("        <div class=\"nk-sidebar\">\n");
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
      out.write("                            <li><a href=\"./product-list.html\">Danh sách bài hát</a></li>\n");
      out.write("                            <li><a href=\"./new-product.html\">Thêm mới</a></li>\n");
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
      out.write("                            <!-- <li><a href=\"./page-register.html\">Thêm ca sĩ mới</a></li> -->\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"has-arrow\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"icon-notebook menu-icon\"></i><span class=\"nav-text\">User</span>\n");
      out.write("                        </a>\n");
      out.write("                        <ul aria-expanded=\"false\">\n");
      out.write("                            <li><a href=\"./staff-list.html\">Danh sách User</a></li>\n");
      out.write("                            <!-- <li><a href=\"./page-register.html\">Thêm danh sách User mới</a></li> -->\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--**********************************\n");
      out.write("            Sidebar end\n");
      out.write("        ***********************************-->\n");
      out.write("        <!--**********************************\n");
      out.write("            Content body start\n");
      out.write("        ***********************************-->\n");
      out.write("        <div class=\"content-body\">\n");
      out.write("\n");
      out.write("            <div class=\"row page-titles mx-0\">\n");
      out.write("                <div class=\"col p-md-0\">\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li class=\"breadcrumb-item\"><a href=\"index.html\">Tổng quan</a></li>\n");
      out.write("                        <li class=\"breadcrumb-item active\"><a href=\"product-list.html\">Danh sách bài hát</a></li>\n");
      out.write("                    </ol>z\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- row -->\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h4 class=\"card-title\">Quản lý bài hát</h4>\n");
      out.write("                                <div class=\"table-responsive\">\n");
      out.write("                                    <table class=\"table table-striped table-bordered zero-configuration\">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>ID_Song</th>\n");
      out.write("                                                <th>NAME</th>\n");
      out.write("                                                <th>Poster</th>\n");
      out.write("                                                <th>LinkSong</th>\n");
      out.write("                                                <th>Description</th>\n");
      out.write("                                                <th>Singer</th>\n");
      out.write("                                                <th>Genre</th>\n");
      out.write("                                                <td></td>\n");
      out.write("                                                <td></td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        \n");
      out.write("                                        <tfoot>\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </tfoot>\n");
      out.write("                                           <!-- add sp -->\n");
      out.write("                                        <!-- foot -->\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- #/ container -->\n");
      out.write("        </div>\n");
      out.write("        <!--**********************************\n");
      out.write("            Content body end\n");
      out.write("        ***********************************-->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--**********************************\n");
      out.write("            Footer start\n");
      out.write("        ***********************************-->\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"copyright\">\n");
      out.write("                <p>Copyright &copy; Designed & Developed by Trung Nguyễn . Thanks to <a href=\"https://themeforest.net/user/quixlab\">Quixlab</a></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--**********************************\n");
      out.write("            Footer end\n");
      out.write("        ***********************************-->\n");
      out.write("    </div>\n");
      out.write("    <!--**********************************\n");
      out.write("        Main wrapper end\n");
      out.write("    ***********************************-->\n");
      out.write("\n");
      out.write("    <!--**********************************\n");
      out.write("        Scripts\n");
      out.write("    ***********************************-->\n");
      out.write("    <script src=\"plugins/common/common.min.js\"></script>\n");
      out.write("    <script src=\"js/custom.min.js\"></script>\n");
      out.write("    <script src=\"js/settings.js\"></script>\n");
      out.write("    <script src=\"js/gleek.js\"></script>\n");
      out.write("    <script src=\"js/styleSwitcher.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"./plugins/tables/js/jquery.dataTables.min.js\"></script>\n");
      out.write("    <script src=\"./plugins/tables/js/datatable/dataTables.bootstrap4.min.js\"></script>\n");
      out.write("    <script src=\"./plugins/tables/js/datatable-init/datatable-basic.min.js\"></script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.songs}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("s");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <tr>\n");
          out.write("                                                <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.id_song}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\n");
          out.write("                                                <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\n");
          out.write("                                                <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.poster}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\n");
          out.write("                                                <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.linksong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\n");
          out.write("                                                <th>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</th>\n");
          out.write("                                                <th>");
          if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("   </th>\n");
          out.write("                                                <th>");
          if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write(" </th>\n");
          out.write("                                                <td>\n");
          out.write("                                                <input type=\"button\" onclick=\"doUpdate('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.id_song}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("');\" value=\"Update\"/>\n");
          out.write("                                                </td>\n");
          out.write("                                                <td>\n");
          out.write("                                                    <input type=\"button\" onclick=\"doDelete('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.id_song}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("');\" value=\"Delete\"/>\n");
          out.write("                                                </td>\n");
          out.write("                                            </tr>\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.singers}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("si");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${si.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" <br/>\n");
          out.write("                                                       ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.genres}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("g");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${g.name_genre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" <br/>\n");
          out.write("                                                               ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
