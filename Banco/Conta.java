package Banco;

public abstract class Conta implements IConta {
    protected int agencia;
    protected int numero;
    protected double saldo;


    public boolean verificaSaque(double valor){
        if(valor>this.saldo){
            return false;
        }
        else{
            return true;
        }
    }
    public void sacar(double valor){
        if(verificaSaque(valor)==false){
            System.out.println("Saldo insuficiente");
        }
        else{
            System.out.println("Saldo Atual: " +this.saldo);
            this.saldo -=valor;
            System.out.println("Novo Saldo: " +this.saldo);
        }
    }
    public void depositar(double valor){
        System.out.println("Saldo Atual: " +this.saldo);
        this.saldo+=valor;
        System.out.println("Novo Saldo: " +this.saldo);
    }
    public int getAgencia(){
        return this.agencia;
    }
    public int getNumero(){
        return this.numero;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void transferir(ContaCorrente destino, ContaCorrente origem,double valor){
        if(verificaSaque(valor)==false){
            System.out.println("Saldo insuficiente");
        }
        else{
            origem.sacar(valor);
            destino.depositar(valor);
            System.out.println("R$" +valor+" foi transferido da conta"+ origem.getNumero()+ "para a conta "+ destino.getNumero());
        }
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
