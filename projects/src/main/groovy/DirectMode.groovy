//Groovy utilise ses propres classLoaders

/*
def loader = this.class.getClassLoader()

while (loader != null) {
    println(loader)
    loader = loader.getParent()
}*/


//Typage est optionnel

/*
Object chaine = 'our string'

chaine = 3
println(chaine.getClass())

def method(Object o) {
    1
}

def method(String s) {
    2
}

println method(chaine)*/
/*
def nom = 'abadi'
def chaine = "Nom : ${nom}"
println(chaine.getClass())*/

/*int a = 10*/

/*def display(long a) {
    println(a)
}
def display(Integer a) {
    println(a)
}

display(a)*/

/*
int a = 'abadi'
println(a + 10)*/
class Person {
    private String firstName
    String lastName

    String getFirstName() {
        return "Mr "+ firstName
    }
}

//def persons = [new Person(firstName: 'abadi', lastName: 'ihab'), new Person(firstName: 'titi', lastName: 'tata')]
def p = new Person(firstName: 'abadi')

println(p.getFirstName())

/*def range = (1..10)
(1..<10).each {println(it)}*/

//Map

/*def map = [firstName : 'abadi', lastName : 'ihab']

//println(map.firstName)
map.eachWithIndex{  entry, int i -> println(entry) }*/
/*def person =null
println(person?.name)

def ourName = person.name ?: 'any name'
println(ourName)*/

/*println(1 <=> 3)*/



