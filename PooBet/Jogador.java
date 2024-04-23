package PooBet;
import java.util.ArrayList;
import java.util.List;
import PooBet.InOut;

public class Jogador {
    
    //att
    int idJogador;
    String nome;
    String sobrenome;
    String apelido;
    String cpf;
    String nacionalidade;
    String dataNascimento;
    private Credito credito;
    private ArrayList <Aposta> listaDeApostas;

    void Aposta(){
        this.listaDeApostas = new ArrayList<Aposta>();
    }

    //met
    public static void main(String[] args){
        Jogador jogador = new Jogador();

        jogador.menu();
    }


    //metodo menu
    void menu(){
        List <Jogador> listaJogadores = new ArrayList <Jogador>();
        
        while(true){

            int opt = InOut.leInt("MENU \n[1] - Criar Conta; \n[2] - Acessar Conta; \n[0] - End");
            if(opt == 0){
                break;
            }
            if(opt == 1){
                //Cria e seta jogador;
                Jogador jogador = new Jogador();
                String nome = InOut.leString("Insira o seu nome: ");
                jogador.setNome(nome);
                String sobrenome = InOut.leString("Insira o seu sobrenome: ");
                jogador.setSobrenome(sobrenome);
                String apelido = InOut.leString("Insira o seu apelido: ");
                jogador.setApelido(apelido);
                String cpf = InOut.leString("Insira o seu CPF: ");
                jogador.setCPF(cpf);
                String nacionalidade = InOut.leString("Insira sua nacionalidade: ");
                jogador.setNacionalidade(nacionalidade);
                String dataNascimento = InOut.leString("Insira sua data de nascimento: ");
                jogador.setDataNascimento(dataNascimento);
                System.out.print(jogador.credito);

                listaJogadores.add(jogador);

                
            }
            if(opt == 2){
                //Acessa conta existente
                while(true){
                    if(listaJogadores.isEmpty()){
                        InOut.MsgDeErro("ERRO", "Nenhuma conta registrada no sistema!");
                        break;
                    }
                    String pesquisaCPF = InOut.leString("Insira o CPF da sua conta: \n[0] - Sair");
                    if(pesquisaCPF.equals("0")){
                        break;
                    }
                    for(Jogador jogador : listaJogadores){
                        if(jogador.getCPF().equals(pesquisaCPF)){
                            while(true){
                                int optehvc = InOut.leInt("Este é você? \nApelido: "+jogador.getApelido()+"; \nNome: "+jogador.getNome()+" "+jogador.getSobrenome()+"; \nCPF: "+jogador.getCPF()+"; \nNacionalidade: "+jogador.getNacionalidade()+"; \nData de nascimento: "+jogador.getDataNascimento()+".\n-------------------- \n[1] - Sim \n[0] - Não");
                                if(optehvc == 0){
                                    break;
                                }
                                if(optehvc == 1){
                                    while(true){
                                        int optMenu = InOut.leInt("MENU PRINCIPAL \n[1] - Crédito; \n[2] - Apostar; \n[0] - Sair.");
                                        if(optMenu == 0){
                                            break;
                                        }
                                        else if(optMenu == 1){
                                            //menu crédito
                                            while(true){
                                                int optCredito = InOut.leInt("MENU CRÉDITO \n[1] - Inserir crédito; \n[2] - Verificar crédito; \n[0] - Voltar");
                                                if(optCredito == 0){
                                                    break;
                                                }
                                                else if(optCredito == 1){
                                                    //Inserir crédito
                                                    Credito credito = new Credito();
                                                    double saldo = InOut.leDouble("Insira o valor a ser inserido ao saldo: ");
                                                    credito.setSaldo(saldo);
                                                    String validade = InOut.leString("Insira a validade: ");
                                                    credito.setValidade(validade);
                                                    String moeda = InOut.leString("Insira a moeda: ");
                                                    credito.setMoeda(moeda);
                                                    String bloqueado = InOut.leString("Insira se a conta está bloqueada: \n[1] - Sim \n[0] - Não");
                                                    if(bloqueado.equals("1")){
                                                        credito.setBloqueado(true);
                                                    }
                                                    else if(bloqueado.equals("0")){
                                                        credito.setBloqueado(false);
                                                    }
                                                    credito.setJogador(jogador);
                                                    jogador.setCredito(credito);
                
                                                }
                                                else if(optCredito == 2){
                                                    //Verificar crédito
                                                    if(jogador.credito == null){
                                                        InOut.MsgDeErro("ERRO", "Não há crédito relacionado a este jogador!");            
                                                    }else{
                                                        boolean status = jogador.credito.getBloqueado();
                                                        String statusRetorno = "";
                                                        if(status){
                                                            statusRetorno = "Bloqueado";
                                                        }else{
                                                            statusRetorno = "Ativo";
                                                        }                                                       
                                                        InOut.MsgDeInformacao("Crédito", "Jogador: "+jogador.getApelido()+"; \nSaldo: "+jogador.getCredito().getSaldo()+"; \nValidade: "+jogador.getCredito().getValidade()+"; \nStatus da conta: "+statusRetorno+".");
                                                    }  
                                                }
                                            }
                                        }
                                        else if(optMenu == 2){
                                            //menu aposta
                                            while(true){
                                                int optAposta = InOut.leInt("MENU APOSTA \n[1] - Criar aposta; \n[2] - Verificar suas apostas; \n[0] - Sair.");
                                                if(optAposta == 0){
                                                    break;
                                                }
                                                else if(optAposta == 1){
                                                    Aposta aposta = new Aposta();
                                                    aposta.gerarIdAposta();
                                                    double valorAposta = InOut.leDouble("Insira o valor da sua aposta: ");
                                                    aposta.setValorAposta(valorAposta);
                                                    //perguntar sobre o repetir aposta
                                                    
                                                    //set jogo
                                                    String listaJogoFinal = "";
                                                    for(Jogo jogo : .getBibliotecaDeJogos()){
                                                        String listaJogo = "Jogo: "+jogo.getDescritivo()+"; \nAposta máxima: "+jogo.getApostaMax()+"; \nPremio máximo: "+jogo.getPremioMax()+"; \nId: "+jogo.getIdJogo()+". \n";
                                                        listaJogoFinal = listaJogoFinal + listaJogo;
                                                    }
                                                    int optJogo = InOut.leInt("Escolha em qual jogo irá apostar: \nJogos disponíveis: \n"+listaJogoFinal);
                                                    aposta.setJogador(jogador);

                                                    InOut.MsgDeInformacao("APOSTA CRIADA", "Aposta criada: \nValor da aposta: "+aposta.getValorAposta()+"; \nJogador: "+jogador.getApelido()+"; \nJogo: ");
                                                }
                                                else if(optAposta == 2){
                                                    String verificarApostaFinal = "";
                                                    for(Aposta aposta : jogador.listaDeApostas){
                                                        String verificarAposta = "ID: "+aposta.getIdAposta()+"; \nValor da aposta: "+aposta.getValorAposta()+"; \nJogo: "+aposta.getJogo()+". \n";
                                                        verificarApostaFinal = verificarApostaFinal + verificarAposta;
                                                    }

                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                            }  
                        }
                    }
                }
            }if(opt ==3){
                //debug
            }
        }
    }

    //metodo get set nome
    void setNome(String nome){
        this.nome = nome;
    }

    String getNome(){
        return nome;
    }

    //metodo get set sobrenome
    void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    String getSobrenome(){
        return sobrenome;
    }

    //metodo get set apelido
    void setApelido(String apelido){
        this.apelido = apelido;
    }

    String getApelido(){
        return apelido;
    }

    //metodo get set cpf
    void setCPF(String cpf){
        this.cpf = cpf;
    }

    String getCPF(){
        return cpf;
    }

    //metodo get set nacionalidade
    void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    String getNacionalidade(){
        return nacionalidade;
    }

    //metodo get set data de nascimento
    void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    String getDataNascimento(){
        return dataNascimento;
    }

    //metodo get set credito
    void setCredito(Credito credito){
        this.credito = credito;
    }

    Credito getCredito(){
        return credito;
    }

    //metodo adicionar e remover aposta
    public void adicionarAposta(Aposta aposta){
        listaDeApostas.add(aposta);
    }

    public void removerAposta(Aposta aposta){
        listaDeApostas.remove(aposta);
    }
}
