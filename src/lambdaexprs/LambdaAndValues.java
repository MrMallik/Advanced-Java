package lambdaexprs;

import java.util.function.Consumer;

public class LambdaAndValues {
    public static void main(String[] args) {
        int x = 5;

        Consumer<Integer> consumer = (y) -> System.out.println(x);

        consumer.accept(10);
    }
}
