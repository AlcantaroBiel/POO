package PooBet;

public class Jogador {
    
    //att
    int idJogador;
    String nome;
    String sobrenome;
    String apelido;
    String cpf;
    String nacionalidade;
    Date dataNascimento;

    //met
    public static void main(String[] args){
        Jogador jogador1 = new Jogador();

        jogador1.menu();
    }

    void menu(){
        while(true){
            int opt = InOut.leInt("MENU \n[1] - AAAA \n[2] - BBBB \n[0] - End");
            if(opt == 0){
                break;
            }
            
        }
    }


}
