package OOP.Inheritance.Challenge1;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public int getAge() {
        int age = 0;
        int currentYear = 2024;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return (currentYear-birthYear);
    }

    public double collectPay() {
        double pay = 0;
//        todo: write method for pay
        return pay;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
