import java.util.Scanner;

public class exercicioIMC {
    public static void main(String[] args) {

        //entradas do usuário
        var scanner = new Scanner(System.in);
        System.out.printf("\nOlá, qual o seu nome? ");
        var nome = scanner.next();
        System.out.printf("Insira o seu peso: ");
        var peso = scanner.nextFloat();
        System.out.printf("Insira sua altura: ");
        var altura = scanner.nextFloat();

        //calcula e mostra o IMC
        var imc = peso/(Math.pow(altura, 2));
        System.out.printf("\n%s seu imc é de %s\n", nome, imc);
        
        //condições de cada IMC
        if (imc <= 18.5) System.out.println("Você está abaixo do peso!");
        else if (imc >= 18.6 && imc <= 24.9) System.out.println("Você está no peso ideal!");
        else if (imc >= 25 && imc <= 29.9) System.out.println("Você está levemente acima do peso!");
        else if (imc >= 30 && imc <= 34.9) System.out.println("Você está com Obesidade Grau I!");
        else if (imc >= 35 && imc <= 39.9) System.out.println("Você está com Obesidade Grau II (Severa)!");
        else System.out.println("Você está com Obesidade Grau III (Mórbida)!");
        
        scanner.close();
    }
}
