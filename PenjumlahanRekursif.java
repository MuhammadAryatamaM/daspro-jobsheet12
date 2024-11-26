import java.util.Scanner;
public class PenjumlahanRekursif {
    static int jumlah(int n) {
        if (n == 1) {
            System.out.print(n);
            return n;
        } else {
            System.out.printf("%d + ", n);
            return (n + jumlah(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Beri satu angka: ");
        int angka = sc.nextInt();

        int hasil = jumlah(angka);
        System.out.printf(" = %d",  hasil);
    }
}