




/***Create a Pojo(Plain Old Java Object) Shape. 
 * 
 * Create a HashSet and store the unique Pojo in the application. Use Override methods to do this.
 @author Reshmikabandaru
***/



package com.aaslin.override.models;

import java.util.Objects;

class MyShape {
  
}

class MyShapeRectangle extends MyShape {
    private double length;
    private double width;

    public MyShapeRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // This method will remain for specific rectangle calculations
    public double calculateArea() {
        return length * width;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyShapeRectangle shape = (MyShapeRectangle) obj;
        return Double.compare(shape.length, length) == 0 && Double.compare(shape.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    @Override
    public String toString() {
        return "MyShapeRectangle{" + "length=" + length + ", width=" + width + '}';
    }
}



