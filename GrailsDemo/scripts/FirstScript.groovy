includeTargets << grailsScript("_GrailsInit")
includeTargets << grailsScript("_GrailsEvent")
target(firstScript: "The description of the script goes here!") {
    println("First Script")
    event('compileStart', ["send message to compileStartEvent"])
    def cl = classLoader.loadClass("package.classe")
    def obj = cl.newInstance()
}

target(optionScirpt : "option Script") {

}

setDefaultTarget(firstScript)
