import java.security.SecureRandom;
import java.util.stream.Collectors;

public class randomInteger {

    public static void main(String[] args) {
        SecureRandom randomNum = new SecureRandom();
        String numbers = randomNum.ints(10,1,7)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(numbers);

    }
}
