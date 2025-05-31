import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        while (a > 0 && b > 0) {
            int mai = Math.max(a, b);
            int men = Math.min(a, b);
            int sum = 0;

            for (int i = men; i <= mai; i++) {
                System.out.printf("%d ", i);
                sum += i;
            }
            System.out.println("Sum=" + sum);

            a = sc.nextInt();
            b = sc.nextInt();
        }
    }
}
