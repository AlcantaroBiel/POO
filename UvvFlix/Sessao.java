package UvvFlix;
import java.util.ArrayList;
import java.util.List;

public class Sessao {
    //att
    boolean statusSessao;
    String horario;
    private ArrayList <Filme> filmes;
    private Sala sala;

    //met
    public Sessao(){
        this.filmes = new ArrayList<Filme>();

    }

    public void adicionarFilme(Filme filme){
        filmes.add(filme);
    }

    public ArrayList <Filme> getFilmes(){
        return filmes;
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



}
