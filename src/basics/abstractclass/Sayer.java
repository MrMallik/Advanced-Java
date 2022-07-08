package basics.abstractclass;

public class Sayer implements Sayable, Doable{
    public void say(){
        System.out.println("Say from Sayer");
    }

//    public void sayMore(){
//        System.out.println("SayMore from Sayer");
//    }

    public static void main(String[] args) {
        Sayer sayer = new Sayer();
        sayer.say();
        sayer.sayMore();
    }
}
