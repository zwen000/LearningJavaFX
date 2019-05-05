import java.util.*;

public class linklist {

    public static void main(String[] args) {
        String[] colors = { "black", "yellow", "green", "blue", "violet", "silver" };
        List<String> list1 = new LinkedList<>();

        for(String color: colors){
            list1.add(color);
        }
        String[] colors2 = { "gold", "white", "brown", "blue", "gray", "silver" };
        List<String> list2 = new LinkedList<>();
        for(String color: colors2){
            list2.add(color);
        }

        System.out.println("list1 and list2 have not element in common: "+Collections.disjoint(list1,list2));







        list1.addAll(list2);
        list2= list1.subList(0,6);

        printFront(list1);
        System.out.println("------------------------");
        printFront(list2);
        list2.clear();
        System.out.println("------------------------");
        ((LinkedList<String>) list1).addFirst("123456");
        printFront(list1);
        //printFront(list1);




       //printBack(list2);

    }

    private static void printFront(List<String> collection1){
        Iterator<String> i = collection1.iterator();
        while (i.hasNext()){
            System.out.println(i.next());

        }
    }
    /*
    private static void removeList(List<String> collection1) {
        Iterator<String> i = collection1.iterator();
        while (i.hasNext()){
            collection1.remove(i.next());
        }
    }*/


    private static void printBack(List<String> collection1){
        Iterator<String> i = collection1.listIterator(collection1.size());
      //  ListIterator<String> j =  collection1.listIterator(collection1.size());

        while (((ListIterator<String>) i).hasPrevious()){
            System.out.println(((ListIterator<String>) i).previous());
        }

    }

}
