package lambda;

import java.lang.reflect.Method;
import java.util.Optional;

public class ThreadExample {

    public static void main(String[] args) {
        ThreadExample threadExample = new ThreadExample();
        Thread t1 = new Thread(() -> threadExample.numberPrinter());
        t1.start();
        System.out.println("Printed First");
        Thread t2 = new Thread(threadExample::numberPrinter);
        t2.start();
        System.out.println("Printed Second");
        Thread t3 = new Thread(threadExample::numberPrinter);
        t3.start();
        System.out.println("Printing Third");

    }



    void numberPrinter(){
        System.out.println(Thread.currentThread().getId() + " is running now");
        for(int i = 0; i < 100; i++){
            System.out.println("\t"+i);
        }
        System.out.println(Thread.currentThread().getId() + " is stopped now");
    }
}
