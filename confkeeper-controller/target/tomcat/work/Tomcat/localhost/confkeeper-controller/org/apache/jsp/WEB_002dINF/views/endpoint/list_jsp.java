/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.30
 * Generated at: 2014-01-13 02:03:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.endpoint;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zh-CN\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<meta name=\"author\" content=\"yate\" />\n");
      out.write("<title>Configution Keeper</title>\n");
      out.write("\n");
      out.write("<!-- Bootstrap -->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap.min.css\">\n");
      out.write("<style type=\"text/css\">\n");
      out.write("body {\n");
      out.write("\tpadding-top: 65px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#content {\n");
      out.write("\tpadding: 0 35px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-group {\n");
      out.write("\tmargin-bottom: 10px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script src=\"http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\"\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.endpoint.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tfunction go(rows, idx) {\n");
      out.write("\t\t$(\"#datas\").endpoint('load', {\n");
      out.write("\t\t\turi : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/endpoint\",\n");
      out.write("\t\t\tidx : idx,\n");
      out.write("\t\t\trows : rows\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tfunction info(id) {\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t\ttype : \"get\",\n");
      out.write("\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/endpoint/\" + id,\n");
      out.write("\t\t\tdataType : 'json',\n");
      out.write("\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\tif (data) {\n");
      out.write("\t\t\t\t\t$(\"#d_id\").val(data.id);\n");
      out.write("\t\t\t\t\t$(\"#d_trunk\").val(data.trunk);\n");
      out.write("\t\t\t\t\t$(\"#d_state\").val(data.state);\n");
      out.write("\t\t\t\t\t$(\"#modify\")\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction addParamRow(){\n");
      out.write("\t\t$(\"values\").append();\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction delParamRow(id){\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t$(document)\n");
      out.write("\t\t\t.ready(\n");
      out.write("\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t$(\"#datas\").endpoint('init', {\n");
      out.write("\t\t\t\t\t\t\turi : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/endpoint\"\n");
      out.write("\t\t\t\t\t\t}).endpoint('load');\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t$(\"#addBut\")\n");
      out.write("\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t.ajax({\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttype : \"post\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/endpoint/add\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttraditional : true,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdata : {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"app.id\" : $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#appId\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(),\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"trunk\" : $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#trunk\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(),\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"state\" : $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#state\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val()\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdataType : 'json',\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#datas\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.endpoint(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'load',\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\turi : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/endpoint\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tidx : 1,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\trows : 10\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t$(\"#delBut\")\n");
      out.write("\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar arr = new Array();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"input[name='ids']:checked\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t.each(function(idx, obj) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tarr.push(obj.value);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t.ajax({\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttype : \"post\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/endpoint/removes\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttraditional : true,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdata : {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tids : arr\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdataType : 'json',\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#datas\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.endpoint(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'load',\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\turi : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/endpoint\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tidx : 1,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\trows : 10\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t$(\"#queryBut\")\n");
      out.write("\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar param = {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\"app.id\" : $(\"#q_appId\").val(),\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\"trunk\" : $(\"#q_trunk\").val(),\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\"state\" : $(\"#q_state\").val()\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t};\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#datas\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t.endpoint(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'load',\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\turi : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/endpoint\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tidx : 1,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\trows : 10,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tparam : param\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t$(\"#modBut\")\n");
      out.write("\t\t\t\t\t\t\t\t.click(\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t.ajax({\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\ttype : \"post\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/endpoint/\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ $(\"#d_id\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(),\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdata : {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"id\" : $(\"#d_id\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(),\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"trunk\" : $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#d_trunk\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(),\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"state\" : $(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"#d_state\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val()\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tdataType : 'json',\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tsuccess : function(data) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#datas\")\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.endpoint(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'load',\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t{\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\turi : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/endpoint\",\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tidx : 1,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\trows : 10\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("        <script src=\"http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"http://cdn.bootcss.com/respond.js/1.3.0/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"nav\">\n");
      out.write("\t\t<nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\t\t\tdata-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t\t<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<p class=\"navbar-text navbar-center\">Configution Keeper</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown active\"><a href=\"#\" class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\t\t\tdata-toggle=\"dropdown\">服务管理<b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/app\">应用</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/endpoint\">版本</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/endparam\">参数</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\t\t\tdata-toggle=\"dropdown\">连接状态<b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">服务器状态</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">客户端状态</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\t\t\tdata-toggle=\"dropdown\">配置清单<b class=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">日志</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">事件</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\"><a\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/logout\" class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\t\t\tdata-toggle=\"dropdown\"><span class=\"glyphicon glyphicon-off\"></span>注销</a>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\"><a href=\"get\" class=\"dropdown-toggle\"\n");
      out.write("\t\t\t\t\t\t\tdata-toggle=\"dropdown\"> <span class=\"glyphicon glyphicon-cog\"></span>设置<b\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"caret\"></b></a>\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">推送设置</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">用户中心</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">修改密码</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div id=\"body\">\n");
      out.write("\n");
      out.write("\t\t<!-- Add Modal -->\n");
      out.write("\t\t<div class=\"modal fade\" id=\"add\" tabindex=\"-1\" role=\"dialog\"\n");
      out.write("\t\t\taria-hidden=\"true\">\n");
      out.write("\t\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t\t<label for=\"inputEmail3\" class=\"control-label\">应用名</label> <select\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"appId\" name=\"appId\">\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t</select> <label for=\"inputPassword3\" class=\"control-label\">版本</label> <input\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"trunk\" name=\"trunk\"> <label\n");
      out.write("\t\t\t\t\t\t\tfor=\"inputPassword3\" class=\"control-label\">状态</label> <select\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"state\" name=\"state\">\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">激活</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"0\">取消</option>\n");
      out.write("\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\n");
      out.write("\t\t\t\t\t\t<button id=\"addBut\" type=\"submit\" class=\"btn btn-primary\">确定</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Query Modal -->\n");
      out.write("\t\t<div class=\"modal fade\" id=\"query\" tabindex=\"-1\" role=\"dialog\"\n");
      out.write("\t\t\taria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t\t<label for=\"inputEmail3\" class=\"control-label\">应用名</label> <select\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"q_appId\" name=\"appId\">\n");
      out.write("\t\t\t\t\t\t\t<option value=\"\" selected=\"selected\"></option>\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t</select> <label for=\"inputPassword3\" class=\"control-label\">版本</label> <input\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"q_trunk\" name=\"trunk\"> <label\n");
      out.write("\t\t\t\t\t\t\tfor=\"inputPassword3\" class=\"control-label\">状态</label> <select\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"q_state\" name=\"state\">\n");
      out.write("\t\t\t\t\t\t\t<option value=\"\" selected=\"selected\"></option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">激活</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"0\">取消</option>\n");
      out.write("\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\n");
      out.write("\t\t\t\t\t\t<button id=\"queryBut\" type=\"button\" class=\"btn btn-primary\">确定</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Modify Modal -->\n");
      out.write("\t\t<div class=\"modal fade\" id=\"modify\" tabindex=\"-1\" role=\"dialog\"\n");
      out.write("\t\t\taria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t\t<label for=\"inputEmail3\" class=\"control-label\">编号</label> <input\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"d_id\" name=\"id\" readonly=\"readonly\"> <label\n");
      out.write("\t\t\t\t\t\t\tfor=\"inputPassword3\" class=\"control-label\">版本</label> <input\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"d_trunk\" name=\"trunk\"> <label\n");
      out.write("\t\t\t\t\t\t\tfor=\"inputPassword3\" class=\"control-label\">状态</label> <select\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" id=\"d_state\" name=\"state\">\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">激活</option>\n");
      out.write("\t\t\t\t\t\t\t<option value=\"0\">取消</option>\n");
      out.write("\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\n");
      out.write("\t\t\t\t\t\t<button id=\"modBut\" type=\"button\" class=\"btn btn-primary\">确定</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- Param Modal -->\n");
      out.write("\t\t<div class=\"modal fade\" id=\"params\" tabindex=\"-1\" role=\"dialog\"\n");
      out.write("\t\t\taria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"inputEmail3\" class=\"control-label\">版本</label>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<input id=\"p_id\" name=\"id\" readonly=\"readonly\" type=\"hidden\">\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"form-control\" id=\"p_trunk\" name=\"trunk\" readonly=\"readonly\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div id=\"values\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"control-label\">key</label>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input class=\"form-control\" id=\"p_key\" name=\"p_key\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"control-label\">value</label>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input id=\"p_value\" name=\"p_value\">\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t<span type=\"button\"\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-default glyphicon glyphicon-plus-sign\" onclick=\"\"></span>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\n");
      out.write("\t\t\t\t\t\t<button id=\"modBut\" type=\"button\" class=\"btn btn-primary\">确定</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<!-- CRUD -->\n");
      out.write("\t\t<div style=\"float: right;\">\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-default glyphicon glyphicon-plus-sign\"\n");
      out.write("\t\t\t\tdata-toggle=\"modal\" data-target=\"#add\">添加</button>\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-default glyphicon glyphicon-remove-sign\"\n");
      out.write("\t\t\t\tid=\"delBut\">删除</button>\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-default glyphicon glyphicon-search\"\n");
      out.write("\t\t\t\tdata-toggle=\"modal\" data-target=\"#query\">查询</button>\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-default glyphicon glyphicon-search\"\n");
      out.write("\t\t\t\tdata-toggle=\"modal\" data-target=\"#params\">显示参数</button>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<table id=\"datas\" class=\"table table-hover\">\n");
      out.write("\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th width=\"3%\">#</th>\n");
      out.write("\t\t\t\t\t\t<th width=\"8%\">编号</th>\n");
      out.write("\t\t\t\t\t\t<th width=\"24%\">应用名</th>\n");
      out.write("\t\t\t\t\t\t<th width=\"40%\">版本</th>\n");
      out.write("\t\t\t\t\t\t<th width=\"10%\">状态</th>\n");
      out.write("\t\t\t\t\t\t<th width=\"15%\">操作</th>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t<tfoot>\n");
      out.write("\t\t\t\t</tfoot>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/endpoint/list.jsp(267,7) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/endpoint/list.jsp(267,7) '${apps.rows}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${apps.rows}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/endpoint/list.jsp(267,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("obj");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.appName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option>\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/views/endpoint/list.jsp(295,7) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/endpoint/list.jsp(295,7) '${apps.rows}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${apps.rows}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/views/endpoint/list.jsp(295,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("obj");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${obj.appName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option>\n");
          out.write("\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}
