package reviewMateri_P1;

import java.util.Scanner;

public class MenghitungBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, bilangan, total = 0;
        
        System.out.print(" N = ");
        N = sc.nextInt();
        
        if (N <= 0) {
            System.out.println("N tidak boleh nol atau minus");
        } else {
            for (int i = 1; i <= N; i++) {
//                System.out.print( i );
                bilangan = sc.nextInt();
                total += bilangan;
            }
            System.out.println("Total = " + total);
        }
    }
}
