import java.util.Scanner;

public class A_Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (c % 2 == 0) {
                if (a > b) {
                    System.out.println("First");
                } else {
                    System.out.println("Second");
                }
            } else {
                if (b > a) {
                    System.out.println("Second");
                } else {
                    System.out.println("First");
                }
            }
        }
        sc.close();
    }
}