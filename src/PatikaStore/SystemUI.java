package PatikaStore;

import java.util.List;

public class SystemUI {
    public static void start() {
        System.out.println("**** |PATİKA STORE'YE HOŞ GELDİNİZ| ****");
        List<Brand> brands = Brand.brandsList();
        for (Brand brand : brands) {
            System.out.println(brand.getName());
        }
    }
}
