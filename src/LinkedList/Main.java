package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
         var placesToVisit = new LinkedList<String>();
         placesToVisit.add("Brazil");
         placesToVisit.add(0,"Turkey");
        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);
        placesToVisit.poll();
        System.out.println(placesToVisit);
        placesToVisit.pollFirst();
        System.out.println(placesToVisit);
        placesToVisit.pop();
        System.out.println(placesToVisit);
        placesToVisit.remove();
        System.out.println(placesToVisit);
        placesToVisit.removeFirst();
        System.out.println(placesToVisit);
    }
    private static void addMoreElements(LinkedList<String> list){
        list.addFirst("USA");
        list.addLast("Japan");
        list.addFirst("Canada");
        list.addLast("Australia");
        list.addFirst("India");
        list.addLast("Mexico");
        list.addFirst("UAE");
        list.addLast("China");

    // There are many methods that exactly do same this

    }
}
