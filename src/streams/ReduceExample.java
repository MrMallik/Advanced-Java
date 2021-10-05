package streams;

import java.util.ArrayList;
import java.util.Arrays;

public class ReduceExample {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        //reduce basically does cumulative operations
        //It starts with an initial value, and performs operation on it, gives it as output
        //In the next step, this output becomes the new input and the operation is continued

        System.out.println(numList.stream()
                                  .reduce(0, (a,b) -> a + b));
    }
}
