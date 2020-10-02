
// importing all the sql classes classes in java will be imported 
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohan
 */
public class productsCrud extends javax.swing.JFrame {
    /**
     * Creates new form productsCrud
     */
    public productsCrud(){
        initComponents();
        jButton6.requestFocus();
        // calling the connect method
        connect();
        LoadProductNo();
    }
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    // establishing database connection between java and mysql
    public void connect(){
        try {
            //register the mysql jdbc
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost/product_management_system","root","");
            } catch (SQLException ex) {
                Logger.getLogger(productsCrud.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(productsCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //loading the pid in product id dropdown
    
    public void LoadProductNo(){
        try {
            pst = con.prepareStatement("select id,pname from products");
            rs = pst.executeQuery();
            pid.removeAllItems();
            pid.addItem("Choose Item");
            while(rs.next()){
                pid.addItem(rs.getString(1) +" - "+ rs.getString(2));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(productsCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtpname = new javax.swing.JTextField();
        txtpprice = new javax.swing.JTextField();
        txtpqty = new javax.swing.JTextField();
        pid = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product Management System");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 658, 420));
        setMaximumSize(new java.awt.Dimension(658, 420));
        setMinimumSize(new java.awt.Dimension(658, 420));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("PRODUCT MANAGEMENT SYSTEM");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRODUCT INFO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 102, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("PRODUCT NAME");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("PRICE");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("QUANTITY");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("PRODUCT ID");

        pid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pidMouseClicked(evt);
            }
        });
        pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidActionPerformed(evt);
            }
        });
        pid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pidKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 255));
        jLabel6.setText("(CHOOSE THE ITEM AND PRESS ENTER)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtpqty, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(txtpprice, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addGap(32, 32, 32)
                .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtpqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(29, 29, 29))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPTIONS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 102, 51))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton2.setForeground(new java.awt.Color(0, 0, 255));
        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(255, 153, 0));
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });

        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });

        jButton5.setForeground(new java.awt.Color(0, 204, 0));
        jButton5.setText("NEW");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton5KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton3)
                .addGap(28, 28, 28)
                .addComponent(jButton4)
                .addGap(39, 39, 39)
                .addComponent(jButton5)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 204, 0));
        jButton6.setText("BILLING ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton6KeyPressed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 0, 0));
        jButton7.setText("CLOSE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jButton7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton7KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(61, 61, 61)
                                .addComponent(jButton7))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        //Deleting data
        if(pid.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Select an Item to Delete!");
        }
        else{
        String id = pid.getSelectedItem().toString();
        String arr[] = id.split(" ");
        id = arr[0];
        String pid = id;
        try {
           
            pst = con.prepareStatement("delete from products where id=?");
            pst.setString(1, pid);
            JOptionPane.showMessageDialog(this, pst);
        } catch (SQLException ex) {
            Logger.getLogger(productsCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
        int k = 0;
        try {
            k = pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(productsCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        //checking whether the record is added or not        
        if (k==1){
            JOptionPane.showMessageDialog(this, "Record deleted successfully!");
            txtpname.setText("");
            txtpprice.setText("");
            txtpqty.setText("");
            //changing back the focus to first field
            txtpname.requestFocus();
        }
        else{
            JOptionPane.showMessageDialog(this, "Record deletion failed!");
        }
        }
        LoadProductNo();
        txtpname.requestFocus();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        //updating data
        if(pid.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Select an Item to Update!");
        }
        else{
        String pname = txtpname.getText();
        String price = txtpprice.getText();
        String qty = txtpqty.getText();
        String id = pid.getSelectedItem().toString();
        String arr[] = id.split(" ");
        id = arr[0];
        
        int pprice = Integer.parseInt(price);
        int pqty = Integer.parseInt(qty);
        int pid = Integer.parseInt(id);
        
        try {
            pst = con.prepareStatement("update products set pname=?,pprice=?,pqty=? where id=?");
            pst.setString(1, pname);
            pst.setInt(2, pprice);
            pst.setInt(3, pqty);
            pst.setInt(4, pid);
        } catch (SQLException ex) {
            Logger.getLogger(productsCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
        int k = 0;
        try {
            k = pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(productsCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        //checking whether the record is added or not        
        if (k==1){
            JOptionPane.showMessageDialog(this, "Record updated successfully!");
            txtpname.setText("");
            txtpprice.setText("");
            txtpqty.setText("");
            //changing back the focus to first field
            txtpname.requestFocus();
        }
        else{
            JOptionPane.showMessageDialog(this, "Record updation failed!");
        }
        }
        LoadProductNo();
        txtpname.requestFocus();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(txtpname.getText().equals("") || txtpprice.getText().equals("") || txtpqty.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Enter the product details to add!");
        }
        else{
        String pname = txtpname.getText();
        String price = txtpprice.getText();
        String qty = txtpqty.getText();
            try {
                pst = con.prepareStatement("select * from products");
                rs = pst.executeQuery();
                int l =0;
                while(rs.next()){
                    if(pname.equals(rs.getString("pname"))){
                        pst = con.prepareStatement("update products set pqty=?,pprice=? where id=?");
                        int current_qty = Integer.parseInt(rs.getString("pqty")) + Integer.parseInt(qty);
                        pst.setString(1, Integer.toString(current_qty));
                        pst.setString(2, price);
                        pst.setString(3, rs.getString("id"));
                        l = pst.executeUpdate();
                        if(l!=0){
                           JOptionPane.showMessageDialog(this, pname +" is updated successfully!");
                        }
                        return;
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(productsCrud.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        int pprice = Integer.parseInt(price);
        int pqty = Integer.parseInt(qty);
        
        try {
            pst = con.prepareStatement("insert into products(pname,pprice,pqty) values (?,?,?)");
            pst.setString(1, pname);
            pst.setInt(2, pprice);
            pst.setInt(3, pqty);
        } catch (SQLException ex) {
            Logger.getLogger(productsCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
        int k = 0;
        try {
            k = pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(productsCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        //checking whether the record is added or not        
        if (k==1){
            JOptionPane.showMessageDialog(this, "Record added successfully!");
            txtpname.setText("");
            txtpprice.setText("");
            txtpqty.setText("");
            //changing back the focus to first field
            txtpname.requestFocus();
        }
        else{
            JOptionPane.showMessageDialog(this, "Record addtion failed!");
        }
        }
        LoadProductNo();
        txtpname.requestFocus();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            
            pid.setSelectedIndex(0);
            
            txtpname.setText("");
            txtpprice.setText("");
            txtpqty.setText("");
            //changing back the focus to first field
            txtpname.requestFocus();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose();
        new productsBilling().setVisible(true);
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //dispose();
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidActionPerformed
       
    }//GEN-LAST:event_pidActionPerformed

    private void pidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pidKeyPressed
        //search
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String id = pid.getSelectedItem().toString();
            if(id == "Choose Item"){
                txtpname.setText("");
                txtpprice.setText("");
                txtpqty.setText("");
                LoadProductNo();
            }
            else{
            try {
                pst = con.prepareStatement("select * from products where id = ?");
                pst.setString(1, id);
                rs = pst.executeQuery();
            
                if(rs.next() == true){
                    txtpname.setText(rs.getString(2));
                    txtpprice.setText(rs.getString(3));
                    txtpqty.setText(rs.getString(4));
                }
            } catch (SQLException ex) {
                Logger.getLogger(productsCrud.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            txtpprice.requestFocus();
        }
    }//GEN-LAST:event_pidKeyPressed

    private void pidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pidMouseClicked
        
    }//GEN-LAST:event_pidMouseClicked

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(txtpname.getText().equals("") || txtpprice.getText().equals("") || txtpqty.getText().equals("") ){
            JOptionPane.showMessageDialog(this, "Enter the product details to add!");
        }
        else{
        String pname = txtpname.getText();
        String price = txtpprice.getText();
        String qty = txtpqty.getText();
            try {
                pst = con.prepareStatement("select * from products");
                rs = pst.executeQuery();
                int l =0;
                while(rs.next()){
                    if(pname.equals(rs.getString("pname"))){
                        pst = con.prepareStatement("update products set pqty=?,pprice=? where id=?");
                        int current_qty = Integer.parseInt(rs.getString("pqty")) + Integer.parseInt(qty);
                        pst.setString(1, Integer.toString(current_qty));
                        pst.setString(2, price);
                        pst.setString(3, rs.getString("id"));
                        l = pst.executeUpdate();
                        if(l!=0){
                           JOptionPane.showMessageDialog(this, pname +" is updated successfully!");
                        }
                        return;
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(productsCrud.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        int pprice = Integer.parseInt(price);
        int pqty = Integer.parseInt(qty);
        
        try {
            pst = con.prepareStatement("insert into products(pname,pprice,pqty) values (?,?,?)");
            pst.setString(1, pname);
            pst.setInt(2, pprice);
            pst.setInt(3, pqty);
        } catch (SQLException ex) {
            Logger.getLogger(productsCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
        int k = 0;
        try {
            k = pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(productsCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        //checking whether the record is added or not        
        if (k==1){
            JOptionPane.showMessageDialog(this, "Record added successfully!");
            txtpname.setText("");
            txtpprice.setText("");
            txtpqty.setText("");
            //changing back the focus to first field
            txtpname.requestFocus();
        }
        else{
            JOptionPane.showMessageDialog(this, "Record addtion failed!");
        }
        }
        LoadProductNo();
        txtpname.requestFocus();
        
        }
    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           if(pid.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Select an Item to Update!");
        }
        else{
        String pname = txtpname.getText();
        String price = txtpprice.getText();
        String qty = txtpqty.getText();
        String id = pid.getSelectedItem().toString();
        String arr[] = id.split(" ");
        id = arr[0];
        
        int pprice = Integer.parseInt(price);
        int pqty = Integer.parseInt(qty);
        int pid = Integer.parseInt(id);
        
        try {
            pst = con.prepareStatement("update products set pname=?,pprice=?,pqty=? where id=?");
            pst.setString(1, pname);
            pst.setInt(2, pprice);
            pst.setInt(3, pqty);
            pst.setInt(4, pid);
        } catch (SQLException ex) {
            Logger.getLogger(productsCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
        int k = 0;
        try {
            k = pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(productsCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        //checking whether the record is added or not        
        if (k==1){
            JOptionPane.showMessageDialog(this, "Record updated successfully!");
            txtpname.setText("");
            txtpprice.setText("");
            txtpqty.setText("");
            //changing back the focus to first field
            txtpname.requestFocus();
        }
        else{
            JOptionPane.showMessageDialog(this, "Record updation failed!");
        }
        }
        LoadProductNo();
        txtpname.requestFocus();
       }
    }//GEN-LAST:event_jButton3KeyPressed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            //Deleting data
        if(pid.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Select an Item to Delete!");
        }
        else{
        String id = pid.getSelectedItem().toString();
        String arr[] = id.split(" ");
        id = arr[0];
        int pid = Integer.parseInt(id);
        
        try {
            pst = con.prepareStatement("delete from products where id=?");
            pst.setInt(1, pid);
        } catch (SQLException ex) {
            Logger.getLogger(productsCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
        int k = 0;
        try {
            k = pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(productsCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        //checking whether the record is added or not        
        if (k==1){
            JOptionPane.showMessageDialog(this, "Record deleted successfully!");
            txtpname.setText("");
            txtpprice.setText("");
            txtpqty.setText("");
            //changing back the focus to first field
            txtpname.requestFocus();
        }
        else{
            JOptionPane.showMessageDialog(this, "Record deletion failed!");
        }
        }
        LoadProductNo();
        txtpname.requestFocus();
        }
    }//GEN-LAST:event_jButton4KeyPressed

    private void jButton5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton5KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
             pid.setSelectedIndex(0);
            
            txtpname.setText("");
            txtpprice.setText("");
            txtpqty.setText("");
            //changing back the focus to first field
            txtpname.requestFocus();
        }
    }//GEN-LAST:event_jButton5KeyPressed

    private void jButton6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton6KeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            dispose();
        new productsBilling().setVisible(true);
        }
    }//GEN-LAST:event_jButton6KeyPressed

    private void jButton7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton7KeyPressed
    if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        System.exit(0);
    }
    }//GEN-LAST:event_jButton7KeyPressed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(productsCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productsCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productsCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productsCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productsCrud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> pid;
    private javax.swing.JTextField txtpname;
    private javax.swing.JTextField txtpprice;
    private javax.swing.JTextField txtpqty;
    // End of variables declaration//GEN-END:variables
}
