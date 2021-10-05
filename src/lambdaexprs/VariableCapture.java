package lambdaexprs;

interface MyFunc{
    int func(int n);
}

public class VariableCapture {

    static int addend = 10;

    public static void main(String[] args) {

        int multiplier = 2; //effectively final variable

        MyFunc multiplyMe = (n) -> {
            return n*=multiplier;
        };

        //Uncommenting the below line will generate compiler error
        //as the variable multiplier will no longer be effectively final

        //multiplier = 69;

        System.out.println(multiplyMe.func(11));

        MyFunc addMe = n -> {
            return n+=addend; //static variables can be used and can be modified too
        };

        System.out.println(addMe.func(100));

        addend = 20;

        System.out.println(addMe.func(100));
    }
}
