import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        double preço1 = sc.nextDouble();

        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        double preço2 = sc.nextDouble();

        double total = (preço1 * b1) + (preço2 * b2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);


    }
}
