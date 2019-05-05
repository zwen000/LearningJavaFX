import java.util.stream.IntStream;

public class filtering {

    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,10).filter(x-> (x%2==0)).map(x-> x*3).sum() );
        /////////////////////////////////////////////////////////////////////////
        IntStream.rangeClosed(1,10)
                .filter(
                        x ->{
                            System.out.println("filter is "+x);
                            return x%2 == 0;
                        }
                )
                .map(
                        x-> {
                            System.out.println("map: "+ x);
                            return x*3;
                        }
                )
                .sum();
        /////////////////////////////////////////////////////////////////////////

    }
}
