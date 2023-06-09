package PatikaStore;

import java.util.ArrayList;
import java.util.List;

public class Notebook extends Product {
    public List<Product> notebooks = new ArrayList<>();

    public Notebook() {
        super(2, "Notebook");
    }

    @Override
    void add() {
        Notebook notebook = new Notebook();
        System.out.print("ID : ");
        notebook.setId(Input.in.nextInt());
        System.out.print("Fiyat : ");
        notebook.setPrice(Input.in.nextDouble());
        System.out.print("İndirim Oranı : ");
        notebook.setDiscountRate(Input.in.nextInt());
        System.out.print("Stok : ");
        notebook.setStock(Input.in.nextInt());
        Brand.brandList();
        System.out.print("Marka : ");
        int selectBrand = Input.in.nextInt();
        notebook.setBrand(Brand.brands().get(selectBrand - 1));
        System.out.print("Hafıza (GB) : ");
        notebook.setMemory(Input.in.nextInt());
        System.out.print("Ekran Boyutu : ");
        notebook.setScreenSize(Input.in.nextDouble());
        System.out.print("RAM : ");
        notebook.setRam(Input.in.nextInt());
        Input.in.nextLine();
        System.out.print("Renk : ");
        notebook.setColor(Input.in.nextLine());
        notebook.setTotalPrice(notebook.getPrice() * (100 + notebook.getDiscountRate()) / 100);

        notebooks.add(notebook);

    }

    @Override
    Product delete(int id) {
        return notebooks.remove(id);
    }

    @Override
    void update(int id) {

    }

    @Override
    public List<Product> list() {
        return notebooks;
    }

    @Override
    void filter(String brand) {

    }
}
