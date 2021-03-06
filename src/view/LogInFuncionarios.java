/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import bd.Conexao;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import model.*;
/**
 *
 * @author mariano
 */
public class LogInFuncionarios extends javax.swing.JFrame {
    private Map<Integer, Funcionario> funcionarios;
    private StringBuffer texto = new StringBuffer();
    /**
     * Creates new form LogInFuncionarios
     */
    public LogInFuncionarios() {
        initComponents();
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label2 = new java.awt.Label();
        cpfLabel = new javax.swing.JLabel();
        caixaLabel = new javax.swing.JLabel();
        cpfTextField = new javax.swing.JTextField();
        caixaTextField = new javax.swing.JTextField();
        logInButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label2.setText("Log in de Funcionarios");

        cpfLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cpfLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cpfLabel.setText("CPF");

        caixaLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        caixaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caixaLabel.setText("Caixa");

        cpfTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfTextFieldActionPerformed(evt);
            }
        });

        caixaTextField.setToolTipText("");

        logInButton.setText("LOG IN");
        logInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                logInButtonMouseReleased(evt);
            }
        });
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });
        logInButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                logInButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logInButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cpfLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(cpfTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(caixaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(caixaTextField)))
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cpfLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(caixaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cpfTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(caixaTextField))
                .addGap(18, 18, 18)
                .addComponent(logInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cpfTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfTextFieldActionPerformed

    private void logInButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInButtonMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_logInButtonMouseReleased

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        Conexao sql = Conexao.getInstance();
        String cpf = cpfTextField.getText();
        Funcionario f = sql.carregarFuncionariosDeLogIn(funcionarios,cpf);
        //sql.getConnection();
        
        
        
        try{ 
            System.out.println(cpf);
            System.out.println(f.getNome());
            if (f.isIsManager() == 0){
                    new TelaCaixaManual(f,Integer.parseInt(caixaTextField.getText()),
                    new Date(evt.getWhen())).setVisible(true);
            }else  {
                new TelaGerente().setVisible(true);
            }
                           
                       
            
        }
        catch(NullPointerException npe){
            cpfTextField.setText("- SEM CADASTRO. NPE-");
        }catch(Exception e){
            cpfTextField.setText("- SEM CADASTRADO -");
        } 
       
    }//GEN-LAST:event_logInButtonActionPerformed

    private void logInButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_logInButtonKeyPressed
        
        
        if(evt.getKeyCode()==10){
            new TelaCaixaManual(new Funcionario("Mariano", "copes", cpfTextField.getText(), 0 ),
                            Integer.parseInt(caixaTextField.getText()), new Date(evt.getWhen())).setVisible(true);
        }else{
            texto.append(evt.getKeyChar());            
            if (texto.toString().equals("manager")){
                new TelaGerente().setVisible(true);
            }
        }
    }//GEN-LAST:event_logInButtonKeyPressed

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
            java.util.logging.Logger.getLogger(LogInFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new LogInFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel caixaLabel;
    private javax.swing.JTextField caixaTextField;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JTextField cpfTextField;
    private java.awt.Label label2;
    private javax.swing.JButton logInButton;
    // End of variables declaration//GEN-END:variables
}
