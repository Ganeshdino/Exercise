package org.example.basics.inheritance;

abstract class Shape {

    public abstract void calculateArea();
}

class Circle extends Shape{
    private int arc;
    private final double BY = 3.14159;
    Circle(int arc){
        this.arc = arc;
    }
    @Override
    public void calculateArea() {
        System.out.println(BY * Math.pow(2,arc));
    }
}

public class AbstractImpl {
    public static void main(String[] args) {
        Shape shape = new Circle(4);
        shape.calculateArea();
    }
}