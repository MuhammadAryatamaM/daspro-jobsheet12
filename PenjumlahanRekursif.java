import java.util.Scanner;
public class PenjumlahanRekursif {
    static int jumlah(int n, int loop) {
        if (loop == n) {
            System.out.print(n);
            return n;
        } else {
            System.out.printf("%d + ", loop);
            return (loop + jumlah(n, loop+1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Beri satu angka: ");
        int angka = sc.nextInt();

        int hasil = jumlah(angka, 1);
        System.out.printf(" = %d",  hasil);
    }
}