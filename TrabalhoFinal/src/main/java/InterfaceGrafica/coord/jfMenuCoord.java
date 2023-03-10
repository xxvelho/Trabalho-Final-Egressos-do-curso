package InterfaceGrafica.coord;

import InterfaceGrafica.coord.menu.CriandoEgresso.jfCriandoEgresso;
import InterfaceGrafica.coord.menu.EditandoEgresso.jfSelecionandoEgresso;
import InterfaceGrafica.coord.menu.EditandoEgresso.jfConsultarEgresso;
import InterfaceGrafica.coord.menu.jfEditandoCurso;
import InterfaceGrafica.jfPrincipal;
import Pessoa.Adm;
import Pessoa.Coord;
import Pessoa.Curso;
import Pessoa.ExAlunos;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class jfMenuCoord extends javax.swing.JFrame {
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
    //gerar pdf    
    public void gerandoPDF (ArrayList<ExAlunos> egressosList){
        Document docPDF = new Document();
        try {
            PdfWriter.getInstance(docPDF, new FileOutputStream("relatorio.pdf"));
            docPDF.open();
            Paragraph texto = new Paragraph();
            for (ExAlunos egresso : egressosList) {
                texto.add(new Chunk(egresso.mostraTudo()));
                docPDF.add(texto);
                docPDF.add(new Paragraph(" "));
                docPDF.add(new Paragraph(" "));
            }
        } catch (IOException e) {
            System.out.println("Deu ruim ao criar arquivo");
        } catch(DocumentException e){
            e.printStackTrace();
        }
        
        
     
        docPDF.close();
    }
    
    /**
     * Creates new form jfMenuCoord
     */
    public jfMenuCoord() {
        initComponents();
        //resgatando informacoes do arquivo
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
        bntLogoutCoord = new javax.swing.JButton();
        bntAddEgresso = new javax.swing.JButton();
        bnrEditEgresso = new javax.swing.JButton();
        bntConsultarEgresso = new javax.swing.JButton();
        bntGerarRelatorio = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU COORD");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Menu");

        bntLogoutCoord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntLogoutCoord.setText("Logout");
        bntLogoutCoord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLogoutCoordActionPerformed(evt);
            }
        });

        bntAddEgresso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntAddEgresso.setText("Adicionar egresso");
        bntAddEgresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAddEgressoActionPerformed(evt);
            }
        });

        bnrEditEgresso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bnrEditEgresso.setText("Editar egresso");
        bnrEditEgresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnrEditEgressoActionPerformed(evt);
            }
        });

        bntConsultarEgresso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntConsultarEgresso.setText("Consultar egresso");
        bntConsultarEgresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntConsultarEgressoActionPerformed(evt);
            }
        });

        bntGerarRelatorio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntGerarRelatorio.setText("(nao funciona)Gerar Relat??rio (PDF)*");
        bntGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGerarRelatorioActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Editar curso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bntAddEgresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bnrEditEgresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bntConsultarEgresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bntGerarRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(bntLogoutCoord)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(bntAddEgresso)
                .addGap(18, 18, 18)
                .addComponent(bnrEditEgresso)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(bntConsultarEgresso)
                .addGap(18, 18, 18)
                .addComponent(bntGerarRelatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bntLogoutCoord)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntLogoutCoordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLogoutCoordActionPerformed
        // TODO add your handling code here:
        jfPrincipal logout = new jfPrincipal();
        dispose();
        logout.setVisible(true);
    }//GEN-LAST:event_bntLogoutCoordActionPerformed

    private void bntAddEgressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAddEgressoActionPerformed
        // TODO add your handling code here:
        jfCriandoEgresso novo = new jfCriandoEgresso();
        dispose();
        novo.setVisible(true);
    }//GEN-LAST:event_bntAddEgressoActionPerformed

    private void bntGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGerarRelatorioActionPerformed
        // TODO add your handling code here:
        //pegabdo itens
        Hashtable<String, Coord> auxListCoord = admRei.getCoordenadores();
        Coord coordAtual = auxListCoord.get(chaves.getLoginCoordenador());
        Curso curso = coordAtual.getCurso();
        Hashtable<String, ExAlunos> auxEgressoList = curso.getEgressos();
        ArrayList<ExAlunos> egressoList = new ArrayList<>();
        
        for (ExAlunos egresso : auxEgressoList.values()) {
            egressoList.add(egresso);
        }
        
        gerandoPDF(egressoList);
        JOptionPane.showMessageDialog(null, "PDF criado.");
    }//GEN-LAST:event_bntGerarRelatorioActionPerformed

    private void bnrEditEgressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnrEditEgressoActionPerformed
        // TODO add your handling code here:
        jfSelecionandoEgresso novo = new jfSelecionandoEgresso();
        dispose();
        novo.setVisible(true);
    }//GEN-LAST:event_bnrEditEgressoActionPerformed

    private void bntConsultarEgressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntConsultarEgressoActionPerformed
        // TODO add your handling code here:
        jfConsultarEgresso novo = new jfConsultarEgresso();
        dispose();
        novo.setVisible(true);
    }//GEN-LAST:event_bntConsultarEgressoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jfEditandoCurso novo = new jfEditandoCurso();
        dispose();
        novo.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(jfMenuCoord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfMenuCoord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfMenuCoord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfMenuCoord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfMenuCoord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnrEditEgresso;
    private javax.swing.JButton bntAddEgresso;
    private javax.swing.JButton bntConsultarEgresso;
    private javax.swing.JButton bntGerarRelatorio;
    private javax.swing.JButton bntLogoutCoord;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
