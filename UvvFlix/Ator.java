package UvvFlix;
import java.util.ArrayList;
import java.util.List;

public class Ator {
    //att
    static int contador = 1;
    int idAtor;
    String nome;
    String papel;
    private ArrayList <Filme> filmes;

    public Ator(){
        this.filmes = new ArrayList <Filme>();
    }

    //gerarid
    void createId(){
        this.idAtor = contador;
        contador++;
    }

    int getId(){
        return idAtor;
    }

    //metodo get e set nome
    void setNome(String nome){
        this.nome = nome;
    }

    String getNome(){
        return nome;
    }

    //metodo get e set papel
    void setPapel(String papel){
        this.papel = papel;
    }

    String getPapel(){
        return papel;
    }

    //metodo adicionar e remover filmes
    public void adicionarFilme(Filme filmes){
        this.filmes.add(filmes);
    }

    public void removerFilme(Filme filmes){
        this.filmes.remove(filmes);
    }
}
