package Transacao;

public class Saldo implements Transacao{
    private float valor;
    @Override
    public void movimento(float valorMovimento) {
        this.valor += valorMovimento;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
