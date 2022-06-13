package inheritanceExample;

public class StudentEmployee extends Student{
    double rateOfPayPerHour;
    String employeeId;
    public StudentEmployee(String fName, String lName, String studentId, String employeeId, double rateOfPayPerHour) {
        super(fName, lName, studentId);
        this.rateOfPayPerHour = rateOfPayPerHour;
        this.employeeId = employeeId;
    }

    public double getRateOfPayPerHour(){
        return rateOfPayPerHour;
    }

    public void setRateOfPayPerHour(double rateOfPayPerHour) {
        this.rateOfPayPerHour = rateOfPayPerHour;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString(){
        return super.toString() + "Employee Id" + employeeId + ", Pay rate: " + rateOfPayPerHour;
    }
}
