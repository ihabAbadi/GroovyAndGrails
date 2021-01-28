<g:link action="detail" controller="product" id="1">
    <div class="col-3">
        <div class="row">
            <img class="col" src="${createLink(uri: '/images/logo.png')}">
        </div>
        <div class="row">
            <div class="col">
                ${product.title}
            </div>
        </div>
        <div class="row">
            <div class="col">
                ${product.price} €
            </div>
        </div>
    </div>
</g:link>
