package com.csc205.project2;

public class Cylinder extends Shape {

    private double radius;
    private double height;

    public Cylinder() {
        super();
        this.radius = 0.0;
    }

    public Cylinder(double r, double h) {
        super();
        this.radius = r;
        this.height = h;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea() {
        return (2.0 * Math.PI * radius * height) + (2.0 * Math.PI * Math.pow(radius, 2));
    }

    public double volume() {
        return (Math.PI * Math.pow(radius, 2) * height);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("Radius = ").append(radius);
        sb.append(", Width = ").append(height);
        sb.append(", Surface Area = ").append(surfaceArea());
        sb.append(", Volume = ").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
