import java.util.Scanner;

public class exercicioTabuada {
    public static void main(String[] args) throws Exception {

        //entrad do usuário
        var scanner = new Scanner(System.in);
        System.out.printf("Insira um número: ");
        var num = scanner.nextInt();
        System.out.println("");

        //saída
        System.out.println("TABUADA DO " + num);
        for (var i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = "+ (num*i));
        }

        scanner.close();
    }
}
