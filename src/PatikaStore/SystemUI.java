package PatikaStore;

import java.util.ArrayList;
import java.util.List;

public class SystemUI {
    private static List<Product> products = new ArrayList<>();
    private static int id;

    public static void start() {
        products = Product.productList();
        System.out.println("----------------------------------------------------------------");
        System.out.println("**** |PATİKA STORE'YE HOŞ GELDİNİZ| ****");
        System.out.println("----------------------------------------------------------------");
        boolean flag = true;
        while (flag) {
            homePage();
            flag = actions();
            System.out.println("----------------------------------------------------------------");
            System.out.println("ANA MENÜYE DÖNMEK İÇİN |e|, ÇIKMAK İÇİN HERHANGİ BİR TUŞA BASINIZ.");
            System.out.print("Seç : ");
            String choose = Input.in.nextLine();
            if (choose.equals("e") || choose.equals("E"))
                flag = !flag;
        }
    }

    private static boolean actions() {
        int choose = 0;
        while (choose < 1 || choose > 7) {
            System.out.print("Seç : ");
            choose = Input.in.nextInt();
            Input.in.nextLine();
        }
        switch (choose) {
            case 1:
                productGroupList();
                break;
            case 2:
                productList();
                break;
            case 3:
                brandList();
                break;
            case 4:
                productAdd();
                break;
            case 5:
                productDelete();
                break;
            case 6:
                productUpdate();
                break;
            case 8:
                logOut();
                break;
        }
        if (choose != 8) return true;
        return false;
    }

    private static void homePage() {
        System.out.println("--- MENU ---"
                + "\n1 - Ürün Gruplarını Listele"
                + "\n2 - Ürünleri Listele"
                + "\n3 - Markaları Listele"
                + "\n4 - Ürün Ekle"
                + "\n5 - Ürün Sil"
                + "\n6 - Ürün Güncelle"
                + "\n7 - Ürün Filtrele"
                + "\n8 - Çıkış Yap");
    }

    private static void productGroupList() {
        List<Product> products = Product.productList();
        for (Product product : products) {
            System.out.println("ID : " + product.getId() + "\tÜrün : " + product.getName());
        }
    }

    private static void productList() {
        System.out.println("**** KAYITLI ÜRÜNLER ****");
        for (Product product : products) {
            System.out.println("-> " + product.getName() + " Listesi");
            if (products.size() == 0) {
                System.out.println("ÜRÜN YOK");
            } else {
                product.list();
            }
            System.out.println();
        }
    }

    private static void brandList() {
        Brand.brandList();
    }

    private static void productAdd() {
        System.out.println("ÜRÜN EKLEME İŞLEMİ");
        for (Product product : products)
            System.out.println("ID : " + product.getId() + "\tÜrün : " + product.getName());
        System.out.print("Ekleme Yapacağınız Ürünü Seçin : ");
        Product product = products.get(Input.in.nextInt() - 1);
        System.out.print("Eklenecek Ürün Sayısı : ");
        int total = Input.in.nextInt();
        System.out.println("---------------------------------------------");
        product.add(total);
    }

    private static void productDelete() {
        products = Product.productList();
        for (Product product : products)
            System.out.println("ID : " + product.getId() + "\tÜrün : " + product.getName());
        System.out.print("Silinecek Ürünün Id Numarası : ");
        id = Input.in.nextInt() - 1;
        Product product = products.get(id);
        System.out.println("---------------------------------------------");
        product = product.delete(id);
        System.out.println("Silinen Ürün : " + product.getName() + " Marka : " + product.getBrand().getName());
    }

    private static void productUpdate() {
        products = Product.productList();
        for (Product product : products)
            System.out.println("ID : " + product.getId() + "\tÜrün : " + product.getName());
        System.out.print("Güncellenecek Ürünün Id Numarası : ");
        id = Input.in.nextInt() - 1;
        Product product = products.get(id);
        System.out.println("---------------------------------------------");
        product.update(id);
        System.out.println("Ürün Güncellendi!");
    }

    private static void logOut() {
        System.out.println("Çıkış Yapıldı!");
    }
}
