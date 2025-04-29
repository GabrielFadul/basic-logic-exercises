import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;

        System.out.println("Escolha a sua operação: ");
        System.out.println("1. ADICAO");
        System.out.println("2.SUBTRACAO");
        System.out.println("3.MULTIPLICACAO");
        System.out.println("4.DIVISAO");
        System.out.println("------------------------");
        int choice = sc.nextInt();

        System.out.println("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = sc.nextInt();

        switch(choice){
            case 1:
                result = sum(a,b);
                System.out.println("A soma é: " + result);
                break;
            case 2:
                result = sub(a,b);
                System.out.println("A subtração é: " + result);
                break;
            case 3:
                result = mul(a,b);
                System.out.println("A Multiplicação é: " + result);
                break;
            case 4:
                if (b != 0){
                    double resultDiv = div(a,b);
                    System.out.println("A divisão é: " + resultDiv);
                } else {
                    System.out.println("Divisão com zero!");
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        sc.close();
    }
    public static int sum (int a, int b){
        return a + b;
    }
    public static int sub(int a, int b){
        return a - b;
    }
    public static int mul(int a, int b){
        return a * b;
    }
    public static double div(int a, int b){
        return (double) a / b;
    }
}
