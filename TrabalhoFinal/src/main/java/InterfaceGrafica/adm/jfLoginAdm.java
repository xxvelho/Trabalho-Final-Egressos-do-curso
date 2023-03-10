package InterfaceGrafica.adm;

import InterfaceGrafica.jfPrincipal;
import Pessoa.Adm;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;

public class jfLoginAdm extends javax.swing.JFrame {
    private Adm admRei;
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
    
    /**
     * Creates new form jfLoginAdm
     */
    public jfLoginAdm() {
        initComponents();
        try {
            admRei = lerArquivo();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLoginAdm = new javax.swing.JTextField();
        bntEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bntVoltar = new javax.swing.JButton();
        txtSenhaAdm = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN ADM");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Login:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Senha:");

        txtLoginAdm.setText("admin");
        txtLoginAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginAdmActionPerformed(evt);
            }
        });

        bntEntrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bntEntrar.setText("Entrar");
        bntEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEntrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Entrar como Administrador");

        bntVoltar.setText("Voltar");
        bntVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVoltarActionPerformed(evt);
            }
        });

        txtSenhaAdm.setText("admin");
        txtSenhaAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaAdmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLoginAdm, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(txtSenhaAdm)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bntVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(bntEntrar)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoginAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSenhaAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bntEntrar)
                .addGap(39, 39, 39)
                .addComponent(bntVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginAdmActionPerformed

    private void bntVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVoltarActionPerformed
        // TODO add your handling code here:
        jfPrincipal voltar = new jfPrincipal();
        dispose();
        voltar.setVisible(true);
    }//GEN-LAST:event_bntVoltarActionPerformed

    private void txtSenhaAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaAdmActionPerformed

    private void bntEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEntrarActionPerformed
        // TODO add your handling code here:
        if(txtLoginAdm.getText().equals(admRei.getLogin()) && 
                txtSenhaAdm.getText().equals(admRei.getSenha()))
        {
            jfMenuAdm logado = new jfMenuAdm();
            dispose();
            logado.setVisible(true);
        }
        else if(!txtLoginAdm.getText().equals(admRei.getLogin())){
            JOptionPane.showMessageDialog(null, "Usu??rio incorreto!");
        }else{
            JOptionPane.showMessageDialog(null, "Senha incorreta!");
        }
    }//GEN-LAST:event_bntEntrarActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfLoginAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntEntrar;
    private javax.swing.JButton bntVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtLoginAdm;
    private javax.swing.JPasswordField txtSenhaAdm;
    // End of variables declaration//GEN-END:variables
}