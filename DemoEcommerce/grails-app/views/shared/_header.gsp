<header class="container-fluid">
    <section class="row justify-content-center align-items-center">
        <div class="col-2">
            <custom:logo></custom:logo>
        </div>
        <div class="col-6">
            <g:render template="/shared/search" model="[controller : 'product', action:'search', placeholder:'Rechercher un produit']"></g:render>
        </div>
    </section>
</header>