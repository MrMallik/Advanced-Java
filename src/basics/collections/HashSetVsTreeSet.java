package basics.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetVsTreeSet {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        Set<String> hashSet = new HashSet<>();


        //TreeSet cannot contain null
        //treeSet.add(null);
        hashSet.add(null);

        treeSet.addAll(Arrays.asList("Baeldung", "JavatPoint", "Abracadabra"));
        hashSet.addAll(Arrays.asList("Baeldung", "JavatPoint", "Abracadabra"));


        System.out.println(treeSet);
        System.out.println(hashSet);
    }
}
