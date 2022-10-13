public class Employee extends Person{
    public double salary;

    public Employee(int ID, String name, double salary) {
        super(ID, name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", salary=" + salary;
    }
}
