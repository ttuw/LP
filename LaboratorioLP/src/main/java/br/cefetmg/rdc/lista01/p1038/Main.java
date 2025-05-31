import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod = sc.nextInt();
        int qtd = sc.nextInt();
        
        switch (cod){
            case 1:
                System.out.printf("Total: R$ %.2f\n", qtd * 4.00);
                break;
            case 2:
                System.out.printf("Total: R$ %.2f\n", qtd * 4.50);
                break;
            case 3:
                System.out.printf("Total: R$ %.2f\n", qtd * 5.00);
                break;
            case 4:
                System.out.printf("Total: R$ %.2f\n", qtd * 2.00);
                break;
            case 5:
                System.out.printf("Total: R$ %.2f\n", qtd * 1.50);
                break;

        }
    }
}
