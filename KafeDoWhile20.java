import java.util.Scanner;
public class KafeDoWhile20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double hkopi = 12000, hteh = 7000, hroti = 20000, jkopi, jteh, jroti, totalharga;
        String namapelanggan;

        do {
            System.out.print(" masukan nama pelanggan (ketik batal untuk keluar) :");
            namapelanggan = sc.nextLine();
            
            if (namapelanggan.equalsIgnoreCase ("batal")){
                System.out.println("pesanan dibatalkan");
                break;
            }
            System.out.print("jumlah kopi : ");
            jkopi = sc.nextInt();
            System.out.print("jumlah teh : ");
            jteh = sc.nextInt();
            System.out.print("jumlah roti : ");
            jroti = sc.nextInt();
            totalharga = (jkopi*hkopi) + (jteh*hteh) + (jroti*hroti) ;
            System.out.println( "total harga yang harus di bayar : " + totalharga);
            sc.nextLine();
        } while (true);
        System.out.println("semua transaksi selesai");
    }
}
