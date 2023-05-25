package ListClass;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("*******************************************************************************************");
        MyList<Integer> myList = new MyList<Integer>();

        System.out.println("Array Kapasitesi : " + myList.getCapacity());
        System.out.println("Array Eleman Sayısı : " + myList.getSize());

        System.out.println("----------------------------------------------------------------------------");

        // Eleman ekleme
        for (int i = 1; i <= 10; i++) {
            myList.add(i * 10);
        }
        // Array elemanlarını ekrana yazma.
        System.out.println(myList.toString());
        System.out.println("Array Kapasitesi : " + myList.getCapacity());
        System.out.println("Array Eleman Sayısı : " + myList.getSize());

        System.out.println("----------------------------------------------------------------------------");

        // Eleman ekleme.
        myList.add(78);
        myList.add(10);
        System.out.println(myList.toString());
        System.out.println("Array Kapasitesi : " + myList.getCapacity());
        System.out.println("Array Eleman Sayısı : " + myList.getSize());

        System.out.println("----------------------------------------------------------------------------");

        // 5.indexteki veriyi getirme.
        int value = myList.getIndex(5);
        System.out.println(value);

        System.out.println("----------------------------------------------------------------------------");

        // 6.indexteki veriyi silme.
        myList.remove(6);
        System.out.println(myList.toString());
        System.out.println("Array Kapasitesi : " + myList.getCapacity());
        System.out.println("Array Eleman Sayısı : " + myList.getSize());

        System.out.println("----------------------------------------------------------------------------");

        // 8.indexteki veriyi güncelle 31 yap.
        myList.set(8,31);
        System.out.println(myList.toString());

        System.out.println("----------------------------------------------------------------------------");

        // 100 değeri varsa indexini döner, yoksa -1 döner.
        int result = myList.indexOf(100);
        System.out.println(result);
        // 31 değeri varsa indexini döner, yoksa -1 döner.
        result = myList.indexOf(31);
        System.out.println(result);
        // 10 değeri varsa indexini döner, yoksa -1 döner.
        result = myList.indexOf(10);
        System.out.println(result);

        System.out.println("----------------------------------------------------------------------------");

        // 10 sayısının son indexsini dönder.
        result = myList.lastIndexOf(10);
        System.out.println(result);

        System.out.println("----------------------------------------------------------------------------");

        // Listenin doluluğunu kontrol etme.
        boolean isEmpty = myList.isEmpty();
        if(isEmpty) System.out.println("Liste boş!");
        else System.out.println("Liste dolu!");

        System.out.println("----------------------------------------------------------------------------");

        // Listedeki öğeleri, aynı sırayla bir array haline getirme.
        Object[] list = myList.toArray();
        for(int i=0; i<list.length; i++){
            System.out.println(list[i]);
        }

        System.out.println("----------------------------------------------------------------------------");

        // Parametrede verilen indeks aralığına ait bir liste döner.
        MyList<Integer> numbers = myList.sublist(4,8);
        System.out.println(numbers.toString());

        System.out.println("----------------------------------------------------------------------------");

        // 65 değeri varsa true, yoksa false döner.
        boolean isValue = myList.contains(65);
        System.out.println(isValue);

        System.out.println("----------------------------------------------------------------------------");

        // Listeyi boşaltma.

        myList.clear();
        System.out.println(myList.toString());
        System.out.println("Array Kapasitesi : " + myList.getCapacity());
        System.out.println("Array Eleman Sayısı : " + myList.getSize());
        System.out.println("*******************************************************************************************");

    }
}