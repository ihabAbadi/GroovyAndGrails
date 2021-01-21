//DSL
class Cookie {
    List ingredient

    Cookie() {
       ingredient = new ArrayList()
    }

    def make(def closure) {
        closure.delegate = this
        closure()
    }

    def ingredient(String element) {
        ingredient << element
    }
}

def c = new Cookie()
c.make {
    ingredient("chocolat")
    ingredient "lait"
    ingredient "farine"
}

println(c.ingredient)