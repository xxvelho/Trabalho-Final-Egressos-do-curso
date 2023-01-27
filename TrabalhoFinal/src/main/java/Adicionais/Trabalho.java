package Adicionais;

import java.io.Serializable;

public class Trabalho implements Serializable {
    protected String salario;
    protected String empresa;
    protected String local;
    protected String cargo;
    protected String descricao;
    protected String dataInicio, dataFim;

    //contrutor
    public Trabalho(String empresa, String cargo, String salario, String local,
            String dtInicio, String dtFim, String descricao) {
        this.salario = salario;
        this.empresa = empresa;
        this.local = local;
        this.cargo = cargo;
        this.dataInicio = dtInicio;
        this.dataFim = dtFim;
        this.descricao = descricao;
    }
    public Trabalho() {
    }
    
    //getters and setters
    public String getSalario() {
        return salario;
    }
    public void setSalario(String salario) {
        this.salario = salario;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    //toString
    @Override
    public String toString() {
        return  empresa + " - " + cargo;
    }
    
    public String mostrando(){
        return "\n\nEmpresa: " + empresa + 
                ", Cargo: " + cargo + 
                ", Salário: " + salario + 
                ", Local: " + local + 
                "\nData Inicio: " + dataInicio + 
                ", Data Fim: " + dataFim + 
                ", Descricao: " + descricao +
                "\n";
    }
}