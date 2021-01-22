import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor

//DSL
/*
class Cookie {
    List ingredient

    Cookie() {
       ingredient = new ArrayList()
    }

    def make(def closure) {
        closure.delegate = this
        closure()
    }

    def ingredient( element) {
        ingredient << element
    }
}

def c = new Cookie()
c.make {
    ingredient("chocolat")
    ingredient "lait"
    ingredient "farine"
}

println(c.ingredient)*/
//@ToString
//@TupleConstructor
//@EqualsAndHashCode
@Canonical
class Email implements GroovyInterceptable {
    String from
    String to
    List cc
    String subject
    String body
    List attach

    Email() {
        cc = new ArrayList()
        attach = new ArrayList()
    }

    def send(def cl) {
        cl.delegate = this
        cl()
    }

    def from(String from) {
        this.from = from
    }
    def to(String to) {
        this.to = to
    }
    def cc(String cc) {
        this.cc << cc
    }

    def subject(String subject) {
        this.subject = subject
    }

    def body(String body) {
        this.body = body
    }

    def attach(String attach) {
        this.attach << attach
    }
}

Email e = new Email('test')
Email e2 = new Email('from', '')

e.send {
    from "ihab@utopios.net"
    to "toto@tata.fr"
    cc "titi@minet.fr"
    subject "test"
    body : "body mail"
    attach : "file1"
}

println(e)