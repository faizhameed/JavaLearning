package OOP.Inheritance.Challenge1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire() {
        Date today = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        String endDate = dateFormat.format(today);

    }


}
