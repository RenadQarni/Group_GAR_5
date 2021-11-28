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

        backToprevious = new javax.swing.JLabel();
        PageTitle_Label = new javax.swing.JLabel();
        water = new javax.swing.JLabel();
        foodcount = new javax.swing.JLabel();
        bed = new javax.swing.JLabel();
        coller = new javax.swing.JLabel();
        food = new javax.swing.JLabel();
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
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        backToprevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        backToprevious.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backTopreviousbackToPrevious(evt);
            }
        });
        getContentPane().add(backToprevious);
        backToprevious.setBounds(0, 0, 50, 50);

        PageTitle_Label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        PageTitle_Label.setText("STORE");
        getContentPane().add(PageTitle_Label);
        PageTitle_Label.setBounds(140, 30, 70, 24);

        water.setText("Auto Pet Water");
        getContentPane().add(water);
        water.setBounds(30, 140, 220, 14);

        foodcount.setText("0");
        getContentPane().add(foodcount);
        foodcount.setBounds(320, 90, 20, 20);

        bed.setText("Super Soft Bed");
        getContentPane().add(bed);
        bed.setBounds(30, 180, 220, 14);

        coller.setText("Smart Pet Coller");
        getContentPane().add(coller);
        coller.setBounds(30, 220, 220, 14);

        food.setText("Auto food Dispenser");
        getContentPane().add(food);
        food.setBounds(30, 100, 220, 14);

        addfood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/plus.png"))); // NOI18N
        addfood.setContentAreaFilled(false);
        addfood.setOpaque(false);
        addfood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addfoodActionPerformed(evt);
            }
        });
        getContentPane().add(addfood);
        addfood.setBounds(280, 80, 30, 30);

        lessfood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/minus.png"))); // NOI18N
        lessfood.setContentAreaFilled(false);
        lessfood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessfoodActionPerformed(evt);
            }
        });
        getContentPane().add(lessfood);
        lessfood.setBounds(340, 80, 30, 30);

        addwater.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/plus.png"))); // NOI18N
        addwater.setContentAreaFilled(false);
        addwater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addwaterActionPerformed(evt);
            }
        });
        getContentPane().add(addwater);
        addwater.setBounds(280, 120, 30, 30);

        watercount.setText("0");
        getContentPane().add(watercount);
        watercount.setBounds(320, 130, 20, 20);

        lesswater.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/minus.png"))); // NOI18N
        lesswater.setContentAreaFilled(false);
        lesswater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lesswaterActionPerformed(evt);
            }
        });
        getContentPane().add(lesswater);
        lesswater.setBounds(340, 120, 30, 30);

        addbed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/plus.png"))); // NOI18N
        addbed.setContentAreaFilled(false);
        addbed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbedActionPerformed(evt);
            }
        });
        getContentPane().add(addbed);
        addbed.setBounds(280, 160, 30, 30);

        bedcount.setText("0");
        getContentPane().add(bedcount);
        bedcount.setBounds(320, 170, 20, 20);

        lessbed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/minus.png"))); // NOI18N
        lessbed.setContentAreaFilled(false);
        lessbed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessbedActionPerformed(evt);
            }
        });
        getContentPane().add(lessbed);
        lessbed.setBounds(340, 160, 30, 30);

        addcoller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/plus.png"))); // NOI18N
        addcoller.setContentAreaFilled(false);
        addcoller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcollerActionPerformed(evt);
            }
        });
        getContentPane().add(addcoller);
        addcoller.setBounds(280, 200, 30, 30);

        collercount.setText("0");
        getContentPane().add(collercount);
        collercount.setBounds(320, 210, 20, 20);

        lesscoller.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/minus.png"))); // NOI18N
        lesscoller.setContentAreaFilled(false);
        lesscoller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lesscollerActionPerformed(evt);
            }
        });
        getContentPane().add(lesscoller);
        lesscoller.setBounds(340, 200, 30, 30);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 260, 520, 30);

        jButton1.setText("cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 380, 51, 23);

        jLabel2.setText("total");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 420, 520, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backTopreviousbackToPrevious(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backTopreviousbackToPrevious
        // back to browse services interface

        //*** not implemented yet ***
    }//GEN-LAST:event_backTopreviousbackToPrevious

    private void addfoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addfoodActionPerformed
        //adding
        count += 1;
        foodcount.setText(count + "");
        products_list[0] = new Product("Auto food Dispenser", 100 * count, false, count);
        jLabel11.setText(products_list[0] + "");
    }//GEN-LAST:event_addfoodActionPerformed

    private void lessfoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessfoodActionPerformed
        //less 
        if (count > 0) {
            count -= 1;
        }
        foodcount.setText(count + "");
        products_list[0] = new Product("Auto food Dispenser", 100 * count, false, count);
        jLabel11.setText(products_list[0] + "");
    }//GEN-LAST:event_lessfoodActionPerformed

    private void addwaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addwaterActionPerformed
        //adding
   
            watcount += 1;
            watercount.setText(watcount + "");
            products_list[1] = new Product("Auto Pet Water", 100 * watcount, false, watcount);
            jLabel11.setText(products_list[1] + "");
        
    }//GEN-LAST:event_addwaterActionPerformed

    private void lesswaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lesswaterActionPerformed
        //less 
        if (watcount > 0) {
            watcount -= 1;
        }
        watercount.setText(watcount + "");
        products_list[1] = new Product("Auto Pet Water", 100 * watcount, false, watcount);
        jLabel11.setText(products_list[1] + "");
    }//GEN-LAST:event_lesswaterActionPerformed

    private void addbedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbedActionPerformed
        //adding
        beddcount += 1;
        bedcount.setText(beddcount + "");
        products_list[2] = new Product("Super Soft Bed", 150 * beddcount, false, beddcount);
        jLabel11.setText(products_list[2] + "");
    }//GEN-LAST:event_addbedActionPerformed

    private void lessbedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessbedActionPerformed
        //less 
        if (beddcount > 0) {
            beddcount -= 1;
        }
        bedcount.setText(beddcount + "");
        products_list[2] = new Product("Super Soft Bed", 150 * beddcount, false, beddcount);
        jLabel11.setText(products_list[2] + "");
    }//GEN-LAST:event_lessbedActionPerformed

    private void addcollerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcollerActionPerformed
        //adding
        colllercount += 1;
        collercount.setText(colllercount + "");
        products_list[3] = new Product("Smart Pet Coller", 250 * colllercount, false, colllercount);
        jLabel11.setText(products_list[3] + "");
    }//GEN-LAST:event_addcollerActionPerformed

    private void lesscollerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lesscollerActionPerformed
        //less 
        if (colllercount > 0) {
            colllercount -= 1;
        }
        collercount.setText(colllercount + "");
        products_list[3] = new Product("Smart Pet Coller", 250 * colllercount, false, colllercount);
        jLabel11.setText(products_list[3] + "");
    }//GEN-LAST:event_lesscollerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int total = products_list[0].getPrice() + products_list[1].getPrice() + products_list[2].getPrice() + products_list[3].getPrice();
        jLabel2.setText("total: "+total + "");
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JLabel backToprevious;
    private javax.swing.JLabel bed;
    private javax.swing.JLabel bedcount;
    private javax.swing.JLabel coller;
    private javax.swing.JLabel collercount;
    private javax.swing.JLabel food;
    private javax.swing.JLabel foodcount;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton lessbed;
    private javax.swing.JButton lesscoller;
    private javax.swing.JButton lessfood;
    private javax.swing.JButton lesswater;
    private javax.swing.JLabel water;
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
