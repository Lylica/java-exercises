public class conta {

    private double saldo = 0;

    public double deposito;

    public double saque;

     //saldo da conta
    public conta(double saldo){
        this.saldo = saldo;
    }

    //faz um deposito
    public void depositar(){
        this.saldo += deposito;
        return;
    }

    //adiciona o cheque
    public void depositaCheque (double deposito){
        saldo += deposito;
    }

    //retira o cheque
    public void sacaCheque (double deposito){
        saldo -= deposito;
    }

    //faz um saque
    public void sacar(){
        this.saldo -= saque;
        return;
    }

    //verifica saldo
    public double verificarSaldo(){
        return saldo;
    }




}