package BuAuliaRPL;
import java.util.Scanner;
public class deretAritmatikaWHILE {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("BATAS AWAL: ");
        int awal = s.nextInt();
        System.out.print("BATAS AKHIR: ");
        int akhir = s.nextInt();
        System.out.print("MASUKKAN BEDA: ");
        int beda = s.nextInt();
        
        System.out.println("Deret aritmatika menggunakan WHILE:");
        int i = awal;
        while (i <= akhir) {
            System.out.print(i + " ");
            i += beda;
        }
        System.out.println(); 
    }
}