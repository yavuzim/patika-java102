package PatikaStore;

import java.util.List;

public class SystemUI {
    private static List<Product> products;
    private static int id;

    public static void start() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("**** |PATİKA STORE'YE HOŞ GELDİNİZ| ****");
        System.out.println("----------------------------------------------------------------");

        System.out.println("--- MENU ---"
                + "\n1 - Ürün Gruplarını Listele"
                + "\n2 - Ürünleri Listele"
                + "\n3 - Markaları Listele"
                + "\n4 - Ürün Ekle"
                + "\n5 - Ürün Sil"
                + "\n6 - Ürün Güncelle"
                + "\n7 - Ürün Filtrele"
                + "\n8 - Çıkış Yap");

        int choose = 0;
        while (choose < 1 || choose > 7) {
            System.out.print("Seç : ");
            choose = Input.in.nextInt();
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
    }

    private static void productGroupList() {
        List<Product> products = Product.productList();
        for (Product product : products) {
            System.out.println("ID : " + product.getId() + "\tÜrün : " + product.getName());
        }
    }

    private static void productList() {
        List<Product> products = Product.productList();

        for (Product product : products) {
            System.out.println("-> " + product.getName());
            if (product.list().size() == 0) {
                System.out.println("ÜRÜN YOK");
            } else {
                product.list();
            }
        }
    }

    private static void brandList() {
        Brand.brandList();
    }

    private static void productAdd() {
        System.out.println("ÜRÜN EKLEME İŞLEMİ");
        products = Product.productList();
        for (Product product : products)
            System.out.println("ID : " + product.getId() + "\tÜrün : " + product.getName());
        System.out.print("Ekleme Yapacağınız Ürünü Seçin : ");
        Product product = products.get(Input.in.nextInt() - 1);
        System.out.println("---------------------------------------------");
        product.add();
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
