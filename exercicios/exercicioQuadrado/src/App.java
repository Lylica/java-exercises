import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do lado do quadrado");
        var side = scanner.nextInt();
        var area = Math.pow(side, 2);
        System.out.printf("A área do quadrado é de %s\n", area);
    }
}
