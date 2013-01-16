package org.apache.jsp;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<title>WebSocket Test</title>\r\n");
      out.write("<script type=\"text/javascript\">  \r\n");
      out.write("\t\r\n");
      out.write("\tvar wsUri = \"ws://localhost:8080/demo-websocket/indexprice?symbol=NGH12\"; \r\n");
      out.write("\tvar output;  \r\n");
      out.write("\t\r\n");
      out.write("\tfunction init() { \r\n");
      out.write("\t\toutput = document.getElementById(\"output\"); \r\n");
      out.write("\t\ttestWebSocket(); \r\n");
      out.write("\t}  \r\n");
      out.write("\t\r\n");
      out.write("\tfunction testWebSocket() { \r\n");
      out.write("\t\twebsocket = new WebSocket(wsUri); \r\n");
      out.write("\t\twebsocket.onopen = function(evt) { \r\n");
      out.write("\t\t\tonOpen(evt) \r\n");
      out.write("\t\t}; \r\n");
      out.write("\t\twebsocket.onclose = function(evt) { \r\n");
      out.write("\t\t\tonClose(evt) \r\n");
      out.write("\t\t}; \r\n");
      out.write("\t\twebsocket.onmessage = function(evt) { \r\n");
      out.write("\t\t\tonMessage(evt) \r\n");
      out.write("\t\t}; \r\n");
      out.write("\t\twebsocket.onerror = function(evt) { \r\n");
      out.write("\t\t\tonError(evt) \r\n");
      out.write("\t\t}; \r\n");
      out.write("\t}  \r\n");
      out.write("\tfunction onOpen(evt) { \r\n");
      out.write("\t\twriteToScreen(\"CONNECTED\");  \r\n");
      out.write("\t}  \r\n");
      out.write("\tfunction onClose(evt) { \r\n");
      out.write("\t\twriteToScreen(\"DISCONNECTED\"); \r\n");
      out.write("\t}  \r\n");
      out.write("\tfunction onMessage(evt) { \r\n");
      out.write("\t\twriteToScreen('<span style=\"color: blue;\">RESPONSE: ' + evt.data +'</span>'); \r\n");
      out.write("\t}  \r\n");
      out.write("\tfunction onError(evt) { \r\n");
      out.write("\t\twriteToScreen('<span style=\"color: red;\">ERROR:</span> ' + evt.data); \r\n");
      out.write("\t\twebsocket.close(); \r\n");
      out.write("\t}  \r\n");
      out.write("\tfunction doSend(message) { \r\n");
      out.write("\t\twriteToScreen(\"SENT: \" + message);  \r\n");
      out.write("\t\twebsocket.send(message); \r\n");
      out.write("\t}  \r\n");
      out.write("\tfunction writeToScreen(message) { \r\n");
      out.write("\t\toutput.innerHTML = message;\r\n");
      out.write("\t}  \r\n");
      out.write("\twindow.addEventListener(\"load\", init, false); \r\n");
      out.write("</script>\r\n");
      out.write("<h2>WebSocket Test</h2>\r\n");
      out.write("<div id=\"output\"></div>\r\n");
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
