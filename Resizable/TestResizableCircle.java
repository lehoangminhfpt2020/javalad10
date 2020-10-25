package lad10.Resizable;

public class TestResizableCircle {
    public static void main(String[] args) {
        Circle c1 = new ResizableCircle(6.0);

        System.out.println("c1");
        System.out.println(c1.toString());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());
        System.out.println("\n");

        System.out.println("rc1");
        ResizableCircle rc1 = new ResizableCircle(2.0);
        System.out.println(rc1.toString());
        System.out.println(rc1.getPerimeter());
        System.out.println(rc1.getArea());
        rc1.resize(150);
        System.out.println(rc1.toString());
        System.out.println("\n");

        System.out.println("c2");
        Circle c2 = new Circle(5.0);
        System.out.println(c2.toString());
    }
}
