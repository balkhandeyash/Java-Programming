import java.util.Scanner;

class P2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        if (a >= 0 && b <= 1000) {
            for (int i = a; i <= b; i++) {
                printPrime(i);
            }
        }

    }

    static void printPrime(int n) {
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0)
                break;
        }
        if (n == i) {
            System.out.print(n + " ");
        }
    }
}