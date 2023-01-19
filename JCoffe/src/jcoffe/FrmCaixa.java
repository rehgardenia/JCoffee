package jcoffe;

import javax.swing.JOptionPane;

public class FrmCaixa extends javax.swing.JFrame {

    Pedido pedido;

    public FrmCaixa(Pedido p1) {
        initComponents();
        pedido = p1;
        TxtTotal.setText(p1.getTotal() + "");
        LPedido.setText("Pedido - " + p1.getComanda());
        LCliente.setText(p1.getCliente());
        // PnlComprovante.setVisible(false);
    }

    private FrmCaixa() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtGrpFormPag = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LblSair = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PnlComprovante = new javax.swing.JPanel();
        jCompra = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jDados = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtComp = new javax.swing.JTextArea();
        jtotal = new javax.swing.JLabel();
        BtnPagar = new javax.swing.JButton();
        BtnVoltar = new javax.swing.JButton();
        LPedido = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtValor = new javax.swing.JTextField();
        TxtTotal = new javax.swing.JTextField();
        RbtnDinheiro = new javax.swing.JRadioButton();
        RbtnCartao = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LCliente = new javax.swing.JLabel();
        TxtTroco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(104, 73, 38));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(43, 21, 8));

        LblSair.setBackground(new java.awt.Color(255, 255, 255));
        LblSair.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LblSair.setForeground(new java.awt.Color(183, 166, 138));
        LblSair.setText("X");
        LblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblSairMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(183, 166, 138));
        jLabel3.setText("Caixa JCOFFE");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 524, Short.MAX_VALUE)
                .addComponent(LblSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblSair)
                            .addComponent(jLabel3))
                        .addGap(11, 11, 11))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 50));

        PnlComprovante.setBackground(new java.awt.Color(183, 166, 138));
        PnlComprovante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PnlComprovante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCompra.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCompra.setText(" JCOFFEE - Comprovante  ");
        PnlComprovante.add(jCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 17, 271, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("     Item    -  Qtd  -  Preço Uni.(R$)  -  Total (R$)");
        PnlComprovante.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 300, -1));

        jDados.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jDados.setText("Cliente :                                    Pedido :");
        PnlComprovante.add(jDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 59, 279, 20));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("---------------------------------------------------------------------------");
        PnlComprovante.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 41, -1, 10));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("---------------------------------------------------------------------------");
        PnlComprovante.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 82, -1, 10));

        jScrollPane1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        TxtComp.setEditable(false);
        TxtComp.setBackground(new java.awt.Color(183, 166, 138));
        TxtComp.setColumns(20);
        TxtComp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TxtComp.setLineWrap(true);
        TxtComp.setRows(5);
        TxtComp.setAutoscrolls(false);
        TxtComp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtComp.setFocusable(false);
        TxtComp.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        TxtComp.setSelectionColor(new java.awt.Color(183, 166, 138));
        jScrollPane1.setViewportView(TxtComp);

        PnlComprovante.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 130, 320, 230));

        jtotal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jtotal.setText("TOTAL");
        jtotal.setName(""); // NOI18N
        PnlComprovante.add(jtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 270, 30));

        jPanel1.add(PnlComprovante, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 300, 420));

        BtnPagar.setBackground(new java.awt.Color(43, 21, 8));
        BtnPagar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnPagar.setForeground(new java.awt.Color(183, 166, 138));
        BtnPagar.setText("Pagar");
        BtnPagar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPagarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 130, 40));

        BtnVoltar.setBackground(new java.awt.Color(43, 21, 8));
        BtnVoltar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnVoltar.setForeground(new java.awt.Color(183, 166, 138));
        BtnVoltar.setText("Voltar");
        BtnVoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 130, 40));

        LPedido.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        LPedido.setForeground(new java.awt.Color(43, 21, 8));
        LPedido.setText("Pedido - **");
        jPanel1.add(LPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(43, 21, 8));
        jLabel4.setText("Valor:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(43, 21, 8));
        jLabel5.setText("Troco:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, 20));

        TxtValor.setBackground(new java.awt.Color(183, 166, 138));
        TxtValor.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        TxtValor.setForeground(new java.awt.Color(43, 21, 8));
        TxtValor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(TxtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 130, -1));

        TxtTotal.setEditable(false);
        TxtTotal.setBackground(new java.awt.Color(183, 166, 138));
        TxtTotal.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        TxtTotal.setForeground(new java.awt.Color(43, 21, 8));
        TxtTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(TxtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 220, -1));

        BtGrpFormPag.add(RbtnDinheiro);
        RbtnDinheiro.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        RbtnDinheiro.setForeground(new java.awt.Color(183, 166, 138));
        RbtnDinheiro.setText("Dinheiro");
        jPanel1.add(RbtnDinheiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        BtGrpFormPag.add(RbtnCartao);
        RbtnCartao.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        RbtnCartao.setForeground(new java.awt.Color(183, 166, 138));
        RbtnCartao.setText("Cartão");
        RbtnCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbtnCartaoActionPerformed(evt);
            }
        });
        jPanel1.add(RbtnCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(43, 21, 8));
        jLabel6.setText("Total:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(183, 166, 138));
        jLabel7.setText("Forma Pagamento:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, 30));

        LCliente.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        LCliente.setForeground(new java.awt.Color(43, 21, 8));
        LCliente.setText("Cliente ***");
        jPanel1.add(LCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 230, 30));

        TxtTroco.setEditable(false);
        TxtTroco.setBackground(new java.awt.Color(183, 166, 138));
        TxtTroco.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        TxtTroco.setForeground(new java.awt.Color(43, 21, 8));
        TxtTroco.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(TxtTroco, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_LblSairMouseClicked

    private void BtnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPagarActionPerformed

        if (RbtnCartao.isSelected()) {
            pedido.setFormaPagamento(RbtnCartao.getText());
            double valor = Double.parseDouble(TxtValor.getText());
            if (pedido.pagamento(valor) == true) {
                mostrarComprovante();
            }

        } else if (RbtnDinheiro.isSelected()) {
            pedido.setFormaPagamento(RbtnDinheiro.getText());
            if (TxtValor.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Valor não infomado..", "Pagamento", 0);
            } else {
                try {
                    double valor = Double.parseDouble(TxtValor.getText());
                    if (pedido.pagamento(valor) == true) {
                        TxtTroco.setText(pedido.getTroco() + "");
                      //  mostrarComprovante();
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor Invalido!", "Erro", 0);
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione a forma de pagamento!", "Pagamento", 1);
        }

    }//GEN-LAST:event_BtnPagarActionPerformed

    private void BtnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVoltarActionPerformed
        FrmMenu form1 = new FrmMenu();
        form1.setVisible(true);
    }//GEN-LAST:event_BtnVoltarActionPerformed

    private void RbtnCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbtnCartaoActionPerformed
        TxtValor.setText(pedido.getTotal() + "");
    }//GEN-LAST:event_RbtnCartaoActionPerformed
    public void mostrarComprovante() {
        String cliente = "Cliente :" + pedido.getCliente();
        String comanda = "Pedido : " + pedido.getComanda();
        jDados.setText(cliente + "           " + comanda);

        for (Item i : pedido.getItens()) {
            TxtComp.setText("  " + TxtComp.getText() + " " + i.getCafe().getNome() + "  -    " + i.getQtd()
                    + "   -    R$ " + i.getCafe().getPreco() + "    -    R$ " + (i.getQtd() * i.getCafe().getPreco()) + "\n  ");
        }
        jtotal.setText("TOTAL                          R$ " + pedido.getTotal());
        //limpar
        TxtTotal.setText("");
        TxtValor.setText("");
        TxtTroco.setText("");
        RbtnCartao.setSelected(false);
        RbtnDinheiro.setSelected(false);

    }

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
            java.util.logging.Logger.getLogger(FrmCaixa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCaixa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCaixa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCaixa.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCaixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BtGrpFormPag;
    private javax.swing.JButton BtnPagar;
    private javax.swing.JButton BtnVoltar;
    private javax.swing.JLabel LCliente;
    private javax.swing.JLabel LPedido;
    private javax.swing.JLabel LblSair;
    private javax.swing.JPanel PnlComprovante;
    private javax.swing.JRadioButton RbtnCartao;
    private javax.swing.JRadioButton RbtnDinheiro;
    private javax.swing.JTextArea TxtComp;
    private javax.swing.JTextField TxtTotal;
    private javax.swing.JTextField TxtTroco;
    private javax.swing.JTextField TxtValor;
    private javax.swing.JLabel jCompra;
    private javax.swing.JLabel jDados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jtotal;
    // End of variables declaration//GEN-END:variables

   
}
