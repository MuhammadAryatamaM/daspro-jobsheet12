public class Fibonacci {
    static int fibonacci(int f_2, int f_1, int f, int loop) {
        if (loop == 0) {
            return f;
        } else {
            f = f_1 + f_2;
            f_2 = f_1;
            f_1 = f;
            return (fibonacci(f_2, f_1, f, loop-1));
        }
    }

    public static void main(String[] args) {
        int bulan = 12;
        System.out.printf("Pasangan marmut pada bulan ke-%d: ", bulan);
        System.out.println(fibonacci(0, 1, 1, bulan - 1));
    }
}