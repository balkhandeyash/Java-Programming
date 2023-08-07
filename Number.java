import java.util.Scanner;

class Number {

    static void even_odd(int n) {
        if (n % 2 == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");
    }

    static void positive_negative(int n) {
        if (n >= 0)
            System.out.println(n + " is Positive");
        else
            System.out.println(n + " is Negative");
    }

    static void is_prime(int n) {
        int i;
        for (i = 2; i < n; i++) {
            if (n % 2 == 0) {
                System.out.println(n + " is not Prime");
                break;
            }
        }

        if (i == n) {
            System.out.println(n + " is Prime");
        }
    }

    static void printFibonacci(int n) {
        int a = 0, b = 1, k;
        System.out.print("Fibonacci Series upto " + n + " elements is " + a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            k = a + b;
            a = b;
            b = k;
            System.out.print(k + " ");
        }
        System.out.println();
    }

    static void factorial(int n) {
        int fact = 1;
        for (int i = n; i > 0; i--) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }

    static void sumNaturalNo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of " + n + " natural number is " + sum);
    }

    static void reverseNo(int n) {
        int rev = 0;
        int digit, org = n;
        while (org != 0) {
            digit = org % 10;
            rev = rev * 10 + digit;
            org = org / 10;
        }
        System.out.println("Reverse of " + n + " is " + rev);
    }

    static void isPalindrome(int n) {
        int rev = 0;
        int digit, org = n;
        while (org != 0) {
            digit = org % 10;
            rev = rev * 10 + digit;
            org = org / 10;
        }
        if (rev == n)
            System.out.println(n + " is Palindrome Number");
        else
            System.out.println(n + " is not Palindrome Number");
    }

    static void isArmstrong(int n) {
        int rev = 0;
        int digit, org = n, length = 0;

        while (org != 0) {
            org = org / 10;
            length++;
        }
        org = n;
        while (org != 0) {
            digit = org % 10;
            rev = rev + (int) Math.pow(digit, length);
            org = org / 10;
        }

        if (rev == n)
            System.out.println(n + " is an armstrong number");
        else
            System.out.println(n + " is not an armstrong number");
    }

    static void mulTable(int n) {
        System.out.println("Multiplication Table of " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    static void findGCD(int a, int b) {
        int hcf = 0;

        for (int i = 1; i <= a || i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                hcf = i;
        }
        System.out.println("HCF of " + a + " and " + b + " is " + hcf);
    }

    static void findLCM(int a, int b) {
        int lcm = 0;
        int max = (a > b) ? a : b;
        for (int i = max; i <= a * b; i++) {
            if (i % a == 0 && i % b == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println("LCM of " + a + " and " + b + " is " + lcm);
    }

    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Number given by the user is " + n);
        even_odd(n);
        positive_negative(n);
        is_prime(n);
        printFibonacci(n);
        factorial(n);
        sumNaturalNo(n);
        reverseNo(n);
        isPalindrome(n);
        isArmstrong(n);
        mulTable(n);

        System.out.println("Enter two number for HCM and GCD");
        int a = sc.nextInt();
        int b = sc.nextInt();
        findGCD(a, b);
        findLCM(a, b);
    }
}