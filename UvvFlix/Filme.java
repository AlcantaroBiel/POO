package UvvFlix;
import java.util.ArrayList;
import java.util.List;


public class Filme {
    //att
    static int contador = 1;
    int idFilme;
    String titulo;
    long duracao;
    String genero;
    private Sessao sessao;
    private ArrayList <Ator> atores;

    public Filme(){
        this.atores = new ArrayList <Ator>();
    }

    //met

    //metodo id
    void createId(){
        this.idFilme = contador;
        contador++;
    }

    int getId(){
        return idFilme;
    }

    //metodo get e set titulo
    void setTitulo(String titulo){
        this.titulo = titulo;
    }

    String getTitulo(){
        return titulo;
    }

    //metodo get e set duracao
    void setDuracao(long duracao){
        this.duracao = duracao;
    }

    long getDuracao(){
        return duracao;
    }

    //metodo get e set genero
    void setGenero(String genero){
        this.genero = genero;
    }

    String getGenero(){
        return genero;
    }

    //metodo get set sessao
    public void setSessao(Sessao sessao){
        this.sessao = sessao;
        if(this.sessao != null){
            this.sessao.adicionarFilme(this);
        }
    }

    public Sessao getSessao(){
        return sessao;
    }

    //metodo adicionar e remover atores;
    public void adicionarAtor(Ator atores){
        this.atores.add(atores);
    }

    public void removerAtor(Ator atores){
        this.atores.remove(atores);
    }

    
    public ArrayList <Ator> getAtores(){
        return atores;
    }
    
}
