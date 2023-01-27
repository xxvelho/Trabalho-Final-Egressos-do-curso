package InterfaceGrafica.coord.menu.EditandoEgresso;

import Adicionais.Trabalho;
import InterfaceGrafica.coord.Chaves;
import Pessoa.Adm;
import Pessoa.Coord;
import Pessoa.Curso;
import Pessoa.ExAlunos;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class jfAdicionandoTrabalho extends javax.swing.JFrame {
    private Adm admRei;
    private Chaves chaves;

    //salvando arquivo
    public static void gravarArquivo(Adm adm)
            throws IOException {
        ObjectOutputStream arquivo =
                new ObjectOutputStream(
                        new FileOutputStream("backup.dat")
                );

        arquivo.writeObject(adm);
        arquivo.close();
    }
    //salvar login
    public static void salvarLogado(Chaves keys)
            throws IOException {
        ObjectOutputStream arquivo =
                new ObjectOutputStream(
                        new FileOutputStream("logado.dat")
                );

        arquivo.writeObject(keys);
        arquivo.close();
    }
    //recuperando arquivo
    public static Adm lerArquivo()
            throws IOException, ClassNotFoundException {
        Adm novo;

        ObjectInputStream arquivo =
                new ObjectInputStream(
                        new FileInputStream("backup.dat")
                );
        
        novo = (Adm) arquivo.readObject();
        arquivo.close();
        return novo;
    }
    //recuperar chaves
    public static Chaves recuperarLogado()
            throws IOException, ClassNotFoundException {
        Chaves novo;

        ObjectInputStream arquivo =
                new ObjectInputStream(
                        new FileInputStream("logado.dat")
                );
        
        novo = (Chaves) arquivo.readObject();
        arquivo.close();
        return novo;
    }


    
    /**
     * Creates new form jfTelaTresCriandoEgresso
     */
    public jfAdicionandoTrabalho() {
        initComponents();
        //resgatando informacoes do arquivo
        try {
            admRei = lerArquivo();
            chaves = recuperarLogado();
        }catch(ClassNotFoundException e){
            System.out.println("Erro ;-;");
        }catch(IOException e){
            System.out.println("Erro ao tentar ler arquivo");
        }
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbCargo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        txtLocal = new javax.swing.JTextField();
        txtNomeEmpresa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bntAdd = new javax.swing.JButton();
        bntVoltar = new javax.swing.JButton();
        bntSalvar = new javax.swing.JButton();
        txtDataInicio = new javax.swing.JFormattedTextField();
        txtDataFim = new javax.swing.JFormattedTextField();
        txtSalario = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INFORMACOES ADICIONAIS EGRESSO");

        cbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Estágio", "Trabalho", "Empreendedor" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Cargo:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nome da empresa:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Salario:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Local:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Descrição:");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Data inicio:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Data fim:");

        bntAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bntAdd.setText("Adicionar");
        bntAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAddActionPerformed(evt);
            }
        });

        bntVoltar.setText("Voltar");
        bntVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVoltarActionPerformed(evt);
            }
        });

        bntSalvar.setText("Salvar");
        bntSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalvarActionPerformed(evt);
            }
        });

        try {
            txtDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtDataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Empregos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1)
                                    .addComponent(txtLocal)
                                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bntAdd)
                        .addGap(174, 174, 174))))
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bntVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntSalvar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntSalvar)
                    .addComponent(bntVoltar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVoltarActionPerformed
        // TODO add your handling code here:
        jfTelaDoisEditandoEgresso novo = new jfTelaDoisEditandoEgresso();
        dispose();
        novo.setVisible(true);
    }//GEN-LAST:event_bntVoltarActionPerformed

    private void bntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarActionPerformed
        // TODO add your handling code here:
        //salvando arquivos
        try{
            gravarArquivo(admRei);
            JOptionPane.showMessageDialog(null, "Egresso salvo");
            jfTelaDoisEditandoEgresso novo = new jfTelaDoisEditandoEgresso();
            dispose();
            novo.setVisible(true);
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar");
        }
    }//GEN-LAST:event_bntSalvarActionPerformed

    private void bntAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAddActionPerformed
        // TODO add your handling code here:
        
        //pegando dados do adm
        Hashtable<String, Coord> auxListCoord = admRei.getCoordenadores();
        Coord coordAtual = auxListCoord.get(chaves.getLoginCoordenador());
        Curso curso = coordAtual.getCurso();
        Hashtable<String, ExAlunos> auxListEgressos = curso.getEgressos();
        //pegando dados da tela
        String nomeEmpresa = txtNomeEmpresa.getText();
        String cargo = cbCargo.getSelectedItem().toString();
        String dataInicio = txtDataInicio.getText();
        String dataFim = txtDataFim.getText();
        String salario = txtSalario.getText();
        String local = txtLocal.getText();
        String descricao = txtDescricao.getText();
        
        
        if(cargo.equals("Nenhum")){
            JOptionPane.showMessageDialog(null, "Selecione um cargo");
        }
        else{
            if(!nomeEmpresa.equals("") && !dataInicio.equals("  /  /    ") 
                    && !salario.equals("") && !local.equals("")){
                //criando trabalho
                Trabalho trabalho = new Trabalho(nomeEmpresa, cargo, salario,
                        local, dataInicio, dataFim, descricao);

                /*add trabalhos*/
                //pegando egresso
                ExAlunos egresso = auxListEgressos.get(chaves.getCpfEgresso());
                ArrayList<Trabalho> trabalhosList = egresso.getTrabalhos();
                trabalhosList.add(trabalho);
                
                //colocando de voltar em adm rei
                egresso.setTrabalhos(trabalhosList);
                //colocando de voltar em adm rei
                auxListEgressos.put(chaves.getCpfEgresso(), egresso);
                curso.setEgressos(auxListEgressos);
                coordAtual.setCurso(curso);
                auxListCoord.put(chaves.getLoginCoordenador(), coordAtual);
                admRei.setCoordenadores(auxListCoord);
                JOptionPane.showMessageDialog(null, "Trabalho adicionada");
            }else{
                JOptionPane.showMessageDialog(null, "Alguns campos não podem ficar vazio");
            }
        }        
    }//GEN-LAST:event_bntAddActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jfAdicionandoTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfAdicionandoTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfAdicionandoTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfAdicionandoTrabalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfAdicionandoTrabalho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAdd;
    private javax.swing.JButton bntSalvar;
    private javax.swing.JButton bntVoltar;
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField txtDataFim;
    private javax.swing.JFormattedTextField txtDataInicio;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtNomeEmpresa;
    private javax.swing.JFormattedTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}