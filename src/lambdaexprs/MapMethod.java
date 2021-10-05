package lambdaexprs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Delta", "Gamma", "Kappa", "THeta", "Iota"));

        list.stream()
            .map(str -> str.charAt(0))
            .forEach(ch -> System.out.print(ch + " "));

        System.out.println(list);
    }
}
