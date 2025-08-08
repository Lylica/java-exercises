import java.util.Scanner;

public class exercicioContaBancaria {

    private final static Scanner scanner = new Scanner(System.in);
    private static conta conta = new conta(0);
    private static chequeEspecial cheque = new chequeEspecial(0);

    public static void main(String[] args) throws Exception {
        var opt = -1;

        do{
            System.out.println("=== Escolha uma das opções ===");
            System.out.println("1- Consultar saldo");
            System.out.println("2- Consultar cheque especial");
            System.out.println("3- Depositar dinheiro");
            System.out.println("4- Sacar dinheiro");
            System.out.println("5- Pagar um boleto");
            System.out.println("6- Verificar uso do cheque especial");
            System.out.println("7- Sair");
            opt = scanner.nextInt();
            System.out.println("");
            switch (opt) {
                case 1 -> verificaSaldo();
                case 2 -> verificaCheque();
                case 3 -> deposita();
                case 4 -> saca();
                case 5 -> pagarBoleto();
                case 6 -> verificaUsoCheque();
                case 7 -> System.exit(0);
                default -> System.out.println("Opção inválida!\n");
            }


        } while (opt != 0);
    }

    //verifica saldo
    public static void verificaSaldo(){
        var saldo = conta.verificarSaldo();
        System.out.println("Seu saldo é de " + saldo + " reais!\n");
    }

    //consulta valor do cheque especial
    public static void verificaCheque(){
        var valor = cheque.retornaCheque();
        System.out.println("Seu cheque especial é de " + valor + "!\n");
    }
    
    //faz o saque
    public static void saca(){
        System.out.printf("Insira o valor a ser sacado: ");
        var saldo = conta.verificarSaldo();
        conta.saque = scanner.nextDouble();
        var saque = conta.saque;
        if (saque <= saldo){
            conta.sacar();
            System.out.println("Saque de " + saque + " reais feito!\n");
        }
        else {
            System.out.println("O valor do saldo é menor que o valor do saque!\n");
        }
    }

    //faz o deposito
    public static void deposita(){

        System.out.printf("Insira o valor a ser depositado: ");
        conta.deposito = scanner.nextDouble();
        var saldo = conta.verificarSaldo();
        var deposito = conta.deposito;
        
        if (saldo == 0){
            double novoCheque = 0;
            if (deposito <= 500 && deposito > 0){
                saldo = 50;
                novoCheque = saldo;
                conta.depositar();
                System.out.println("Depósito de " + deposito + " reais feito!\n");
            }
            else if (deposito > 500){
                saldo = (deposito*0.5);
                novoCheque = saldo;
                conta.depositar();
                System.out.println("Depósito de " + deposito + " reais feito!\n");
            }
            else {
                System.out.println("Depósito inválido!\n");
            }
            cheque.setCheque(novoCheque);
        }

    }

    //verifica uso do cheque
    public static void verificaUsoCheque() {
        var chequeUsado = cheque.setUso();

        if (chequeUsado == false){
            System.out.println("Deseja usar seu cheque especial? S - Sim / N - Não");
            var usoCheque = scanner.next();

            if (usoCheque.equalsIgnoreCase("S") && cheque.retornaCheque() != 0){
                chequeUsado = true;
                var saldo = cheque.retornaCheque();
                System.out.println("Se cheque é de " + saldo + ", quanto vc deseja usar do seu cheque?");
                var saque = scanner.nextDouble();
                conta.depositaCheque(saque);
                double chequeRetirado = (saldo - saque);
                cheque.setCheque(chequeRetirado);
                cheque.chequeZerado(chequeUsado);
                cheque.chequeEmUso(saque);
                System.out.println("O cheque agora está em uso\n");
            }
            else {
                System.out.println("Você não possui cheque especial, faça um depósito inicial para desbloquea-lo!\n");
                chequeUsado = false;
            }
        } 
        else if (cheque.retornaCheque() != 0){ 
            var saldo = cheque.retornaCheque();
            System.out.println("Você tem " + saldo + " de cheque para utilizar, deseja usar?\n");
            var usoCheque = scanner.next();
            if (usoCheque.equalsIgnoreCase("S")){
                System.out.println("Quanto vc deseja usar do seu cheque?");
                var saque = scanner.nextDouble();
                conta.depositaCheque(saque);
                double chequeRetirado = (saldo - saque);
                cheque.setCheque(chequeRetirado);
                cheque.chequeZerado(chequeUsado);
                cheque.chequeEmUso(saque);
        }
      }
        else {
            System.out.println("O cheque foi todo utilizado, é necessário pagar o boleto para reutilizar o cheque!\n");
        }
    }

    //paga boleto
    public static void pagarBoleto(){
        var boleto = cheque.boleto();
        if (boleto != 0){
            var taxa = ((boleto/100)*20);
            boleto += taxa;
            System.out.println("Você tem um boleto em aberto no valor de " + boleto + "\n");
            System.out.println("Deseja realizar o pagamento do boleto?");
            var usoCheque = scanner.next();
            if (usoCheque.equalsIgnoreCase("S")){
                System.out.println("Boleto no valor de " + boleto + " reais pago!\n");
                conta.sacaCheque(boleto); 
                boleto -= taxa;              
                var retorno = cheque.retornaCheque() + boleto;
                //var saldo = cheque.retornaCheque();
                //saldo += retorno;
                cheque.setCheque(retorno);
                boleto = 0;
                cheque.chequeEmUso(boleto);
        }
    }
        else {
            System.out.println("Você não tem boletos em aberto!\n");
        }
     
    
}
}
