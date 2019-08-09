package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CollectionStream {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<Integer>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);

        long start = System.currentTimeMillis();
        number.stream().map(x -> x*x)
                .filter(x -> x%2 == 0)
                .forEach(System.out::println);
        long end = System.currentTimeMillis();

        System.out.println("It took " + (end-start) + " miliseconds");

        long start1 = System.currentTimeMillis();
        for (int i: number) {
            if(i%2 == 0){
                System.out.println(i*i);
            }
        }
        long end1 = System.currentTimeMillis();

        System.out.println("It took " + (end1-start1) + " miliseconds");
    }
}
