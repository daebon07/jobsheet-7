import java.util.Scanner;
public class SiakadFor20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int lulus = 0, tidaklulus = 0;
        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 10; i++){
            System.out.println("masukan nilai mahasiswa ke-" + i + ":");
            nilai = sc.nextDouble();
            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }
            if (nilai >= 60){
                lulus +=1;
            }
            if (nilai <= 59){
                tidaklulus +=1;
            }
        }
        
        System.out.println("nilai tertinggi :" + tertinggi);
        System.out.println("nilai terendah :" + terendah);
        System.out.println("jumlah mahassiswa yang lulus :" + lulus);
        System.out.println("nilai jumlah mahasiswa yang tidak lulus :" + tidaklulus);
    }
}