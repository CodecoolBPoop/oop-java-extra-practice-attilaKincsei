package exercises.java;

import java.lang.Math;

public class Circle {

    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";

    }

    public Circle(double radius) {
        this.radius = radius;
        color = "red";

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    double getRadius() {
        return radius;
    }

    String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * This is an explicit method that overrides java.lang.Object toString() method
     * and prints a basic description of the instance.
     * Should be called explicitly
     */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}