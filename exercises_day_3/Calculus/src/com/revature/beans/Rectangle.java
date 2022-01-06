package com.revature.beans;

/**
 * dim1 is width, dim2 is height.
 */
public class Rectangle extends Polygon {
    public Rectangle() {
        super();
    }

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double getArea() {
        return this.dim1*this.dim2;
    }

    public double getPerimeter() {
        return this.dim1+this.dim1+this.dim2+this.dim2;
    }
}
