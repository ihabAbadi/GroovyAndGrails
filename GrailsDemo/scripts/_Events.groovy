eventCompileEnd = { message ->
    def cl = classLoader.loadClass('com.utopios.entities.Person')
    def p = cl.newInstance()
    p.firstName = 'abadi'
    println(p)
}