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
    private ArrayList <Jogo> jogos;

    void Apostas(){
        this.jogos = new ArrayList<Jogo>();
    }

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

    //metodo adicionar remover e get jogo
    public void adicionarJogo(Jogo jogo){
        if(this.jogos == null){
            this.jogos = new ArrayList<Jogo>();
        }
        jogos.add(jogo);
    }

    public void removerJogo(Jogo jogo){
        jogos.remove(jogo);
    }

    public ArrayList <Jogo> getJogos(){
        return jogos;
    }

    //metodo para gerar jogos de placeholder;
    private ArrayList<Jogo> bibliotecaJogos;

    public ArrayList<Jogo> gerarOuRetornarBibliotecaJogos() {
        if (bibliotecaJogos == null) {
            bibliotecaJogos = gerarBibliotecaJogos();
        }
        
        return bibliotecaJogos;
    }

    // metodo para gerar a biblioteca de jogos
    private ArrayList<Jogo> gerarBibliotecaJogos() {
        ArrayList<Jogo> bibliotecaJogos = new ArrayList<Jogo>();
        Jogo jogo = new Jogo();
        jogo.gerarIdJogo();
        jogo.setDescritivo("Tubarões X Gorilas");
        jogo.setApostaMax(2000);
        jogo.setPremioMax(10000);
    
        Jogo jogo2 = new Jogo();
        jogo2.gerarIdJogo();
        jogo2.setDescritivo("Lobos X Galos");
        jogo2.setApostaMax(1500);
        jogo2.setPremioMax(8000);
    
        Jogo jogo3 = new Jogo();
        jogo3.gerarIdJogo();
        jogo3.setDescritivo("Bulldogs X Leões");
        jogo3.setApostaMax(900);
        jogo3.setPremioMax(4000);

        bibliotecaJogos.add(jogo);
        bibliotecaJogos.add(jogo2);
        bibliotecaJogos.add(jogo3);
        
        contador = 1;

        return bibliotecaJogos;
    }   

}
