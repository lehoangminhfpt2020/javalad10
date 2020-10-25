package lad10.Shape;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(56.4, "Blue", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());

        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());

//        Shape s2 = new Shape();
        Shape s3 = new Rectangle(1.0, 4.5, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());

        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        Shape s4 = new lad10.Shape.Square(5.5);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getPerimeter());

        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);

        Square sq1 = (Square) r2;
        System.out.println(sq1);
    }
}
