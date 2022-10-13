public class Main {
    public static void main(String[] args) {
        Student studentA = new Student(40,"Tung",95);
        System.out.println(studentA.getScore());
        System.out.println(studentA.getID());
        System.out.println(studentA.getName());
        Employee employeeX = new Employee(1, "Linh", 1500);
        System.out.println(studentA);
        //không gọi phương thức toString;
        System.out.println(employeeX);
        //Xem lại biến static count tại đây
    }
}