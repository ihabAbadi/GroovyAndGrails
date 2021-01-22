class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/car"(controller: 'home', action: 'index')
        "/"(view:"/index")
        "500"(view:'/error')

        "/cars"(resources: 'home', excludes:['delete'])
	}
}
