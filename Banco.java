
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

    void sacar(int conta, double valor) {
        for(Conta a : listaDeContas){
            if(a.getNumeroConta() == conta && valor < a.getSaldo()){
                a.setSaldo(a.getSaldo()-valor);
            }
        }
    }
}
