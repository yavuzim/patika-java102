package PatikaStore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class Brand {
    private int id;
    private String name;
    private static List<Brand> brands;

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static List<Brand> brandsList() {
        brands = new ArrayList<>();
        brands.add(new Samsung());
        brands.add(new Lenovo());
        brands.add(new Apple());
        brands.add(new Huawei());
        brands.add(new Casper());
        brands.add(new Asus());
        brands.add(new HP());
        brands.add(new Xiaomi());
        brands.add(new Monster());
        brands.sort(Comparator.comparing(Brand::getName)); // A'dan Z'ye sıralar.
        return brands;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}