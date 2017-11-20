package gui;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ConnectionBuilder;
import model.User;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
        MenuUserP.setVisible(false);
        ViewbookP.setVisible(false);
        MenuAdminP.setVisible(false);
        SignupP.setVisible(false);
        ViewReserveAP.setVisible(false);
        ViewReserveMP.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginP = new javax.swing.JPanel();
        usernameLIF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        passwordLIF = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        MenuAdminP = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        MenuUserP = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        ViewReserveMP = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton18 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        ViewReserveAP = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton16 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        SignupP = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel12 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ViewbookP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginP.setMaximumSize(new java.awt.Dimension(800, 600));
        LoginP.setMinimumSize(new java.awt.Dimension(800, 600));
        LoginP.setPreferredSize(new java.awt.Dimension(800, 600));
        LoginP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameLIF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameLIFKeyPressed(evt);
            }
        });
        LoginP.add(usernameLIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 186, 40));

        jLabel1.setText("USERNAME");
        LoginP.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 90, 20));

        passwordLIF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordLIFKeyPressed(evt);
            }
        });
        LoginP.add(passwordLIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 186, 40));

        jLabel2.setText("PASSWORD");
        LoginP.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 80, 20));

        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        LoginP.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, -1, 30));

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        LoginP.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 90, 40));

        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        LoginP.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 90, 40));

        jLabel3.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jLabel3.setText("Library");
        LoginP.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 330, 110));

        getContentPane().add(LoginP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        MenuAdminP.setMaximumSize(new java.awt.Dimension(800, 600));
        MenuAdminP.setMinimumSize(new java.awt.Dimension(800, 600));
        MenuAdminP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setText("View Borrow");
        MenuAdminP.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 160, 60));

        jButton10.setText("Add Book");
        MenuAdminP.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 160, 60));

        jButton11.setText("Edit Book");
        MenuAdminP.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 160, 60));

        jButton12.setText("Edit Book");
        MenuAdminP.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 160, 60));

        jButton13.setText("Delete Book");
        MenuAdminP.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 160, 60));

        jButton14.setText("View Book");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        MenuAdminP.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 160, 60));

        jButton15.setText("View Reserve");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        MenuAdminP.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 160, 60));

        jButton20.setText("Log Out");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        MenuAdminP.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 160, 60));

        jLabel15.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jLabel15.setText("ADMIN");
        MenuAdminP.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 420, 110));

        getContentPane().add(MenuAdminP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        MenuUserP.setMaximumSize(new java.awt.Dimension(800, 600));
        MenuUserP.setMinimumSize(new java.awt.Dimension(800, 600));
        MenuUserP.setPreferredSize(new java.awt.Dimension(800, 600));
        MenuUserP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setText("Borrow Book");
        MenuUserP.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 160, 50));

        jButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton4.setText("View Book");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        MenuUserP.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 160, 50));

        jButton5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton5.setText("Reserve Book");
        MenuUserP.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 160, 50));

        jButton17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton17.setText("View Reserve");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        MenuUserP.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 160, 50));

        jButton19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton19.setText("Log Out");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        MenuUserP.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 160, 50));

        jLabel16.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jLabel16.setText("MENU");
        MenuUserP.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 350, 110));

        getContentPane().add(MenuUserP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        ViewReserveMP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "BookName", "Date", "DueDate", "ReceiveDate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTable3);
        jTable3.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setMinWidth(30);
            jTable3.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        ViewReserveMP.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 760, 420));

        jButton18.setText("Back");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        ViewReserveMP.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 110, 40));

        jLabel17.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jLabel17.setText("RESERVE");
        ViewReserveMP.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 460, 70));

        getContentPane().add(ViewReserveMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        ViewReserveAP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "BookName", "Date", "DueDate", "ReceiveDate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setColumnSelectionAllowed(true);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(30);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        ViewReserveAP.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 760, 420));

        jButton16.setText("Back");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        ViewReserveAP.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 110, 40));

        jLabel18.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jLabel18.setText("ALL RESERVES");
        ViewReserveAP.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 720, 70));

        getContentPane().add(ViewReserveAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        SignupP.setMaximumSize(new java.awt.Dimension(800, 600));
        SignupP.setMinimumSize(new java.awt.Dimension(800, 600));
        SignupP.setPreferredSize(new java.awt.Dimension(800, 600));
        SignupP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        SignupP.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 160, 30));

        jLabel5.setText("Username");
        SignupP.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 80, 30));

        jLabel6.setText("Password");
        SignupP.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 80, 30));
        SignupP.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 160, 30));

        jLabel7.setText("Firstname");
        SignupP.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 80, 30));
        SignupP.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 160, 30));

        jLabel8.setText("Lastname");
        SignupP.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 80, 30));

        jLabel9.setText("Address");
        SignupP.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 80, 30));

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });
        SignupP.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 160, 30));

        jLabel10.setText("Phone");
        SignupP.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 80, 30));
        SignupP.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 160, 30));

        jLabel11.setText("E-mail");
        SignupP.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 80, 30));

        jScrollPane2.setViewportView(jTextPane1);

        SignupP.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 260, 110));

        jLabel12.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jLabel12.setText("Sign Up");
        SignupP.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));

        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        SignupP.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 100, 40));

        jButton8.setText("Sign Up");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        SignupP.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, 100, 40));
        SignupP.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 160, 30));

        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        SignupP.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 80, 30));

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        SignupP.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 160, 20));

        getContentPane().add(SignupP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        ViewbookP.setMaximumSize(new java.awt.Dimension(800, 600));
        ViewbookP.setMinimumSize(new java.awt.Dimension(800, 600));
        ViewbookP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Type", "Category", "Author", "Publish", "Year"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setMinWidth(100);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(2).setMinWidth(80);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(3).setMinWidth(130);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(130);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setMinWidth(60);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(60);
        }

        ViewbookP.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 740, 420));

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        ViewbookP.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 120, 40));

        jLabel19.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jLabel19.setText("ALL BOOKS");
        ViewbookP.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 550, 70));

        getContentPane().add(ViewbookP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameLIFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameLIFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            nextP();
        }
    }//GEN-LAST:event_usernameLIFKeyPressed

    private void passwordLIFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordLIFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            nextP();
        }
    }//GEN-LAST:event_passwordLIFKeyPressed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            passwordLIF.setEchoChar((char) 0);
        } else {
            passwordLIF.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nextP();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MenuUserP.setVisible(false);
        ViewbookP.setVisible(true);
        ViewBook();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        ViewbookP.setVisible(false);
        if (user.getIsAdmin()) {
            MenuAdminP.setVisible(true);
        } else {
            MenuUserP.setVisible(true);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (!jTextField1.getText().equals("") && !jPasswordField1.getPassword().equals("")
                && !jTextField3.getText().equals("") && !jTextField4.getText().equals("")
                && !jTextField7.getText().equals("") && !jTextField6.getText().equals("") && !jTextPane1.getText().equals("")) {
            try {
                user.register(jTextField1.getText(), jPasswordField1.getText(), jTextField3.getText(), jTextField4.getText(), jTextPane1.getText(), jTextField6.getText(), jTextField7.getText());
                JOptionPane.showMessageDialog(this, "Sign up success!", "Success", JOptionPane.WARNING_MESSAGE);
                SignupP.setVisible(false);
                LoginP.setVisible(true);
            } catch (SQLException ex) {
                System.err.println(ex);
            } finally {
                try {
                    con.close();
                } catch (SQLException ex) {
                    System.err.println(ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please insert text in blank space", "Error!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        SignupP.setVisible(false);
        LoginP.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SignupP.setVisible(true);
        LoginP.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        con = ConnectionBuilder.getConnection();
        try {
            ps = con.prepareStatement("SELECT username FROM Meepooh.member WHERE username=?");
            ps.setString(1, jTextField1.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                jLabel13.setText("Not available!");
                jButton8.setEnabled(false);
            } else { // ถ้าไม่มี
                jLabel13.setText("Available!");
                jButton8.setEnabled(true);
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        } finally {
            if (jTextField1.getText().equalsIgnoreCase("")) {
                jLabel13.setText("Not available!");
                jButton8.setEnabled(false);
            }
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("!" + ex);
            }
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        if (jTextField6.getText().length() >= 10 && checkNum(jTextField6.getText())) {
            jLabel14.setText("");
            jButton8.setEnabled(true);
            if (jTextField6.getText().length() > 10) {
                jTextField6.setText(jTextField6.getText().substring(0, 10));
                jLabel14.setText("");
                jButton8.setEnabled(true);
            }
        } else {
            jLabel14.setText("Please type pattern of phone number");
            jButton8.setEnabled(false);
            if (jTextField6.getText().length() > 10) {
                jTextField6.setText(jTextField6.getText().substring(0, 10));
            }
        }
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        MenuAdminP.setVisible(false);
        ViewbookP.setVisible(true);
        ViewBook();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        MenuAdminP.setVisible(false);
        ViewReserveAP.setVisible(true);
        ViewReserveA();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        ViewReserveAP.setVisible(false);
        MenuAdminP.setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        MenuUserP.setVisible(false);
        ViewReserveMP.setVisible(true);
        ViewReserveM();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        ViewReserveMP.setVisible(false);
        MenuUserP.setVisible(true);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        user.logout();
        MenuUserP.setVisible(false);
        LoginP.setVisible(true);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        user.logout();
        MenuAdminP.setVisible(false);
        LoginP.setVisible(true);
    }//GEN-LAST:event_jButton20ActionPerformed

    public static boolean checkNum(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public void ViewReserveM() {
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        try {
            con = ConnectionBuilder.getConnection();
            ps = con.prepareStatement("SELECT r.re_id, m.fname, b.book_name, r.re_date, r.re_duedate, r.re_receive FROM Meepooh.reserve r JOIN Meepooh.member m ON r.mem_id = m.mem_id JOIN Meepooh.book b ON r.book_id = b.book_id WHERE m.mem_id = ?");
            ps.setInt(1, user.getMemId());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getDate(5), rs.getDate(6)});
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    public void ViewReserveA() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        try {
            con = ConnectionBuilder.getConnection();
            ps = con.prepareStatement("SELECT r.re_id, m.fname, b.book_name, r.re_date, r.re_duedate, r.re_receive FROM Meepooh.reserve r JOIN Meepooh.member m ON r.mem_id = m.mem_id JOIN Meepooh.book b ON r.book_id = b.book_id");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getDate(5), rs.getDate(6)});
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    public void ViewBook() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try {
            con = ConnectionBuilder.getConnection();
            ps = con.prepareStatement("SELECT b.book_name, t.type_name, c.cat_name, a.author_name, p.pub_name, b.book_year FROM Meepooh.book b LEFT JOIN Meepooh.book_type t ON b.type_id = t.type_id LEFT JOIN Meepooh.book_category c ON b.cat_id = c.cat_id LEFT JOIN Meepooh.book_author a ON b.author_id = a.author_id LEFT JOIN Meepooh.book_publisher p ON b.pub_id = p.pub_id");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6)});
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    public void nextP() {  //method ที่เอาไว้เช็ค ตัว username & password
        user.login(usernameLIF.getText(), String.valueOf(passwordLIF.getPassword()));
        if (user.getMemId() == 0) {
            System.out.println("Login fail");
            JOptionPane.showMessageDialog(this, "Wrong Username or Password!", "Invalid", JOptionPane.WARNING_MESSAGE);
        } else {
            System.out.println("Login success");
            usernameLIF.setText("");
            passwordLIF.setText("");
            LoginP.setVisible(false);
            setId(user.getMemId());
            setUser();
            System.out.println(user.toString());
            if (user.getIsAdmin()) {
                MenuAdminP.setVisible(true);
            } else {
                MenuUserP.setVisible(true);
            }
        }
    }

    public void setUser() {
        try {
            con = ConnectionBuilder.getConnection();
            ps = con.prepareStatement("SELECT * FROM Meepooh.member WHERE mem_id=?");
            ps.setInt(1, user.getMemId());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                User.orm(rs, user);
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
    }

    public void setId(int us) {
        user.setMemId(us);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    Connection con;
    PreparedStatement ps;
    User user = new User();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginP;
    private javax.swing.JPanel MenuAdminP;
    private javax.swing.JPanel MenuUserP;
    private javax.swing.JPanel SignupP;
    private javax.swing.JPanel ViewReserveAP;
    private javax.swing.JPanel ViewReserveMP;
    private javax.swing.JPanel ViewbookP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPasswordField passwordLIF;
    private javax.swing.JTextField usernameLIF;
    // End of variables declaration//GEN-END:variables
}
