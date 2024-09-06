package Banco;

public class ContaCorrente extends Conta {
    int id=0;
    public ContaCorrente(int agencia, double saldo) {
        super.agencia=agencia;
        super.saldo=saldo;
        super.numero=id++;
    }
}
