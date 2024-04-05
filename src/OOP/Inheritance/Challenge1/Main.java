package OOP.Inheritance.Challenge1;

public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "04/01/1995", "09/12/2021");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee rishad = new SalariedEmployee("rishad", "15/09/1997", "20/11/2023", 350000, false);
        System.out.println(rishad);
        System.out.println("Age = " + rishad.getAge());
        System.out.println("Pay = " + rishad.collectPay());
        System.out.println("Rishad paycheck = $" + rishad.collectPay());

        //Rishad retires
        rishad.retire();
        System.out.println("Rishad's pension check = $" + rishad.collectPay());
    }
}
