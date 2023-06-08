package PatikaStore;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone extends Product {
    private int memory;
    private int batteryPower;
    private String color;
    public static List<MobilePhone> mobilePhones = new ArrayList<>();

    public MobilePhone() {
        super("Telefon");
    }

    public MobilePhone(int id, double price, int discountRate, int stock, String brand, int ram, double screenSize) {
        super(id, price, discountRate, stock, "Telefon", brand, ram, screenSize);
    }

    @Override
    void add(String newData) {

    }

    @Override
    void update(String data, String newData) {

    }

    @Override
    void delete(int id) {

    }

    @Override
    void select() {

    }

    @Override
    void select(int id) {

    }

    @Override
    void select(String brand) {

    }
}
