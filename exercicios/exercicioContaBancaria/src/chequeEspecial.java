public class chequeEspecial {

    private double cheque = 0; 

    private double chequeEmUso; 

    private boolean emUso;

    //cria cheque especial
    public chequeEspecial(double cheque){
        this.cheque = cheque;
        emUso = false;
    }

    //retorna o cheque (getCheque)
    public double retornaCheque(){
        return cheque;
    }

    //define o cheque
    public void setCheque(double valor){
        this.cheque = valor;
    }

    //verifica se o cheque 
    public void chequeZerado(boolean usado){
        emUso = usado;
    }

    public boolean setUso(){
        return emUso;
    }

    //verifica o valor do cheque usado 
    public void chequeEmUso(double chequeEmUso){
        this.chequeEmUso = chequeEmUso;
    }

    //retorna o valor do boleto
    public double boleto(){
        return chequeEmUso;
    }
}
