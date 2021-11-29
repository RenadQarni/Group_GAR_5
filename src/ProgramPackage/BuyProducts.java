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
        Food_Label = new javax.swing.JLabel();
        Water_Label = new javax.swing.JLabel();
        Bed_Label = new javax.swing.JLabel();
        Collar_IconLabel = new javax.swing.JLabel();
        Collar_Label = new javax.swing.JLabel();
        Collar_OrangeSquareLabel = new javax.swing.JLabel();
        Background_Gray = new javax.swing.JPanel();
        PageTitle_Label = new javax.swing.JLabel();
        Background_White = new javax.swing.JPanel();
        Cart_Icon_Label = new javax.swing.JLabel();
        Home_Icon_Label = new javax.swing.JLabel();
        Help_Icon_Label = new javax.swing.JLabel();
        Total_Label = new javax.swing.JLabel();
        Cart_Button = new javax.swing.JButton();
        Food_IconLabel = new javax.swing.JLabel();
        Food_OrangeSquareLabel = new javax.swing.JLabel();
        Water_IconLabel = new javax.swing.JLabel();
        Water_OrangeSquareLabel = new javax.swing.JLabel();
        Bed_IconLabel = new javax.swing.JLabel();
        Bed_OrangeSquareLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        Food_Label.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Food_Label.setForeground(new java.awt.Color(255, 255, 255));
        Food_Label.setText("Auto food dispenser");
        getContentPane().add(Food_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        Water_Label.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Water_Label.setForeground(new java.awt.Color(255, 255, 255));
        Water_Label.setText("Auto Water Fountain");
        getContentPane().add(Water_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        Bed_Label.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Bed_Label.setForeground(new java.awt.Color(255, 255, 255));
        Bed_Label.setText("Super Soft Bed");
        getContentPane().add(Bed_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        Collar_IconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Collar_1.png"))); // NOI18N
        getContentPane().add(Collar_IconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        Collar_Label.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Collar_Label.setForeground(new java.awt.Color(255, 255, 255));
        Collar_Label.setText("Smart Pet Collar");
        getContentPane().add(Collar_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        Collar_OrangeSquareLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Orange_Br.png"))); // NOI18N
        getContentPane().add(Collar_OrangeSquareLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        Background_Gray.setBackground(new java.awt.Color(249, 249, 249));
        Background_Gray.setLayout(null);

        PageTitle_Label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        PageTitle_Label.setForeground(new java.awt.Color(51, 0, 102));
        PageTitle_Label.setText("Products");
        Background_Gray.add(PageTitle_Label);
        PageTitle_Label.setBounds(30, 50, 120, 29);

        Background_White.setBackground(new java.awt.Color(255, 255, 255));

        Cart_Icon_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cart_dark.png"))); // NOI18N

        Home_Icon_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home.png"))); // NOI18N

        Help_Icon_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/help.png"))); // NOI18N

        javax.swing.GroupLayout Background_WhiteLayout = new javax.swing.GroupLayout(Background_White);
        Background_White.setLayout(Background_WhiteLayout);
        Background_WhiteLayout.setHorizontalGroup(
            Background_WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Background_WhiteLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(Cart_Icon_Label)
                .addGap(44, 44, 44)
                .addComponent(Home_Icon_Label)
                .addGap(45, 45, 45)
                .addComponent(Help_Icon_Label)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        Background_WhiteLayout.setVerticalGroup(
            Background_WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Background_WhiteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Background_WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cart_Icon_Label)
                    .addComponent(Home_Icon_Label)
                    .addComponent(Help_Icon_Label))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        Background_Gray.add(Background_White);
        Background_White.setBounds(0, 620, 330, 85);

        Total_Label.setText("Total");
        Background_Gray.add(Total_Label);
        Total_Label.setBounds(20, 550, 60, 30);

        Cart_Button.setText("cart");
        Cart_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cart_ButtonActionPerformed(evt);
            }
        });
        Background_Gray.add(Cart_Button);
        Cart_Button.setBounds(250, 550, 69, 35);

        Food_IconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Food2.png"))); // NOI18N
        Food_IconLabel.setPreferredSize(new java.awt.Dimension(70, 70));
        Background_Gray.add(Food_IconLabel);
        Food_IconLabel.setBounds(30, 110, 110, 90);

        Food_OrangeSquareLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Orange_Br.png"))); // NOI18N
        Background_Gray.add(Food_OrangeSquareLabel);
        Food_OrangeSquareLabel.setBounds(10, 110, 320, 95);

        Water_IconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Water1.png"))); // NOI18N
        Background_Gray.add(Water_IconLabel);
        Water_IconLabel.setBounds(10, 210, 68, 90);

        Water_OrangeSquareLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Orange_Br.png"))); // NOI18N
        Background_Gray.add(Water_OrangeSquareLabel);
        Water_OrangeSquareLabel.setBounds(10, 210, 310, 95);

        Bed_IconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Bed_1.png"))); // NOI18N
        Background_Gray.add(Bed_IconLabel);
        Bed_IconLabel.setBounds(30, 320, 60, 61);

        Bed_OrangeSquareLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Orange_Br.png"))); // NOI18N
        Background_Gray.add(Bed_OrangeSquareLabel);
        Bed_OrangeSquareLabel.setBounds(10, 310, 310, 95);

        getContentPane().add(Background_Gray, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cart_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cart_ButtonActionPerformed
        int total = products_list[0].getPrice() + products_list[1].getPrice() + products_list[2].getPrice() + products_list[3].getPrice();
        Total_Label.setText("total: " + total + "");

        o = new Order();
        o.addProduct(products_list[0]);

        Date_Time X = new Date_Time();
        X.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Cart_ButtonActionPerformed

    private void lesscollerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lesscollerActionPerformed
        //less
        if (colllercount > 0) {
            colllercount -= 1;
        }
        collercount.setText(colllercount + "");
        products_list[3] = new Product("Smart Pet Coller", 250 * colllercount, false, colllercount);
        Water_IconLabel.setText(products_list[3] + "");
    }//GEN-LAST:event_lesscollerActionPerformed

    private void addcollerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcollerActionPerformed
        //adding
        colllercount += 1;
        collercount.setText(colllercount + "");
        products_list[3] = new Product("Smart Pet Coller", 250 * colllercount, false, colllercount);
        Water_IconLabel.setText(products_list[3] + "");
    }//GEN-LAST:event_addcollerActionPerformed

    private void lessbedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessbedActionPerformed
        //less
        if (beddcount > 0) {
            beddcount -= 1;
        }
        bedcount.setText(beddcount + "");
        products_list[2] = new Product("Super Soft Bed", 150 * beddcount, false, beddcount);
        Water_IconLabel.setText(products_list[2] + "");
    }//GEN-LAST:event_lessbedActionPerformed

    private void addbedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbedActionPerformed
        //adding
        beddcount += 1;
        bedcount.setText(beddcount + "");
        products_list[2] = new Product("Super Soft Bed", 150 * beddcount, false, beddcount);
        Water_IconLabel.setText(products_list[2] + "");
    }//GEN-LAST:event_addbedActionPerformed

    private void lesswaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lesswaterActionPerformed
        //less
        if (watcount > 0) {
            watcount -= 1;
        }
        watercount.setText(watcount + "");
        products_list[1] = new Product("Auto Pet Water", 100 * watcount, false, watcount);
        Water_IconLabel.setText(products_list[1] + "");
    }//GEN-LAST:event_lesswaterActionPerformed

    private void addwaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addwaterActionPerformed
        //adding

        watcount += 1;
        watercount.setText(watcount + "");
        products_list[1] = new Product("Auto Pet Water", 100 * watcount, false, watcount);
        Water_IconLabel.setText(products_list[1] + "");
    }//GEN-LAST:event_addwaterActionPerformed

    private void lessfoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessfoodActionPerformed
        //less
        if (count > 0) {
            count -= 1;
        }
        foodcount.setText(count + "");
        products_list[0] = new Product("Auto food Dispenser", 100 * count, false, count);
        Water_IconLabel.setText(products_list[0] + "");
    }//GEN-LAST:event_lessfoodActionPerformed

    private void addfoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addfoodActionPerformed
        //adding
        count += 1;
        foodcount.setText(count + "");
        products_list[0] = new Product("Auto food Dispenser", 100 * count, false, count);
        Water_IconLabel.setText(products_list[0] + "");
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
    private javax.swing.JPanel Background_Gray;
    private javax.swing.JPanel Background_White;
    private javax.swing.JLabel Bed_IconLabel;
    private javax.swing.JLabel Bed_Label;
    private javax.swing.JLabel Bed_OrangeSquareLabel;
    private javax.swing.JButton Cart_Button;
    private javax.swing.JLabel Cart_Icon_Label;
    private javax.swing.JLabel Collar_IconLabel;
    private javax.swing.JLabel Collar_Label;
    private javax.swing.JLabel Collar_OrangeSquareLabel;
    private javax.swing.JLabel Food_IconLabel;
    private javax.swing.JLabel Food_Label;
    private javax.swing.JLabel Food_OrangeSquareLabel;
    private javax.swing.JLabel Help_Icon_Label;
    private javax.swing.JLabel Home_Icon_Label;
    private javax.swing.JLabel PageTitle_Label;
    private javax.swing.JLabel Total_Label;
    private javax.swing.JLabel Water_IconLabel;
    private javax.swing.JLabel Water_Label;
    private javax.swing.JLabel Water_OrangeSquareLabel;
    private javax.swing.JButton addbed;
    private javax.swing.JButton addcoller;
    private javax.swing.JButton addfood;
    private javax.swing.JButton addwater;
    private javax.swing.JLabel bedcount;
    private javax.swing.JLabel collercount;
    private javax.swing.JLabel foodcount;
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
