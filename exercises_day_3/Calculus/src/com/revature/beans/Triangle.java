package com.revature.beans;

import java.lang.Math;

/**
 * dim3 is the angle (radians) between sides of length dim1 and dim2.
 */
public class Triangle extends Polygon {
    private double dim3;

    public Triangle(double dim1, double dim2, double dim3) {
        super(dim1, dim2);

        if (dim3 < 0) {
            System.out.println("WARNING: Dimension 3 must be a value greater than 0. Angle automatically set to 1.");
            this.dim3 = 1;
        } else if (dim3 > Math.PI/2) {
            System.out.println("WARNING: Triangle given angle greater than pi/2. Angle automatically set to pi/2.");
            this.dim3 = Math.PI/2;
        } else if (dim3 == 0) {
            System.out.println("WARNING: Dimension 3 cannot be 0. Angle automatically set to 1.");
        } else {
            this.dim3 = dim3;
        }
    }

    public Triangle() {
        super();
    }

    public double getDim3() {
        return dim3;
    }

    public void setDim3(double dim3) {
        if (dim3 < 0) {
            System.out.println("WARNING: Dimension 3 must be a value greater than 0. Angle automatically set to 1.");
            this.dim3 = 1;
        } else if (dim3 > Math.PI/2) {
            System.out.println("WARNING: Triangle given angle greater than pi/2. Angle automatically set to pi/2.");
            this.dim3 = Math.PI/2;
        } else if (dim3 == 0) {
            System.out.println("WARNING: Dimension 3 cannot be 0. Angle automatically set to 1.");
        } else {
            this.dim3 = dim3;
        }
    }

    public double getArea() {
        return 0.5*this.dim1*this.dim2*Math.sin(this.dim3);
    }

    public double getPerimeter() {
        final double a = this.dim1;
        final double b = this.dim2;
        final double gamma = this.dim3;
        final double c = Math.sqrt(a*a+b*b-2*a*b*Math.cos(gamma));
        return a+b+c;
    }
}
