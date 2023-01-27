package InterfaceGrafica.coord;

import java.io.Serializable;

public final class Chaves implements Serializable {
    String loginCoordenador;
    String cpfEgresso;

    public Chaves(String loginCoordenador, String cpfEgresso) {
        this.loginCoordenador = loginCoordenador;
        this.cpfEgresso = cpfEgresso;
    }

    public String getLoginCoordenador() {
        return loginCoordenador;
    }

    public void setLoginCoordenador(String loginCoordenador) {
        this.loginCoordenador = loginCoordenador;
    }

    public String getCpfEgresso() {
        return cpfEgresso;
    }

    public void setCpfEgresso(String cpfEgresso) {
        this.cpfEgresso = cpfEgresso;
    }

    @Override
    public String toString() {
        return "Chaves{" + 
                "loginCoordenador=" + loginCoordenador + 
                ", cpfEgresso=" + cpfEgresso + 
                '}';
    }

}
