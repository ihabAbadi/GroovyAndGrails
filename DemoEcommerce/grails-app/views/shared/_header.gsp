<header class="container-fluid">
    <section class="row justify-content-center align-items-center">
        <div class="col-2">
            <custom:logo></custom:logo>
        </div>
        <div class="col-6">
            <g:render template="/shared/search" model="[controller : 'product', action:'search', placeholder:'Rechercher un produit']"></g:render>
        </div>
        <div class="col-2">
            <i class="fas fa-cart-plus"></i>
            <span class="badge badge-light" id="resultCart">
                <g:if test="${session.cart}">
                    ${session.cart.size()}
                </g:if>
            </span>
        </div>
    </section>
</header>