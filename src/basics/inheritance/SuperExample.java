package basics.inheritance;

class Grandparent{
    Grandparent(){
        System.out.println("Grandparent Constructor");
    }
}

class Parent extends Grandparent{
    Parent(){
        System.out.println("Parent Constructor!");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("Child constructor");
    }
}



public class SuperExample {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
