public class Conta {
    private String nome;
    private int numeroConta;
    private double saldo;
    private int contador;

    public Conta(String nome, int conta) {
        this.contador += 1;
        this.nome = nome;
        this.numeroConta = contador;
        this.saldo = 0;
    }
    
   
}
