import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();
                int e = sc.nextInt();

                int marc = 0;
                char resp = ' ';

                if (a <= 127) {
                    marc++;
                    resp = 'A';
                }
                if (b <= 127) {
                    marc++;
                    if (marc == 1) resp = 'B';
                }
                if (c <= 127) {
                    marc++;
                    if (marc == 1) resp = 'C';
                }
                if (d <= 127) {
                    marc++;
                    if (marc == 1) resp = 'D';
                }
                if (e <= 127) {
                    marc++;
                    if (marc == 1) resp = 'E';
                }

                if (marc != 1) {
                    resp = '*';
                }

                System.out.println(resp);
            }
        }
    }
}