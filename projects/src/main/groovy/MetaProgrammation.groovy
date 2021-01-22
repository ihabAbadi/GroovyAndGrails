import org.codehaus.groovy.ast.ASTNode
import org.codehaus.groovy.control.SourceUnit
import org.codehaus.groovy.transform.ASTTransformation
import org.codehaus.groovy.transform.GroovyASTTransformationClass

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

class Car {
    String model
    double price
}
Car.metaClass.promotion =  {double val-> price-val}
def chaine  = "newModel"

Car.metaClass."changeModelTo${chaine}" = {delegate.model = "newModel"}
def c = new Car(price: 100)
//Car.metaClass.getPrice = {->10}

double promo = 20
c.changeModelTonewModel()
println(c.promotion(promo))

/*
class IntegerExtension {
    static void addMethodToInteger(Integer self, Closure cl) {
        int element = self
        cl()
    }

    static void increment(Integer self) {
        self++
    }
}*/

@Category(Integer)
class TripleInteger {
    public Integer triple() { this * 3}
}


use(TripleInteger) {
    int a = 10
    println(a.triple())
}


//AST Metaprogrammation

@Retention(RetentionPolicy.SOURCE)
@Target([ElementType.METHOD])
@GroovyASTTransformationClass(["OurASTClass"])
@interface OurAST {

}

class OurASTClass implements ASTTransformation {

    @Override
    void visit(ASTNode[] nodes, SourceUnit source) {
        //Ajouter la logique metier associée à la création de Transformation
    }
}