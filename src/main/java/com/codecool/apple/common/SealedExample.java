package com.codecool.apple.common;

public class SealedExample {
    public sealed class Shape permits Circle, Rectangle {
        // Ciało klasy Shape
    }

    public final class Circle extends Shape {
        // Ciało klasy Circle
    }

    public non-sealed class Rectangle extends Shape {
        // Ciało klasy Rectangle
    }


    public class FunnyCircle extends Rectangle {

    }
}
