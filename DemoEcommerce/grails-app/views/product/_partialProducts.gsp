<g:each in="${products}" var="product">
    <g:render template="partialProduct" model="[product:product]"></g:render>
</g:each>