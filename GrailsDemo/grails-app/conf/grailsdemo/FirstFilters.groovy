package grailsdemo

class FirstFilters {

    def filters = {
        allExceptAuthenticationController(controller:'Authentication', invert : true ) {
            before = {
                /*if(!session.user) {
                    redirect(action: 'login', controller: 'Authentication')
                }*/
            }
            after = { Map model ->
                /*model.user = session.user*/
            }
            afterView = { Exception e ->

            }
        }
    }
}
