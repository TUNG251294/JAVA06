public class Student extends Person{
    private int score;
    public Student(int ID, String name, int score){
        super(ID, name);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override //phạm vi truy cập của Child class phải cao hơn Parent class
    public String toString() {
        return super.toString() + ", score=" + score;
    }
}
