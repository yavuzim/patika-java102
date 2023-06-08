package PatikaStore;

import java.util.ArrayList;
import java.util.List;

public class SystemUI {

    private static String[] menu;
    private static List<Product> products;
    private static int selectedProcess;

    public static void show() {
        System.out.println("*** PATİKA STORE'YE HOŞGELNİZİ ***");
        Line.line(25, "*");
        menu = new String[]{"Ürün İşlemleri", "Marka İşlemleri", "Çıkış Yap"};
        products = new ArrayList<>();
        products.add(new MobilePhone());
        products.add(new Notebook());
        int index = 1;
        for (String process : menu) {
            System.out.println(index + " - " + process);
            index++;
        }
        Line.line(25, "*");
        while (selectedProcess < 1 || selectedProcess > menu.length) {
            selectedProcess = Input.processInput("Yapılacak İşlem : ");
        }
        Line.line(8, "...");
        switch (selectedProcess) {
            case 1:
                System.out.println("*** " + menu[selectedProcess - 1] + " ***");
                productProcess();
                break;
            case 2:
                System.out.println(menu[selectedProcess - 1]);
                break;
            case 3:
                System.out.println("Çıkış Yapıldı!");
                break;
        }
        Line.line(8, "...");
    }

    private static void productProcess() {
        String[] process = {"Ürün Ekle", "Ürün Güncelle", "Ürün Sil", "Ürünleri Getir", "Ürünleri Ayrıntıları", "Ana Menuye Dön"};
        for (int i = 0; i < process.length; i++) {
            System.out.println((i + 1) + " - " + process[i]);
        }
        selectedProcess = 0;
        List<Product> products = prodcutList();
        while (selectedProcess < 1 || selectedProcess > products.size()) {
            selectedProcess = Input.processInput("Yapılacak İşlemi Seçin : ");
        }
        System.out.println("Yapılacak İşlem : " + products.get(selectedProcess - 1).getName());

    }

    private static List<Product> prodcutList() {
        System.out.println("*** ÜRÜNLER *** ");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + " - " + products.get(i).getName());
        }
        return products;
    }


}
