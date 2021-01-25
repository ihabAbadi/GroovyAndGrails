package com.utopios.traits

trait ExceptionHandler {
    def handleRuntimeException(RuntimeException e) {
        /*RuntimeException ex = new RuntimeException()
        ex.properties = params*/
        render e.message
    }
}