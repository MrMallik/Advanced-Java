package basics.abstractclass;

public interface Doable {
    default void sayMoreAgain(){
        System.out.println("sayMore() from Doable");
    }
}
