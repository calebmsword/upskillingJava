package com.revature.beans;

/**
 * dim1 is width, dim2 is height.
 */
public class Rectangle extends Polygon {
    public Rectangle() {
    }

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double getArea() {
        return this.getDim1()*this.getDim2();
    }

    public double getPerimeter() {
        return this.getDim1()+this.getDim1()+this.getDim2()+this.getDim2();
    }
}
