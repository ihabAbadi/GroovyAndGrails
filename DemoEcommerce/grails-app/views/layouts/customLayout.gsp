<%--
  Created by IntelliJ IDEA.
  User: ihab
  Date: 28/01/2021
  Time: 10:44
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css" integrity="sha512-HK5fgLBL+xu6dm/Ii3z4xhlSUyZgTT9tuc/hSrtw6uzJOvgRr2a9jyxxT1ely+B+xFAmJKVSTbpM/CuL7qxO8w==" crossorigin="anonymous" />
    <title>
        <g:layoutTitle/>
    </title>
    <g:javascript library="jquery"></g:javascript>
    <asset:javascript src="application.js"></asset:javascript>
    <asset:javascript src="ourAjax.js"></asset:javascript>
</head>

<body>
%{--    Inclure header on peut utilser le tag render--}%
    <g:render template="/shared/header"></g:render>
    <main class="container">
    <g:render template="/shared/breadCrump"></g:render>
    <section class="row">
        <aside class="col-3">
            <g:include controller="category" ></g:include>
        </aside>
        <div class="col-9">
            <g:layoutBody/>
        </div>
    </section>
</main>
<div id="spinner" style="position: fixed;top: 50px;right: 50px;font-size: 60px; display: none">
    <i class="fas fa-spinner"></i>
</div>

%{--Inclure footer--}%
</body>
</html>