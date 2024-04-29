package UvvFlix;
import UvvFlix.InOut;
import java.util.ArrayList;
import java.util.List;

public class Sala {
    //att
    static int  constante = 1;
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
        ArrayList <Sala> listaDeSalas = new ArrayList <Sala> ();

        while(true){
            int optSala = InOut.leInt("MENU SALA \nSelecione sua opção: \n[1] - Criar Sala \n[2] - Acessar Sala \n[0] - Sair");
            if(optSala == 0){
                break;
            }
            else if(optSala == 1){
                //criar sala
                Sala sala = new Sala();

                sala.gerarIdSala();
                int numAssentos = InOut.leInt("Insira a quantidade de assentos da sala: ");
                sala.setNumAssentos(numAssentos);
                String tipoTela = InOut.leString("Insira o tipo de tela: ");
                sala.setTipoTela(tipoTela);
                String localizacao = InOut.leString("Insira a localização: ");
                sala.setLocalizacao(localizacao);

                InOut.MsgDeInformacao("SALA CRIADA", "Sala criada: \nID: "+sala.getIdSala()+"\nNúmero de assentos: "+sala.getNumAssentos()+"\nTipo de tela: "+sala.getTipoTela()+"\nLocalização: "+sala.getLocalizacao());

                listaDeSalas.add(sala);
            }
            else if(optSala == 2){
                //acessar sala 
                while(true){
                    if(listaDeSalas.isEmpty()){
                        InOut.MsgDeErro("ERRO", "Nenhuma sala registrada, acesse o menu criar sala!");
                        break;
                    }

                    int idPesquisaSala = InOut.leInt("Insira o ID da sala: \n[0] - Voltar");
                    if(idPesquisaSala == 0){
                        break;
                    }
                    for(Sala sala : listaDeSalas){
                        if(idPesquisaSala == sala.getIdSala()){
                            while(true){
                                int optSessao = InOut.leInt("MENU SESSÃO \nSelecione sua opção: \n[1] - Criar Sessão \n[2] - Acessar Sessão \n[0] - Sair");
                                if(optSessao == 0){
                                    break;
                                }
                                else if(optSessao == 1){
                                    //Criar sessão                            
                                    Sessao sessao = new Sessao();
    
                                    sessao.gerarIdSessao();
                                    String stt = "";
                                    while(true){                               
                                        int statusSessao = InOut.leInt("Insira o status da sessão: \n[1] - Ativo \n[0] - Desativado");
                                        if(statusSessao == 1){
                                            sessao.setStatusSessao(true);
                                            stt = "Ativo";
                                            break;
                                        }else if(statusSessao == 0){
                                            sessao.setStatusSessao(false);
                                            stt = "Desativado";
                                            break;
                                        }
                                    }
                                    String horario = InOut.leString("Insira o horario da sessão: ");
                                    sessao.setHorario(horario);
    
                                    InOut.MsgDeInformacao("SESSÃO CRIADA", "Sessão criada: \nID: "+sessao.getIdSessao()+"\nStatus: "+stt+"\nHorário: "+sessao.getHorario());              
                                    sala.adicionarSessao(sessao);
                    
                                }
                                else if(optSessao == 2){
                                    //Acessar sala
                                    while(true){
                                        if(sala.sessoes.isEmpty()){
                                            InOut.MsgDeErro("ERRO", "Nenhum registro de sessão para essa sala, acesse o menu criar sessão!");
                                            break;
                                        }
                                    
                                        int idPesquisaSessao = InOut.leInt("Insira a sessão desejada pelo ID: \n[0] - Voltar");
                                        if(idPesquisaSessao == 0){
                                            break;
                                        }
    
                                        for(Sessao sessao : sala.getSessoes()){
                                            if(sessao.getIdSessao() == idPesquisaSessao){
                                                while(true){
                                                    int optFilme = InOut.leInt("MENU FILME \n[1] - Criar Filme \n[2] - Pesquisar Filme \n[0] - Voltar");
                                                    if(optFilme == 0 ){
                                                        break;
                                                    }
                                                    else if(optFilme == 1){
                                                        //Criar filme                                               
                                                        Filme filme = new Filme();
    
                                                        filme.createIdFilme();
                                                        String titulo = InOut.leString("Insira o título do filme:");
                                                        filme.setTitulo(titulo);
                                                        long duracao = InOut.leLong("Insira a duração do filme (em minutos): ");
                                                        filme.setDuracao(duracao);
                                                        String genero = InOut.leString("Insira o genero do filme:");
                                                        filme.setGenero(genero);
                                                        while(true){
                                                            int optAtor = InOut.leInt("Gostaria de adcionar um novo ator a este filme? \n[1] - Inserir novo ator \n[0] - Não");
                                                            if(optAtor == 0){
                                                                break;
                                                            } 
                                                            else if(optAtor == 1){
                                                                Ator ator = new Ator();
    
                                                                ator.createIdAtor();
                                                                String nome = InOut.leString("Insira o nome do ator:");
                                                                ator.setNome(nome);
                                                                String papel = InOut.leString("Insira o papel desse ator no filme:");
                                                                ator.setPapel(papel);
    
                                                                ator.adicionarFilme(filme);
                                                                filme.adicionarAtor(ator);
                                                            }
                                                        }                             
                                                        String filmesAtoresFinal = "Atores: \n";
                                                        for(Ator ator: filme.getAtores()){
                                                            String filmesAtores = "Nome: "+ator.getNome()+" \nPapel: "+ator.getPapel()+"\n\n";
                                                            filmesAtoresFinal += filmesAtores;
                                                        }
                                                        
                                                        InOut.MsgDeInformacao("FILME CRIADO", "Filme: "+filme.getTitulo()+" \nID: "+filme.getIdFilme()+"\nDuração: "+filme.getIdFilme()+" minutos\nGenero: "+filme.getGenero()+"\n\n"+filmesAtoresFinal);

                                                        filme.setSessao(sessao);
                                                        sessao.adicionarFilme(filme);
                                                    }
                                                    else if(optFilme == 2){
                                                        //Pesquisar filme
                                                        while(true){
                                                            if(sessao.getFilmes().isEmpty()){
                                                                InOut.MsgDeErro("ERRO", "Nenhum filme registrado ainda, acesse o menu criar filme!");
                                                                break;
                                                            }
                                                        
                                                            String pesquisaNomeFilme = InOut.leString("Insira o título do filme que você deseja encontrar: \n[0] - Voltar");
                                                            
                                                            if(pesquisaNomeFilme.equals("0")){
                                                                break;
                                                            }
                                                            
                                                            for(Filme filme : sessao.getFilmes()){
                                                                if(filme.getTitulo().equals(pesquisaNomeFilme)){
                                                                    String filmesAtoresFinal = "Atores: \n";
                                                                    for(Ator ator: filme.getAtores()){
                                                                        String filmesAtores = "Nome: "+ator.getNome()+" \nPapel: "+ator.getPapel()+"\n\n";
                                                                        filmesAtoresFinal += filmesAtores;
                                                                    }
                                                                    InOut.MsgDeInformacao("RESULTADO", "Filme: "+filme.getTitulo()+" \nID: "+filme.getIdFilme()+"\nDuração: "+filme.getIdFilme()+" minutos\nGenero: "+filme.getGenero()+"\n\n"+filmesAtoresFinal);
                                                                    break;
                                                                }
                                                            }
                                                        } 
                                                    }
                                                }
                                            }
                                        }break;
                                    }
                                }
                            }
                        }
                    }break;
                }
            }
        }
    }
    
    //gerarid
    void gerarIdSala(){
        this.idSala = constante;
        constante++;
    }

    int getIdSala(){
        return idSala;
    }

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
