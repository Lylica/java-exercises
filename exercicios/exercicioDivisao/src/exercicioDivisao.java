import java.util.Scanner;

public class exercicioDivisao {
    public static void main(String[] args) {

        //entrada do usuário
        var scanner = new Scanner(System.in);
        System.out.printf("Insira o primeiro número: ");
        var num1 = scanner.nextInt();
        int num2, result;

        //verifica se o resto da divisão é inteiro
        do {
            System.out.print("\nInsira outro número (sendo ele >= o primeiro): ");
            num2 = scanner.nextInt();
            if (num2 > num1)
            System.out.println(num2 + " não é dívisivel por inteiro por " + num1);

        } while(num2 % num1 != 0);

        //saída
        result = num2 / num1;
        System.out.printf("\n%s divido por %s é igual a %s ", num2, num1, result);

        scanner.close();

    }
}
