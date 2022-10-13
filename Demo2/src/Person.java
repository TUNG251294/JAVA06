public class Person {
    private int ID;
    private String name;
    private  static  int count;
    private static int getCount(){
        return count;
    }
    public Person(int ID, String name) {
        this.ID = ID;
        this.name = name;
        count ++;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override //có thể ghi đè phương thức, thêm tính năng khác vào phương thức, trả về toàn bộ phương thức cũ và tính năng mới
    public String toString() {
        return count + "Person " +
                "ID=" + ID +
                ", name='" + name + "'";
    }
}
