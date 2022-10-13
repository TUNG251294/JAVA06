public class Square extends Rectangle{
    private double side = 1.0;
    public Square() {
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
        this.side = side;
    }

    public double getSide(){
        return this.side;
    }
    public String toString(){
        return "A Square with side = " + this.side + ", which is a subclass of A shape with color of " + getColor() + " and " + getFilled();
    }
}
