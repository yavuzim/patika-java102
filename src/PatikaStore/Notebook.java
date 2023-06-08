package PatikaStore;

import java.util.ArrayList;
import java.util.List;

public class Notebook extends Product {
    private String storage; // depolama
    public static List<MobilePhone> notebooks = new ArrayList<>();


    public Notebook(int id, double price, int discountRate, int stock, String brand, int ram, double screenSize) {
        super(id, price, discountRate, stock, "Notebook", brand, ram, screenSize);
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
