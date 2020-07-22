package com.codedifferently.collections.listbuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListBuilder implements ListBuilder {

    public List<Object> buildList(Object[] a) {
        List<Object> newList = Arrays.asList(a);
        return newList;
    }

    public List<Object> buildList(Collection<Object> a) {

        List<Object> newList = new ArrayList<Object>(a);

        return newList;
    }

    public List<Object> buildList(Object[] a, Object[] b) {

        List<Object> list1 = Arrays.asList(a);
        List<Object> list2 = Arrays.asList(b);

        List<Object>newList = new ArrayList<Object>();

        newList.addAll(list1);
        newList.addAll(list2);
        
        
        return newList;
    }

    public List<Object> buildList(Collection<Object> a, Collection<Object> b) {

        List<Object> list1 = new ArrayList<Object>(a);
        List<Object> list2 = new ArrayList<Object>(b);

        List<Object> newList = new ArrayList<Object>();
        newList.addAll(list1);
        newList.addAll(list2);

        return newList;
    }


    
}