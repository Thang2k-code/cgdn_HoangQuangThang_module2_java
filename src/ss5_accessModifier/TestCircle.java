package ss5_accessModifier;
import java.util.Scanner;
public class TestCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your Radius: ");
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        System.out.println("Radius is: " + c.getRadius());
        System.out.println("Area is: " + c.getArea());
        sc.close();
    }
}
