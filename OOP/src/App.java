package OOP.src;

import java.util.ArrayList;
import java.util.Scanner;
// import OOP.src.Employee;

public class App {
    static ArrayList<Buah> listBuah = new ArrayList<Buah>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        while (true) {
            System.out.println("Hello, Selamat datang di toko buah!");
            System.out.println("1. Tambah Buah");
            System.out.println("2. List buah");
            System.out.println("3. Exit");

            System.out.print("masukkan pilihan anda: "); // output
            int inputMenu = scanner.nextInt(); // input
            scanner.nextLine();

            if (inputMenu == 1) {
                Menu.tambahBuah();
                // tampilListBuah();
            } else if (inputMenu == 2) {
                Menu.tampilListBuah();
            } else if (inputMenu == 3) {
                System.out.println("you're already exit");
                break;
            }
        }
    }
}
