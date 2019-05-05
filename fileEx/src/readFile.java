import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class readFile {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(Paths.get("clients.txt"))){
            System.out.println(" account| number| first name | last name  |  balance");
            while (input.hasNext()){
                System.out.printf("%d %s %s %.2f%n",input.nextInt(), input.next(),
                       input.next(),input.nextDouble() );
             //   System.out.println(input.next());
            }
        }
        catch (IOException | NoSuchFieldError | IllegalStateException e ){
            e.printStackTrace();
        }
    }



}




