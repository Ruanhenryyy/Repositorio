import java.util.Scanner;

public class main 
{
    public static void main(String[] args){
        Scanner banks = new Scanner(System.in);
        String fuck = banks.nextLine();
        Banco c1 = new Banco();

        c1.criarConta(fuck);
        c1.depositar(fuck, 777);
        c1.sacar(fuck, 776);
        c1.mostrarInformacoes(fuck);
        c1.mostrarSaldo(fuck);

    }
}