<%--
  Created by IntelliJ IDEA.
  User: ihab
  Date: 28/01/2021
  Time: 14:11
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
    <div class="row">
        <h1 class="col-8">
            ${product.title}
        </h1>
        <span class="col-4">
            ${product.price} €
        </span>
    </div>
    <div class="row">
        <div class="col">
            <img class="col" src="${createLink(uri: '/images/logo.png')}">
        </div>
    </div>
    <div class="row">
        <div class="col">
            ${product.description}
        </div>
    </div>
    <div class="row">
        <g:remoteLink action="addProduct" id="1" controller="basket" update="resultCart" class="btn btn-secondary col">Ajouter au panier</g:remoteLink>
    </div>
</body>
</html>