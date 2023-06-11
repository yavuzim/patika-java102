package PatikaStore;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone extends Product {

    public List<Product> mobilePhones = new ArrayList<>();

    public MobilePhone() {
        super(1, "Telefon");
    }

    private void setMobilePhones() {

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

    }

    @Override
    void filter(String brand) {

    }
}
