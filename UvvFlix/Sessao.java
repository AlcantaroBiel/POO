package UvvFlix;
import java.util.ArrayList;
import java.util.List;

public class Sessao {
    //att
    static int constante = 1;
    int idSessao;
    boolean statusSessao;
    String horario;
    private ArrayList <Filme> filmes;
    private Sala sala;

    
    public Sessao(){
        this.filmes = new ArrayList<Filme>();

    }

    //met
    //gerar e get id
    void gerarIdSessao(){
        this.idSessao = constante;
        constante++;
    }
    
    int getIdSessao(){
        return idSessao;
    }

    //metodo get e set status sessao
    void setStatusSessao(boolean statusSessao){
        this.statusSessao = statusSessao;
    }

    boolean getStatusSessao(){
        return statusSessao;
    }

    //metodo get e set horario
    void setHorario(String horario){
        this.horario = horario;
    }

    String getHorario(){
        return horario;
    }

    //metodo get set sala
    public void setSala(Sala sala){
        this.sala = sala;
        if(this.sala != null){
            this.sala.adicionarSessao(this);
        }
    }

    public Sala getSala(){
        return sala;
    }

    //metodo adicionar remover e get filme
    public void adicionarFilme(Filme filme){
        filmes.add(filme);
    }

    public void removerFilme(Filme filme){
        filmes.remove(filme);
    }

    public ArrayList <Filme> getFilmes(){
        return filmes;
    }



}
