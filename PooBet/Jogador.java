package PooBet;
import upinout.InOut;
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
            int opt = InOut.leInt("MENU \n[1] - Criar Aposta; \n[2] - Criar Conta; \n[3] - Criar Jogo \n[0] - End");
            if(opt == 0){
                break;
            }
            else if(opt == 1){
                //Criar metodo criar aposta;
            }
            else if(opt == 2){
                //Criar metodo criar conta;
            }
            else if(opt == 3{
                //Criar metodo criar conta;
            })
            
        }
    }


}
