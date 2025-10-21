import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int N = sc.nextInt();
        int arr[] = new int[N];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();

        int max = arr[0], min = arr[0];
        int maxIndex = 0, minIndex = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        System.out.println("The largest number " + max + " was found at location " + maxIndex);
        System.out.println("The smallest number " + min + " was found at location " + minIndex);

        sc.close();
    }
}
