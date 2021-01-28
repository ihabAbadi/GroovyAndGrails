
<html>
<head>
    <title></title>

</head>

<body>
    <main class="container">
        <section class="row">
            <g:each in="${products}" var="product">
                <g:render template="partialProduct" model="[product:product]"></g:render>
            </g:each>
        </section>
    </main>

</body>
</html>