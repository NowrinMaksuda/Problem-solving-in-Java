import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int N = sc.nextInt();
        int arr[] = new int[N];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();

        // Bubble sort
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        double median;
        if (N % 2 == 1) median = arr[N / 2];
        else median = (arr[N / 2 - 1] + arr[N / 2]) / 2.0;

        System.out.println("The median is " + median);

        sc.close();
    }
}


