<%--
  Created by IntelliJ IDEA.
  User: Trung
  Date: 5/27/2019
  Time: 7:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<html>
<head>
    <title>Title</title>
</head>
<h1>User name: </h1>
<%= request.getAttribute("username")%>
<br>
<h1>Password: </h1>
<%= request.getAttribute("password")%>
<h1>List from database</h1>

<table width="100%" border="1" cellpadding="1" cellspacing="1">
    <tr>
        <th width="10%">user</th>
        <th width="50%">password</th>
    </tr>
    <c:forEach items="${list}" var="listAccount">
        <tr>
            <td>${listAccount.userName}</td>
            <td>${listAccount.password}</td>
        </tr>
    </c:forEach>
</table>
<body>

</body>
</html>
