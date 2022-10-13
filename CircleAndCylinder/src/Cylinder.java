public class Cylinder extends Circle{
    private double height = 1.0;
    public Cylinder() {
    }
    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }
    public void setHeight(double newHeight){
        this.height = newHeight;
    }
    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return getArea()*this.height;
    }
}
