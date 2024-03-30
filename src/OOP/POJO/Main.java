package OOP.POJO;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S9" + i, switch (i) {
                case 1 -> "Mary";
                case 2 -> "Faiz";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
            }, "12/08/1996", "Java Learning");
            System.out.println(s);
        }
        Student pojoStudent = new Student("SO1", "Faiz", "01/01/1967", "Solidity");
        LPAStudent recordStudent = new LPAStudent("SO2", "Corvus", "02/02/1996", "Piano");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + " is Taking " + pojoStudent.getClassList() + " class");
        System.out.println(recordStudent.name() + " is Taking " + recordStudent.classList() + " class");
    }
}
