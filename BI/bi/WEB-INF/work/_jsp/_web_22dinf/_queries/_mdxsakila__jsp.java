/*
 * JSP generated by Resin-4.0.44 (built Wed, 22 Apr 2015 02:02:11 PDT)
 */

package _jsp._web_22dinf._queries;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _mdxsakila__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  private boolean _caucho_isNotModified;
  private com.caucho.jsp.PageManager _jsp_pageManager;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    com.caucho.jsp.PageContextImpl pageContext = _jsp_pageManager.allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);

    TagState _jsp_state = new TagState();

    try {
      _jspService(request, response, pageContext, _jsp_application, session, _jsp_state);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      _jsp_state.release();
      _jsp_pageManager.freePageContext(pageContext);
    }
  }
  
  private void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response,
              com.caucho.jsp.PageContextImpl pageContext,
              javax.servlet.ServletContext application,
              javax.servlet.http.HttpSession session,
              TagState _jsp_state)
    throws Throwable
  {
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    javax.servlet.jsp.tagext.JspTag _jsp_parent_tag = null;
    com.caucho.jsp.PageContextImpl _jsp_parentContext = pageContext;
    response.setContentType("text/html; charset=ISO-8859-1");
    com.tonbeller.jpivot.tags.MondrianOlapModelTag _jsp_MondrianOlapModelTag_0 = null;

    out.write(_jsp_string0, 0, _jsp_string0.length);
    com.caucho.jsp.BodyContentImpl _jsp_endTagHack1 = null;
    _jsp_MondrianOlapModelTag_0 = _jsp_state.get_jsp_MondrianOlapModelTag_0(pageContext, _jsp_parent_tag);
    _jsp_MondrianOlapModelTag_0.doStartTag();
    out = pageContext.pushBody();
    _jsp_endTagHack1 = (com.caucho.jsp.BodyContentImpl) out;
    _jsp_MondrianOlapModelTag_0.setBodyContent(_jsp_endTagHack1);
    out.write(_jsp_string1, 0, _jsp_string1.length);
    out = pageContext.popBody();
    _jsp_MondrianOlapModelTag_0.doEndTag();
    pageContext.releaseBody(_jsp_endTagHack1);
    out.write(_jsp_string2, 0, _jsp_string2.length);
    pageContext.sessionSetOrRemove("title01", "Analisis de AutoMoviles");
    out.write(_jsp_string3, 0, _jsp_string3.length);
  }

  private com.caucho.make.DependencyContainer _caucho_depends
    = new com.caucho.make.DependencyContainer();

  public java.util.ArrayList<com.caucho.vfs.Dependency> _caucho_getDependList()
  {
    return _caucho_depends.getDependencies();
  }

  public void _caucho_addDepend(com.caucho.vfs.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    _caucho_depends.add(depend);
  }

  protected void _caucho_setNeverModified(boolean isNotModified)
  {
    _caucho_isNotModified = true;
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;

    if (_caucho_isNotModified)
      return false;

    if (com.caucho.server.util.CauchoSystem.getVersionId() != -1650998886690198223L)
      return true;

    return _caucho_depends.isModified();
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
    TagState tagState;
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.server.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("WEB-INF/queries/mdxsakila.jsp"), -8432353791467331211L, false);
    _caucho_depends.add(depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("WEB-INF/jpivot/jpivot-tags.tld"), -478640942676185352L, false);
    _caucho_depends.add(depend);
    _caucho_depends.add(new com.caucho.make.ClassDependency("com.tonbeller.jpivot.tags.MondrianOlapModelTag", 6471908115278740864L));
  }

  static {
    try {
    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }

  final static class TagState {
    private com.tonbeller.jpivot.tags.MondrianOlapModelTag _jsp_MondrianOlapModelTag_0;

    final com.tonbeller.jpivot.tags.MondrianOlapModelTag get_jsp_MondrianOlapModelTag_0(PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jsp_parent_tag) throws Throwable
    {
      if (_jsp_MondrianOlapModelTag_0 == null) {
        _jsp_MondrianOlapModelTag_0 = new com.tonbeller.jpivot.tags.MondrianOlapModelTag();
        _jsp_MondrianOlapModelTag_0.setPageContext(pageContext);
        if (_jsp_parent_tag instanceof javax.servlet.jsp.tagext.Tag)
          _jsp_MondrianOlapModelTag_0.setParent((javax.servlet.jsp.tagext.Tag) _jsp_parent_tag);
        else if (_jsp_parent_tag instanceof javax.servlet.jsp.tagext.SimpleTag)
          _jsp_MondrianOlapModelTag_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jsp_parent_tag));
        else
          _jsp_MondrianOlapModelTag_0.setParent((javax.servlet.jsp.tagext.Tag) null);
        _jsp_MondrianOlapModelTag_0.setId("query01");
        _jsp_MondrianOlapModelTag_0.setJdbcDriver("com.mysql.jdbc.Driver");
        _jsp_MondrianOlapModelTag_0.setJdbcUrl("jdbc:mysql://localhost/cars_dwh?user=root&password=");
        _jsp_MondrianOlapModelTag_0.setCatalogUri("/WEB-INF/queries/cubeventas.xml");
      }

      return _jsp_MondrianOlapModelTag_0;
    }

    void release()
    {
      if (_jsp_MondrianOlapModelTag_0 != null) {
        _jsp_MondrianOlapModelTag_0.release();
        _jsp_MondrianOlapModelTag_0 = null;
      }
    }
  }

  public java.util.HashMap<String,java.lang.reflect.Method> _caucho_getFunctionMap()
  {
    return _jsp_functionMap;
  }

  public void caucho_init(ServletConfig config)
  {
    try {
      com.caucho.server.webapp.WebApp webApp
        = (com.caucho.server.webapp.WebApp) config.getServletContext();
      init(config);
      if (com.caucho.jsp.JspManager.getCheckInterval() >= 0)
        _caucho_depends.setCheckInterval(com.caucho.jsp.JspManager.getCheckInterval());
      _jsp_pageManager = webApp.getJspApplicationContext().getPageManager();
      com.caucho.jsp.TaglibManager manager = webApp.getJspApplicationContext().getTaglibManager();
      manager.addTaglibFunctions(_jsp_functionMap, "jp", "http://www.tonbeller.com/jpivot");
      manager.addTaglibFunctions(_jsp_functionMap, "c", "http://java.sun.com/jstl/core");
      com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.InitPageContextImpl(webApp, this);
    } catch (Exception e) {
      throw com.caucho.config.ConfigException.create(e);
    }
  }

  private final static char []_jsp_string1;
  private final static char []_jsp_string3;
  private final static char []_jsp_string0;
  private final static char []_jsp_string2;
  static {
    _jsp_string1 = "\r\nwith member [Measures].[cantidad] as '([Measures].[cant_ventas])',format_string = IIf((((([Measures].[cant_ventas]))) > 0), \"|#,##0.00|style='green'\", IIf((((([Measures].[cant_ventas]))) < 0), \"|#,##0.00|style='red'\", \"#,##0.00\"))\r\n				   \r\nselect {[Measures].[cantidad]} on columns, {([fechas].[todas_las_fechas],[carros].[todos_los_carros],[consesionarios].[todos_los_consesionarios],[clientes].[todos_los_clientes],[vendedores].[todos_los_vendedores])} on rows from ventas\r\n		   \r\n".toCharArray();
    _jsp_string3 = "\r\n".toCharArray();
    _jsp_string0 = "\r\n\r\n\r\n<!--\r\n// BIACTA 2009 - INTELIGENCIA DE NEGOCIOS CON SOFTWARE LIBRE\r\n// This software is subject to the terms of the Common Public License\r\n// Copyright (C) 2009 Angel R. Condori Coaquira, Inc.\r\n// All Rights Reserved.\r\n//\r\n// Martes, 30 Junio, 2009\r\n-->\r\n\r\n".toCharArray();
    _jsp_string2 = "\r\n\r\n".toCharArray();
  }
}
