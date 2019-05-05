import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethods {
    public static void main(String[] args) {
        List<String> colorList = List.of("red","orange", "yellow","green","blue","indigo","violet");

        System.out.println("colorList: "+ colorList);


        Set<String> colorSet = Set.of("red","orange", "yellow","green","blue","indigo","violet");
        System.out.println("colorSet: "+ colorSet);

        Map<String,Integer> colorMap = Map.of("red",1,"orange",2, "yellow",3,"green",4, "blue",5,"indigo",6,"violet",7);
        System.out.println("colorMap: "+ colorMap);

        Map<String,Integer> daysPerMonthMap = Map.ofEntries(
          Map.entry("Jan",31),
        Map.entry("Fed",28),
                Map.entry("Mar",31),
                Map.entry("Apr",30),
                Map.entry("May",31),
                Map.entry("Jun",30),

                Map.entry("July",31),
                Map.entry("Aug",31),
                Map.entry("Sep",30),
                Map.entry("Oct",31),
                Map.entry("Nov",30),
                Map.entry("Dec",31)

        );
        System.out.println("mouth map; "+daysPerMonthMap  );
    }



}
