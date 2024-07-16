package org.example;

public class myRunner {
    public static void main(String[] args){
        Circle c = new Circle(100);
        System.out.println("Area of Circle " + c.getArea());
        System.out.println("+++++++++++++++++");
        Shape shapeCircleobj = new Circle(100);
        shapeCircleobj.displayshapName();
        System.out.println("Area of Circle" + shapeCircleobj.getArea());
        System.out.println(shapeCircleobj);
        System.out.println(shapeCircleobj instanceof Circle);

        System.out.println("+++++++++++++++++");
        Shape shapeRectangleobj = new Rectangle("Red");
        shapeRectangleobj.displayshapName();
        shapeRectangleobj.setHeight(2);
        shapeRectangleobj.setWidth(4);
        System.out.println("Area of Rectangle is " +
                shapeRectangleobj.getArea());
        System.out.println(shapeRectangleobj);
        System.out.println(shapeRectangleobj instanceof Rectangle);
        System.out.println("--------------------");
        Shape shapeTriangleobj = new Triangle("Blue");
        shapeTriangleobj.displayshapName();
        shapeTriangleobj.setHeight(10);
        shapeTriangleobj.setBase(15);
        System.out.println("Area of Triangle is " + shapeTriangleobj.getArea());
        System.out.println(shapeTriangleobj);


}}
