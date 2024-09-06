package Banco;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Cliente {
    private String nome;
    private String email;
    private long cpf;
    private String banco;
    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;
    public Cliente(String nome, String email, long cpf, String banco) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.banco = banco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public void criarContaCorrente(int agencia, double saldo) {
        if(contaCorrente == null) {
            this.contaCorrente = new ContaCorrente(agencia, saldo);
        }
        else{
            System.out.println("O usuário já possui uma conta corrente");
        }
    }
    public void criarContaPoupanca(int agencia, double valor) {
        if(contaPoupanca == null) {
            this.contaPoupanca= new ContaPoupanca(agencia, valor);
        }
        else{
            System.out.println("O usuário já possui uma conta poupança");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu email: ");
        String email = sc.nextLine();
        System.out.println("Digite seu cpf: ");
        long cpf = sc.nextLong();
        System.out.println("Digite o nome de seu banco: ");
        String banco = sc.nextLine();
        Cliente cliente = new Cliente(nome, email, cpf, banco);

    }
}
class ClienteEspecial extends Cliente{
    public ClienteEspecial(String nome, String email, int cpf, String banco) {
        super(nome, email, cpf, banco);
    }
    boolean[] listaPrivilegios = new boolean[4];
    public void setupListaPrivilegios() {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        for(int i=0;i< this.listaPrivilegios.length;i++){
            System.out.println("Digite 1 para verdadeiro e 0 para falso");
            try {
                userInput = scanner.nextInt();
                if(userInput == 1){
                    this.listaPrivilegios[i] = true;
                }
                else if(userInput == 0){
                    this.listaPrivilegios[i] = false;
                }
                else{
                    System.out.println("Numero não valido!"+"\n"+"O valor será dado como falso");
                    this.listaPrivilegios[i] = false;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Não foi digitado um numero"+"\n"+" o valor será dado como falso");
                this.listaPrivilegios[i] = false;
            }
        }
    }
    public void setPrivilegio(int posicao, boolean privilegio){
        this.listaPrivilegios[posicao]=privilegio;
    }
    public boolean[] getListaPrivilegios() {
        return this.listaPrivilegios;
    }
    public boolean getPrivilegio(int posicao){
        return this.listaPrivilegios[posicao];
    }
    public void detalhesListaPrivilegios() {
        if(this.listaPrivilegios[0]){
            System.out.println("O cliente tambem é funcionário");
        }
        if(this.listaPrivilegios[1]){
            System.out.println("O cliente é uma pessoa famosa");
        }
        if(this.listaPrivilegios[2]){
            System.out.println("O cliente tem um saldo alto");
        }
        if(this.listaPrivilegios[3]){
            System.out.println("O cliente é politico");
        }
    }

}
