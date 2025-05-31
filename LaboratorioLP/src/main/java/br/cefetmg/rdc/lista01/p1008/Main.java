import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = sc.nextDouble();

        System.out.printf("NUMBER = %d\n", a);
        System.out.printf("SALARY = U$ %.2f\n", b * c);
    }
}
