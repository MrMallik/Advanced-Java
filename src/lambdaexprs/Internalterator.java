package lambdaexprs;

import java.util.Arrays;
import java.util.List;

public class Internalterator {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        numbers.forEach((value) -> {
            int y = 2 * value;
            System.out.println(y);
        });

    }
}
