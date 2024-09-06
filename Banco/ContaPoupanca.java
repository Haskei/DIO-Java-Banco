package Banco;

public class ContaPoupanca extends Conta {
    int id=0;
    public ContaPoupanca(int agencia, double saldo) {
        super.agencia=agencia;
        super.saldo=saldo;
        super.numero=id++;
    }
}
