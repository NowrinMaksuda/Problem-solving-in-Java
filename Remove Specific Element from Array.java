import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int N = sc.nextInt();
        int arr[] = new int[N];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < N; i++) arr[i] = sc.nextInt();

        System.out.println("Enter the element to remove:");
        int remove = sc.nextInt();

        int count = 0;
        for (int num : arr) if (num == remove) count++;

        System.out.print("Input array: ");
        for (int num : arr) System.out.print(num + " ");

        if (count == 0) {
            System.out.println("\nElement not found");
        } else {
            int newArr[] = new int[N - count];
            int index = 0;
            for (int num : arr) {
                if (num != remove) newArr[index++] = num;
            }
            System.out.print("\nNew array: ");
            for (int num : newArr) System.out.print(num + " ");
        }

        sc.close();
    }
}