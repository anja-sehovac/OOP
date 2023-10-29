package Shapes;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle("blue", Shape.fillType.FILLED, 2.5);
        Rectangle r1 = new Rectangle("red", Shape.fillType.NOT_FILLED, 3.1, 2.1);
        c1.displayInfo();
        r1.displayInfo();
    }
}
