/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.9
 * Generated at: 2023-12-26 14:43:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class category_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/admin/footer.jsp", Long.valueOf(1697705686923L));
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar", Long.valueOf(1698135769138L));
    _jspx_dependants.put("/admin/header.jsp", Long.valueOf(1703588878227L));
    _jspx_dependants.put("jar:file:/C:/Users/jggup/OneDrive/Documents/Projects/BookStoreProject/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/BookStoreWebsite/WEB-INF/lib/jakarta.servlet.jsp.jstl-2.0.0.jar!/META-INF/c.tld", Long.valueOf(1602854172000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Manage Categories - Kafka Bookstore Administration</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("<div align=\"center\">\r\n");
      out.write("	<div>\r\n");
      out.write("		<img src=\"../images/Kafka2.png\" />\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div>\r\n");
      out.write("		Welcome, Admin | <a href=\"logout\">Logout</a>\r\n");
      out.write("		<br/><br/>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div>\r\n");
      out.write("		<b> <a href=\"list_users\">Users</a> | \r\n");
      out.write("			<a href=\"list_category\">Categories</a> | \r\n");
      out.write("			<a href=\"books\">Books</a> | \r\n");
      out.write("			<a href=\"customer\">Customers</a> | \r\n");
      out.write("			<a href=\"reviews\">Reviews</a> | \r\n");
      out.write("			<a href=\"orders\">Orders</a>\r\n");
      out.write("		</b>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("	<div align=\"center\">\r\n");
      out.write("		<h2>Category Management</h2>\r\n");
      out.write("		<h3>\r\n");
      out.write("			<a href=\"category_form.jsp\">Create New Category</a>\r\n");
      out.write("		</h3>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div align=\"center\">\r\n");
      out.write("		<h4><i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</i></h4>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div align=\"center\">\r\n");
      out.write("		<table border=\"1\" cellpadding=\"5\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th>Index</th>\r\n");
      out.write("				<th>ID</th>\r\n");
      out.write("				<th>Name</th>\r\n");
      out.write("				<th>Actions</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("			");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("	\r\n");
      out.write("		</table>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("<div align=\"center\">\r\n");
      out.write("	<h4>Bookstore Administration</h4>\r\n");
      out.write("	<h4>Copyright (C) 2023 by Kafka Books Co., Ltd</h4>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("	\r\n");
      out.write("		function confirmDelete(userId){\r\n");
      out.write("			if (confirm(\"Are you sure you want to delete user with ID \"+ userId + \"?\")){\r\n");
      out.write("				window.location = \"delete_user?id=\" + userId;\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /admin/category_list.jsp(31,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("cat");
      // /admin/category_list.jsp(31,3) name = items type = jakarta.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/admin/category_list.jsp(31,3) '${listCategory}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${listCategory}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /admin/category_list.jsp(31,3) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVarStatus("status");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("				<tr>\r\n");
            out.write("					<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.index + 1}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("					<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cat.categoryId}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("					<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cat.name}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("					<td>\r\n");
            out.write("						<a href=\"edit_category?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cat.categoryId}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">Edit</a>\r\n");
            out.write("						&nbsp;\r\n");
            out.write("						<a href=\"javascript:confirmDelete(");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cat.categoryId}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(")\">Delete</a>\r\n");
            out.write("					</td>\r\n");
            out.write("				</tr>\r\n");
            out.write("			");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
