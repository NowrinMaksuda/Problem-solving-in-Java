import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();

            // শুধুমাত্র positive odd সংখ্যাগুলো নেবে
            if (num > 0 && num % 2 != 0) {
                sum += num;
                count++;

                if (num < min) min = num;
                if (num > max) max = num;
            }
        }

        if (count == 0) {
            System.out.println("No odd positive numbers found");
        } else {
            double average = (double) sum / count;
            System.out.println("Sum = " + sum);
            System.out.println("Minimum = " + min);
            System.out.println("Maximum = " + max);
            System.out.println("Average = " + average);
        }

        sc.close();
    }
}
