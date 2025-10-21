import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int N = sc.nextInt();
        double arr[] = new double[N];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < N; i++) arr[i] = sc.nextDouble();

        double newArr[] = new double[N];
        int size = 0;
        int removed = 0;

        newArr[size++] = arr[0];

        for (int i = 1; i < N; i++) {
            if (arr[i] != arr[i - 1]) newArr[size++] = arr[i];
            else removed++;
        }

        System.out.print("New Array: ");
        for (int i = 0; i < size; i++) System.out.print(newArr[i] + " ");
        System.out.println("\nRemoved elements: " + removed);

        sc.close();
    }
}