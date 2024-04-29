package PooBet;
import java.util.ArrayList;
import java.util.List;
import PooBet.InOut;

public class Jogo {
    
    //att
    static int contador = 1;
    int idJogo;
    String descritivo;
    double apostaMax;
    double premioMax;
    private Aposta aposta;

    //met

    //metodo gerar set idJogo
    void gerarIdJogo(){
        this.idJogo = contador;
        contador++;
    }

    int getIdJogo(){
        return idJogo;
    }

    //metodo get set descritivo
    void setDescritivo(String desc){
        this.descritivo = desc;
    }

    String getDescritivo(){
        return descritivo;
    }

    //metodo get set apostaMax
    void setApostaMax(double apostaMax){
        this.apostaMax = apostaMax;
    }
    
    double getApostaMax(){
        return apostaMax;
    }

    //metodo get set premioMax
    void setPremioMax(double premioMax){
        this.premioMax = premioMax;
        }

    double getPremioMax(){
        return premioMax;
    }

    //metodo get set apostas
    public void setAposta(Aposta aposta){
        this.aposta = aposta;
    }
    

    public Aposta getAposta(){
        return aposta;
    }
    
}
