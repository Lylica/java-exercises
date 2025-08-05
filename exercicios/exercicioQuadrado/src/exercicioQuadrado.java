import java.util.Scanner;

public class exercicioQuadrado {
    public static void main(String[] args) {

        //entrada do usuário
        var scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do lado do quadrado");
        var side = scanner.nextInt();

        //calcula a área do quadrado
        var area = Math.pow(side, 2);

        //saída
        System.out.printf("A área do quadrado é de %s\n", area);

        scanner.close();
    }
}
