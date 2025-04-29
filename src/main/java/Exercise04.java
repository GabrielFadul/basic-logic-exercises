import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] idades = new int[5];
        boolean sair = true;

        System.out.println("Informe o nome de 5 pessoas: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("idade " + (i + 1) + "*:");
            idades[i] = sc.nextInt();
        }

        while (sair) {
            System.out.println("1. maior idade");
            System.out.println("2. menor idade");
            System.out.println("3. média das idades");
            System.out.println("4. sair");
            int opc = sc.nextInt();
            switch (opc) {
                case 1:
                    int maior = maiorIdade(idades);
                    System.out.println("A maior idade é: " + maior);
                    break;
                case 2:
                    int menor = menorIdade(idades);
                    System.out.println("A maior idade é: " + menor);
                    break;
                case 3:
                    int media = media(idades);
                    System.out.println("A média das idades é: " + media);
                    break;
                case 4:
                    System.out.println("saindo..");
                    sair = false;
                    break;
                default:
                    System.out.println("Opção invalida.... saindo");
            }

        }
    }

    public static int maiorIdade (int[] idades){
        int maior = 0;
        for(int idade : idades){
            if(idade > maior) {
                maior = idade;
            }
        }
        return maior;
    }

    public static int menorIdade (int[] idades){
        int menor = 1000;
        for(int idade : idades){
            if(idade < menor) {
                menor = idade;
            }
        }
        return menor;
    }

    public static int media( int[] idades){
        int result = 0;
        for(int idade : idades) {
            result += idade;
        }
        return result/5;
    }
}
