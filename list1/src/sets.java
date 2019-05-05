import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class sets {

    public static void main(String[] args) {
        Set<Double> set1 = new HashSet<>();
        // Set is an Interface
        set1.add(1.);
        set1.add(10.);
        set1.add(3.2);
        set1.add(10.);
        set1.add(1.);
        set1.add(30.);
        set1.add(88.8);
        set1.add(1.9);

        System.out.println("--------------------HashSet------------");
        for(Double d: set1){
            System.out.println(d);
        }

        System.out.println("--------------------TreeSet------------");
        Set<Double> set2 = new TreeSet<>(set1);
        for(Double d: set2){
            System.out.println(d);
        }
        System.out.println("--------------------TreeSet.headset( //less than 10 )------------");
        for(Double d: ((TreeSet<Double>) set2).headSet(10.)){
            System.out.println(d);
        }

        System.out.println("Tree.first() = " + ((TreeSet<Double>) set2).first());
        System.out.println("Tree.last() = " + ((TreeSet<Double>) set2).last());



    }


}
