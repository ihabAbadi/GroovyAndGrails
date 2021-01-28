<g:each in="${categories}" var="category">
    <div class="row">
        <g:link controller="product" params="${[categoryId : category.id]}" action="index" class="col">${category.title}</g:link>
    </div>
</g:each>