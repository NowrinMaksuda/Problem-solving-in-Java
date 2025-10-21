import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the lower number:");
        int low = sc.nextInt();
        System.out.println("Enter the upper number:");
        int high = sc.nextInt();

        if (high < low) {
            int temp = low;
            low = high;
            high = temp;
        }

        int count = 0;

        for (int num = low; num <= high; num++) {
            boolean isPrime = true;
            if (num < 2) isPrime = false;
            else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) count++;
        }

        System.out.println("There are " + count + " prime numbers between " + low + " and " + high);

        sc.close();
    }
}
