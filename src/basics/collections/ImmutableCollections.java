package basics.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ImmutableCollections {
    public static void main(String[] args) {
        List<String> mutableList = new ArrayList<>(Arrays.asList("Adarsh", "Venkat", "Shouvan", "Deepesh"));
        mutableList.add("25pac");
        System.out.println(mutableList);

        List<String> immutableList = List.of("Kutta", "Kamina", "Disco", "Man");
        //immutableList.add("Succ");
        System.out.println(immutableList);

        Map<String, Integer> map = Map.of("A", 1, "B", 2, "C", 3);
        System.out.println(map);

        Map<String, Integer> map2 = Map.ofEntries(Map.entry("Z", 26), Map.entry("E", 5));
        System.out.println(map2);
    }
}
