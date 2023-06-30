package RaceofThreads;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> array = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            array.add(i);
        }

        List<Integer> l1 = array.subList(0, 25);
        List<Integer> l2 = array.subList(25, 50);
        List<Integer> l3 = array.subList(50, 75);
        List<Integer> l4 = array.subList(75, 100);

        Threads t1 = new Threads(l1);
        Threads t2 = new Threads(l2);
        Threads t3 = new Threads(l3);
        Threads t4 = new Threads(l4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        Thread.sleep(2000);
        Threads.print();
    }
}
