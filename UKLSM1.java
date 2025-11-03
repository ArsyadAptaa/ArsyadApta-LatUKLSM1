import java.util.Scanner;
public class UKLSM1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Berat paket (kg): ");
        double Berat = in.nextDouble();

        System.out.print("Jarak tempuh (km): ");
        double Jarak = in.nextDouble();

        System.out.print("Panjang (cm): ");
        double p = in.nextDouble();

        System.out.print("Lebar (cm): ");
        double l = in.nextDouble();

        System.out.print("Tinggi (cm): ");
        double t = in.nextDouble();

        double Volume = p * l * t;
        double BiayaPerKg = (Jarak <= 10) ? 4250 : 6000;
        double Biaya = Berat * BiayaPerKg;

        if (Volume > 100) {
            Biaya += 50000;
        }

        System.out.println("\nTotal biaya pengiriman: Rp " + Biaya);

        in.close();
    }
}

