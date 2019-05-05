import java.lang.reflect.Array;
import java.util.*;

public class usingToArray {

    public static void main(String[] args) {
        String [] colors1 = { "black", "yellow", "green", "blue"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors1));

        String [] colors2 = links.toArray(    new String[links.size()]         );
        colors1[0]= "new";

       LinkedList<String> links2 = new LinkedList<>(Arrays.asList(colors1));

        System.out.println(links.remove());

        Collections.sort(links);
        Collections.reverse(links);
        Collections.shuffle(links);


        System.out.println("---colors1--------------");
        for(String color: colors1){
            System.out.println(color);
        }

        System.out.println("---colors2--------------");
        for(String color: colors2){
            System.out.println(color);
        }


        System.out.println("---links--------------");
       printFront(links);


        System.out.println("---links2--------------");
        printFront(links2);

        Collections.copy(links2,links);
        links.removeLast();

        System.out.println("---links---after copy-----------");
        printFront(links);



        System.out.println("---links2----after copy----------");
        printFront(links2);


    }

    private static void printFront(List<String> collection1){
        Iterator<String> i = collection1.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }



}
