package com.codedifferently.collections.iterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import com.codedifferently.collections.listbuilder.ArrayListBuilder;

import org.junit.Assert;

import org.junit.Test;

public class ArrayListBuilderTest {

    @Test

    public void buildListTest1() {
        // Given
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();

        Object[] test = { 1, 2, 3, 4 };

        List<Object> result = arrayListBuilder.buildList(test);

        int expected = test.length;
        int actual = result.size();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void buildListTest2() {
        // Given
        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();

        Object[] test1 = { 1, 2, 3, 4 };
        Object[] test2 = { 5, 6, 7, 8 };

        List<Object> result = arrayListBuilder.buildList(test1, test2);

        int expected = test1.length + test2.length;
        int actual = result.size();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void buildCollectionTest() {

        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();

        Collection<Object> test = new HashSet<Object>();

        test.add("Scooby");
        test.add("Doo");

        List<Object> result = arrayListBuilder.buildList(test);

        int expected = test.size();
        int actual = result.size();


        Assert.assertEquals(expected, actual);


    }

    @Test
    public void buildCollectionTest2() {

        ArrayListBuilder arrayListBuilder = new ArrayListBuilder();

        Collection<Object> test1 = new HashSet<Object>();
        Collection<Object> test2 = new HashSet<Object>();

        test1.add("Scooby");
        test1.add("Doo");

        test2.add("Doodle");
        test2.add("Bob");

        List<Object> result = arrayListBuilder.buildList(test1,test2);

        int expected = test1.size() + test2.size();
        int actual = result.size();


        Assert.assertEquals(expected, actual);


    }

}
