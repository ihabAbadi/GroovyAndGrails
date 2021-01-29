<%--
  Created by IntelliJ IDEA.
  User: ihab
  Date: 29/01/2021
  Time: 15:32
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<section class="row">
    <g:form class="col" action="submitForm">
        <div class="row m-1">
            <g:textField name="title" placeholder="Titre du produit" class="form-control col p-1"></g:textField>
        </div>
        <div class="row m-1">
            <g:textField name="price" placeholder="Prix du produit" class="form-control col p-1"></g:textField>
        </div>
        <div class="row m-1">
            <textarea name="description" placeholder="Titre du produit" class="form-control col p-1"></textarea>
        </div>
        <div class="row m-1">
            <select name="categories">
                <g:each in="${categories}" var="cat">
                    <option value="${cat.id}">${cat.title}</option>
                </g:each>
            </select>
        </div>
        <div class="row m-1">
            <button type="submit" class="btn col btn-warning">Valider</button>
        </div>
    </g:form>
</section>

</body>
</html>