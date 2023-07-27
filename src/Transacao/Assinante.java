package Transacao;

public class Assinante implements Transacao{
    private String nome;

    public Assinante(String nome){
        this.nome = nome;
    }
    @Override
    public void movimento(float valorMovimento) {
        System.out.println(nome + " foi notificado. Movimento realizado: " + valorMovimento);
    }
}
