package Transacao;

import java.util.ArrayList;
import java.util.List;

public class SaldoRepl extends Saldo{
    private List<Transacao> assinantes;

    public SaldoRepl(float saldoInicial){
        this.setValor(saldoInicial);
        this.assinantes = new ArrayList<>();
    }

    public void assinar(Transacao assinante){
        assinantes.add(assinante);
    }

    @Override
    public void movimento(float valorMovimento){
        // Executa a operação de movimento no objeto atual
        super.movimento(valorMovimento);
        // Notifica todos os objetos assinantes
        for(Transacao assinante: assinantes){
            assinante.movimento(valorMovimento);
        }
    }
}

