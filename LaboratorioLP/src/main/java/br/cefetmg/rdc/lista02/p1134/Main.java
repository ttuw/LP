import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int alcool = 0, gas = 0, diesel = 0;
        while(a != 4){
            switch (a){
                case 1:
                    alcool++;
                    break;
                case 2:
                    gas++;
                    break;
                case 3:
                    diesel++;
                    break;
            }
            a = sc.nextInt();
        }
        System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", alcool, gas, diesel);
    }
}
