import java.time.OffsetDateTime;
import java.util.Scanner;

public class exercicioIdade {
    public static void main(String[] args) {

        //pega o ano com base no sistema
        var year = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);

        //entradas do usuário
        System.out.println("Digite seu nome");
        var name = scanner.next();
        System.out.println("Digite seu ano de nascimento");
        var age = scanner.nextInt();

        //calcula a idade da pessoa
        var result = year - age;
        
        //saída
        System.out.printf("Olá %s, sua idade é %s\n", name, result);
        
        scanner.close();
    }
}