public class Main {
    public static void main(String[] args) {
        Rectangle recA = new Rectangle();
        System.out.println(recA.getColor());

        Circle cirX = new Circle();
        cirX.setRadius(5);
        System.out.println(cirX);

        Square squareQ = new Square();
        squareQ.setSide(3);
        System.out.println(squareQ);
        System.out.println(squareQ.getArea());
        System.out.println(squareQ.getPerimeter());

        Square squareP = new Square(5);
        System.out.println(squareP);
        System.out.println(squareP.getArea());
        System.out.println(squareP.getPerimeter());
    }
}