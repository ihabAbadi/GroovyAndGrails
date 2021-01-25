package com.utopios.factories

import grailsdemo.FirstService

class HomeFactory {
    FirstService firstService
    def method1() {
        "hello from factory service"
    }
}
