package demoecommerce

import grails.transaction.Transactional

@Transactional
class ToolsService {

    def getLogo() {
        'images/logo.png'
    }
}
