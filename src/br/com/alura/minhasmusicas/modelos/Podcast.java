package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio{
    private String host;
    private String descricao;

    //Setters
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setHost(String host) {
        this.host = host;
    }
    //Getters
    public String getDescricao() {
        return descricao;
    }

    public String getHost() {
        return host;
    }
    @Override
    public int getClassificacao() {
        if(this.getTotalCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
