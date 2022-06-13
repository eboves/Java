package inheritanceExample;

public class Student extends Person{
    String studentId;
    public Student(String fName, String lName, String studentId) {
        super(fName, lName);
        this.studentId = studentId;
    }

    public String getStudentId(){
        return studentId;
    }

    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    @Override
    public String toString(){
        return super.toString() + "Student Id" + studentId;
    }
}
