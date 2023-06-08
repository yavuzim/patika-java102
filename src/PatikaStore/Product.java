package PatikaStore;

import java.util.ArrayList;
import java.util.List;

public abstract class Product {
    private int id;
    private double price;
    private int discountRate; // indirim oranı
    private int stock;
    private String name;
    private String brand;
    private int ram;
    private double screenSize;
    public static List<Product> products = new ArrayList<>();

    public Product(String name) {
        this.name = name;
    }

    public Product(int id, double price, int discountRate, int stock, String name, String brand, int ram, double screenSize) {
        this.id = id;
        this.price = price;
        this.discountRate = discountRate;
        this.stock = stock;
        this.name = name;
        this.brand = brand;
        this.ram = ram;
        this.screenSize = screenSize;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    abstract void add(String newData);

    abstract void update(String data, String newData);

    abstract void delete(int id);

    abstract void select();

    abstract void select(int id);

    abstract void select(String brand);
}
