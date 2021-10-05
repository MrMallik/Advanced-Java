package lambdaexprs;

import java.util.Comparator;

public class LambdaExprs {
    public static void main(String[] args) {
        Comparator<String> strComparator =
                (String text1, String text2) -> {
                    return text1.compareTo(text2);
                };

        System.out.println(strComparator.compare("pritabrata", "pritabrata"));
    }
}
