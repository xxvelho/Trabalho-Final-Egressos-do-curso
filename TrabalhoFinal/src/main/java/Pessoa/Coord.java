package Pessoa;

import java.io.Serializable;

public class Coord extends Adm implements Serializable{
    protected Curso curso;
    protected boolean cursoFeito;
    
    //construtor
    public Coord(String login, String senha) {
        super(login, senha);
        this.cursoFeito = false;
    }
    public Coord(String login) {
        super(login, null);
    }
    //getters and setters
    @Override
    public String getLogin() {
        return login;
    }
    @Override
    public void setLogin(String login) {
        this.login = login;
    }
    @Override
    public String getSenha() {
        return senha;
    }
    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public boolean isCursoFeito() {
        return cursoFeito;
    }
    public void setCursoFeito(boolean cursoFeito) {
        this.cursoFeito = cursoFeito;
    }
    
    //metodos
    public boolean criarCurso(String nomeCurso, String departamentoCurso){
        curso = new Curso(nomeCurso, departamentoCurso);
        if(curso != null){
            this.cursoFeito = true;
        }
        return false;
    }

    //toString
    @Override
    public String toString() {
        return "Coord{" + 
                "login = " + super.login + 
                ", senha = " + super.senha +
                '}';
    }
    
}