package formation.listener;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class CustomPersistenceListener
  extends org.grails.datastore.mapping.engine.event.AbstractPersistenceEventListener  implements
    groovy.lang.GroovyObject {
;
public CustomPersistenceListener
(org.grails.datastore.mapping.core.Datastore datastore) {
super ((org.grails.datastore.mapping.core.Datastore)null);
}
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
@java.lang.Override() protected  void onPersistenceEvent(org.grails.datastore.mapping.engine.event.AbstractPersistenceEvent event) { }
@java.lang.Override() public  boolean supportsEventType(java.lang.Class<? extends org.springframework.context.ApplicationEvent> aClass) { return false;}
}
