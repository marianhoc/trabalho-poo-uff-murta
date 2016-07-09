/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControleNovoItem;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author copes
 */
public class TelaCaixaManual extends javax.swing.JFrame {
    

    public TelaCaixaManual() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
       Estoque estoque = Estoque.getEstoque();
       
        topPanel = new javax.swing.JPanel();
        labelUltimoItem = new javax.swing.JLabel();
        textLabelUltimoItem = new javax.swing.JLabel();
        painelEsquerdo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        labelCodigo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        labelNome = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelTotalItem = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelTotalCompra = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detalheDaVenda = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mercado");
        setBackground(new java.awt.Color(51, 51, 51));

        topPanel.setBackground(new java.awt.Color(255, 204, 204));
        topPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        topPanel.setName("ultimoItem"); // NOI18N

        labelUltimoItem.setText("Último Item");

        textLabelUltimoItem.setBackground(new java.awt.Color(255, 255, 255));
        textLabelUltimoItem.setText("Ultimo item");
        textLabelUltimoItem.setOpaque(true);

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textLabelUltimoItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addComponent(labelUltimoItem)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelUltimoItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textLabelUltimoItem, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelEsquerdo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painelEsquerdo.setLayout(new java.awt.GridLayout(8, 2));

        jLabel1.setLabelFor(labelCodigo);
        jLabel1.setText("Unidades - Gramas");
        painelEsquerdo.add(jLabel1);

        jSpinner1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        painelEsquerdo.add(jSpinner1);

        labelCodigo.setBackground(new java.awt.Color(255, 255, 255));
        labelCodigo.setText("Codigo");
        labelCodigo.setOpaque(true);
        painelEsquerdo.add(labelCodigo);
        
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            //String[] strings = { "CODIGOS", "Item 2", "Item 3", "Item 4", "Item 5" };
            String[] strings = estoque.pegarCodigoDosProdutos();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        painelEsquerdo.add(jScrollPane2);

        labelNome.setBackground(new java.awt.Color(255, 255, 255));
        labelNome.setText("Nome");
        painelEsquerdo.add(labelNome);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            

            //String[] strings = { "ESTOQUE", "Item 2", "Item 3", "Item 4", "Item 5" };
            String[] strings = estoque.pegarNomeDeProdutos();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList2);

        painelEsquerdo.add(jScrollPane3);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setLabelFor(labelNome);
        jLabel10.setText("Valor unitario/ no quilo");
        jLabel10.setOpaque(true);
        painelEsquerdo.add(jLabel10);

        jLabel7.setText("-------"); //Valor unitario
        painelEsquerdo.add(jLabel7);

        jLabel8.setLabelFor(labelTotalItem);
        jLabel8.setText("Total do Item");
        painelEsquerdo.add(jLabel8);

        labelTotalItem.setBackground(new java.awt.Color(255, 255, 255));
        labelTotalItem.setOpaque(true);
        painelEsquerdo.add(labelTotalItem);

        jLabel2.setText("TOTAL COMPRA");
        painelEsquerdo.add(jLabel2);

        labelTotalCompra.setBackground(new java.awt.Color(255, 255, 255));
        labelTotalCompra.setOpaque(true);
        painelEsquerdo.add(labelTotalCompra);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        detalheDaVenda.setColumns(20);
        detalheDaVenda.setRows(5);
        detalheDaVenda.setFocusable(false);
        detalheDaVenda.setText("\tCOLOCAR AQUI O DETALHE DA VENDA\n\n \tseparando por linhas"
                + "\n\n \tseparando por linhas"
                + "\n\n \tseparando por linhas"
                + "\n\n \tseparando por linhas"
                + "\n\n \tseparando por linhas"
                + "\n\n \tseparando por linhas"
                + "\n\n \tseparando por linhas"
                + "\n\n \tseparando por linhas"
                + "\n\n \tseparando por linhas"
                + "\n\n \tseparando por linhas"
                + "\n\n \tseparando por linhas"
                + "\n\n \tseparando por linhas"
                + "\n\n \tseparando por linhas");
        jScrollPane1.setViewportView(detalheDaVenda);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 0, 0));
        jPanel6.setLayout(new java.awt.GridLayout(1, 6, 2, 5));

        jLabel4.setText("Operador");
        jPanel6.add(jLabel4);

        jLabel5.setText("Caixa");
        jPanel6.add(jLabel5);

        jLabel6.setText("Dia");
        jPanel6.add(jLabel6);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(painelEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelEsquerdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        topPanel.getAccessibleContext().setAccessibleName("");
        
        
        // Listeners
        
        jList2.addListSelectionListener(new ControleNovoItem(estoque.pegarNomeDeProdutos(), textLabelUltimoItem));
        jList1.addListSelectionListener(new ControleNovoItem(estoque.pegarCodigoDosProdutos(), textLabelUltimoItem));
        
        
        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel 
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
  
        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCaixa().setVisible(true);
            }
        });
    }
  */
    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel textLabelUltimoItem;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea detalheDaVenda;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTotalCompra;
    private javax.swing.JLabel labelTotalItem;
    private javax.swing.JLabel labelUltimoItem;
    private javax.swing.JPanel painelEsquerdo;
    private javax.swing.JPanel topPanel;
    // End of variables declaration                   
}


/*

TODO  Leo

fazer com que a janela mostre um ArrayList <Item> 
e um botao para fechar a compra  (Venda) que vai salvar (adicionar no final) a Venda no ArrayList <Venda> ARQUIVO LEO
 
==========================================================


TODO  Evandro
por outro lado
fazer uma janela pro gerente que consiga recuperar o arquivo como ArrayList<Vendas>


*/