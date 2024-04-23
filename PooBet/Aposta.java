package PooBet;
import java.util.ArrayList;
import java.util.List;
import PooBet.InOut;

public class Aposta {
    
    //att
    static int contador = 1;
    int idAposta;
    double valorAposta;
    int repetir;
    private Jogador jogador;
    private Jogo jogo;


    //met
    //metodo gerar e get idAposta
    void gerarIdAposta(){
        this.idAposta = contador;
        contador++;
    }

    int getIdAposta(){
        return idAposta;
    }

    //metodo get set valorAposta
    void setValorAposta(double valorAposta){
        this.valorAposta = valorAposta;

    }

    double getValorAposta(){
        return valorAposta;
    }

    //metodo get set repetir
    void setRepetir(int repetir){
        this.repetir = repetir;
    }

    int getRepetir(){
        return repetir;
    }

    //metodo get set jogador
    public void setJogador(Jogador jogador){
        this.jogador = jogador;
        if(this.jogador != null){
            this.jogador.adicionarAposta(this);
        }
    }

    public Jogador getJogador(){
        return jogador;
    }

    //metodo get set aposta
    void setAposta(Jogo jogo){
        this.jogo = jogo;
        if(this.jogo != null){
            this.jogo.adicionarAposta(this);
        }
    }

    Jogo getAposta(){
        return jogo;
    }

    //metodo criar biblioteca de jogos
    ArrayList <Jogo> bibliotecaDeJogos = new ArrayList<Jogo>();

}
