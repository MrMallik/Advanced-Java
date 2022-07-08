package basics.abstractclass;

public interface Sayable {
    void say();

    default void sayMore(){
        System.out.println("sayMore() already has some implementation built-in");
    }
}
