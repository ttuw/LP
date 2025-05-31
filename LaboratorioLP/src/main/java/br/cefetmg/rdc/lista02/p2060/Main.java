import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] p = new int[a];

        for (int i = 0; i < a; i++) {
            p[i] = sc.nextInt();
        }

        int mult2 = 0, mult3 = 0, mult4 = 0, mult5 = 0;

        for (int i = 0; i < a; i++) {
            if (p[i] % 2 == 0) mult2++;
            if (p[i] % 3 == 0) mult3++;
            if (p[i] % 4 == 0) mult4++;
            if (p[i] % 5 == 0) mult5++;
        }

        System.out.println(mult2 + " Multiplo(s) de 2");
        System.out.println(mult3 + " Multiplo(s) de 3");
        System.out.println(mult4 + " Multiplo(s) de 4");
        System.out.println(mult5 + " Multiplo(s) de 5");
    }
}