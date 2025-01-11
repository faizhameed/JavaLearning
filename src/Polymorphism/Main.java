package Polymorphism;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
//    while(true){
//        System.out.println("Enter Type (A for Adventure, C for Comedy, "+
//                "S for Science Fiction. or Q to quit");
//        String type =s.nextLine();
//        if("Qq".contains(type)) {
//            break;
//        }
//        System.out.println("Enter Movie Title:");
//        String title =s.nextLine();
//        Movie movie = Movie.getMovie(type, title);
//        movie.watchMovie();
//    }
        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws"); // Object type casting
        jaws.watchMovie();
        var plane = new Comedy("Jackie Jan");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("C", "Airplane!");
        System.out.printf("UnknownObject.getClass().getSimpleName() is %s",unknownObject.getClass().getSimpleName());
        if (unknownObject.getClass().getSimpleName().equals("Comedy")) {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
            System.out.printf("I am IN Yaaay!");
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        }
    }


}
