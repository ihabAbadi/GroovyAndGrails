package formation.tools

class Projecter {
    static def create(Object o, Class cl) {
        def response = cl.newInstance()
        o.getProperties().each {p ->
            response.metaClass.properties."${p.getKey()}" = p.getValue()
        }

        cl.getProperties().each {p->
            if(o.metaClass.getProperty(o, p.getKey().toString()))
                p.value = o.metaClass.getProperty(o, p.getKey().toString())
        }
        response
    }
}
