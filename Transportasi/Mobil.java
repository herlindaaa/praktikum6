package Transportasi;

public class Mobil {
    private String merk;
    private String model;
    private int tahunProduksi;

    public Mobil(String merk, String model, int tahunProduksi) {
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

    public void drive() {
        System.out.println("Mobil "+merk+" "+model+" tahun "+tahunProduksi+" sedang digunakan.");
    }
}
