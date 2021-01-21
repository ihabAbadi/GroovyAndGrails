/*def cl = { name -> println("say hello ${name}")}
println(cl.getClass())
cl('abadi') // <=> cl.call()*/

//Utilisation du scope des closures
//this

/*
class Parent {

    class Enfant {
        def cl = {owner}

        def method() {
            def cl = {owner}
        }
    }

    def method() {
        def e = new Enfant()
        assert e.cl() == e
    }
}

new Parent().method()*/

//delegate

def p = [firstName : 'abadi', lastName : 'ihab']

def upperCl = {firstName.toUpperCase()}

upperCl.delegate = p

println(upperCl())

