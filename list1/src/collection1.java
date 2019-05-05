import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class collection1 {

    public static void main(String[] args) {
        String[] sample = { "0", "1", "2", "3", "4", "5","0" };
        List<String> list1 = new LinkedList<>();

        for(String s:sample){
            list1.add(s);
        }

        System.out.println("---------------------------");
        printFront(list1);

        System.out.println("Frequency of 0 is "+Collections.frequency(list1,"0"));

        List<String> list2 = new LinkedList<>(list1);
        ((LinkedList<String>) list2).clear();
        System.out.println(Collections.disjoint(list1,list2));
        list2.addAll(list1);

        System.out.println("-----------sorted----------------");
        Collections.sort(list1);
        printFront(list1);

        System.out.println("-----------reversed----------------");
        Collections.sort(list1,Collections.reverseOrder());
     //   Collections.reverse(list1);

        printFront(list1);

        System.out.println("-----------fill----------------");
        Collections.fill(list1,"1");
        printFront(list1);

        System.out.println("max of list2: "+Collections.max(list2));
        System.out.println("min of list2: "+Collections.min(list2));



    }

    private static void printFront(List<String> collection1){
        Iterator<String> i = collection1.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }

}
