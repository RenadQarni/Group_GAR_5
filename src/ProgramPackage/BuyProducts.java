/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramPackage;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

public class BuyProducts extends javax.swing.JFrame implements MouseListener {

    public static Order o;

    Product[] products_list = new Product[4];

    public BuyProducts() {
       jPanel2.setBackground(jPanel1.getBackground());

      //  jPanel1.setVisible(true);
    //    full_cart.setVisible(false);

        initComponents();
        products_list[0] = new Product("Auto food Dispenser", 0, false, 0);
        products_list[1] = new Product("Auto Pet Water", 0, false, 0);
        products_list[2] = new Product("Super Soft Bed", 0, false, 0);
        products_list[3] = new Product("Smart Pet Coller", 0, false, 0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background_Gray = new javax.swing.JPanel();
        Background_White = new javax.swing.JPanel();
        Home_Icon_Label = new javax.swing.JLabel();
        Help_Icon_Label = new javax.swing.JLabel();
        dot_cart_panel = new java.awt.Panel();
        cart1 = new javax.swing.JButton();
        carttttt = new java.awt.Panel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cart_panle = new javax.swing.JButton();
        full_cart = new javax.swing.JButton();
        FoodCart_Button = new javax.swing.JButton();
        PageTitle_Label = new javax.swing.JLabel();
        Food_Label = new javax.swing.JLabel();
        Water_Label = new javax.swing.JLabel();
        Bed_Label = new javax.swing.JLabel();
        Collar_IconLabel = new javax.swing.JLabel();
        Cart_Button3 = new javax.swing.JButton();
        Collar_Label = new javax.swing.JLabel();
        Collar_OrangeSquareLabel = new javax.swing.JLabel();
        Food_IconLabel = new javax.swing.JLabel();
        Food_OrangeSquareLabel = new javax.swing.JLabel();
        Cart_Button2 = new javax.swing.JButton();
        Water_IconLabel = new javax.swing.JLabel();
        Cart_Button1 = new javax.swing.JButton();
        Water_OrangeSquareLabel = new javax.swing.JLabel();
        Bed_IconLabel = new javax.swing.JLabel();
        Bed_OrangeSquareLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        Background_Gray.setBackground(new java.awt.Color(249, 249, 249));
        Background_Gray.setLayout(null);

        Background_White.setBackground(new java.awt.Color(255, 255, 255));

        Home_Icon_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home.png"))); // NOI18N

        Help_Icon_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/help.png"))); // NOI18N

        dot_cart_panel.setLayout(null);

        cart1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/dot_cart.png"))); // NOI18N
        cart1.setBorderPainted(false);
        cart1.setContentAreaFilled(false);
        dot_cart_panel.add(cart1);
        cart1.setBounds(50, 540, 56, 42);

        carttttt.setLayout(null);
        dot_cart_panel.add(carttttt);
        carttttt.setBounds(0, 0, 60, 50);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cart_panle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cart_dark.png"))); // NOI18N
        cart_panle.setContentAreaFilled(false);
        cart_panle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cart_panleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cart_panle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cart_panle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        full_cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/dot_cart.png"))); // NOI18N
        full_cart.setContentAreaFilled(false);
        full_cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                full_cartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(full_cart, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(full_cart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout Background_WhiteLayout = new javax.swing.GroupLayout(Background_White);
        Background_White.setLayout(Background_WhiteLayout);
        Background_WhiteLayout.setHorizontalGroup(
            Background_WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Background_WhiteLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(Background_WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Background_WhiteLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(Home_Icon_Label)
                        .addGap(61, 61, 61)
                        .addComponent(Help_Icon_Label))
                    .addComponent(dot_cart_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        Background_WhiteLayout.setVerticalGroup(
            Background_WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Background_WhiteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Background_WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Home_Icon_Label)
                    .addComponent(Help_Icon_Label)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(dot_cart_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        Background_Gray.add(Background_White);
        Background_White.setBounds(0, 620, 390, 182);

        FoodCart_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add-cart.png"))); // NOI18N
        FoodCart_Button.setContentAreaFilled(false);
        FoodCart_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodCart_ButtonActionPerformed(evt);
            }
        });
        Background_Gray.add(FoodCart_Button);
        FoodCart_Button.setBounds(240, 140, 50, 50);

        PageTitle_Label.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        PageTitle_Label.setForeground(new java.awt.Color(51, 0, 102));
        PageTitle_Label.setText("Products");
        Background_Gray.add(PageTitle_Label);
        PageTitle_Label.setBounds(30, 30, 190, 37);

        Food_Label.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Food_Label.setForeground(new java.awt.Color(255, 255, 255));
        Food_Label.setText("Auto food dispenser");
        Background_Gray.add(Food_Label);
        Food_Label.setBounds(90, 120, 202, 25);

        Water_Label.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Water_Label.setForeground(new java.awt.Color(255, 255, 255));
        Water_Label.setText("Auto Water Fountain");
        Background_Gray.add(Water_Label);
        Water_Label.setBounds(90, 220, 210, 25);

        Bed_Label.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Bed_Label.setForeground(new java.awt.Color(255, 255, 255));
        Bed_Label.setText("Super Soft Bed");
        Background_Gray.add(Bed_Label);
        Bed_Label.setBounds(120, 310, 152, 25);

        Collar_IconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Collar_1.png"))); // NOI18N
        Background_Gray.add(Collar_IconLabel);
        Collar_IconLabel.setBounds(30, 430, 57, 57);

        Cart_Button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add-cart.png"))); // NOI18N
        Cart_Button3.setContentAreaFilled(false);
        Cart_Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cart_Button3ActionPerformed(evt);
            }
        });
        Background_Gray.add(Cart_Button3);
        Cart_Button3.setBounds(240, 450, 50, 50);

        Collar_Label.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Collar_Label.setForeground(new java.awt.Color(255, 255, 255));
        Collar_Label.setText("Smart Pet Collar");
        Background_Gray.add(Collar_Label);
        Collar_Label.setBounds(120, 420, 164, 25);

        Collar_OrangeSquareLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Orange_Br.png"))); // NOI18N
        Background_Gray.add(Collar_OrangeSquareLabel);
        Collar_OrangeSquareLabel.setBounds(10, 410, 309, 95);

        Food_IconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Food2.png"))); // NOI18N
        Food_IconLabel.setPreferredSize(new java.awt.Dimension(70, 70));
        Background_Gray.add(Food_IconLabel);
        Food_IconLabel.setBounds(30, 100, 110, 90);

        Food_OrangeSquareLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Orange_Br.png"))); // NOI18N
        Background_Gray.add(Food_OrangeSquareLabel);
        Food_OrangeSquareLabel.setBounds(10, 100, 320, 95);

        Cart_Button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add-cart.png"))); // NOI18N
        Cart_Button2.setContentAreaFilled(false);
        Cart_Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cart_Button2ActionPerformed(evt);
            }
        });
        Background_Gray.add(Cart_Button2);
        Cart_Button2.setBounds(240, 240, 50, 50);

        Water_IconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Water1.png"))); // NOI18N
        Background_Gray.add(Water_IconLabel);
        Water_IconLabel.setBounds(20, 200, 68, 90);

        Cart_Button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add-cart.png"))); // NOI18N
        Cart_Button1.setContentAreaFilled(false);
        Cart_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cart_Button1ActionPerformed(evt);
            }
        });
        Background_Gray.add(Cart_Button1);
        Cart_Button1.setBounds(240, 340, 50, 50);

        Water_OrangeSquareLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Orange_Br.png"))); // NOI18N
        Background_Gray.add(Water_OrangeSquareLabel);
        Water_OrangeSquareLabel.setBounds(10, 200, 310, 95);

        Bed_IconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Bed_1.png"))); // NOI18N
        Background_Gray.add(Bed_IconLabel);
        Bed_IconLabel.setBounds(30, 320, 60, 61);

        Bed_OrangeSquareLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Orange_Br.png"))); // NOI18N
        Background_Gray.add(Bed_OrangeSquareLabel);
        Bed_OrangeSquareLabel.setBounds(10, 300, 310, 95);

        getContentPane().add(Background_Gray);
        Background_Gray.setBounds(0, 0, 380, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cart_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cart_Button1ActionPerformed
        products_list[1] = new Product("Auto Pet Water", 0, false, 0);
        if (products_list[1].isSelected() == false) {
            products_list[1].setPrice(150);
            products_list[1].setSelected(true);
            products_list[1].setAmount(1);
            full_cart.setVisible(true);
            jPanel1.setVisible(false);
        }
        o = new Order();
        o.addProduct(products_list[1]);
    }//GEN-LAST:event_Cart_Button1ActionPerformed

    private void Cart_Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cart_Button2ActionPerformed
        products_list[2] = new Product("Super Soft Bed", 0, false, 0);
        if (products_list[2].isSelected() == false) {
            products_list[2].setPrice(200);
            products_list[2].setSelected(true);
            products_list[2].setAmount(1);
            full_cart.setVisible(true);
            jPanel1.setVisible(false);
        }
        o = new Order();
        o.addProduct(products_list[2]);
    }//GEN-LAST:event_Cart_Button2ActionPerformed

    private void Cart_Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cart_Button3ActionPerformed
        products_list[3] = new Product("Smart Pet Coller", 0, false, 0);
        if (products_list[3].isSelected() == false) {
            products_list[3].setPrice(150);
            products_list[3].setSelected(true);
            products_list[3].setAmount(1);
            full_cart.setVisible(true);
            jPanel1.setVisible(false);
        }
        o = new Order();
        o.addProduct(products_list[3]);
    }//GEN-LAST:event_Cart_Button3ActionPerformed

    private void FoodCart_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodCart_ButtonActionPerformed
        products_list[0] = new Product("Auto food Dispenser", 0, false, 0);
        if (products_list[0].isSelected() == false) {
            products_list[0].setPrice(100);
            products_list[0].setSelected(true);
            products_list[0].setAmount(1);
            full_cart.setVisible(true);
            jPanel1.setVisible(false);
        }
        o = new Order();
        o.addProduct(products_list[0]);


    }//GEN-LAST:event_FoodCart_ButtonActionPerformed

    private void full_cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_full_cartActionPerformed
        // TODO add your handling code here:
        if (products_list[0].isSelected() == true || products_list[1].isSelected() == true || products_list[2].isSelected() == true || products_list[3].isSelected() == true) {
            Date_Time X = new Date_Time();
            X.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_full_cartActionPerformed

    private void cart_panleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cart_panleActionPerformed
        JOptionPane.showMessageDialog(null, "No Product have been Selected the cart is empty!", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_cart_panleActionPerformed

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
            java.util.logging.Logger.getLogger(BuyProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background_Gray;
    private javax.swing.JPanel Background_White;
    private javax.swing.JLabel Bed_IconLabel;
    private javax.swing.JLabel Bed_Label;
    private javax.swing.JLabel Bed_OrangeSquareLabel;
    private javax.swing.JButton Cart_Button1;
    private javax.swing.JButton Cart_Button2;
    private javax.swing.JButton Cart_Button3;
    private javax.swing.JLabel Collar_IconLabel;
    private javax.swing.JLabel Collar_Label;
    private javax.swing.JLabel Collar_OrangeSquareLabel;
    private javax.swing.JButton FoodCart_Button;
    private javax.swing.JLabel Food_IconLabel;
    private javax.swing.JLabel Food_Label;
    private javax.swing.JLabel Food_OrangeSquareLabel;
    private javax.swing.JLabel Help_Icon_Label;
    private javax.swing.JLabel Home_Icon_Label;
    private javax.swing.JLabel PageTitle_Label;
    private javax.swing.JLabel Water_IconLabel;
    private javax.swing.JLabel Water_Label;
    private javax.swing.JLabel Water_OrangeSquareLabel;
    private javax.swing.JButton cart1;
    private javax.swing.JButton cart_panle;
    private java.awt.Panel carttttt;
    private java.awt.Panel dot_cart_panel;
    private javax.swing.JButton full_cart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
