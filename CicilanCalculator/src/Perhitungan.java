package CicilanCalculator.src;

import java.text.NumberFormat;

public class Perhitungan {

    public static void tampilBayaran(double bayaranPerBulan) {
        System.out.println("----- Pembayaran setiap bulan -----");
        Formatter.formatHarga(bayaranPerBulan);
    }

    public static double hitungBayaranPerBulan(int hargaAwal, int durasiCicilan, double bunga) {
        return (hargaAwal + (hargaAwal * (bunga / App.PERCENT))) / (durasiCicilan * App.BULAN_DALAM_TAHUN);
    }

    public static void hitungSisaBayaranPerBulan(int hargaAwal, int durasiCicilan, double bunga,
            double bayaranPerBulan) {
        System.out.println("----- Sisa pembayaran per bulan -----");
        double sisaBayaran = hargaAwal + (hargaAwal * (bunga / App.PERCENT));
        for (int i = 0; i < durasiCicilan * App.BULAN_DALAM_TAHUN; i++) {
            sisaBayaran -= bayaranPerBulan;
            System.out.println(NumberFormat.getCurrencyInstance().format(sisaBayaran));
        }
    }
}