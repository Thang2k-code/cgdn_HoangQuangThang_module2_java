package ss7_AbstractClass_Interface.Resizeable;

import ss7_AbstractClass_Interface.Resizeable.Resizeable;

public class Square implements Resizeable {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }
    @Override
    public void resize(double percent) {
        side += side * percent / 100;
    }
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
