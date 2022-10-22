import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), n = a, k;
        if (a % 8 != 0) {
            a += 8 - a % 8;
        }

        k = a / 8;
        byte[] bool = new byte[k];
        for (int i = 0; i < n; i++) {
            boolean x = in.nextBoolean();
            bool[i / 8] |= ((x ? 1 : 0) << (i % 8));
        }

        for (int i = 0; i < n; i++) {
            System.out.print(((bool[i / 8] & (1 << (i % 8))) != 0) + " ");
        }
    }
}