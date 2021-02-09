package formation.interfaces;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public interface IRepository
<T> {
;
 void create(T element);
 void update(T element);
 void delete(T element);
 T read(int id);
 java.util.List<T> readAll(java.lang.Object closure);
}
