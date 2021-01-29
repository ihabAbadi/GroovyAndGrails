<%--
  Created by IntelliJ IDEA.
  User: ihab
  Date: 28/01/2021
  Time: 16:08
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>

<g:if test="${categoryCommand}">
    <g:hasErrors bean="${categoryCommand}">
        <div class="row">
            <div class="col alert alert-danger">
                <g:eachError var="error" bean="${categoryCommand}">
                    <li>${error}</li>
                </g:eachError>
            </div>
        </div>

    </g:hasErrors>
</g:if>
<section class="row">
    <g:form controller="category" enctype="multipart/form-data" action="submitForm" class="col">
        <div class="row">
            <g:textField name="title" placeholder="Titre de la catégorie" class="col form-control m-1 p-1"></g:textField>
        </div>
        <div class="row">
            <input type="file" name="image">
        </div>
        <div class="row">
           %{-- <g:submitToRemote update="[success:'cssSelectorSuccess', failure:'cssSelectorError']">Valider</g:submitToRemote>--}%
             <button class="col btn btn-success m-1 p-1" type="submit">Valider</button>
        </div>
    </g:form>
  %{--  <g:formRemote name="categoryForm" url="[controller:'category', action:'submitForm']" update="[success:'cssSelectorSuccess', failure:'cssSelectorError']" class="col">
        <div class="row">
            <g:textField name="title" placeholder="Titre de la catégorie" class="col form-control m-1 p-1"></g:textField>
        </div>
        <div class="row">
            --}%%{--            <g:submitToRemote update="[success:'cssSelectorSuccess', failure:'cssSelectorError']">Valider</g:submitToRemote>--}%%{--
            <button class="col btn btn-success m-1 p-1" type="submit">Valider</button>
        </div>
    </g:formRemote>--}%
</section>

</body>
</html>