import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número para ver a tabuada");
        int num = sc.nextInt();

        multResult(num);

        sc.close();
    }

    public static void multResult(int n) {
        System.out.println("Tabuada de " + n);
        System.out.println("----------------");
        for (int i = 0; i < 11 ; i++) {
            System.out.println(n + " X " + i + " = " + (n*i));
        }
    }
}
