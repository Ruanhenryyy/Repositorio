
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> listaDeContas;

    public Banco() {
        this.listaDeContas = new ArrayList<>();
    }

    void criarConta(String nome) {
        listaDeContas.add(new Conta(nome));
    }

    void sacar(String nome, double valor) {
        for(Conta a : listaDeContas){
            if(a.getNome().equalsIgnoreCase(nome) && valor < a.getSaldo()){
                a.setSaldo(a.getSaldo()-valor);
            }
        }
    }

    void depositar(String nome, double valor){
        for(Conta a : listaDeContas){
            if(a.getNome().equalsIgnoreCase(nome)){
                a.setSaldo(a.getSaldo()+valor);
            }
        }
    }

    public String mostrarInformacoes(String nome){
        String nomemil = null;
         for(Conta a : listaDeContas){
            if(a.getNome().equalsIgnoreCase(nome)){
                nome = a.getNome();
            }
         }
        return nomemil;
    }

    void mostrarSaldo(String nome){
        for(Conta a : listaDeContas){
            if(a.getNome().equalsIgnoreCase(nome)){
                System.out.println(a.getSaldo());;
            }
        }
    }
}
