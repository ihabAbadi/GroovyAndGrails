import grails.util.Environment

class BootStrap {

    def init = { servletContext ->
        /*switch (Environment.current) {
            case Environment.PRODUCTION :
                break;
        }*/
        environments {
            production {}
        }
    }
    def destroy = {
    }
}
