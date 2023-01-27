package Pessoa;

import java.io.Serializable;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Curso implements Serializable {
    protected String nome;
    protected String departamento;
    private Hashtable<String, ExAlunos> egressos;

    public Curso(String nomeCurso, String departamentoCurso) {
        this.nome = nomeCurso;
        this.departamento = departamentoCurso;
        egressos = new Hashtable<>();
    }
    public Curso() {
    }
    
    //getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public Hashtable<String, ExAlunos> getEgressos() {
        return egressos;
    }
    public void setEgressos(Hashtable<String, ExAlunos> egressos) {
        this.egressos = egressos;
    }
    
    //metodos
    public boolean addEgresso(ExAlunos novo){
        if(!egressos.containsKey(novo.getCpf())){
            egressos.put(novo.getCpf(), novo);
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "CPF já cadrastrado. Tente ir em [editar egresso]");
            return false;
        }
    }
    
    public boolean editandoEgresso(ExAlunos novo){
        this.egressos.put(novo.getCpf(), novo);
        return true;    
    }

    @Override
    public String toString() {
        return "Curso{" + 
                "nome = " + nome + 
                ", departamento = " + departamento + 
                ", egressos = " + egressos + 
                '}';
    }
    
}
