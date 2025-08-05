import java.util.Scanner;

public class exercicioRetangulo {
    public static void main(String[] args) {

        //entradas do usuário
        var scanner = new Scanner(System.in);
        System.out.printf("Insira o valor da base: ");
        var base = scanner.nextInt();
        System.out.printf("Insira o valor da altura: ");
        var height = scanner.nextInt();

        //calcula a área do retângulo
        var result = base * height;

        //saída
        System.out.printf("A área do retângulo é igual a %s\n", result);

        scanner.close();
    }
}
