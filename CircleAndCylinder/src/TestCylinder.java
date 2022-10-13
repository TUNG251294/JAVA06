public class TestCylinder {
    public static void main(String[] args) {
        Circle circleY;
        circleY = new Cylinder("blue",5,8);
        Cylinder circleZ = (Cylinder) circleY;
        System.out.printf("%.4f%s",circleZ.getVolume(),"\n");
        //đoạn code trên là đang xét ví dụ ép kiểu tường minh từ superType xuống subType(explicit casting)
        Cylinder cyl1 = new Cylinder();
        cyl1.setRadius(3);
        cyl1.setHeight(5);
        System.out.println(cyl1.getColor());
        System.out.println(cyl1.getVolume());
    }
}