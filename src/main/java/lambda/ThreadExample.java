package lambda;

public class ThreadExample {
    public static void main(String[] args) {
        ThreadExample threadExample = new ThreadExample();
        threadExample.numberPrinter();
        threadExample.numberPrinter();
        threadExample.numberPrinter();
    }

    void numberPrinter(){
        for(int i = 0; i < 100; i++){
            System.out.println("\t"+i);
        }
    }
}
