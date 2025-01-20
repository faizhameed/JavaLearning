package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
         var placesToVisit = new LinkedList<String>();
         placesToVisit.add("Brazil");
         placesToVisit.add(0,"Turkey");
        System.out.println(placesToVisit);
        addMoreElements(placesToVisit);
//        System.out.println(placesToVisit);
//        placesToVisit.poll();
//        System.out.println(placesToVisit);
//        placesToVisit.pollFirst();
//        System.out.println(placesToVisit);
//        placesToVisit.pop();
//        System.out.println(placesToVisit);
//        placesToVisit.remove();
//        System.out.println(placesToVisit);
//        placesToVisit.removeFirst();
//        System.out.println(placesToVisit);
//            printElements(placesToVisit);
    printItinerary(placesToVisit);
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
    private static void printElements(LinkedList<String> list){
        System.out.println(list);
        System.out.printf("printing first %s%n",list.getFirst());
        System.out.printf("printing Last %s%n",list.getLast());
        System.out.printf("printing Second list.get(1) %s%n",list.get(1));
        System.out.printf("printing if list.contains(\"India\") %s%n",list.contains("India"));
        System.out.printf("find list.indexOf(\"Australia\") %s%n",list.indexOf("Australia"));
        System.out.printf("peek first %s%n",list.peekFirst());
        System.out.printf("peek %s%n",list.peek());
        System.out.printf("peek last %s%n",list.peekLast());
    }

    private static void printItinerary(LinkedList<String> list){
        System.out.printf("Trips starts at %s %n",list.getFirst());
        for(int i=1;i<list.size();i++){
        System.out.printf("next from %s to %s %n",list.get(i-1),list.get(i));
        }
        System.out.printf("Trip ends at %s",list.getLast());

    }
}
