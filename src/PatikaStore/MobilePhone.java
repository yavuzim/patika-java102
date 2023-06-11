package PatikaStore;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone extends Product {
    public int a;
    public List<MobilePhone> mobilePhones = new ArrayList<>();

    public MobilePhone() {
        super(1, "Telefon");
    }

    @Override
    void add(int total) {
        for (int i = 1; i <= total; i++) {
            MobilePhone mobilePhone = new MobilePhone();
            System.out.print("ID : ");
            mobilePhone.setId(Input.in.nextInt());
            System.out.print("Fiyat : ");
            mobilePhone.setPrice(Input.in.nextDouble());
            System.out.print("İndirim Oranı : ");
            mobilePhone.setDiscountRate(Input.in.nextInt());
            System.out.print("Stok : ");
            mobilePhone.setStock(Input.in.nextInt());
            Brand.brandList();
            System.out.print("Marka : ");
            int selectBrand = Input.in.nextInt();
            mobilePhone.setBrand(Brand.brands().get(selectBrand - 1));
            System.out.print("Hafıza (GB) : ");
            mobilePhone.setMemory(Input.in.nextInt());
            System.out.print("Ekran Boyutu : ");
            mobilePhone.setScreenSize(Input.in.nextDouble());
            System.out.print("RAM : ");
            mobilePhone.setRam(Input.in.nextInt());
            Input.in.nextLine();
            System.out.print("Renk : ");
            mobilePhone.setColor(Input.in.nextLine());
            mobilePhone.setTotalPrice(mobilePhone.getPrice() * (100 + mobilePhone.getDiscountRate()) / 100);

            mobilePhones.add(mobilePhone);
        }
    }

    @Override
    Product delete(int id) {
        return mobilePhones.remove(id);
    }

    @Override
    void update(int id) {

    }

    @Override
    public void list() {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %1$-4s| %2$-20s| %3$-15s| %4$-15s| %5$-15s| %6$-15s| %7$-15s| %8$-15s| %9$-15s| %10$-15s| %11$-15s|%n",
                "ID", "Ürün Adı", "Marka", "Renk", "Depolama", "RAM", "Stok",
                "Ekran", "Fiyat", "İndirim Oranı", "Toplam Fiyat");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        if (mobilePhones.size() > 0) {
            for (MobilePhone productMobile : mobilePhones) {
                System.out.printf("| %1$-4s| %2$-20s| %3$-15s| %4$-15s| %5$-15s| %6$-15s| %7$-15s| %8$-15s| %9$-15s| %10$-15s| %11$-15s|%n"
                        , productMobile.getId()
                        , productMobile.getName()
                        , productMobile.getBrand().getName()
                        , productMobile.getColor()
                        , productMobile.getMemory()
                        , productMobile.getRam()
                        , productMobile.getStock()
                        , productMobile.getScreenSize()
                        , productMobile.getPrice()
                        , productMobile.getDiscountRate()
                        , productMobile.getTotalPrice());
                System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            }
        } else System.out.println("Kayıtlı Ürün Yok!");
    }

    @Override
    void filter(String brand) {

    }
}
