<%--
  Created by IntelliJ IDEA.
  User: Michele
  Date: 05/05/15
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
    <title>Product</title>
</head>
<body>
<h1>Products</h1>
<table>
    <tr>
        <th>Name</th>
        <th>Price</th>
    </tr>
    <c:forEach var="product" items="${products}">
        <tr>
            <td><a href="<c:url value="/controller/product.get?id=${product.id}" />">${product.name}</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>