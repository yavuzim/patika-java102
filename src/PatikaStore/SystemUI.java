package PatikaStore;

import FootballTournament.Line;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SystemUI {
    private static Scanner input = new Scanner(System.in);

    public static void show() {
        System.out.println("*** PATİKA STORE'YE HOŞGELNİZİ ***");
        line(25, "*");
        String[] menu = {"Ürün Ekle", "Ürün Sil", "Ürün Güncelle", "Marka Ekle", "Ürünleri Listele", "Markaları Listele", "Ürünleri Filtrele", "Çıkış Yap"};

        int index = 1;
        for (String process : menu) {
            System.out.println(index + " - " + process);
            index++;
        }
        line(25, "*");
        processInput(menu);
    }

    private static void processInput(String[] menu) {
        try {
            input("Yapılacak İşlem : ");
        } catch (InputMismatchException e) {
            System.out.println("1 - " + menu.length + " Arası Değerler Giriniz");
            line(8, "-");
            input.nextLine();
            processInput(menu);
        }
    }

    private static void input(String message) {
        int n = 0;
        while (n < 1 || n > 8) {
            System.out.print(message);
            n = input.nextInt();
        }
    }

    private static void line(int n, String shape) {
        for (int i = 1; i <= n; i++) {
            System.out.print(shape);
        }
        System.out.println();
    }
}
