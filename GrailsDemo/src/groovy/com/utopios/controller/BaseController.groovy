package com.utopios.controller

class BaseController {
    def beforeInterceptor = {
        println("Interception request")
    }
}
