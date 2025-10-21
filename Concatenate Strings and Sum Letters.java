import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String s2 = sc.nextLine();

        String concat = s1 + " " + s2;

        int sum = 0;
        for (char ch : concat.toCharArray()) {
            if (Character.isLetter(ch)) sum += (int) ch;
        }

        System.out.println(concat);
        System.out.println(sum);

        sc.close();
    }
}

