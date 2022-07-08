package basics.diamondproblem;

public interface A {
    default void foo(){
        System.out.println("foo inside A");
    }
}
