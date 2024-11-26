import java.util.Scanner;
public class DeretDescending {
    static int descendRekursif(int n) {
        if (n == 0) {
            System.out.print(n);
            return 0;
        } else {
            System.out.print(n + " ");
            return (descendRekursif(n-1));
        }
    }
    static void descendIteratif(int n){
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Beri satu angka: ");
        int angka = sc.nextInt();

        System.out.println("Untuk Fungsi Rekursif: ");
        descendRekursif(angka);
        System.out.println();
        System.out.println("Untuk Fungsi Iteratif: ");
        descendIteratif(angka);
    }
}