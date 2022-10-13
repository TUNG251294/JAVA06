public class TestCircle {
    public static void main(String[] args) {
        Circle circleX = new Circle();
        circleX.setColor("Green");
        circleX.setRadius(3.5);
        System.out.println(circleX.getColor());
        System.out.println(circleX.getRadius());
        System.out.printf("%.4f",circleX.getArea());
    }
}
