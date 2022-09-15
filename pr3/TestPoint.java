package nyrex;

public class TestPoint {
    public static void main(String[] args) {
        MovableCircle c1 = new MovableCircle(0, 0, 1, 1, 2);
        System.out.println(c1);
        c1.moveUp();
        c1.moveRight();
        System.out.println(c1);
    }
}
