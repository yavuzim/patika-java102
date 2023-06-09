package PatikaStore;

import java.util.ArrayList;
import java.util.List;

public abstract class Product {
    private int id;
    private double price;
    private int discountRate;
    private int stock;
    private String name;
    private Brand brand;
    private int memory;
    private double screenSize;
    private int ram;
    private String color;
    private double totalPrice;
    private static List<Product> products;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract void add();

    abstract Product delete(int id);

    abstract void update(int id);

    public abstract List<Product> list();

    abstract void filter(String brand);

    public static List<Product> productList() {
        products = new ArrayList<>();
        products.add(new MobilePhone());
        products.add(new Notebook());
        return products;
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

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
