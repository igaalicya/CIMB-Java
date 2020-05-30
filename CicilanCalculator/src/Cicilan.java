package CicilanCalculator.src;

public class Cicilan {
    private int hargaAwal;
    private int durasiCicilan;
    private double bunga;

    public Cicilan(int hargaAwal, int durasiCicilan, double bunga) {
        setHargaAwal(hargaAwal);
        setDurasi(durasiCicilan);
        setBunga(bunga);
    }

    public int getHargaAwal() {
        return hargaAwal;
    }

    public void setHargaAwal(int hargaAwal) {
        if (hargaAwal >= 1_000_000 && hargaAwal <= 100_000_000) {
            this.hargaAwal = hargaAwal;
        } else {
            throw new IllegalArgumentException("harga harus diantara 1.000.000 - 100.000.000");
        }

    }

    public int getDurasi() {
        return durasiCicilan;
    }

    public void setDurasi(int durasiCicilan) {
        if (durasiCicilan < 1) {
            throw new IllegalArgumentException("Durasi cicilan minimal 1 tahun");
        }
        this.durasiCicilan = durasiCicilan;
    }

    public double getBunga() {
        return bunga;
    }

    public void setBunga(double bunga) {
        if (bunga <= 0) {
            throw new IllegalArgumentException("Bunga minimal 0%");
        }
        this.bunga = bunga;
    }

}