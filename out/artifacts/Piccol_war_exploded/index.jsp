<%--
  Created by IntelliJ IDEA.
  User: Michele
  Date: 04/05/15
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="US-ASCII">
    <title>Piccol</title>
</head>
<body>
<h1>STO CAZZO</h1>
<ul>
    <li><a href="<c:url value="/controller/product.create" />">Nuovo ordine</a></li>
    <li><a href="<c:url value="/controller/product.list" />">Catalogo</a></li>
</ul>
${action}
</body>
</html>
