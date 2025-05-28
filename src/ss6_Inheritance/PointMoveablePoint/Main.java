package ss6_Inheritance.PointMoveablePoint;
    public class Main {
        public static void main(String[] args) {
            MoveablePoint mp = new MoveablePoint(1, 2, 0.5f, 1.5f);
            System.out.println(mp);
            mp.move();
            System.out.println(mp);
        }
    }
