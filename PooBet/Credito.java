package PooBet;

public class Credito {
    //att
    double saldo;
    String validade;
    String moeda;
    boolean bloqueado;
    private Jogador jogador;

    //met
    //metodo get set saldo
    void setSaldo(double saldo){
        this.saldo += saldo;
    }

    double getSaldo(){
        return saldo;
    }

    //metodo get set validade
    void setValidade(String validade){
        this.validade = validade;
    }

    String getValidade(){
        return validade;
    }

    //metodo get set moeda
    void setMoeda(String moeda){
        this.moeda = moeda;
    }

    String getMoeda(){
        return moeda;
    }

    //metodo get set bloqueado
    void setBloqueado(boolean bloqueado){
        this.bloqueado = bloqueado;
    }

    boolean getBloqueado(){
        return bloqueado;
    }

    void setJogador(Jogador jogador){
        this.jogador = jogador;
    }

}
