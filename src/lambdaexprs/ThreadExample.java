package lambdaexprs;



public class ThreadExample{
    public static void main(String[] args) {
        /*Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running my own thread!");
                System.out.println(Thread.currentThread());
            }
        }, "MyThread");*/

        Thread t = new Thread(() ->{
            System.out.println("Running my own thread!");
            System.out.println(Thread.currentThread());
        }, "MyThread");

        t.start();

    }
}
