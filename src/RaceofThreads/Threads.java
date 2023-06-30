package RaceofThreads;

import java.util.ArrayList;
import java.util.List;

public class Threads extends Thread {
    static List<Integer> evenNumbers, oddNumbers;
    private boolean isRun;
    List<Integer> list;

    public Threads(List<Integer> list) {
        this.list = list;
        evenNumbers = new ArrayList<>();
        oddNumbers = new ArrayList<>();
        isRun = true;
    }

    private synchronized void finder(List<Integer> list) {
        for (int i = 0; i < 25; i++) {
            if (list.get(i) % 2 == 0) {
                evenNumbers.add(list.get(i));
                System.out.println(Thread.currentThread().getName() + " : " + list.get(i));
            } else {
                oddNumbers.add(list.get(i));
                System.out.println(Thread.currentThread().getName() + " : " + list.get(i));
            }
        }
    }

    @Override
    public void run() {
        finder(this.list);
    }

    public static void print() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(evenNumbers.size());
        System.out.println(oddNumbers.size());
        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 0; i < evenNumbers.size(); i++) {
            if (i < evenNumbers.size() - 1)
                System.out.print(evenNumbers.get(i) + " - ");
            else System.out.print(evenNumbers.get(i));
        }
        System.out.println();
        System.out.println("************************************************************************************************");
        for (int i = 0; i < oddNumbers.size(); i++)
            if (i < oddNumbers.size() - 1)
                System.out.print(oddNumbers.get(i) + " - ");
            else System.out.print(oddNumbers.get(i));
    }


}
