
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class createFileFormatter {
    public static void main(String[] args) {

        try (Formatter output = new Formatter("clients.txt")){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter account number, first name, last name and balance.\n"
                    +"Enter end-of-file indicator to end input.");

            if(input.hasNext()){//loop until end-of-file indicator
                try {
                    output.format("%d %s %s %.2f%n",input.nextInt(), input.next(),
                            input.next(),input.nextDouble() );
                    output.format("%d %s %s %.2f%n",input.nextInt(), input.next(),
                            input.next(),input.nextDouble() );
                    output.format("%d %s %s %.2f%n",input.nextInt(), input.next(),
                            input.next(),input.nextDouble() );

                }
                catch (NoSuchElementException elementException){

                    System.err.println("invalid input, try again");

                    input.nextLine();
                }
                System.out.println("? ");
            }
            output.close();
        }
        catch (SecurityException | FileNotFoundException| FormatterClosedException e){
            e.printStackTrace();
        }
    }

}
