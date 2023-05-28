package org.example;

import javax.swing.*;
import java.sql.*;

public class Payment extends JFrame {
    private Object[] userData;
    private JLabel jLabelAmount;
    private double amount;
    private  double price;

    public Payment(Object[] userData) {

        initComponents();
        this.userData = userData;
        // price = getPrice((int) userData[4]);
        //System.out.println("timi prwth" + price);
        amount = calculateAmount(userData);
        for (Object obj : userData) {
            System.out.println(obj.toString());
        }
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        jTextFieldName = new JTextField();
        jLabelName = new JLabel();
        jLabelNumber = new JLabel();
        jTextField2 = new JTextField();
        jLabelCVV = new JLabel();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        jButtonSubmit = new JButton();
        jLabelAmount = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabelName.setText("Name");

        jLabelNumber.setText("Number");

        jLabelCVV.setText("CVV");

        jLabelAmount.setText("Amount:");

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

        jButtonSubmit.setBackground(new java.awt.Color(102, 204, 0));
        jButtonSubmit.setText("Submit Payment");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jLabelAmount.setBackground(new java.awt.Color(0, 153, 0));
        jLabelAmount.setText("Amount");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addComponent(jButtonSubmit))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabelAmount,
                                                                GroupLayout.PREFERRED_SIZE, 124,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabelName,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                60,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabelNumber,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                64,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(6, 6, 6)
                                                                                .addGroup(jPanel1Layout
                                                                                        .createParallelGroup(
                                                                                                GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabelCVV)
                                                                                        .addComponent(jTextFieldName,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                161,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(jPanel1Layout
                                                                                                .createParallelGroup(
                                                                                                        GroupLayout.Alignment.TRAILING,
                                                                                                        false)
                                                                                                .addGroup(jPanel1Layout
                                                                                                        .createSequentialGroup()
                                                                                                        .addComponent(
                                                                                                                jTextField3)
                                                                                                        .addGap(18, 18,
                                                                                                                18)
                                                                                                        .addComponent(
                                                                                                                jTextField4,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                                .addComponent(
                                                                                                        jTextField2,
                                                                                                        GroupLayout.PREFERRED_SIZE,
                                                                                                        161,
                                                                                                        GroupLayout.PREFERRED_SIZE)))))
                                                                .addGap(7, 7, 7)))))
                                .addContainerGap(37, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelName)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldName, GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelNumber)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelCVV, GroupLayout.PREFERRED_SIZE, 14,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 26,
                                        Short.MAX_VALUE)
                                .addComponent(jLabelAmount, GroupLayout.PREFERRED_SIZE, 40,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSubmit)
                                .addContainerGap()));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(109, Short.MAX_VALUE)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(17, Short.MAX_VALUE)
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)));

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

   /* private double getPrice(int court_id) {
        try {
            // Establishing database connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nearcourt", "root", "");

            // Retrieving price from the court table
            PreparedStatement courtStmt = connection.prepareStatement("SELECT price FROM court WHERE court_id = ?");
            courtStmt.setInt(1, court_id);
            System.out.println(court_id);

            ResultSet courtResult = courtStmt.executeQuery();

            if (courtResult.next()) {
                double price = courtResult.getDouble("price");
                System.out.println(price);
            } else {
                JOptionPane.showMessageDialog(this, "Court not found.");
            }
        }catch(Exception e){
                System.out.println(e);
            }
            return price;
    }*/
    public double calculateAmount(Object[] userData) {
        double amount = 0.0;

        try {
            // Establishing database connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nearcourt", "root", "");

            // Retrieving price from the court table
            PreparedStatement courtStmt = connection.prepareStatement("SELECT price FROM `court` WHERE court_id = ?");
            courtStmt.setInt(1, (int) userData[4]);
            ResultSet courtResult = courtStmt.executeQuery();

            if (courtResult.next()) {
                double price = courtResult.getDouble("price");

                // Retrieving group_capacity from the groups table
                PreparedStatement groupStmt = connection.prepareStatement("SELECT group_capacity FROM `groups` WHERE group_id = ?");
                groupStmt.setInt(1, (int) userData[5]);
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

        jLabelAmount.setText("Amount: $" + amount);
        return amount;
    }
        /*public double calculateAmount(Object[] userData, double price){
            double amount = 0.0;
            System.out.println("calculateA"+price);
            try {
                // Establishing database connection
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nearcourt", "root", "");
                // Retrieving group_capacity from the groups table
                PreparedStatement groupStmt = connection
                        .prepareStatement("SELECT group_capacity FROM `groups` WHERE group_id = ?");
                groupStmt.setInt(1, (int) userData[5]);
                ResultSet groupResult = groupStmt.executeQuery();

                if (groupResult.next()) {
                    int groupCapacity = groupResult.getInt("group_capacity");
                        System.out.println(groupCapacity);
                    // Calculating amount
                    if (groupCapacity != 0) {
                        amount = price / groupCapacity;
                    } else {
                        amount = price;
                    }
                }

                groupStmt.close();

                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // Displaying the amount on the UI
            jLabelAmount.setText("Amount: $" + amount);
            return amount;
        }*/

        private void addPayment ( double amount){
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

        public boolean successPayment () {
            return true;
        }

        private void jTextField3ActionPerformed (java.awt.event.ActionEvent evt){
            // TODO: Add your handling code here (if any)
        }

        private void jTextField4ActionPerformed (java.awt.event.ActionEvent evt){
            // TODO: Add your handling code here (if any)
        }

        private void jButtonSubmitActionPerformed (java.awt.event.ActionEvent evt){
            if (validateCardInfo()) {
                addPayment(amount);
                // Additional code for processing the payment can be added here
                // JOptionPane.showMessageDialog(this, "Payment successful!");
            }
        }


        private JButton jButtonSubmit;
        private JLabel jLabelName;
        private JLabel jLabelNumber;
        private JLabel jLabelCVV;
        private JPanel jPanel1;
        private JTextField jTextFieldName;
        private JTextField jTextField2;
        private JTextField jTextField3;
        private JTextField jTextField4;


    }
