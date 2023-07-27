import Transacao.Assinante;
import Transacao.SaldoRepl;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SaldoRepl saldoRepl = new SaldoRepl(1000);

        Assinante assinante1 = new Assinante(" Assinante 1");
        Assinante assinante2 = new Assinante(" Assinante 2");

        saldoRepl.assinar(assinante1);
        saldoRepl.assinar(assinante2);

        saldoRepl.movimento(500);

    }
}