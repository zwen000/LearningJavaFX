import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sum of 1 through 10 is: "+ IntStream.range(1,10).sum());
        System.out.println("Max of 1 through 10 is: "+ IntStream.rangeClosed(1,10).max());
        System.out.println("Min of 1 through 10 is: "+ IntStream.rangeClosed(1,10).min());
        System.out.println("Avg. of 1 through 10 is: "+ IntStream.rangeClosed(1,10).average());
        System.out.println("Stat. of 1 through 10 is: "+ IntStream.rangeClosed(1,10).summaryStatistics());


        System.out.println("The sum of even ints from 2 to 20:  "+IntStream.rangeClosed(1,10).map((int x)->{return x*2; }).sum());





    }
}
