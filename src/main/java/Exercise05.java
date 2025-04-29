import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[4];

        System.out.println("Informe um aluno: ");
        String nome = sc.next();

        for (int i = 0; i < 4; i++) {
            System.out.println("Informe a " + (i+1) + "* nota: (0 a 10)");
            notas[i] = sc.nextInt();
        }
        System.out.println("A situação do aluno " + nome + " é: " + situcao(notas));
    }

    public static String situcao(int[] notas){
        int soma = 0;
        for(int nota : notas){
            soma += nota;
        }
        int media = soma / 4;

        if (media >= 7){
            return "Aprovado";
        } else if (media >= 5){
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }
}
