package PooBet;

public class Jogo {
    
    //att
    int idJogo;
    String descritivo;
    double apostaMax;
    double premioMax;

    //met
    public void criarJogo(){
        //Descobrir como gerar id
        this.descritivo = descritivo;
        descritivo = InOut.leString("Insira a descrição do jogo: ");
        
        this.apostaMax = apostaMax;
        apostaMax = InOut.leFloat("Insira a aposta máxima para o jogo: ");

        this.premioMax = premioMax;
        premioMax = InOut.leFloat("Insira o premio máximo para o jogo:");
    }

    
}
