
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Στελιος Πανσεληνας
 */
public class FindGroupGUI extends javax.swing.JFrame {

    /**
     * Creates new form FindGroup
     */
    public FindGroupGUI() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        groupsTable = new javax.swing.JTable();
        joinBut = new javax.swing.JButton();
        sportComboBox = new javax.swing.JComboBox<>();
        courtComboBox = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        profileBut = new javax.swing.JButton();
        logoutBut = new javax.swing.JButton();
        findGroupsBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setBackground(new java.awt.Color(51, 204, 0));
        jLabel5.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("jLabel5");
        jLabel5.setOpaque(true);

        groupsTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {"", "", "", ""},
                        {"", "", "", ""},
                        {"", "", "", ""},
                        {"", "", "", ""},
                        {"", "", "", ""},
                        {"", "", "", ""},
                        {"", "", "", ""},
                        {"", "", "", ""},
                        {"", "", "", ""},
                        {"", "", "", ""}
                },
                new String [] {
                        "Court", "Date", "Sport", "Players"
                }
        ));
        jScrollPane2.setViewportView(groupsTable);

        joinBut.setBackground(new java.awt.Color(0, 204, 0));
        joinBut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        joinBut.setForeground(new java.awt.Color(255, 255, 255));
        joinBut.setText("Join");
        joinBut.setBorderPainted(false);

        sportComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sportComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Football", "Basket", "Tennis" }));

        courtComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        courtComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Players", "1", "2", "3", "4" }));

        profileBut.setBackground(new java.awt.Color(102, 153, 255));
        profileBut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profileBut.setText("Profile");
        profileBut.setBorderPainted(false);

        logoutBut.setBackground(new java.awt.Color(102, 153, 255));
        logoutBut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutBut.setText("LogOut");
        logoutBut.setBorderPainted(false);

        findGroupsBut.setBackground(new java.awt.Color(0, 51, 255));
        findGroupsBut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        findGroupsBut.setForeground(new java.awt.Color(255, 255, 255));
        findGroupsBut.setText("Find Groups");
        findGroupsBut.setBorderPainted(false);
        findGroupsBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findGroupsButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(271, 271, 271)
                                                .addComponent(joinBut))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(81, 81, 81)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(sportComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(101, 101, 101)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(findGroupsBut)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(courtComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                .addContainerGap(189, Short.MAX_VALUE))
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(profileBut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logoutBut))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(profileBut)
                                        .addComponent(logoutBut))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(sportComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(courtComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addComponent(findGroupsBut)
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(joinBut)
                                .addContainerGap(254, Short.MAX_VALUE))
        );

        pack();

        String url = "jdbc:mysql://localhost:3306/near";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stm = con.createStatement();
            ResultSet rslt = stm.executeQuery("SELECT name,date,groups.sport,players FROM `groups` INNER JOIN court ON court.court_id = groups.court_id");
            ResultSetMetaData metaData = rslt.getMetaData();
            int numOfColumns = metaData.getColumnCount();
            while(rslt.next()){
                for(int i=1; i<=numOfColumns; i++){
                    groupsTable.setValueAt(rslt.getObject(i),0,i-1 );
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {


    }// </editor-fold>

    private void findGroupsButActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

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
            java.util.logging.Logger.getLogger(FindGroupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindGroupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindGroupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindGroupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FindGroupGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private static javax.swing.JComboBox<String> courtComboBox;
    private static javax.swing.JButton findGroupsBut;
    private static javax.swing.JTable groupsTable;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JButton joinBut;
    private static javax.swing.JButton logoutBut;
    private static javax.swing.JButton profileBut;
    private static javax.swing.JComboBox<String> sportComboBox;
    // End of variables declaration
}