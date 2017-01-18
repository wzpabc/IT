
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<shiro:notAuthenticated>
	<% response.sendRedirect("login");%>
</shiro:notAuthenticated>
<shiro:authenticated>
	<% response.sendRedirect("index");%>
</shiro:authenticated>
