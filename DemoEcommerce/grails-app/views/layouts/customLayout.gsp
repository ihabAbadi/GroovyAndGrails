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
    <title>
        <g:layoutTitle/>
    </title>
</head>

<body>
%{--    Inclure header on peut utilser le tag render--}%
    <g:render template="/shared/header"></g:render>
    <main class="container">
    <g:render template="/shared/breadCrump"></g:render>
    <section class="row">
        <aside class="col-3">
            <g:include controller="category"></g:include>
        </aside>
        <div class="col-9">
            <g:layoutBody/>
        </div>
    </section>
</main>


%{--Inclure footer--}%
</body>
</html>