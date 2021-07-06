package day59_polymorphism_exceptions;

import day57_abstraction_polymorphism.shapes.Circle;
import day57_abstraction_polymorphism.shapes.Shape;
import day57_abstraction_polymorphism.shapes.Square;

public class InstanceOf {
    public static void main(String[] args) {
        Shape shape = new Circle();
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Square);

        System.out.println(shape.getClass().getSimpleName());
        // reflection API
        if (shape.getClass().getSimpleName().equals("Circle")) {
            System.out.println("It's a Circle object");
        }
        System.out.println();
    }
}
