package OOP.Inheritance.Challenge1;

public class Employee extends Worker {
    private long employeeId;
    protected String hireDate;

    private static int employeeNum = 0;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNum++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
