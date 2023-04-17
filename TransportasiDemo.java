import Transportasi.Mobil;
import Transportasi.Bicycle;

public class TransportasiDemo {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Honda", "HRV", 2022);
        mobil.drive();

        Bicycle sepeda = new Bicycle("Polygon", "Monarch 4");
        sepeda.ride();
    }
}
