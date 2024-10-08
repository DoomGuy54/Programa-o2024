package Aula_28_06.exercicio_Banco;

import java.util.Random;

public class Conta {

    private String titular;
    private String identificador;
    private String senha;
    protected float saldo;

    public Conta (String titular, String senha){
        this.titular = titular;
        this.senha = senha;
        geraIdenficador();
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void depositar (float valor){
        saldo += valor;
    }

    private void geraIdenficador(){
        String identificador = "";
        Random aleatorio = new Random();

        for(int i=0; i<4; i++){

            identificador+=(char)aleatorio.nextInt(65, 90);
        }
        identificador+=aleatorio.nextInt(1000,2000);
        this.identificador = identificador;

    }

    public String getIdentificador(){
        return identificador;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean validaAcesso(String identificador, String senha){
        return this.identificador.equals(identificador) && this.senha.equals(senha);
    }

}
