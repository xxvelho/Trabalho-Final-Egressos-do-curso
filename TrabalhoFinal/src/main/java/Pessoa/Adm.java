package Pessoa;
import java.io.Serializable;
import java.util.Hashtable;

public class Adm implements Serializable{
    protected String login;
    protected String senha;
    private Hashtable<String, String> senhasCoordenadores;
    private Hashtable<String, Coord> coordenadores;
    

    //construtor
    public Adm(String login, String senha) {
        this.login = login;
        this.senha = senha;
        senhasCoordenadores = new Hashtable<>();
        coordenadores = new Hashtable<>();
    }
    public Adm(){
        
    }

    //getters and setters
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Hashtable<String, String> getSenhasCoordenadores() {
        return senhasCoordenadores;
    }
    public void setSenhasCoordenadores(Hashtable<String, String> senhasCoordenadores) {
        this.senhasCoordenadores = senhasCoordenadores;
    }
    public Hashtable<String, Coord> getCoordenadores() {
        return coordenadores;
    }
    public void setCoordenadores(Hashtable<String, Coord> coordenadores) {
        this.coordenadores = coordenadores;
    }

    //toString
    @Override
    public String toString() {
        return "Adm{" + 
                "login = " + login + 
                ", senha = " + senha + 
                ",\n" +
                "coordenadores = [ " + coordenadores +
                ",\n" +
                "senhas coordenadores = [ " + senhasCoordenadores +
                " ]" +
                '}';
    }

    
    
}