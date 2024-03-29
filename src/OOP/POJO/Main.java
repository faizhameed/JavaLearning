package OOP.POJO;

public class Main {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            Student s = new Student("S9"+i,switch (i){
                case 1->"Mary";
                case 2->"Faiz";
                case 3->"Tim";
                case 4->"Harry";
                case 5->"Lisa";
                default -> "Anonymous";
            },"12/08/1996","Java Learning");
            System.out.println(s);
        }
    }
}
