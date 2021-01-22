enum OurAnnotationPropsVal {
    FIRST, SECOND, THIRD
}

@interface OurFirstAnnotation {
    OurAnnotationPropsVal prop1Val() default OurAnnotationPropsVal.FIRST
}

@OurFirstAnnotation
class OurClass {

    @OurFirstAnnotation
    def method() {

    }
}

def obj = OurClass.newInstance()
def ann = obj.class.getAnnotation(OurFirstAnnotation)
if(ann) {
    switch (ann.prop1Val()){
        case OurFirstAnnotation.First :
            //Implémenter la logique associée avec la valeur de notre annotation
    }
}


