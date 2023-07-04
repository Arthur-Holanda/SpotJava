package br.com.alura.minhasmusicas.principal;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;
import br.com.alura.minhasmusicas.modelos.Preferidas;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setHost("Marcos Mendes");

        
        for (int i = 0; i < 6000; i++) {
            if(i%3==0) {
                minhaMusica.reproduz();
                if(i%2==0){
                    minhaMusica.curte();
                }
            }
            if(i%2==0){
                meuPodcast.reproduz();
                if(i%3==0){
                    meuPodcast.curte();
                }
            }
        }
        Preferidas preferidas = new Preferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }

}
