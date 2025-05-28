package ss6_Inheritance.CircleCylinder;

import ss6_Inheritance.CircleCylinder.Circle;
import ss6_Inheritance.CircleCylinder.Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5, "blue");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(2.5, "blue", 5.0);
        System.out.println(cylinder);
    }
}
