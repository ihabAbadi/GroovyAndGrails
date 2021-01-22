package com.utopios.traits

trait OurControllerTrait {
    def beforeInterceptor = [action:this.&actionToRun, except:'']
}