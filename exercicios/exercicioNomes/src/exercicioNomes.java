import java.util.Scanner;

public class exercicioNomes {
    public static void main(String[] args) {
    
        //nome e idade 1
        var scanner = new Scanner(System.in);
        System.out.printf("Insira o primeiro nome: ");
        var name1 = scanner.next();
        System.out.printf("Insira a idade de %s: ", name1);
        var age1 = scanner.nextInt();

        //nome e idade 2
        System.out.printf("\nInsira o segundo nome: ");
        var name2 = scanner.next();
        System.out.printf("Insira a idade de %s: ", name2);
        var age2 = scanner.nextInt();

        //final
        var difference = Math.abs(age1 - age2);
        System.out.printf("\nA diferença de idade entre %s e %s é de %s ano(s)!\n", name1, name2, difference);

        scanner.close();
    }
}
