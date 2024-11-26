import java.util.Scanner;
public class CekPrimaRekursif {
    static void isPrime(int n, int pembagi) {
        if (pembagi == 2) {
            System.out.println("Bilangan prima");
        } else {
            if (n % (pembagi-1) == 0) {
                System.out.println("Bukan bilangan prima");
                return;
            } else {
                isPrime(n, pembagi-1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Beri satu angka: ");
        int angka = sc.nextInt();
        
        isPrime(angka, angka);
    }
}