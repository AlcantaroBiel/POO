package UvvFlix;
import UvvFlix.InOut;

public class Sala {
    //att
    int idSala;
    int numAssentos;
    String tipoTela;
    String localizacao;

    //met
    public static void main(String[] args){
        Sala menu = new Sala();

        menu.menu();
    }

    void menu(){
        while(true){
            int opt = InOut.leInt("MENU \nSelecione sua opção: \n[1] - AAA \n[2] - BBB \n[0] - End");
            if(opt == 0){
                break;
            }
        }
    }

    //+++++
}
