
class P3 {
    public static void main(String args[]) {
        // int num = 1000;
        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            int org = i, digit, result = 0, length = 0;
            while (org != 0) {
                org = org / 10;
                length++;
            }
            org = i;
            while (org != 0) {
                digit = org % 10;
                result = result + (int) Math.pow(digit, length);
                org = org / 10;
            }
            if (i == result) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n" + count);

    }
}