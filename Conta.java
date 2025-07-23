public class Conta {
    private String nome;
    private int numeroConta;
    private double saldo;
    private int contador;

    public Conta(String nome) {
        this.contador += 1;
        this.nome = nome;
        this.numeroConta = contador;
        this.saldo = 0;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
