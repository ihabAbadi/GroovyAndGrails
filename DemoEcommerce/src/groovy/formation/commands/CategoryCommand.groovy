package formation.commands

import grails.validation.Validateable

@Validateable
class CategoryCommand {
    String title
    static constraints = {
        title(blank: false, minSize: 3)
    }
}
