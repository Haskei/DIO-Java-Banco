package Banco;

public interface IConta {
    public boolean verificaSaque(double valor);
    public void sacar(double valor);
    public void depositar(double valor);
    public int getAgencia();
    public int getNumero();
    public double getSaldo();
    public void transferir(ContaCorrente destino, ContaCorrente origem,double valor);
    public void setAgencia(int agencia);
    public void setNumero(int numero);
    public void setSaldo(double saldo);
}
