package InterfaceGrafica.adm;

import Pessoa.Adm;
import Pessoa.Coord;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class jfCriandoCoord extends javax.swing.JFrame {
    private Adm admRei;
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
     * Creates new form jfCriandoCoord
     */
    public jfCriandoCoord() {
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
        jLabel3 = new javax.swing.JLabel();
        bntAddCoord = new javax.swing.JButton();
        txtLoginCoord = new javax.swing.JTextField();
        bntVoltarMenuAdm = new javax.swing.JButton();
        txtSenhaCoord = new javax.swing.JTextField();
        bntSalvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNomeDepartamento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNomeCurso = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRIANDO COORDENADORES");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Login:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Senha:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Criando Coordenadores");

        bntAddCoord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntAddCoord.setText("Criar");
        bntAddCoord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAddCoordActionPerformed(evt);
            }
        });

        bntVoltarMenuAdm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bntVoltarMenuAdm.setText("Voltar");
        bntVoltarMenuAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVoltarMenuAdmActionPerformed(evt);
            }
        });

        bntSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntSalvar.setText("Salvar");
        bntSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalvarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Curso:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Departamento:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bntVoltarMenuAdm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntSalvar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLoginCoord)
                    .addComponent(txtSenhaCoord)
                    .addComponent(txtNomeDepartamento)
                    .addComponent(txtNomeCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bntAddCoord)
                        .addGap(186, 186, 186))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtLoginCoord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSenhaCoord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bntAddCoord)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntVoltarMenuAdm)
                    .addComponent(bntSalvar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntVoltarMenuAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVoltarMenuAdmActionPerformed
        // TODO add your handling code here:
        jfMenuAdm menuAdm = new jfMenuAdm();
        dispose();
        menuAdm.setVisible(true);
    }//GEN-LAST:event_bntVoltarMenuAdmActionPerformed

    private void bntAddCoordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAddCoordActionPerformed
        // TODO add your handling code here:
        Hashtable<String, String> aux;
        Hashtable<String, Coord> auxCoord;
        Coord coordenador;
        
        aux = admRei.getSenhasCoordenadores();
        auxCoord = admRei.getCoordenadores();
        
        String nomeCurso = txtNomeCurso.getText();
        String departamento = txtNomeDepartamento.getText();
        String login = txtLoginCoord.getText();
        String senha = txtSenhaCoord.getText();
        
        if(!nomeCurso.equals("") && !departamento.equals("") && 
                !login.equals("") && !senha.equals("")){
            if(!aux.containsKey(login)){
                aux.put(login, senha);
                admRei.setSenhasCoordenadores(aux);

                //criando coordenador
                coordenador = new Coord(login, senha);

                //criando curso
                coordenador.criarCurso(nomeCurso, departamento);

                //adicionando coordenador
                auxCoord.put(login, coordenador);
                admRei.setCoordenadores(auxCoord);
                JOptionPane.showMessageDialog(null, "Login pra coordenador criado com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "J?? existe uma chave com esse login. Tente novamente!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Todos os itens sao obrigatorios");
        }
    }//GEN-LAST:event_bntAddCoordActionPerformed

    private void bntSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalvarActionPerformed
        // TODO add your handling code here:
        //salvando arquivos
        try{
            gravarArquivo(admRei);
            JOptionPane.showMessageDialog(null, "Arquivos salvos");
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
        }
    }//GEN-LAST:event_bntSalvarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfCriandoCoord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAddCoord;
    private javax.swing.JButton bntSalvar;
    private javax.swing.JButton bntVoltarMenuAdm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtLoginCoord;
    private javax.swing.JTextField txtNomeCurso;
    private javax.swing.JTextField txtNomeDepartamento;
    private javax.swing.JTextField txtSenhaCoord;
    // End of variables declaration//GEN-END:variables
}
