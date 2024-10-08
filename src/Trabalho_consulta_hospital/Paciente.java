package Trabalho_consulta_hospital;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Paciente {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private ArrayList<Atendimento> atendimentos;

    public Paciente(){
        //this.nome = nome;
        //this.sobrenome = sobrenome;
        //this.dataNascimento = dataNascimento;
        atendimentos = new ArrayList<Atendimento>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ArrayList<Atendimento> getAtendimentos(){
        return atendimentos;
    }
    public void adicionarConsulta(Atendimento atendimento){
        atendimentos.add(atendimento);
    }

    public int getIdade(){
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        return periodo.getYears();
    }

    @Override
    public String toString(){
        String retorno = "Nome: "+nome+" "+sobrenome;
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dataNascimento);
        String data = formatoBr.format(this.dataNascimento);
        retorno += "Data de nascimento: "+ data;
        retorno += "Idade: "+getIdade();
        return retorno;
    }
}
