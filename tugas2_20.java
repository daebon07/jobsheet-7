import java.util.Scanner;

public class tugas2_20 {
    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);

        int jenis, waktu, total = 0;
        
        do {
            System.out.println("Masukkan jenis kendaraan (1. mobil, 2. motor, 0 keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.println("Masukkan durasi yang anda parkir : ");
                waktu = sc.nextInt();
                if (waktu > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += waktu * 3000;
                } else if (jenis == 2) {
                    total += waktu * 2000;
                }
            }
        } while (jenis != 0);

        System.out.println("Hasilnya adalah = " + total);
    }
}
