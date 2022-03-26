<%@ page import="ru.gb.homework.Product" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: SAMBU
  Date: 26.03.2022
  Time: 18:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>

<h1>Product</h1>
<hr>
<h2>Catalog</h2>
<ul>
    <% for (Product product : (List<Product>) request.getAttribute("product")) { %>
    <li>
        ID: <%= product.getId()%>;
        Title: <%= product.getTitle()%>;
        Cost: <%= product.getCost()%>;
    </li>
    <% } %>
</ul>
</body>
</html>
