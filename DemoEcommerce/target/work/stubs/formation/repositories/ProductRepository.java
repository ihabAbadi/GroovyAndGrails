package formation.repositories;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class ProductRepository
  extends java.lang.Object  implements
    formation.interfaces.IRepository<demoecommerce.Product>,    groovy.lang.GroovyObject {
;
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
@java.lang.Override() public  void create(demoecommerce.Product element) { }
@java.lang.Override() public  void update(demoecommerce.Product element) { }
@java.lang.Override() public  void delete(demoecommerce.Product element) { }
@java.lang.Override() public  demoecommerce.Product read(int id) { return (demoecommerce.Product)null;}
@java.lang.Override() public  java.util.List<demoecommerce.Product> readAll(java.lang.Object closure) { return (java.util.List<demoecommerce.Product>)null;}
public  java.util.List<demoecommerce.Product> searchByAllField(java.lang.String search) { return (java.util.List<demoecommerce.Product>)null;}
public  java.util.List<demoecommerce.Product> getProductByCategory(int cat) { return (java.util.List<demoecommerce.Product>)null;}
}
