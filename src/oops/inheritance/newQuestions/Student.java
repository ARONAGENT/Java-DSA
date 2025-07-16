package oops.inheritance.newQuestions;

public class Student extends Person{
    private int rollNo;

    public Student(String name) {
        super(name);
    }


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {
        Student student=new Student("Rohan");
        student.setRollNo(21);
        System.out.println(student.getRollNo());

    }
}
