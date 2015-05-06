<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Michele
  Date: 05/05/15
  Time: 17:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CARELLO</title>
</head>
<body>
<table>
    <tr>
        <th>Nome</th>
        <th>Quantità</th>
        <th>Prezzo</th>
    </tr>
    <c:forEach var="orderLine" items="${order.orderLines}">
        <tr>
            <td><a href="<c:url value="http://localhost:8080/controller/product.get?id=${orderLine.id}" />">${product.name}</a></td>
            <td>${orderLine.quantity}</td>
            <td>${orderLine.price}</td>
            <td> <a href=""<c:url value="/controller/product.delete?id=${orderLine.id}"/>"Rimuovi</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
