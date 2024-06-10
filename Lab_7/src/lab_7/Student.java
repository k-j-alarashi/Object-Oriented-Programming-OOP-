package lab_7;

public class Student extends Person{
    
    private String major ;

    public Student(String major, int id, String name, int age) {
        super(id , name , age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nMajor : "+getMajor();
    }
    
    
}
