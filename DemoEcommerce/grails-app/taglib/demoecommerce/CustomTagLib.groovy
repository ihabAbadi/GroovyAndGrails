package demoecommerce

class CustomTagLib {
    static namespace = "custom"
    ToolsService toolsService
    static defaultEncodeAs = [taglib:'text']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]
    def logo = {attr, body ->
        out << render(template: '/shared/logo', model: [logo:createLink(uri: '/'+toolsService.getLogo())])
    }

    /*def encodeHTML = { attr, body ->
        out << body.c
    }*/
}
