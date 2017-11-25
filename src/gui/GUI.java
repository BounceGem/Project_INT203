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
        AddBookP.setVisible(false);
        EditBookP.setVisible(false);
        ViewBorrowP.setVisible(false);
        EditP.setVisible(false);
        ViewMemberP.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddBookP = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton13 = new javax.swing.JButton();
        jTextField15 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        ViewMemberP = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jButton37 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        MenuAdminP = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        EditBookP = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton32 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        EditP = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jButton35 = new javax.swing.JButton();
        jTextField18 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jButton36 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        ViewbookP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
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
        ViewReserveMP = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton18 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        MenuUserP = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        LoginP = new javax.swing.JPanel();
        usernameLIF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        passwordLIF = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ViewBorrowP = new javax.swing.JPanel();
        jButton29 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        ViewReserveAP = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton16 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton24 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddBookP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jLabel20.setText("ADD BOOK");
        AddBookP.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 550, 100));

        jButton12.setText("Back");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        AddBookP.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 532, 120, 50));

        jLabel4.setText("Quntity");
        AddBookP.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 70, 30));

        jLabel21.setText("Name");
        AddBookP.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 70, 30));

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });
        AddBookP.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 150, 30));

        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
        });
        AddBookP.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 150, 30));

        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField9KeyReleased(evt);
            }
        });
        AddBookP.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 150, 30));

        jLabel22.setText("Author");
        AddBookP.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 70, 30));

        jLabel23.setText("Type");
        AddBookP.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 70, 30));

        jLabel24.setText("Category");
        AddBookP.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 70, 30));
        AddBookP.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 150, 30));

        jLabel25.setText("FinePerDay");
        AddBookP.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 70, 30));

        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField12KeyReleased(evt);
            }
        });
        AddBookP.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 150, 30));
        AddBookP.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 150, 30));

        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField14KeyReleased(evt);
            }
        });
        AddBookP.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 150, 30));

        jLabel26.setText("FineLost");
        AddBookP.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 70, 30));

        jLabel27.setText("Year");
        AddBookP.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 70, 30));

        jLabel28.setText("Publisher");
        AddBookP.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 70, 30));

        AddBookP.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 150, 30));

        AddBookP.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 150, 30));

        jButton13.setText("Add");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        AddBookP.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, 120, 50));
        AddBookP.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 150, 30));

        jLabel32.setText("Price");
        AddBookP.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 70, 30));

        jButton22.setFont(new java.awt.Font("Dialog", 1, 5)); // NOI18N
        jButton22.setText("ADD");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        AddBookP.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 50, 30));

        jButton23.setFont(new java.awt.Font("Dialog", 1, 5)); // NOI18N
        jButton23.setText("ADD");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        AddBookP.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 50, 30));

        getContentPane().add(AddBookP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        ViewMemberP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jLabel43.setText("MEMBER");
        ViewMemberP.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 510, 100));

        jButton37.setText("Back");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        ViewMemberP.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 542, 100, 40));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Firstname", "Lastname", "Address", "Phone", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setMinWidth(35);
            jTable6.getColumnModel().getColumn(0).setMaxWidth(35);
        }

        ViewMemberP.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 740, -1));

        getContentPane().add(ViewMemberP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        MenuAdminP.setMaximumSize(new java.awt.Dimension(800, 600));
        MenuAdminP.setMinimumSize(new java.awt.Dimension(800, 600));
        MenuAdminP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setText("View Member");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        MenuAdminP.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 160, 60));

        jButton10.setText("Add Book");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        MenuAdminP.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 160, 60));

        jButton11.setText("Edit Book");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        MenuAdminP.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 160, 60));

        jButton14.setText("View Book");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        MenuAdminP.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 160, 60));

        jButton15.setText("View Reserve");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        MenuAdminP.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 160, 60));

        jButton20.setText("Log Out");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        MenuAdminP.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 160, 60));

        jLabel15.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jLabel15.setText("ADMIN");
        MenuAdminP.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 420, 110));

        jButton21.setText("View Borrow");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        MenuAdminP.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 160, 60));

        getContentPane().add(MenuAdminP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        EditBookP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Type", "Category", "Author", "Publish", "Year"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable5.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(jTable5);
        jTable5.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable5.getColumnModel().getColumnCount() > 0) {
            jTable5.getColumnModel().getColumn(0).setMinWidth(35);
            jTable5.getColumnModel().getColumn(0).setMaxWidth(35);
            jTable5.getColumnModel().getColumn(1).setResizable(false);
            jTable5.getColumnModel().getColumn(2).setMinWidth(100);
            jTable5.getColumnModel().getColumn(2).setMaxWidth(100);
            jTable5.getColumnModel().getColumn(3).setMinWidth(80);
            jTable5.getColumnModel().getColumn(3).setMaxWidth(80);
            jTable5.getColumnModel().getColumn(4).setMinWidth(130);
            jTable5.getColumnModel().getColumn(4).setMaxWidth(130);
            jTable5.getColumnModel().getColumn(5).setResizable(false);
            jTable5.getColumnModel().getColumn(6).setMinWidth(60);
            jTable5.getColumnModel().getColumn(6).setMaxWidth(60);
        }

        EditBookP.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 740, 370));

        jButton32.setText("Back");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        EditBookP.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 120, 40));

        jLabel30.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jLabel30.setText("EDIT BOOKS");
        EditBookP.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 650, 100));

        jTextField17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField17KeyPressed(evt);
            }
        });
        EditBookP.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, 30));

        jButton33.setText("SearchByName");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        EditBookP.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jButton34.setText("ALL");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        EditBookP.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, -1, -1));

        jButton25.setText("Edit");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        EditBookP.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 120, 40));

        getContentPane().add(EditBookP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        EditP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jLabel31.setText("EDIT");
        EditP.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 270, 100));
        EditP.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 60, 30));

        jLabel34.setText("Quntity :");
        EditP.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 80, 30));

        jButton35.setText("Edit");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        EditP.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 540, 90, 40));
        EditP.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, 150, 30));

        jLabel35.setText("Book ID :");
        EditP.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 60, 30));

        jLabel36.setText("Name :");
        EditP.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 80, 30));
        EditP.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 150, 30));
        EditP.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 150, 30));

        jLabel37.setText("Author :");
        EditP.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 80, 30));

        jLabel38.setText("Publisher :");
        EditP.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 80, 30));

        jLabel39.setText("Year :");
        EditP.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 80, 30));

        jLabel40.setText("Type :");
        EditP.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 80, 30));
        EditP.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 150, 30));

        jLabel41.setText("Price :");
        EditP.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 80, 30));

        jLabel42.setText("Category :");
        EditP.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 80, 30));

        jButton36.setText("Back");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        EditP.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 90, 40));

        EditP.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 150, 30));

        EditP.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 150, 30));

        EditP.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 150, 30));

        EditP.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 150, 30));

        getContentPane().add(EditP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

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

        ViewbookP.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 740, 370));

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        ViewbookP.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 120, 40));

        jLabel19.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jLabel19.setText("ALL BOOKS");
        ViewbookP.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 550, 100));

        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField10KeyPressed(evt);
            }
        });
        ViewbookP.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, 30));

        jButton26.setText("SearchByName");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        ViewbookP.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jButton27.setText("ALL");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        ViewbookP.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, -1, -1));

        getContentPane().add(ViewbookP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

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
        SignupP.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 100, 40));

        jButton8.setText("Sign Up");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        SignupP.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 100, 40));
        SignupP.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 160, 30));

        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        SignupP.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 80, 30));

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        SignupP.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 160, 20));

        getContentPane().add(SignupP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

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

        ViewReserveMP.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 760, 430));

        jButton18.setText("Back");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        ViewReserveMP.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 110, 40));

        jLabel17.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jLabel17.setText("RESERVE");
        ViewReserveMP.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 460, 70));

        getContentPane().add(ViewReserveMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

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
        MenuUserP.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 160, 50));

        jLabel16.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jLabel16.setText("MENU");
        MenuUserP.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 350, 110));

        getContentPane().add(MenuUserP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

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

        ViewBorrowP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton29.setText("Back");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        ViewBorrowP.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 532, 120, 50));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "BookName", "Date", "DueDate", "ReceiveDate", "Amount", "isFine"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jTable4);
        jTable4.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setMinWidth(30);
            jTable4.getColumnModel().getColumn(0).setMaxWidth(30);
            jTable4.getColumnModel().getColumn(6).setMinWidth(60);
            jTable4.getColumnModel().getColumn(6).setMaxWidth(60);
            jTable4.getColumnModel().getColumn(7).setMinWidth(50);
            jTable4.getColumnModel().getColumn(7).setMaxWidth(50);
        }

        ViewBorrowP.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 760, 380));

        jLabel29.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jLabel29.setText("ALL BORROW");
        ViewBorrowP.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 640, 100));

        jTextField16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField16KeyPressed(evt);
            }
        });
        ViewBorrowP.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, 30));

        jButton30.setText("SearchByName");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        ViewBorrowP.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, 30));

        jButton31.setText("ALL");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        ViewBorrowP.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, -1, -1));

        getContentPane().add(ViewBorrowP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

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

        ViewReserveAP.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 760, 380));

        jButton16.setText("Back");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        ViewReserveAP.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 110, 40));

        jLabel18.setFont(new java.awt.Font("Forte", 1, 100)); // NOI18N
        jLabel18.setText("ALL RESERVES");
        ViewReserveAP.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 720, 70));

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        ViewReserveAP.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, 30));

        jButton24.setText("SearchByName");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        ViewReserveAP.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, 30));

        jButton28.setText("ALL");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        ViewReserveAP.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, -1, -1));

        getContentPane().add(ViewReserveAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

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

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        MenuAdminP.setVisible(false);
        AddBookP.setVisible(true);
        jButton23.setEnabled(false);
        jButton22.setEnabled(false);
        TypeQuery();
        CatQuery();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        AddBookP.setVisible(false);
        MenuAdminP.setVisible(true);
        DeleteItem();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        AddFine(Integer.parseInt(jTextField14.getText()), Integer.parseInt(jTextField8.getText()));
        FineMAX();
        AddBook(jTextField5.getText(), jComboBox2.getSelectedIndex() + 1, jComboBox1.getSelectedIndex() + 1, author, pub, fine, Integer.parseInt(jTextField11.getText()), Integer.parseInt(jTextField15.getText()), Integer.parseInt(jTextField13.getText()));
        AddBookP.setVisible(false);
        MenuAdminP.setVisible(true);
        DeleteItem();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTextField9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyReleased
        try {
            Connection con = ConnectionBuilder.getConnection();
            PreparedStatement ps;
            ps = con.prepareStatement("SELECT * FROM Meepooh.book_author WHERE author_name=?");
            ps.setString(1, jTextField9.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                jButton23.setEnabled(false);
                author = rs.getInt(1);
                con.close();
            } else {
                jButton23.setEnabled(true);
                con.close();
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_jTextField9KeyReleased

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        try (Connection con = ConnectionBuilder.getConnection()) {
            PreparedStatement regis
                    = con.prepareStatement("INSERT INTO Meepooh.book_author (author_id, author_name) VALUES (NULL, ?);");
            regis.setString(1, jTextField9.getText());
            regis.executeUpdate();
            con.close();
            AuthorMAX();
        } catch (SQLException ex) {
            System.err.println(ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        jButton23.setEnabled(false);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jTextField12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyReleased
        try {
            Connection con = ConnectionBuilder.getConnection();
            PreparedStatement ps;
            ps = con.prepareStatement("SELECT * FROM Meepooh.book_publisher WHERE pub_name=?");
            ps.setString(1, jTextField12.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                jButton22.setEnabled(false);
                pub = rs.getInt(1);
                con.close();
            } else {
                jButton22.setEnabled(true);
                con.close();
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_jTextField12KeyReleased

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        try (Connection con = ConnectionBuilder.getConnection()) {
            PreparedStatement regis
                    = con.prepareStatement("INSERT INTO Meepooh.book_publisher (pub_id, pub_name) VALUES (NULL, ?);");
            regis.setString(1, jTextField12.getText());
            regis.executeUpdate();
            con.close();
            PubMAX();
        } catch (SQLException ex) {
            System.err.println(ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        jButton22.setEnabled(false);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jTextField14KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyReleased
        if (checkNum(jTextField14.getText())) {
            jButton13.setEnabled(true);
        } else {
            jButton13.setEnabled(false);
        }
    }//GEN-LAST:event_jTextField14KeyReleased

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
        if (checkNum(jTextField8.getText())) {
            jButton13.setEnabled(true);
        } else {
            jButton13.setEnabled(false);
        }
    }//GEN-LAST:event_jTextField8KeyReleased

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        try {
            Connection con = ConnectionBuilder.getConnection();
            PreparedStatement ps;
            ps = con.prepareStatement("SELECT * FROM Meepooh.book WHERE book_name=?");
            ps.setString(1, jTextField5.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                jButton13.setEnabled(false);
                con.close();
            } else {
                jButton13.setEnabled(true);
                con.close();
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        EditBookP.setVisible(true);
        MenuAdminP.setVisible(false);
        ViewEditBook();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        SearchReByName(jTextField2.getText());
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            SearchReByName(jTextField2.getText());
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        SearchBookByName(jTextField10.getText());
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jTextField10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            SearchBookByName(jTextField10.getText());
        }
    }//GEN-LAST:event_jTextField10KeyPressed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        ViewBook();
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        ViewReserveA();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        ViewBorrowP.setVisible(false);
        MenuAdminP.setVisible(true);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jTextField16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            SearchBoByName(jTextField16.getText());
        }
    }//GEN-LAST:event_jTextField16KeyPressed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        SearchBoByName(jTextField16.getText());
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        ViewBorrowA();
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        ViewBorrowP.setVisible(true);
        MenuAdminP.setVisible(false);
        ViewBorrowA();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        EditBookP.setVisible(false);
        MenuAdminP.setVisible(true);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jTextField17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField17KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            SearchEBByName(jTextField17.getText());
        }
    }//GEN-LAST:event_jTextField17KeyPressed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        SearchEBByName(jTextField17.getText());
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        ViewEditBook();
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        EditP.setVisible(true);
        EditBookP.setVisible(false);
        jLabel33.setText(jTable5.getValueAt(jTable5.getSelectedRow(), 0) + "");
        QueryBook((int) jTable5.getValueAt(jTable5.getSelectedRow(), 0));
        System.out.println(jTable5.getValueAt(jTable5.getSelectedRow(), 0));
        PubQuery();
        AuthorQuery();
        CatQuery();
        TypeQuery();
        DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        Edit(jTextField19.getText(), jComboBox6.getSelectedIndex() + 1, jComboBox3.getSelectedIndex() + 1, jComboBox4.getSelectedIndex() + 1, jComboBox5.getSelectedIndex() + 1, Integer.parseInt(jTextField22.getText()), Integer.parseInt(jTextField25.getText()), Integer.parseInt(jTextField18.getText()), Integer.parseInt(jLabel33.getText()));
        EditP.setVisible(false);
        EditBookP.setVisible(true);
        ViewEditBook();
        DeleteItem();
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        EditP.setVisible(false);
        EditBookP.setVisible(true);
        ViewEditBook();
        DeleteItem();
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        ViewMemberP.setVisible(false);
        MenuAdminP.setVisible(true);
        DefaultTableModel model = (DefaultTableModel) jTable6.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        ViewMemberP.setVisible(true);
        MenuAdminP.setVisible(false);

        DefaultTableModel model = (DefaultTableModel) jTable6.getModel();
        try {
            con = ConnectionBuilder.getConnection();
            ps = con.prepareStatement("SELECT * from Meepooh.member");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt(1), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)});
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
    }//GEN-LAST:event_jButton9ActionPerformed

    public void Edit(String name, int type, int cat, int author, int pub, int year, int price, int qty, int id) {
        try (Connection con = ConnectionBuilder.getConnection()) {
            PreparedStatement ps = con.prepareStatement("UPDATE Meepooh.book SET book_name=?, type_id=?, cat_id=?, author_id=?, pub_id=?, book_year=?, book_price=?, qty=? WHERE book_id =?");
            ps.setString(1, name);
            ps.setInt(2, type);
            ps.setInt(3, cat);
            ps.setInt(4, author);
            ps.setInt(5, pub);
            ps.setInt(6, year);
            ps.setInt(7, price);
            ps.setInt(8, qty);
            ps.setInt(9, id);
            ps.executeUpdate();
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

    public void QueryBook(int id) {
        try {
            con = ConnectionBuilder.getConnection();
            ps = con.prepareStatement("SELECT * FROM Meepooh.book Where book_id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                jTextField19.setText(rs.getString(2));
                jTextField22.setText(rs.getString(8));
                jTextField25.setText(rs.getString(9));
                jTextField18.setText(rs.getString(10));
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

    public void PubQuery() {
        try {
            con = ConnectionBuilder.getConnection();
            ps = con.prepareStatement("SELECT * FROM Meepooh.book_publisher");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                jComboBox5.addItem(rs.getInt(1) + " - " + rs.getString(2));
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

    public void AuthorQuery() {
        try {
            con = ConnectionBuilder.getConnection();
            ps = con.prepareStatement("SELECT * FROM Meepooh.book_author");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                jComboBox4.addItem(rs.getInt(1) + " - " + rs.getString(2));
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

    public void TypeQuery() {
        try {
            con = ConnectionBuilder.getConnection();
            ps = con.prepareStatement("SELECT * FROM Meepooh.book_type");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                jComboBox2.addItem(rs.getInt(1) + " - " + rs.getString(2));
                jComboBox6.addItem(rs.getInt(1) + " - " + rs.getString(2));
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

    public void CatQuery() {
        try {
            con = ConnectionBuilder.getConnection();
            ps = con.prepareStatement("SELECT * FROM Meepooh.book_category");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                jComboBox1.addItem(rs.getInt(1) + " - " + rs.getString(2));
                jComboBox3.addItem(rs.getInt(1) + " - " + rs.getString(2));
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

    public void SearchEBByName(String name) {
        DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        try {
            con = ConnectionBuilder.getConnection();
            ps = con.prepareStatement("SELECT b.book_id, b.book_name, t.type_name, c.cat_name, a.author_name, p.pub_name, b.book_year FROM Meepooh.book b LEFT JOIN Meepooh.book_type t ON b.type_id = t.type_id LEFT JOIN Meepooh.book_category c ON b.cat_id = c.cat_id LEFT JOIN Meepooh.book_author a ON b.author_id = a.author_id LEFT JOIN Meepooh.book_publisher p ON b.pub_id = p.pub_id WHERE b.book_name LIKE ?;");
            ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7)});
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

    public void ViewEditBook() {
        DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
        try {
            con = ConnectionBuilder.getConnection();
            ps = con.prepareStatement("SELECT b.book_id, b.book_name, t.type_name, c.cat_name, a.author_name, p.pub_name, b.book_year FROM Meepooh.book b LEFT JOIN Meepooh.book_type t ON b.type_id = t.type_id LEFT JOIN Meepooh.book_category c ON b.cat_id = c.cat_id LEFT JOIN Meepooh.book_author a ON b.author_id = a.author_id LEFT JOIN Meepooh.book_publisher p ON b.pub_id = p.pub_id");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7)});
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

    public void SearchBoByName(String name) {
        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        System.out.println(name);
        try {
            con = ConnectionBuilder.getConnection();
            ps = con.prepareStatement("SELECT bo.bo_id, m.fname, b.book_name, bo.bo_date, bo.bo_duedate, bo.bo_redate, bo.fine_amount, bo.ispaid FROM Meepooh.borrow bo JOIN Meepooh.member m ON bo.mem_id = m.mem_id JOIN Meepooh.book b ON bo.book_id = b.book_id Join Meepooh.book_fine f on b.fine_id = f.fine_id WHERE m.fname LIKE ?;");
            ps.setString(1, "%" + name + "%");
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

    public void ViewBorrowA() {
        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
        try {
            con = ConnectionBuilder.getConnection();
            ps = con.prepareStatement("SELECT bo.bo_id, m.fname, b.book_name, bo.bo_date, bo.bo_duedate, bo.bo_redate, bo.fine_amount, bo.ispaid FROM Meepooh.borrow bo JOIN Meepooh.member m ON bo.mem_id = m.mem_id JOIN Meepooh.book b ON bo.book_id = b.book_id Join Meepooh.book_fine f on b.fine_id = f.fine_id");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getDate(5), rs.getDate(6), rs.getInt(7), rs.getBoolean(8)});
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

    public void SearchBookByName(String name) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        System.out.println(name);
        try {
            con = ConnectionBuilder.getConnection();
            ps = con.prepareStatement("SELECT b.book_name, t.type_name, c.cat_name, a.author_name, p.pub_name, b.book_year FROM Meepooh.book b LEFT JOIN Meepooh.book_type t ON b.type_id = t.type_id LEFT JOIN Meepooh.book_category c ON b.cat_id = c.cat_id LEFT JOIN Meepooh.book_author a ON b.author_id = a.author_id LEFT JOIN Meepooh.book_publisher p ON b.pub_id = p.pub_id WHERE b.book_name LIKE ?;");
            ps.setString(1, "%" + name + "%");
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

    public void SearchReByName(String name) {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        try {
            con = ConnectionBuilder.getConnection();
            ps = con.prepareStatement("SELECT r.re_id, m.fname, b.book_name, r.re_date, r.re_duedate, r.re_receive FROM Meepooh.reserve r JOIN Meepooh.member m ON r.mem_id = m.mem_id JOIN Meepooh.book b ON r.book_id = b.book_id WHERE m.mem_id = (SELECT mem_id FRom Meepooh.member Where fname = ?);");
            ps.setString(1, name);
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

    public void PubMAX() {
        try {
            con = ConnectionBuilder.getConnection();
            ps = con.prepareStatement("SELECT MAX(pub_id) FROM Meepooh.book_publisher");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                pub = rs.getInt(1);
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

    public void AuthorMAX() {
        try {
            con = ConnectionBuilder.getConnection();
            ps = con.prepareStatement("SELECT MAX(author_id) FROM Meepooh.book_author");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                author = rs.getInt(1);
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

    public void FineMAX() {
        try {
            con = ConnectionBuilder.getConnection();
            ps = con.prepareStatement("SELECT MAX(fine_id) FROM Meepooh.book_fine");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                fine = rs.getInt(1);
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

    public void AddFine(int pd, int l) {
        try (Connection con = ConnectionBuilder.getConnection()) {
            PreparedStatement regis
                    = con.prepareStatement("INSERT INTO Meepooh.book_fine (fine_id, fineperday, finelost) VALUES (NULL, ?, ?);");
            regis.setInt(1, pd);
            regis.setInt(2, l);
            regis.executeUpdate();
            con.close();
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

    public void AddBook(String name, int type, int cat, int author, int pub, int fine, int year, int price, int qty) {
        try (Connection con = ConnectionBuilder.getConnection()) {
            PreparedStatement regis
                    = con.prepareStatement("INSERT INTO Meepooh.book (book_id, `book_name`, `type_id`, `cat_id`, `author_id`, `pub_id`, `fine_id`, `book_year`, `book_price`, `qty`) VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            regis.setString(1, name);
            regis.setInt(2, type);
            regis.setInt(3, cat);
            regis.setInt(4, author);
            regis.setInt(5, pub);
            regis.setInt(6, fine);
            regis.setInt(7, year);
            regis.setInt(8, price);
            regis.setInt(9, qty);
            regis.executeUpdate();
            con.close();
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

    public void DeleteItem() {
        jComboBox2.removeAllItems();
        jComboBox1.removeAllItems();
        jComboBox6.removeAllItems();
        jComboBox3.removeAllItems();
        jComboBox4.removeAllItems();
        jComboBox5.removeAllItems();
    }

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

    int author, pub, fine;
    Connection con;
    PreparedStatement ps;
    User user = new User();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddBookP;
    private javax.swing.JPanel EditBookP;
    private javax.swing.JPanel EditP;
    private javax.swing.JPanel LoginP;
    private javax.swing.JPanel MenuAdminP;
    private javax.swing.JPanel MenuUserP;
    private javax.swing.JPanel SignupP;
    private javax.swing.JPanel ViewBorrowP;
    private javax.swing.JPanel ViewMemberP;
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
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPasswordField passwordLIF;
    private javax.swing.JTextField usernameLIF;
    // End of variables declaration//GEN-END:variables
}
