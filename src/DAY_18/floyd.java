import java.util.Scanner;

public class floyd {

    // Function to count occurrences of P in the prime factors of num
    public static int countFactors(int num, int p) {
        int count = 0;

        while (num % p == 0) {
            count++;
            num = num / p;
        }

        return count;
    }

    // Function to count occurrences from L to R
    public static int getCount(int l, int r, int p) {
        int total = 0;

        for (int i = l; i <= r; i++) {
            total += countFactors(i, p);
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int R = sc.nextInt();
        int P = sc.nextInt();

        System.out.println(getCount(L, R, P));

        sc.close();
    }
}