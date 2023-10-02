import java.util.Scanner;

public class PemilihanPercobaan207 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        System.out.println("Nilai UAS     : ");
        float UAS = input07.nextFloat();
        System.out.println("Nilai UTS     : ");
        float UTS = input07.nextFloat();
        System.out.println("Nilai Kuis    : ");
        float Kuis = input07.nextFloat();
        System.out.println("Nilai Tugas   : ");
        float Tugas = input07.nextFloat();

        float total = (UAS * 0.4F) + (UTS * 0.3F) + (Kuis * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak Remidi";

        System.out.println("Nilai Akhir= " + total + " sehingga " + message);

    }
}
