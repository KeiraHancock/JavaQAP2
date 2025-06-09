public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle rect = new MyRectangle(1, 5, 6, 1);

        System.out.println(rect); // toString
        System.out.println("Top Left: " + rect.getTopLeft());
        System.out.println("Bottom Right: " + rect.getBottomRight());

        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}
