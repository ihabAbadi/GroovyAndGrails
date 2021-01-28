class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/search/$search"(controller: 'product', action: 'search')

        "/"(controller: 'product', action: 'index')
        "500"(view:'/error')
	}
}
