/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.9
 * Generated at: 2023-12-26 11:09:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/admin/footer.jsp", Long.valueOf(1697705686923L));
    _jspx_dependants.put("/admin/header.jsp", Long.valueOf(1703588878227L));
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
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Kafka Bookstore Administration</title>\r\n");
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
      out.write("		<h2>Administrative Dashboard</h2>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div align=\"center\">\r\n");
      out.write("		<hr width=\"60%\" />\r\n");
      out.write("		<h2>Quick Actions:</h2>\r\n");
      out.write("		<b> <a href=\"create_book\">New Book</a> &nbsp; <a\r\n");
      out.write("			href=\"create_user\">New User</a> &nbsp; <a href=\"create_category\">New\r\n");
      out.write("				Category</a> &nbsp; <a href=\"create_customer\">New Customer</a> &nbsp;\r\n");
      out.write("		</b>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div align=\"center\">\r\n");
      out.write("		<hr width=\"60%\" />\r\n");
      out.write("		<h2>Recent Sales:</h2>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div align=\"center\">\r\n");
      out.write("		<hr width=\"60%\" />\r\n");
      out.write("		<h2>Recent Reviews:</h2>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div align=\"center\">\r\n");
      out.write("		<hr width=\"60%\" />\r\n");
      out.write("		<h2>Statistics:</h2>\r\n");
      out.write("		<hr width=\"60%\" />\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      out.write("<div align=\"center\">\r\n");
      out.write("	<h4>Bookstore Administration</h4>\r\n");
      out.write("	<h4>Copyright (C) 2023 by Kafka Books Co., Ltd</h4>\r\n");
      out.write("</div>");
      out.write("\r\n");
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
}
