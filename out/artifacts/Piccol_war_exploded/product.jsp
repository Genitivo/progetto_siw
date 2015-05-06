<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Product</title>
</head>
<body>

<h1>${product.name}</h1>
<h2>Details</h2>
<div>Code: ${product.code}</div>
<div>Price: ${product.price}</div>
<div>Description: ${product.description}</div>
<ul>
    <li><a href="<c:url value="http://localhost:8080/controller/product.list" />">Torna al catalogo</a></li>
    <li><a href="<c:url value="http://localhost:8080/controller/order.create" />">Aggiungi a ordine</a></li>
</ul>
${action}
</body>
</html>