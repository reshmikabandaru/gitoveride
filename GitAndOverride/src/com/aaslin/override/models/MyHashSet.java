/***Create a Pojo(Plain Old Java Object) Shape. 
 * 
 * Create a HashSet and store the unique Pojo in the application. Use Override methods to do this.
 @author Reshmikabandaru
***/




package com.aaslin.override.models;

import java.util.HashSet;

public class MyHashSet {

    public static void main(String[] args) {
        HashSet<MyShape> rect = new HashSet<>();

        MyShapeRectangle sh1 = new MyShapeRectangle(12, 25.0);
        MyShapeRectangle sh2 = new MyShapeRectangle(13.5, 16.0);
        MyShapeRectangle sh3 = new MyShapeRectangle(16.5, 30.0);
        MyShapeRectangle sh4 = new MyShapeRectangle(12, 25.0); 

        rect.add(sh1);
        rect.add(sh2);
        rect.add(sh3);
        rect.add(sh4); // This won't be added because it's a duplicate

       
        System.out.println();
        for (MyShape shape : rect) {
            System.out.println(shape);
            
        }
    }
}
 