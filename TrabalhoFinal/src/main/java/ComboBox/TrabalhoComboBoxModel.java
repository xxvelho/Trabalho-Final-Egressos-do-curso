package ComboBox;

import Adicionais.Trabalho;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class TrabalhoComboBoxModel extends AbstractListModel implements ComboBoxModel, Serializable{
    private ArrayList<Trabalho> dados;
    private Trabalho trabalhoSelecionado;

    public TrabalhoComboBoxModel() {
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
        if(anItem instanceof Trabalho){
            this.trabalhoSelecionado = (Trabalho) anItem;
            fireContentsChanged(this.dados, 0, this.dados.size());
        }
    }

    @Override
    public Object getSelectedItem() {
        return this.trabalhoSelecionado;
    }
    
    public void addTrabalho(Trabalho trabalho){
        this.dados.add(trabalho);
    }
    public void reset(){
        this.dados.clear();
    }
    
    
    
}
