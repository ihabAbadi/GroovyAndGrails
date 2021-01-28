
<html>
<head>
    <title></title>

</head>

<body>

        <section class="row">
            <g:each in="${products}" var="product">
                <g:render template="partialProduct" model="[product:product]"></g:render>
            </g:each>
        </section>
</body>
</html>