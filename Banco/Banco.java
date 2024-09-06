package Banco;

public class Banco {
    private String nome;
    private int numeroClientes;
    private String paisOrigem;
    private int id;
    public Banco(String nome, int clientes, String paisOrigem, int id) {
        this.nome = nome;
        this.numeroClientes = clientes;
        this.paisOrigem = paisOrigem;
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumeroClientes() {
        return numeroClientes;
    }
    public void aumentarNumeroClientes(int aumento){
        this.numeroClientes += aumento;
    }
    public void diminuirNumeroClientes(int diminuir){
        if((this.numeroClientes - diminuir)>0){
            this.numeroClientes -= diminuir;
        }
        else{
            System.out.println("Não há nenhum cliente para remover");
        }
    }
}
