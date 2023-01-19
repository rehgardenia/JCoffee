package jcoffe;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FrmMenu extends javax.swing.JFrame {

    public FrmMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        LblSair = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtItem = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtPreco = new javax.swing.JTextField();
        BtnMenos = new javax.swing.JButton();
        BtnConfirmar = new javax.swing.JButton();
        BtnMais = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TxtQtd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        LstPedido = new javax.swing.JList<>();
        BtnAdd = new javax.swing.JButton();
        TxtCliente = new javax.swing.JTextField();
        BtnCancelar = new javax.swing.JButton();
        PnlMenu = new javax.swing.JPanel();
        PnlCafe = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PnlCafe1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PnlCafe2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        PnlCafe3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        PnlCafe4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        PnlCafe5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        PnlCafe8 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        PnlCafe6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        PnlCafe7 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setLocationByPlatform(true);
        setUndecorated(true);

        fundo.setBackground(new java.awt.Color(104, 73, 38));
        fundo.setForeground(new java.awt.Color(183, 166, 138));
        fundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(43, 21, 8));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblSair.setBackground(new java.awt.Color(255, 255, 255));
        LblSair.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        LblSair.setForeground(new java.awt.Color(183, 166, 138));
        LblSair.setText("X");
        LblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblSairMouseClicked(evt);
            }
        });
        jPanel1.add(LblSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 30, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(183, 166, 138));
        jLabel3.setText(" JCOFFEE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 160, -1));

        imgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        imgLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(imgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 50, 50));

        fundo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 60));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(183, 166, 138));
        jLabel2.setText("Cliente:");
        fundo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(183, 166, 138));
        jLabel4.setText("Item:");
        fundo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        TxtItem.setEditable(false);
        TxtItem.setBackground(new java.awt.Color(183, 166, 138));
        TxtItem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TxtItem.setForeground(new java.awt.Color(43, 21, 8));
        TxtItem.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fundo.add(TxtItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 125, 110, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(183, 166, 138));
        jLabel5.setText("Preço:");
        fundo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, 20));

        TxtPreco.setEditable(false);
        TxtPreco.setBackground(new java.awt.Color(183, 166, 138));
        TxtPreco.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TxtPreco.setForeground(new java.awt.Color(43, 21, 8));
        TxtPreco.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fundo.add(TxtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 125, 70, -1));

        BtnMenos.setBackground(new java.awt.Color(43, 21, 8));
        BtnMenos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnMenos.setForeground(new java.awt.Color(183, 166, 138));
        BtnMenos.setText("-");
        BtnMenos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenosActionPerformed(evt);
            }
        });
        fundo.add(BtnMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 40, 30));

        BtnConfirmar.setBackground(new java.awt.Color(43, 21, 8));
        BtnConfirmar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnConfirmar.setForeground(new java.awt.Color(183, 166, 138));
        BtnConfirmar.setText("Confirmar");
        BtnConfirmar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConfirmarActionPerformed(evt);
            }
        });
        fundo.add(BtnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 120, 40));

        BtnMais.setBackground(new java.awt.Color(43, 21, 8));
        BtnMais.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnMais.setForeground(new java.awt.Color(183, 166, 138));
        BtnMais.setText("+");
        BtnMais.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMaisActionPerformed(evt);
            }
        });
        fundo.add(BtnMais, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 40, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(183, 166, 138));
        jLabel6.setText("Qtd:");
        fundo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        TxtQtd.setEditable(false);
        TxtQtd.setBackground(new java.awt.Color(183, 166, 138));
        TxtQtd.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TxtQtd.setForeground(new java.awt.Color(43, 21, 8));
        TxtQtd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TxtQtd.setDisabledTextColor(new java.awt.Color(43, 21, 8));
        fundo.add(TxtQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 110, -1));

        LstPedido.setBackground(new java.awt.Color(183, 166, 138));
        LstPedido.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LstPedido.setForeground(new java.awt.Color(43, 21, 8));
        LstPedido.setSelectionBackground(new java.awt.Color(183, 166, 138));
        LstPedido.setSelectionForeground(new java.awt.Color(43, 21, 8));
        jScrollPane1.setViewportView(LstPedido);

        fundo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 300, -1));

        BtnAdd.setBackground(new java.awt.Color(43, 21, 8));
        BtnAdd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnAdd.setForeground(new java.awt.Color(183, 166, 138));
        BtnAdd.setText("Adicionar");
        BtnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });
        fundo.add(BtnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 120, 30));

        TxtCliente.setBackground(new java.awt.Color(183, 166, 138));
        TxtCliente.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TxtCliente.setForeground(new java.awt.Color(43, 21, 8));
        TxtCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fundo.add(TxtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 85, 240, -1));

        BtnCancelar.setBackground(new java.awt.Color(43, 21, 8));
        BtnCancelar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnCancelar.setForeground(new java.awt.Color(183, 166, 138));
        BtnCancelar.setText("Cancelar");
        BtnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        fundo.add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 120, 40));

        PnlMenu.setBackground(new java.awt.Color(183, 166, 138));

        PnlCafe.setBackground(new java.awt.Color(43, 21, 8));
        PnlCafe.setPreferredSize(new java.awt.Dimension(70, 70));
        PnlCafe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlCafeMouseClicked(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cafe.png"))); // NOI18N
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(183, 166, 138));
        jLabel8.setText("Café Trad.");

        javax.swing.GroupLayout PnlCafeLayout = new javax.swing.GroupLayout(PnlCafe);
        PnlCafe.setLayout(PnlCafeLayout);
        PnlCafeLayout.setHorizontalGroup(
            PnlCafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCafeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PnlCafeLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel8))
        );
        PnlCafeLayout.setVerticalGroup(
            PnlCafeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCafeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel8))
        );

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(43, 21, 8));
        jLabel9.setText("Menu Bebidas:");

        PnlCafe1.setBackground(new java.awt.Color(43, 21, 8));
        PnlCafe1.setPreferredSize(new java.awt.Dimension(70, 70));
        PnlCafe1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlCafe1MouseClicked(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cappuccino.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(183, 166, 138));
        jLabel11.setText("Cappuccino");

        javax.swing.GroupLayout PnlCafe1Layout = new javax.swing.GroupLayout(PnlCafe1);
        PnlCafe1.setLayout(PnlCafe1Layout);
        PnlCafe1Layout.setHorizontalGroup(
            PnlCafe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCafe1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PnlCafe1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel11))
        );
        PnlCafe1Layout.setVerticalGroup(
            PnlCafe1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCafe1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PnlCafe1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel11))
        );

        PnlCafe2.setBackground(new java.awt.Color(43, 21, 8));
        PnlCafe2.setPreferredSize(new java.awt.Dimension(70, 70));
        PnlCafe2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlCafe2MouseClicked(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cafe-com-leite.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(183, 166, 138));
        jLabel13.setText("Café c/leite");

        javax.swing.GroupLayout PnlCafe2Layout = new javax.swing.GroupLayout(PnlCafe2);
        PnlCafe2.setLayout(PnlCafe2Layout);
        PnlCafe2Layout.setHorizontalGroup(
            PnlCafe2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCafe2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PnlCafe2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        PnlCafe2Layout.setVerticalGroup(
            PnlCafe2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCafe2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel13))
        );

        PnlCafe3.setBackground(new java.awt.Color(43, 21, 8));
        PnlCafe3.setPreferredSize(new java.awt.Dimension(70, 70));
        PnlCafe3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlCafe3MouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(183, 166, 138));
        jLabel15.setText("Expresso");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/expresso.png"))); // NOI18N

        javax.swing.GroupLayout PnlCafe3Layout = new javax.swing.GroupLayout(PnlCafe3);
        PnlCafe3.setLayout(PnlCafe3Layout);
        PnlCafe3Layout.setHorizontalGroup(
            PnlCafe3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCafe3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PnlCafe3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)))
        );
        PnlCafe3Layout.setVerticalGroup(
            PnlCafe3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCafe3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addContainerGap())
        );

        PnlCafe4.setBackground(new java.awt.Color(43, 21, 8));
        PnlCafe4.setPreferredSize(new java.awt.Dimension(70, 70));
        PnlCafe4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlCafe4MouseClicked(evt);
            }
        });

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/achocolatado.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(183, 166, 138));
        jLabel17.setText("Achocolatado");

        javax.swing.GroupLayout PnlCafe4Layout = new javax.swing.GroupLayout(PnlCafe4);
        PnlCafe4.setLayout(PnlCafe4Layout);
        PnlCafe4Layout.setHorizontalGroup(
            PnlCafe4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCafe4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCafe4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap())
        );
        PnlCafe4Layout.setVerticalGroup(
            PnlCafe4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCafe4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addContainerGap())
        );

        PnlCafe5.setBackground(new java.awt.Color(43, 21, 8));
        PnlCafe5.setPreferredSize(new java.awt.Dimension(70, 70));
        PnlCafe5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlCafe5MouseClicked(evt);
            }
        });

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/machiato.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(183, 166, 138));
        jLabel19.setText("Macchiato");

        javax.swing.GroupLayout PnlCafe5Layout = new javax.swing.GroupLayout(PnlCafe5);
        PnlCafe5.setLayout(PnlCafe5Layout);
        PnlCafe5Layout.setHorizontalGroup(
            PnlCafe5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCafe5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PnlCafe5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)))
        );
        PnlCafe5Layout.setVerticalGroup(
            PnlCafe5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCafe5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addContainerGap())
        );

        PnlCafe8.setBackground(new java.awt.Color(43, 21, 8));
        PnlCafe8.setPreferredSize(new java.awt.Dimension(70, 70));
        PnlCafe8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlCafe8MouseClicked(evt);
            }
        });

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/descafeinado.png"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(183, 166, 138));
        jLabel25.setText("Descafeinado");

        javax.swing.GroupLayout PnlCafe8Layout = new javax.swing.GroupLayout(PnlCafe8);
        PnlCafe8.setLayout(PnlCafe8Layout);
        PnlCafe8Layout.setHorizontalGroup(
            PnlCafe8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCafe8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCafe8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addContainerGap())
        );
        PnlCafe8Layout.setVerticalGroup(
            PnlCafe8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCafe8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addContainerGap())
        );

        PnlCafe6.setBackground(new java.awt.Color(43, 21, 8));
        PnlCafe6.setPreferredSize(new java.awt.Dimension(70, 70));
        PnlCafe6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlCafe6MouseClicked(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/latte.png"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(183, 166, 138));
        jLabel21.setText("Latte");

        javax.swing.GroupLayout PnlCafe6Layout = new javax.swing.GroupLayout(PnlCafe6);
        PnlCafe6.setLayout(PnlCafe6Layout);
        PnlCafe6Layout.setHorizontalGroup(
            PnlCafe6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCafe6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PnlCafe6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)))
        );
        PnlCafe6Layout.setVerticalGroup(
            PnlCafe6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCafe6Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addContainerGap())
        );

        PnlCafe7.setBackground(new java.awt.Color(43, 21, 8));
        PnlCafe7.setPreferredSize(new java.awt.Dimension(70, 70));
        PnlCafe7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlCafe7MouseClicked(evt);
            }
        });

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mocha.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(183, 166, 138));
        jLabel23.setText("Mocha");

        javax.swing.GroupLayout PnlCafe7Layout = new javax.swing.GroupLayout(PnlCafe7);
        PnlCafe7.setLayout(PnlCafe7Layout);
        PnlCafe7Layout.setHorizontalGroup(
            PnlCafe7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCafe7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PnlCafe7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlCafe7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel23))
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        PnlCafe7Layout.setVerticalGroup(
            PnlCafe7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCafe7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addContainerGap())
        );

        javax.swing.GroupLayout PnlMenuLayout = new javax.swing.GroupLayout(PnlMenu);
        PnlMenu.setLayout(PnlMenuLayout);
        PnlMenuLayout.setHorizontalGroup(
            PnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnlMenuLayout.createSequentialGroup()
                        .addComponent(PnlCafe3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(PnlCafe4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlMenuLayout.createSequentialGroup()
                        .addComponent(PnlCafe6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(PnlCafe7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnlMenuLayout.createSequentialGroup()
                        .addComponent(PnlCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(PnlCafe1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PnlCafe2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlCafe5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlCafe8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(116, 116, 116))
        );
        PnlMenuLayout.setVerticalGroup(
            PnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlMenuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(PnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PnlCafe2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlCafe1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PnlCafe4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PnlCafe3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PnlCafe5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PnlCafe8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlCafe7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnlCafe6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        fundo.add(PnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 360, 370));
        fundo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<Item> pedido = new ArrayList<>();
    Pedido pedido1;


    private void BtnMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMaisActionPerformed
        int qtd = Integer.parseInt(TxtQtd.getText());
        try {
            if (qtd > 0) {
                TxtQtd.setText(String.valueOf(qtd + 1));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_BtnMaisActionPerformed

    private void BtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConfirmarActionPerformed
        pedido1 = new Pedido();
        pedido1.setCliente(TxtCliente.getText());
        if (pedido.isEmpty() || pedido1.getCliente().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Antes de confimar, faça o pedido!", "ERRO", 0);
        } else {
            pedido1.setItens(pedido);
            pedido1.calcularTotal();
            //abrir outro form
            FrmCaixa form2 = new FrmCaixa(pedido1);
            form2.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_BtnConfirmarActionPerformed

    DefaultListModel listModel = new DefaultListModel();
    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        // verifacando se algum dos campos estao limpos
        if (TxtCliente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira um nome para continuar..", "Erro", 0);
        } else if (TxtItem.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione um cafe, para adicionar ao seu pedido.", "Erro", 0);
        } else {
            Cafe p1 = new Cafe(TxtItem.getText(), Double.parseDouble(TxtPreco.getText()));
            Item item = new Item(p1, Integer.parseInt(TxtQtd.getText()));
            adicionar(item);

        }
    }//GEN-LAST:event_BtnAddActionPerformed
    public void adicionar(Item cafe) {
        boolean item = false;
        for (int ii = 0; ii < pedido.size(); ii++) {
            if (pedido.get(ii).getCafe().getNome().equals(cafe.getCafe().getNome())) {
                JOptionPane.showMessageDialog(null, "Esse cafe já foi adicionado ao pedido anteriormente.", "Erro", 0);
                item = true;
            }
        }
        if (!item == true) {
            pedido.add(cafe);
            listModel.addElement(cafe.getCafe().getNome() + " x" + cafe.getQtd());
            LstPedido.setModel(listModel);
        }

    }
    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        //limpando os campos de texto
        TxtCliente.setText("");
        TxtPreco.setText("");
        TxtItem.setText("");
        TxtQtd.setText("");
        //limpando as listas
        pedido.clear();
        listModel.clear();
        LstPedido.setModel(listModel);

    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void LblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblSairMouseClicked
        // sair do sistema
        System.exit(0);
    }//GEN-LAST:event_LblSairMouseClicked

    private void PnlCafeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlCafeMouseClicked
        TxtItem.setText("Café Trad.");
        TxtPreco.setText(String.valueOf(8.50));
        TxtQtd.setText(String.valueOf(1));

    }//GEN-LAST:event_PnlCafeMouseClicked

    private void BtnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenosActionPerformed
        // diminui a quantidade desejada
        int qtd = Integer.parseInt(TxtQtd.getText());
        try {
            if (qtd > 1) {
                TxtQtd.setText(String.valueOf(qtd - 1));
            } else {
                TxtQtd.setText(String.valueOf(1));
            }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_BtnMenosActionPerformed

    private void PnlCafe1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlCafe1MouseClicked
        TxtItem.setText("Cappuccino");
        TxtPreco.setText(String.valueOf(15.00));
        TxtQtd.setText(String.valueOf(1));
        

    }//GEN-LAST:event_PnlCafe1MouseClicked

    private void PnlCafe2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlCafe2MouseClicked
        TxtItem.setText("Café c/ Leite");
        TxtPreco.setText(String.valueOf(9.50));
        TxtQtd.setText(String.valueOf(1));
     

    }//GEN-LAST:event_PnlCafe2MouseClicked

    private void PnlCafe3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlCafe3MouseClicked
        TxtItem.setText("Expresso");
        TxtPreco.setText(String.valueOf(10.50));
        TxtQtd.setText(String.valueOf(1));
       

    }//GEN-LAST:event_PnlCafe3MouseClicked

    private void PnlCafe4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlCafe4MouseClicked
        TxtItem.setText("Achocolatado");
        TxtPreco.setText(String.valueOf(12.00));
        TxtQtd.setText(String.valueOf(1));
       

    }//GEN-LAST:event_PnlCafe4MouseClicked

    private void PnlCafe5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlCafe5MouseClicked
        TxtItem.setText("Macchiato");
        TxtPreco.setText(String.valueOf(15.00));
        TxtQtd.setText(String.valueOf(1));
       

    }//GEN-LAST:event_PnlCafe5MouseClicked

    private void PnlCafe6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlCafe6MouseClicked
        TxtItem.setText("Latte");
        TxtPreco.setText(String.valueOf(14.00));
        TxtQtd.setText(String.valueOf(1));
   

    }//GEN-LAST:event_PnlCafe6MouseClicked

    private void PnlCafe7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlCafe7MouseClicked
        TxtItem.setText("Mocha");
        TxtPreco.setText(String.valueOf(14.00));
        TxtQtd.setText(String.valueOf(1));
       

    }//GEN-LAST:event_PnlCafe7MouseClicked

    private void PnlCafe8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlCafe8MouseClicked
        TxtItem.setText("Descafeinado");
        TxtPreco.setText(String.valueOf(18.00));
        TxtQtd.setText(String.valueOf(1));
       

    }//GEN-LAST:event_PnlCafe8MouseClicked

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnConfirmar;
    private javax.swing.JButton BtnMais;
    private javax.swing.JButton BtnMenos;
    private javax.swing.JLabel LblSair;
    private javax.swing.JList<String> LstPedido;
    private javax.swing.JPanel PnlCafe;
    private javax.swing.JPanel PnlCafe1;
    private javax.swing.JPanel PnlCafe2;
    private javax.swing.JPanel PnlCafe3;
    private javax.swing.JPanel PnlCafe4;
    private javax.swing.JPanel PnlCafe5;
    private javax.swing.JPanel PnlCafe6;
    private javax.swing.JPanel PnlCafe7;
    private javax.swing.JPanel PnlCafe8;
    private javax.swing.JPanel PnlMenu;
    private javax.swing.JTextField TxtCliente;
    private javax.swing.JTextField TxtItem;
    private javax.swing.JTextField TxtPreco;
    private javax.swing.JTextField TxtQtd;
    private javax.swing.JPanel fundo;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
