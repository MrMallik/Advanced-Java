package concurrencyApi.Semaphore;

import java.util.concurrent.Semaphore;

public class IncThread{
    String name;
    Semaphore semaphore;

    IncThread(Semaphore s, String str){
        semaphore = s;
        name = str;
        new Thread(() -> doStuff()).start(); //Notice how a thread has been started
    }

    public void doStuff(){
        System.out.println("Starting " + name);

        try{
            //First, get a permit
            System.out.println(name + " is wating for permit.");
            semaphore.acquire();
            System.out.println(name + " gets a permit");

            //Now access shared resource
            for(int i = 0; i < 5; i++){
                SharedResource.count++;
                System.out.println(name + ": " + SharedResource.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " releases the permit");
        semaphore.release();
    }
}
