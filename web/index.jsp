<!DOCTYPE HTML>
<html>
<%--<style type="text/css">--%>
  <%--.login {--%>
    <%--height:180px; width:230px;--%>
    <%--margin:0;--%>
    <%--padding:10px;--%>
    <%--border:1px #CCC solid;--%>
  <%--}--%>
  <%--.login input {--%>
    <%--padding:5px; margin:5px--%>
  <%--}--%>
<%--</style>--%>
<body>
<form method="post" action="/login">
  <div class="login">
    <h2>Login</h2>

  </div><input type="text" name="username" size="30"  placeholder="username" />
  <input type="text" name="password" size="30" placeholder="password" />
  <input type="text" name="nameOfAdmin" placeholder="Your Name"/>
  <input type="submit" value="Sign in"/>
</form>
</body>
</html>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
  <%--<meta charset="UTF-8">--%>
  <%--<title>c:choose,c:when,c:otherwise example</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h2>c:choose,c:when,c:otherwise example</h2>--%>
<%--<c:choose>--%>
  <%--&lt;%&ndash; Khi tham số color == 'red' &ndash;%&gt;--%>
  <%--<c:when test="${param.color=='red'}">--%>
    <%--<p style="color:red;">RED COLOR</p>--%>
  <%--</c:when>--%>
  <%--&lt;%&ndash; Khi tham số color == 'blue' &ndash;%&gt;--%>
  <%--<c:when test="${param.color=='blue'}">--%>
    <%--<p style="color:blue;">BLUE COLOR</p>--%>
  <%--</c:when>--%>
  <%--&lt;%&ndash; Các trường hợp khác &ndash;%&gt;--%>
  <%--<c:otherwise>--%>
    <%--<b>Other color change</b>--%>
  <%--</c:otherwise>--%>
<%--</c:choose>--%>
<%--</body>--%>
<%--</html>--%>