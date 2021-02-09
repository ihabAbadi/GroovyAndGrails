<g:link action="detail" controller="product" id="${product.id}">
    <div class="col-3">
        <div class="row">
            <img class="col" src="${createLink(uri: '/'+product.images[0].url)}">
        </div>
        <div class="row">
            <div class="col">
                ${product.title}
            </div>
        </div>
        <div class="row">
            <div class="col">
                ${product.price.encodeAsHtml()} €
            </div>
        </div>
    </div>
</g:link>
