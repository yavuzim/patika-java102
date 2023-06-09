package PatikaStore;

import java.util.ArrayList;
import java.util.List;

public class Notebook extends Product {
    public  List<Notebook> notebooks = new ArrayList<>();

    public Notebook() {
        super(2, "Notebook");
    }

    @Override
    void add(int total) {
        for (int i = 1; i <= total; i++) {
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
            notebook.setBrand(Product.brandSelect(Input.in.nextInt()));
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
    }

    @Override
    Product delete(int id) {
        return notebooks.remove(id);
    }

    @Override
    void update(int id) {
        int index = 0;
        for (Notebook notebook : notebooks) {
            if (notebook.getId() == id) {
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
                notebook.setBrand(Product.brandSelect(Input.in.nextInt()));
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
                notebooks.set(index, notebook);
                System.out.println(notebook.getId() + " ID numaralı ürün güncellendi!");
                break;
            }
            index++;
        }
    }

    @Override
    public void list() {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %1$-4s| %2$-20s| %3$-15s| %4$-15s| %5$-15s| %6$-15s| %7$-15s| %8$-15s| %9$-15s| %10$-15s| %11$-15s|%n",
                "ID", "Ürün Adı", "Marka", "Renk", "Depolama", "RAM", "Stok",
                "Ekran", "Fiyat", "İndirim Oranı", "Toplam Fiyat");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        if (notebooks.size() != 0) {
            for (Notebook productNotebook : notebooks) {
                System.out.printf("| %1$-4s| %2$-20s| %3$-15s| %4$-15s| %5$-15s| %6$-15s| %7$-15s| %8$-15s| %9$-15s| %10$-15s| %11$-15s|%n"
                        , productNotebook.getId()
                        , productNotebook.getName()
                        , productNotebook.getBrand().getName()
                        , productNotebook.getColor()
                        , productNotebook.getMemory()
                        , productNotebook.getRam()
                        , productNotebook.getStock()
                        , productNotebook.getScreenSize()
                        , productNotebook.getPrice()
                        , productNotebook.getDiscountRate()
                        , productNotebook.getTotalPrice());
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------s-----");
            }
        } else System.out.println("Kayıtlı Ürün Yok!");
    }

    @Override
    void filter(String brand) {
        for (Notebook notebook : notebooks) {
            if (notebook.getBrand().getName().equals(brand)) {
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("| %1$-4s| %2$-20s| %3$-15s| %4$-15s| %5$-15s| %6$-15s| %7$-15s| %8$-15s| %9$-15s| %10$-15s| %11$-15s|%n",
                        "ID", "Ürün Adı", "Marka", "Renk", "Depolama", "RAM", "Stok",
                        "Ekran", "Fiyat", "İndirim Oranı", "Toplam Fiyat");
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("| %1$-4s| %2$-20s| %3$-15s| %4$-15s| %5$-15s| %6$-15s| %7$-15s| %8$-15s| %9$-15s| %10$-15s| %11$-15s|%n"
                        , notebook.getId()
                        , notebook.getName()
                        , notebook.getBrand().getName()
                        , notebook.getColor()
                        , notebook.getMemory()
                        , notebook.getRam()
                        , notebook.getStock()
                        , notebook.getScreenSize()
                        , notebook.getPrice()
                        , notebook.getDiscountRate()
                        , notebook.getTotalPrice());
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }
        }
    }
}
