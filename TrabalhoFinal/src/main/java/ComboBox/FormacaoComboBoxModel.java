package ComboBox;

import Adicionais.Formacao;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class FormacaoComboBoxModel extends AbstractListModel implements ComboBoxModel, Serializable{
    private ArrayList<Formacao> dados;
    private Formacao formacaoSelecionada;

    public FormacaoComboBoxModel() {
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
        if(anItem instanceof Formacao){
            this.formacaoSelecionada = (Formacao) anItem;
            fireContentsChanged(this.dados, 0, this.dados.size());
        }
    }

    @Override
    public Object getSelectedItem() {
        return this.formacaoSelecionada;
    }
    
    public void addFormacao(Formacao form){
        this.dados.add(form);
    }
    public void reset(){
        this.dados.clear();
    }
    
}
