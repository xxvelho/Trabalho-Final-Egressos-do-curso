package Adicionais;

import java.io.Serializable;

public class Formacao implements Serializable {
    protected String nivel;
    protected String curso;
    protected String data;
    protected String instituicao;
    protected String descricao;

    //construtor
    public Formacao(String nivel, String curso, String instituicao, String data, String descricao) {
        this.nivel = nivel;
        this.curso = curso;
        this.data = data;
        this.instituicao = instituicao;
        this.descricao = descricao;
    }
    public Formacao() {
    }
    
    
    //getters and setters
    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getInstituicao() {
        return instituicao;
    }
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString() {
        return  curso + " - " + instituicao;
    }
    
    public String mostrando(){
        return "\n\nNivel: " + nivel + 
                ", Curso: " + curso + 
                ", Instituicao: " + instituicao + 
                "\nConclusão: " + data + 
                ", Descricao: " + descricao +
                "\n";
    }
}
