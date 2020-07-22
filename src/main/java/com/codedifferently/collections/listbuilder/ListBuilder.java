package com.codedifferently.collections.listbuilder;

import java.util.Collection;
import java.util.List;

public interface ListBuilder {
    
    List<Object> buildList(Object[] a);

    List<Object> buildList(Collection<Object> a);
    
    List<Object> buildList(Object[] a, Object[] b);

    List<Object> buildList(Collection<Object> a, Collection<Object> b);


}



