import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        for(int i = 0; i<10; i++){
            System.out.println("Informe um número: ");
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("A soma de números pares é: " + sumEvenNumbers(numbers));

        sc.close();
    }
    public static int sumEvenNumbers(int[] nums){
        int result = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                result += num;
            }
        }
        return result;
    }

}

