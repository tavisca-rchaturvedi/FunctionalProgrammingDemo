package lambda;

public class ThreadExample {

    public static void main(String[] args) {
        ThreadExample threadExample = new ThreadExample();
        Thread t1 = new Thread(() -> threadExample.numberPrinter());
        t1.start();
        Thread t2 = new Thread(threadExample::numberPrinter);
        t2.start();
        Thread t3 = new Thread(() -> threadExample.numberPrinter());
        t3.start();
    }

    void numberPrinter(){
        for(int i = 0; i < 100; i++){
            System.out.println("\t"+i);
        }
    }
}
