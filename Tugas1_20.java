import java.util.Scanner;
public class Tugas1_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlah, jumlahtotal = 0 ;
        double totalSemua, totalHarga, totalDiskon, totalpenjualanharian = 0, harga = 50000, diskon = 0;
        String transaksi = "";

        do {
            System.out.println("Masukkan jumlah tiket : ");
           jumlah = sc.nextInt();
            
            if (jumlah < 0) {
                System.out.println("Jumlah tiket tidak valid");
                continue;
            }

            if (jumlah > 10) {
                diskon = 0.15;
            } else if (jumlah > 4) {
                diskon = 0.10;
            }

            totalHarga =jumlah * harga;
            totalDiskon = harga * diskon;
            totalSemua = totalHarga - totalDiskon;

            jumlahtotal +=jumlah;
            totalpenjualanharian += totalSemua;

           sc.nextLine();

            System.out.println("Jadi total harga untuk tiket adalah: " + totalSemua);
            System.out.println("apakah melanjutkan transaksi (iya/tidak) : ");
            transaksi = sc.nextLine();
        } while (transaksi.equalsIgnoreCase("iya"));

        System.out.println("Jadi total tiket yang terjual adalah = " + jumlahtotal);
        System.out.println("dan Total semua penjualan dalam sehari adalah = " + totalpenjualanharian);
    }
}

        
    