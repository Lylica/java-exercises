import java.time.OffsetDateTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var year = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        var name = scanner.next();
        System.out.println("Digite seu ano de nascimento");
        var age = scanner.nextInt();
        var result = year - age;
        System.out.printf("Olá %s, sua idade é %s\n", name, result);
    }
}

