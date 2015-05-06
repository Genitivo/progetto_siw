<%--
  Created by IntelliJ IDEA.
  User: Michele
  Date: 05/05/15
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<!--<form action="<c:url value="/controller/helper/id.check" method="get">!-->
    <div>Email: <input type="text" name="email" value="${user.email}"/> ${emailErr}</div>
    <div>Password: <input type="text" name="password" value="${user.password}"/> ${passwordErr}</div>
    <div><input type="submit" name="sumbit" value="invia" /></div>
    </form>
</body>
</html>
