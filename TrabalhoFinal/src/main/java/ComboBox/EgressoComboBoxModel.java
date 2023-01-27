package ComboBox;

import Pessoa.ExAlunos;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class EgressoComboBoxModel extends AbstractListModel implements ComboBoxModel, Serializable{
    private ArrayList<ExAlunos> dados;
    private ExAlunos egressoSelecionado;

    public EgressoComboBoxModel() {
        dados = new ArrayList<>();
    }
    
    @Override
    public int getSize() {
        return dados.size();
    }

    @Override
    public Object getElementAt(int index) {
        return this.dados.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        if(anItem instanceof ExAlunos){
            this.egressoSelecionado = (ExAlunos) anItem;
            fireContentsChanged(this.dados, 0, this.dados.size());
        }
    }

    @Override
    public Object getSelectedItem() {
        return this.egressoSelecionado;
    }
    
    public void addEgresso(ExAlunos egresso){
        this.dados.add(egresso);
    }
    public void reset(){
        this.dados.clear();
    }
    
    
    
}
