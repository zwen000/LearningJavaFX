import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] colors = { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };
        List<String> list = new ArrayList<String>();
        for(String color: colors){
            list.add(color);
        }

        String[] removeColors = { "RED", "WHITE", "BLUE" };
        List<String> removeList = new ArrayList<String>();
        for(String color: removeColors){
            removeList.add(color);
        }

        System.out.println("Arraylist:  ");
        for (int count = 0; count <list.size();count++){
            System.out.printf(count+" "+ list.get(count)+"   \n");
        }
        //removeColors(list, removeList);

        removeColors(list,removeList);


        System.out.println("Arraylist:  ");
        for (int count = 0; count <list.size();count++){
            System.out.printf(count+" "+ list.get(count)+"   \n");
        }

    }

    private static void removeColors(Collection<String> collection1,Collection<String> collection2){
        Iterator<String> iterator = collection1.iterator();

        while (iterator.hasNext()){
            if(collection2.contains(iterator.next()))
                iterator.remove();
        }

    }
}
