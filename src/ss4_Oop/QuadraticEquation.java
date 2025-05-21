package ss4_Oop;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập giá trị b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập giá trị c: ");
        double c = sc.nextDouble();
        if (a == 0) {
            System.out.println("Không phải phương trình bậc hai (a phải khác 0).");
        } else {
            QuadraticEquation eq = new QuadraticEquation(a, b, c);
            double delta = eq.getDiscriminant();

            if (delta > 0) {
                System.out.println("Phương trình có 2 nghiệm:");
                System.out.println("Nghiệm 1: " + eq.getRoot1());
                System.out.println("Nghiệm 2: " + eq.getRoot2());
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép: " + eq.getRoot1());
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        }

        sc.close();
    }
}
