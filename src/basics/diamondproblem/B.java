package basics.diamondproblem;

public interface B {
    default void foo(){
        System.out.println("foo inside B");
    }
}
