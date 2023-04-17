package Transportasi;

public class Bicycle {
    private String merk;
    private String model;

    public Bicycle(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public void ride() {
        System.out.println("Sepeda "+merk+" "+model+" sedang digunakan.");
    }
}
