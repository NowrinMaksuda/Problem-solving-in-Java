import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int N = sc.nextInt();
        int arr[] = new int[N];
        int freq[] = new int[N];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            freq[i] = -1;
        }

        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = i + 1; j < N; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = 0;
                }
            }
            if (freq[i] != 0) freq[i] = count;
        }

        for (int i = 0; i < N; i++) {
            if (freq[i] != 0) System.out.println(arr[i] + " - " + freq[i] + " times");
        }

        sc.close();
    }
}

