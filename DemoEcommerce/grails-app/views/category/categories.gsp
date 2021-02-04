<g:each in="${categories}" var="category">
    <div class="row">
        <g:remoteLink controller="product" update="resultProducts" params="${[categoryId : category.id]}" action="indexAjax" class="col">${category.title}</g:remoteLink>
        %{--<g:remoteLink controller="product" action="indexAjax" params="${[categoryId : category.id]}" onSuccess="getProductByCategorie(data)" class="col">${category.title}</g:remoteLink>--}%

    </div>
</g:each>