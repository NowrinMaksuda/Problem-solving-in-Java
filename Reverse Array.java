import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int N = sc.nextInt();
        int arr[] = new int[N];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();

        System.out.println("Reversed array:");
        for (int i = N - 1; i >= 0; i--) System.out.print(arr[i] + " ");

        sc.close();
    }
}