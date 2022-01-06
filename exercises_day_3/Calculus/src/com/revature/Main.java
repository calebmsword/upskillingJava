package com.revature;

import com.revature.beans.Rectangle;
import com.revature.beans.Triangle;


public class Main {
    public static void main(String[] args) {
        System.out.println("Creating rectangle of dim1=1 and dim2=2.");
        Rectangle rectangle = new Rectangle(1,2);
        System.out.println("Area of rectangle is: "+rectangle.getArea());
        System.out.println("Perimeter of rectangle is: "+rectangle.getPerimeter());
        System.out.println("Creating right triangle with legs of length 3 and 4.");
        Triangle triangle = new Triangle(3,4,Math.PI/2);
        System.out.println("Area of triangle is: "+triangle.getArea());
        System.out.println("Perimeter of triangle is: "+triangle.getPerimeter());
    }
}
