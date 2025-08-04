import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.printf("Insira o valor da base: ");
        var base = scanner.nextInt();
        System.out.printf("Insira o valor da altura: ");
        var height = scanner.nextInt();
        var result = base * height;
        System.out.printf("A área do retângulo é igual a %s\n", result);
    }
}
