import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int som = 0;

        int men = Math.min(a, b) + 1;
        int mai = Math.max(a, b);

        for (int i = men; i < mai; i++) {
            if (i % 2 != 0) {
                som += i;
            }
        }

        System.out.println(som);
    }
}
