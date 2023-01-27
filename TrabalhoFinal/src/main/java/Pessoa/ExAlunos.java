package Pessoa;

import Adicionais.Contato;
import Adicionais.Formacao;
import Adicionais.Trabalho;
import java.io.Serializable;
import java.util.ArrayList;

public class ExAlunos implements Serializable{
    protected String nome;
    protected String cpf;
    protected String data;
    protected Contato contatos;
    protected ArrayList<Formacao> formacoes;
    protected ArrayList<Trabalho> trabalhos; 

    //construtor
    public ExAlunos(String nome, String cpf, String data) {
        this.nome = nome;
        this.cpf = cpf;
        this.data = data;
        formacoes = new ArrayList();
        trabalhos = new ArrayList<>();
    }
    
    //getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Contato getContatos() {
        return contatos;
    }
    public void setContatos(Contato contatos) {
        this.contatos = contatos;
    }
    public ArrayList<Formacao> getFormacoes() {
        return formacoes;
    }
    public void setFormacoes(ArrayList<Formacao> formacoes) {
        this.formacoes = formacoes;
    }
    public ArrayList<Trabalho> getTrabalhos() {
        return trabalhos;
    }
    public void setTrabalhos(ArrayList<Trabalho> trabalhos) {
        this.trabalhos = trabalhos;
    }
    
    public void adicionandoTrabalho(Trabalho trabalho){
        this.trabalhos.add(trabalho);
    }
    public void adicionandoFormacao(Formacao formacao){
        this.formacoes.add(formacao);
    }
    
    public void removendoTrabalho(Trabalho trabalho){
        this.trabalhos.remove(trabalho);
    }
    public void removendoFormacao(Formacao formacao){
        this.formacoes.remove(formacao);
    }
    
    
    //toString
    @Override
    public String toString() {
        return nome + " - " + cpf;
    }
    public String mostraTudo(){
        String str = "Nome: "+ this.nome +
                "\nCPF: " + this.cpf +
                "\nConclusão: " + this.data +
                "\n\nContatos:\n[" + this.contatos + 
                "]\n" +
                "\nFormações:\n[" + this.formacoes + 
                "]\n" +
                "\nFormações:\n[" + this.trabalhos +
                "]\n";
        
        return str;
    }
    
}