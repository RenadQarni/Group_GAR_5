/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramPackage;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;

public class BuyProducts extends javax.swing.JFrame implements MouseListener {

    public static Order o;

    ImageIcon redcart, blackcart;
    private int count = 0;
    private int watcount = 0;
    private int beddcount = 0;
    private int colllercount = 0;

    Product[] products_list = new Product[4];

    public BuyProducts() {
        redcart = new ImageIcon("shopping-cart.png");
        blackcart = new ImageIcon("shopping-cart(1).png");

        initComponents();
        products_list[0] = new Product("Auto food Dispenser", 0, false, 0);
        products_list[1] = new Product("Auto Pet Water", 0, false, 0);
        products_list[2] = new Product("Super Soft Bed", 0, false, 0);
        products_list[3] = new Product("Smart Pet Coller", 0, false, 0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        foodcount = new javax.swing.JLabel();
        addfood = new javax.swing.JButton();
        lessfood = new javax.swing.JButton();
        addwater = new javax.swing.JButton();
        watercount = new javax.swing.JLabel();
        lesswater = new javax.swing.JButton();
        addbed = new javax.swing.JButton();
        bedcount = new javax.swing.JLabel();
        lessbed = new javax.swing.JButton();
        addcoller = new javax.swing.JButton();
        collercount = new javax.swing.JLabel();
        lesscoller = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        PageTitle_Label = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(349, 514));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foodcount.setText("0");
        getContentPane().add(foodcount, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 20, 20));

        addfood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/plus.png"))); // NOI18N
        addfood.setContentAreaFilled(false);
        addfood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addfoodActionPerformed(evt);
            }
        });
        getContentPane().add(addfood, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 30, 30));

        lessfood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/minus.png"))); // NOI18N
        lessfood.setContentAreaFilled(false);
        lessfood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessfoodActionPerformed(evt);
            }
        });
        getContentPane().add(lessfood, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 30, 30));

        addwater.setBackground(new java.awt.Color(255, 255, 255));
        addwater.setForeground(new java.awt.Color(255, 255, 255));
        addwater.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/plus.png"))); // NOI18N
        addwater.setContentAreaFilled(false);
        addwater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addwaterActionPerformed(evt);
            }
        });
        getContentPane().add(addwater, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 30, 30));

        watercount.setText("0");
        getContentPane().add(watercount, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 20, 20));

        lesswater.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/minus.png"))); // NOI18N
        lesswater.setContentAreaFilled(false);
        lesswater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lesswaterActionPerformed(evt);
            }
        });
        getContentPane().add(lesswater, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 30, 30));

        addbed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/plus.png"))); // NOI18N
        addbed.setContentAreaFilled(false);
        addbed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbedActionPerformed(evt);
            }
        });
        getContentPane().add(addbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 30, 30));

        bedcount.setText("0");
        getContentPane().add(bedcount, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 20, 20));

        lessbed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/minus.png"))); // NOI18N
        lessbed.setContentAreaFilled(false);
        lessbed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessbedActionPerformed(evt);
            }
        });
        getContentPane().add(lessbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 30, 30));

        addcoller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/plus.png"))); // NOI18N
        addcoller.setContentAreaFilled(false);
        addcoller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcollerActionPerformed(evt);
            }
        });
        getContentPane().add(addcoller, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 30, 30));

        collercount.setText("0");
        getContentPane().add(collercount, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 20, 20));

        lesscoller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/minus.png"))); // NOI18N
        lesscoller.setContentAreaFilled(false);
        lesscoller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lesscollerActionPerformed(evt);
            }
        });
        getContentPane().add(lesscoller, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 30, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Auto food dispenser");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Auto Water Fountain");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Super Soft Bed");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/bed.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/collar.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Smart Pet Collar");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Orange_Br.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jPanel1.setBackground(new java.awt.Color(249, 249, 249));

        PageTitle_Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PageTitle_Label.setForeground(new java.awt.Color(51, 0, 102));
        PageTitle_Label.setText("Products");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cart_dark.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/help.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel15)
                .addGap(44, 44, 44)
                .addComponent(jLabel16)
                .addGap(45, 45, 45)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel2.setText("total");

        jButton1.setText("cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/food.png"))); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(70, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Orange_Br.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/water.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Orange_Br.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Orange_Br.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(PageTitle_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addComponent(jButton1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(PageTitle_Label)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addGap(145, 145, 145)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int total = products_list[0].getPrice() + products_list[1].getPrice() + products_list[2].getPrice() + products_list[3].getPrice();
        jLabel2.setText("total: " + total + "");

        o = new Order();
        o.addProduct(products_list[0]);

        Date_Time X = new Date_Time();
        X.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lesscollerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lesscollerActionPerformed
        //less
        if (colllercount > 0) {
            colllercount -= 1;
        }
        collercount.setText(colllercount + "");
        products_list[3] = new Product("Smart Pet Coller", 250 * colllercount, false, colllercount);
        jLabel11.setText(products_list[3] + "");
    }//GEN-LAST:event_lesscollerActionPerformed

    private void addcollerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcollerActionPerformed
        //adding
        colllercount += 1;
        collercount.setText(colllercount + "");
        products_list[3] = new Product("Smart Pet Coller", 250 * colllercount, false, colllercount);
        jLabel11.setText(products_list[3] + "");
    }//GEN-LAST:event_addcollerActionPerformed

    private void lessbedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessbedActionPerformed
        //less
        if (beddcount > 0) {
            beddcount -= 1;
        }
        bedcount.setText(beddcount + "");
        products_list[2] = new Product("Super Soft Bed", 150 * beddcount, false, beddcount);
        jLabel11.setText(products_list[2] + "");
    }//GEN-LAST:event_lessbedActionPerformed

    private void addbedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbedActionPerformed
        //adding
        beddcount += 1;
        bedcount.setText(beddcount + "");
        products_list[2] = new Product("Super Soft Bed", 150 * beddcount, false, beddcount);
        jLabel11.setText(products_list[2] + "");
    }//GEN-LAST:event_addbedActionPerformed

    private void lesswaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lesswaterActionPerformed
        //less
        if (watcount > 0) {
            watcount -= 1;
        }
        watercount.setText(watcount + "");
        products_list[1] = new Product("Auto Pet Water", 100 * watcount, false, watcount);
        jLabel11.setText(products_list[1] + "");
    }//GEN-LAST:event_lesswaterActionPerformed

    private void addwaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addwaterActionPerformed
        //adding

        watcount += 1;
        watercount.setText(watcount + "");
        products_list[1] = new Product("Auto Pet Water", 100 * watcount, false, watcount);
        jLabel11.setText(products_list[1] + "");
    }//GEN-LAST:event_addwaterActionPerformed

    private void lessfoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessfoodActionPerformed
        //less
        if (count > 0) {
            count -= 1;
        }
        foodcount.setText(count + "");
        products_list[0] = new Product("Auto food Dispenser", 100 * count, false, count);
        jLabel11.setText(products_list[0] + "");
    }//GEN-LAST:event_lessfoodActionPerformed

    private void addfoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addfoodActionPerformed
        //adding
        count += 1;
        foodcount.setText(count + "");
        products_list[0] = new Product("Auto food Dispenser", 100 * count, false, count);
        jLabel11.setText(products_list[0] + "");
    }//GEN-LAST:event_addfoodActionPerformed

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
    private javax.swing.JLabel PageTitle_Label;
    private javax.swing.JButton addbed;
    private javax.swing.JButton addcoller;
    private javax.swing.JButton addfood;
    private javax.swing.JButton addwater;
    private javax.swing.JLabel bedcount;
    private javax.swing.JLabel collercount;
    private javax.swing.JLabel foodcount;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton lessbed;
    private javax.swing.JButton lesscoller;
    private javax.swing.JButton lessfood;
    private javax.swing.JButton lesswater;
    private javax.swing.JLabel watercount;
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
