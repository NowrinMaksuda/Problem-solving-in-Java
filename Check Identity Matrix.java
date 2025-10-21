import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the matrix size:");
        int N = sc.nextInt();
        int matrix[][] = new int[N][N];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                matrix[i][j] = sc.nextInt();

        boolean isIdentity = true;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j && matrix[i][j] != 1) isIdentity = false;
                if (i != j && matrix[i][j] != 0) isIdentity = false;
            }
        }

        if (isIdentity) System.out.println("Identity matrix");
        else System.out.println("Not an identity matrix");

        sc.close();
    }
}
