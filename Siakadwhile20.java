import java.util.Scanner;
public class Siakadwhile20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int nilai, jml, i=0;

        System.out.print("masukan jumlah mahasiswa : ");
        jml = sc.nextInt();

        while ( i < jml) {
            System.out.println("masukan nilai mahasiswa ke" + (i+1) + ":");
            nilai = sc.nextInt();
            i++;


            if (nilai < 0 || nilai > 100){
                System.out.println( "nilai tidak valid masukan nilai yang valid ");
            }
            
        }
        
    }
}
