package UvvFlix;
import UvvFlix.InOut;
import java.util.ArrayList;
import java.util.List;

public class Sala {
    //att
    int idSala;
    int numAssentos;
    String tipoTela;
    String localizacao;
    private ArrayList <Sessao> sessoes;

    public Sala(){
        this.sessoes = new ArrayList <Sessao>();
    }

    //met
    public static void main(String[] args){
        Sala menu = new Sala();

        menu.menu();
    }

    void menu(){
        Sala sala = new Sala();
        while(true){
            int opt = InOut.leInt("MENU \nSelecione sua opção: \n[1] - Criar Sessão \n[2] - Inserir Filme \n[0] - Sair");
            if(opt == 0){
                break;
            }
            else if(opt == 1){
                //Criar sessão
                Sessao sessao = new Sessao();
                while(true){
                    int statusSessao = InOut.leInt("Insira o status da sessão: \n[1] - Ativo; \n[0] - Desativado;");
                    if(statusSessao == 1){
                        sessao.setStatusSessao(true);
                        break;
                    }else if(statusSessao == 0){
                        sessao.setStatusSessao(false);
                        break;
                    }
                }
                String horario = InOut.leString("Insira o horario da sessão: ");
                sessao.setHorario(horario);

                //APAGAR ISSO QUANDO IMPLEMENTAR CRIAÇÃO DE SALA
                //N ESQUECER

                sala.adicionarSessao(sessao);


            }
            else if(opt == 2){
                //Inserir Filme
                while(true){
                    int optFilme = InOut.leInt("Menu: \n[1] - Pesquisar filme; \n[2] - Criar novo filme; \n[0] - Voltar");
                    if(optFilme == 0){
                        break;
                    }
                    else if(optFilme == 1){
                        //Pesquisar filme
                        String pesquisaNomeFilme = InOut.leString("Insira o nome do filme que você deseja encontrar: ");
                        for(Sessao sessoes : sala.getSessoes()){
                            for(Filme filmes : sessoes.getFilmes()){
                                if(filmes.getTitulo().equals(pesquisaNomeFilme)){
                                    System.out.println("Filme: \nId: "+filmes.getId()+"Nome: "+filmes.getTitulo());
                                    for(Ator atores : filmes.getAtores()){
                                        System.out.println(atores.getId());
                                        System.out.println(atores.getNome());
                                    }
                                }
                                
                            }
                        }

                    }
                    else if(optFilme == 2){
                        //Criar novo filme
                        Filme filme = new Filme();
                        filme.createId();
                        String titulo = InOut.leString("Insira o título do filme:");
                        filme.setTitulo(titulo);
                        long duracao = InOut.leLong("Insira a duração do filme: ");
                        filme.setDuracao(duracao);
                        String genero = InOut.leString("Insira o genero do filme:");
                        filme.setGenero(genero);
                        while(true){
                            int optAtor = InOut.leInt("Gostaria de adcionar um novo ator a este filme? \n[1] - Inserir novo ator; \n[0] - Não.");
                            if(optAtor == 0){
                                break;
                            } 
                            else if(optAtor == 1){
                                Ator ator = new Ator();
                                String nome = InOut.leString("Insira o nome do ator:");
                                ator.setNome(nome);
                                String papel = InOut.leString("Insira o papel desse ator no filme:");
                                ator.setPapel(papel);

                                ator.adicionarFilme(filme);
                                filme.adicionarAtor(ator);
                            }
                        filme.setSessao(sessao);
                        sessoes.adicionarFilme(filme);
                        }

                    }

                }
            }
        }
    }

    //gerarid

    //Metodo get e set numAssentos
    void setNumAssentos(int numAssentos){
        this.numAssentos = numAssentos;
    }

    int getNumAssentos(){
        return numAssentos;
    }

    //Metodo get e set tipoTela
    void setTipoTela(String tipoTela){
        this.tipoTela = tipoTela;
    }

    String getTipoTela(){
        return tipoTela;
    }

    //Metodo get e set localizacao
    void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }

    String getLocalizacao(){
        return localizacao;
    }

    //Metodo adcionar e remover sessão
    public void adicionarSessao(Sessao sessoes){
        this.sessoes.add(sessoes);
    }

    public void removerSessao(Sessao sessoes){
        this.sessoes.remove(sessoes);
    }

    //metodo get sessoes

    public ArrayList <Sessao> getSessoes(){
        return sessoes;
    }
}
