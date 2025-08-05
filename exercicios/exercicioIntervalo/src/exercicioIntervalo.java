import java.util.Scanner;

public class exercicioIntervalo {
    public static void main(String[] args) {
        
        //entrada do usuário
        var scanner = new Scanner(System.in);
        System.out.printf("Insira o primeiro número: ");
        var min = scanner.nextInt();
        System.out.printf("Insira o segundo número, sendo ele maior que o primeiro: ");
        var max = scanner.nextInt();
        String opt;

        do{
        //verifica escolha
        System.out.printf("Deseja ver os números ímpares ou pares? ");
        opt = scanner.next();

        //testa opções
        if (opt.equalsIgnoreCase("pares")){
            System.out.println("\nNúmeros pares!");
            for (var i = min; i <= max; i++){
                if(i % 2 == 0) System.out.println(i);
            }
            break;
        }
        else if (opt.equalsIgnoreCase("ímpares")){
            System.out.println("\nNúmeros ímpares!");
            for (var i = min; i <= max; i++){
                if(i % 2 != 0) System.out.println(i);
            }
            break;
        }
        else
            System.out.println("Opção Inválida!");
        } while(!opt.equalsIgnoreCase("ímpares")|| !opt.equalsIgnoreCase("pares"));

        scanner.close();
    }
}
