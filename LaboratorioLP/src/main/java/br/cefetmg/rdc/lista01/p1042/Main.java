import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] valores = {a, b, c};

        Arrays.sort(valores);

        for (int valor : valores) {
            System.out.println(valor);
        }

        System.out.println();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}