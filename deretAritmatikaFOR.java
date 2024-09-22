package BuAuliaRPL;
import java.util.Scanner;
public class deretAritmatikaFOR {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("BATAS AWAL: ");
        int awal = s.nextInt();
        System.out.print("BATAS AKHIR: ");
        int akhir = s.nextInt();
        System.out.print("MASUKKAN BEDA: ");
        int beda = s.nextInt();
        
        System.out.println("Deret Aritmatika menggunakan FOR:");
        for (int a = awal; a <= akhir; a += beda) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}

