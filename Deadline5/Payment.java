package org.example;

import javax.swing.*;
import java.sql.*;

public class Payment extends javax.swing.JFrame {
    private Object[] userData;

    private int group_id;

    private int court_id;

    private double amount;
    private javax.swing.JLabel jLabel4;


    public Payment(Object[] userData, int group_id, int court_id) {
        initComponents();
        this.userData = userData;
        this.group_id = group_id;
        this.court_id = court_id;
        this.amount = calculateAmount(userData, group_id, court_id);
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Number");

        jLabel3.setText("CVV");

        jLabel4.setText("Amount:");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setText("MM/YY");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 204, 0));
        jButton1.setText("Submit Payment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });


        jLabel4.setBackground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addComponent(jButton1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(6, 6, 6)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel3)
                                                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                        .addComponent(jTextField3)
                                                                                                        .addGap(18, 18, 18)
                                                                                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                .addGap(7, 7, 7)))))
                                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(109, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(17, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
        );

        pack();

    }


    private boolean validateCardInfo() {
        String number = jTextField2.getText();
        String cvv = jTextField3.getText();
        String expiration = jTextField4.getText();

        if (number.length() != 12) {
            JOptionPane.showMessageDialog(this, "Number should contain 12 digits.");
            return false;
        }

        if (cvv.length() != 3) {
            JOptionPane.showMessageDialog(this, "CVV should contain 3 digits.");
            return false;
        }
        if (!expiration.matches("\\d{2}/\\d{2}")) {
            JOptionPane.showMessageDialog(this, "Expiration should be in the format MM/YY.");
            return false;
        }

        // Additional checks or validations can be added here

        return true;
    }


    public double calculateAmount(Object[] userData, int group_id, int court_id) {
        double amount = 0.0;

        try {
            // Establishing database connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nearcourt", "root", "");

            // Retrieving price from the court table
            PreparedStatement courtStmt = connection.prepareStatement("SELECT price FROM court WHERE court_id = ?");
            courtStmt.setInt(1, court_id);
            ResultSet courtResult = courtStmt.executeQuery();

            if (courtResult.next()) {
                double price = courtResult.getDouble("price");

                // Retrieving group_capacity from the groups table
                PreparedStatement groupStmt = connection.prepareStatement("SELECT group_capacity FROM `groups` WHERE group_id = ?");
                groupStmt.setInt(1, group_id);
                ResultSet groupResult = groupStmt.executeQuery();

                if (groupResult.next()) {
                    int groupCapacity = groupResult.getInt("group_capacity");

                    // Calculating amount
                    if (groupCapacity != 0) {
                        amount = price / groupCapacity;
                    } else {
                        amount = price;
                    }
                }

                groupStmt.close();
                courtStmt.close();
            } else {
                JOptionPane.showMessageDialog(this, "Court not found.");
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Displaying the amount on the UI
        jLabel4.setText("Amount: $" + amount);
        return amount;
    }




    private void addPayment(double amount) {
            try {
                // Establishing database connection
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nearcourt", "root", "");

                // Inserting payment data into the payment table
                PreparedStatement paymentStmt = connection.prepareStatement("INSERT INTO payment (user_id, amount) VALUES (?, ?)");
                paymentStmt.setInt(1, (int) userData[0]); // Assuming userData[0] contains the user ID
                paymentStmt.setDouble(2, amount); // Call calculateAmount method to get the amount
                paymentStmt.executeUpdate();

                paymentStmt.close();
                connection.close();

                JOptionPane.showMessageDialog(this, "Payment added successfully!");
                successPayment();
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Failed to add payment.");
            }
        }

    public boolean successPayment() {
        return true;
    }



    /*public double calculateAmount(Object[] userData) {
        double amount = 0.0;

        try {
            // Establishing database connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nearcourt", "root", "");

            // Retrieving price from the court table
            PreparedStatement courtStmt = connection.prepareStatement("SELECT price FROM court WHERE court_id = ?");
            courtStmt.setInt(1, (int) userData[4]);
            ResultSet courtResult = courtStmt.executeQuery();

            if (courtResult.next()) {
                double price = courtResult.getDouble("price");

                // Retrieving group_capacity from the groups table
                PreparedStatement groupStmt = connection.prepareStatement("SELECT group_capacity FROM groups WHERE group_id = ?");
                groupStmt.setInt(1, (int) userData[5]);
                ResultSet groupResult = groupStmt.executeQuery();

                if (groupResult.next()) {
                    int groupCapacity = groupResult.getInt("group_capacity");

                    // Calculating amount
                    if (groupCapacity != 0) {
                        amount = price * groupCapacity;
                    } else {
                        amount = price;
                    }

                    // Displaying the amount on the UI

                }

                groupStmt.close();
                courtStmt.close();
            } else {
                JOptionPane.showMessageDialog(this, "Court not found.");
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        jLabel4.setText("Amount: $" + amount);

        return amount;
    }*/

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO: Add your handling code here (if any)
    }

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO: Add your handling code here (if any)
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (validateCardInfo()) {
            addPayment(amount);
            // Additional code for processing the payment can be added here
            //JOptionPane.showMessageDialog(this, "Payment successful!");
        }
    }

    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Object[] userData = new Object[] { 1, "5", "123", "05/25", 1, 1 }; // Example data
                new Payment(userData, 1,1).setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration
}