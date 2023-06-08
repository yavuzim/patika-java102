package PatikaStore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Brand {
    private int brandID;
    private String brandName;
    public static List<Brand> brands = new ArrayList<>();

    public Brand(int brandID, String brandName) {
        this.brandID = brandID;
        this.brandName = brandName;
    }

    public int getBrandID() {
        return brandID;
    }

    public void setBrandID(int brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    static {
        brands.add(new Brand(1,"Samsung"));
        brands.add(new Brand(2,"Lenovo"));
        brands.add(new Brand(3,"Apple"));
        brands.add(new Brand(4,"Huwaei"));
        brands.add(new Brand(5,"Casper"));
        brands.add(new Brand(6,"Asus"));
        brands.add(new Brand(7,"HP"));
        brands.add(new Brand(8,"Xiaomi"));
        brands.add(new Brand(9,"Monster"));
        brands.sort(Comparator.comparing(Brand::getBrandName)); // Markaları A'dan Z'ye sıralar.
    }
}
