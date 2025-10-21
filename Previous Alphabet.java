import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word in small letters:");
        String str = sc.nextLine();

        String result = "";
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a') result += 'z';
                else result += (char)(ch - 1);
            } else result += ch;
        }

        System.out.println(result);

        sc.close();
    }
}