package BuAuliaRPL;
import java.util.Scanner;
public class Faktorial {
        public static void main(String[] args) {
            int angka, temp=1;
            Scanner s =new Scanner(System.in);
            System.out.println("Masukkan Angka");
            angka=s.nextInt();
            for (int a = angka; a>=1; a--) {
                System.out.print(a+" x ");
                temp *=a;
    
            }
            System.out.println();
            System.out.println("Total Faktorial");   
        
        }
    
    }