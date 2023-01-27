package Adicionais;

import java.io.Serializable;

public final class Contato implements Serializable {
    protected String telefone;
    protected String email;
    protected String linkedin;

    //construtor
    public Contato(String telefone, String email, String linkedin) {
        this.telefone = telefone;
        this.email = email;
        this.linkedin = linkedin;
    }
    public Contato(String telefone, String email) {
        this.telefone = telefone;
        this.email = email;
    }

    //getters and setters
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getLinkedin() {
        return linkedin;
    }
    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    //toString
    @Override
    public String toString() {
        return "Contato{" + 
                "telefone = " + telefone + 
                ", email = " + email + 
                ", linkedin = " + linkedin + 
                '}';
    }
    
}