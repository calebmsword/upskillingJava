package com.revature.beans;

import java.lang.Math;

/**
 *
 */
public class Triangle extends Polygon {
    private double dim3;

    public Triangle(double dim1, double dim2, double dim3) {
        super(dim1, dim2);

        if(dim3 < 0) {
            System.out.println("WARNING: Triangle given angle less than 0. Angle automatically set to 0.");
            this.dim3 = 0;
        } else if (dim3 > Math.PI/2) {
            System.out.println("WARNING: Triangle given angle greater than pi/2. Angle automatically set to pi/2.");
            this.dim3 = Math.PI/2;
        } else {
            this.dim3 = dim3;
        }
    }

    public Triangle() {
    }

    public double getDim3() {
        return dim3;
    }

    public void setDim3(double dim3) {
        if(dim3 < 0) {
            System.out.println("WARNING: Triangle given angle less than 0. Angle automatically set to 0.");
            this.dim3 = 0;
        } else if (dim3 > Math.PI/2) {
            System.out.println("WARNING: Triangle given angle greater than pi/2. Angle automatically set to pi/2.");
            this.dim3 = Math.PI/2;
        } else {
            this.dim3 = dim3;
        }
    }

    public double getArea() {
        return 0.5*this.getDim1()*this.getDim2()*Math.sin(this.getDim3());
    }

    public double getPerimeter() {
        final double a = this.getDim1();
        final double b = this.getDim2();
        final double gamma = this.getDim3();
        final double c = Math.sqrt(a*a+b*b-2*a*b*Math.cos(gamma));
        return a+b+c;
    }
}
