package CicilanCalculator.src;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    static final int BULAN_DALAM_TAHUN = 12;
    static final int PERCENT = 100;

    public static void main(String[] args) throws Exception {
        System.out.println("===== Program hitung Cicilan =====");

        int hargaAwal;
        int durasiCicilan;
        double bunga;

        hargaAwal = (int) Console.readInputNumber("Harga Awal: ");
        durasiCicilan = (int) Console.readInputNumber("Durasi Cicilan: ");
        bunga = (int) Console.readInputNumber("Bunga: ");

        Cicilan cicilan = new Cicilan(hargaAwal, durasiCicilan, bunga);
        double bayaranPerBulan = Perhitungan.hitungBayaranPerBulan(hargaAwal, durasiCicilan, bunga);
        Perhitungan.tampilBayaran(bayaranPerBulan);
        Perhitungan.hitungSisaBayaranPerBulan(hargaAwal, durasiCicilan, bunga, bayaranPerBulan);
    }
}
