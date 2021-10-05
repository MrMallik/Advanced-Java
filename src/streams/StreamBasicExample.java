package streams;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamBasicExample {

    public static boolean isPrime(int n){

        if(n <= 1) return false;

        for(int i = 2; i < n / 2; i++){
            if(n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(55,29,36,42,19,33));

        //Obtain stream
        //Filter out Prime numbers
        System.out.println("Prime Numbers :");
        numList.stream()
                .filter(StreamBasicExample::isPrime)
                .forEach(System.out::println);

        //Obtain stream
        //Get max value and min value
        //The following are reduction operation
        int maxVal = numList.stream()
                            .max(Integer::compareTo).get();

        System.out.println("Maximum Value of the Lot : " + maxVal);

        int minVal = numList.stream()
                .min(Integer::compareTo).get();

        System.out.println("Minimum Value of the Lot : " + minVal);


        //Obtain Stream
        //Double Only odd numbers greater than 30
        System.out.println("Double of odd numbers greater than 30 :-");
        numList.stream()
                .filter(e -> e % 2 != 0 && e > 30)
                .map(e -> e * 2)
                .forEach(System.out::println);


    }
}
