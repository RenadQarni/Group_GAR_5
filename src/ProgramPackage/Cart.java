/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramPackage;

import static ProgramPackage.BuyProducts.o;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author renad
 */
public class Cart extends javax.swing.JFrame {

    /**
     * Creates new form Cart
     */
    public Cart() {
        initComponents();

        disblayProduct(o.getSelectedProducts());
        disblayTotal(o.getTotalPrice());
        int totalPrice ;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background_Gray = new javax.swing.JPanel();
        Background_White = new javax.swing.JPanel();
        Home_Icon_Label = new javax.swing.JLabel();
        Cart_Icon = new javax.swing.JLabel();
        PageTitle_Label = new javax.swing.JLabel();
        AmountTitle = new javax.swing.JLabel();
        ProductTitle = new javax.swing.JLabel();
        errorr_empty = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        PriceTitle = new javax.swing.JLabel();
        totalPrice = new javax.swing.JLabel();
        ConfirmButton = new javax.swing.JButton();
        Back_label = new javax.swing.JLabel();
        inc_1 = new javax.swing.JLabel();
        Amount_4 = new javax.swing.JLabel();
        Amount_1 = new javax.swing.JLabel();
        Amount_2 = new javax.swing.JLabel();
        Amount_3 = new javax.swing.JLabel();
        inc_2 = new javax.swing.JLabel();
        dec_1 = new javax.swing.JLabel();
        dec_2 = new javax.swing.JLabel();
        inc_3 = new javax.swing.JLabel();
        inc_4 = new javax.swing.JLabel();
        dec_3 = new javax.swing.JLabel();
        dec_4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(380, 700));
        getContentPane().setLayout(null);

        Background_Gray.setBackground(new java.awt.Color(249, 249, 249));
        Background_Gray.setLayout(null);

        Background_White.setBackground(new java.awt.Color(255, 255, 255));

        Home_Icon_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home.png"))); // NOI18N

        Cart_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cart_dark.png"))); // NOI18N

        javax.swing.GroupLayout Background_WhiteLayout = new javax.swing.GroupLayout(Background_White);
        Background_White.setLayout(Background_WhiteLayout);
        Background_WhiteLayout.setHorizontalGroup(
            Background_WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Background_WhiteLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(Cart_Icon)
                .addGap(55, 55, 55)
                .addComponent(Home_Icon_Label)
                .addGap(165, 165, 165))
        );
        Background_WhiteLayout.setVerticalGroup(
            Background_WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Background_WhiteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Background_WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cart_Icon)
                    .addComponent(Home_Icon_Label))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        Background_Gray.add(Background_White);
        Background_White.setBounds(0, 600, 380, 110);

        PageTitle_Label.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        PageTitle_Label.setForeground(new java.awt.Color(91, 74, 132));
        PageTitle_Label.setText("Cart");
        Background_Gray.add(PageTitle_Label);
        PageTitle_Label.setBounds(30, 60, 70, 37);

        AmountTitle.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        AmountTitle.setForeground(new java.awt.Color(91, 74, 132));
        AmountTitle.setText("Amount");
        Background_Gray.add(AmountTitle);
        AmountTitle.setBounds(290, 160, 50, 16);

        ProductTitle.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ProductTitle.setForeground(new java.awt.Color(91, 74, 132));
        ProductTitle.setText("Products");
        Background_Gray.add(ProductTitle);
        ProductTitle.setBounds(30, 160, 60, 16);

        errorr_empty.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        errorr_empty.setForeground(new java.awt.Color(255, 102, 102));
        errorr_empty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errorr_empty.setText("  ");
        Background_Gray.add(errorr_empty);
        errorr_empty.setBounds(0, 250, 380, 24);

        p1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p1.setForeground(new java.awt.Color(51, 51, 51));
        p1.setText("Prouduct 1");
        Background_Gray.add(p1);
        p1.setBounds(30, 200, 220, 17);

        p2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p2.setForeground(new java.awt.Color(51, 51, 51));
        p2.setText("Prouduct 2");
        Background_Gray.add(p2);
        p2.setBounds(30, 240, 220, 17);

        p3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p3.setForeground(new java.awt.Color(51, 51, 51));
        p3.setText("Prouduct 3");
        Background_Gray.add(p3);
        p3.setBounds(30, 280, 220, 17);

        p4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        p4.setForeground(new java.awt.Color(51, 51, 51));
        p4.setText("Prouduct 4");
        Background_Gray.add(p4);
        p4.setBounds(30, 320, 220, 17);

        PriceTitle.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        PriceTitle.setForeground(new java.awt.Color(91, 74, 132));
        PriceTitle.setText("Total :");
        Background_Gray.add(PriceTitle);
        PriceTitle.setBounds(30, 510, 60, 16);

        totalPrice.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        totalPrice.setForeground(new java.awt.Color(243, 130, 89));
        totalPrice.setText("Total Price");
        Background_Gray.add(totalPrice);
        totalPrice.setBounds(30, 550, 80, 20);

        ConfirmButton.setBackground(new java.awt.Color(121, 99, 175));
        ConfirmButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ConfirmButton.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmButton.setText("Next");
        ConfirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmButtonconfirm(evt);
            }
        });
        Background_Gray.add(ConfirmButton);
        ConfirmButton.setBounds(260, 510, 100, 50);

        Back_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back_arrow.png"))); // NOI18N
        Back_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backTo_buyProduct(evt);
            }
        });
        Background_Gray.add(Back_label);
        Back_label.setBounds(10, 20, 14, 24);

        inc_1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inc_1.setForeground(new java.awt.Color(91, 74, 132));
        inc_1.setText("+");
        inc_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inc_1MouseClicked(evt);
            }
        });
        Background_Gray.add(inc_1);
        inc_1.setBounds(280, 190, 13, 22);

        Amount_4.setText("1");
        Background_Gray.add(Amount_4);
        Amount_4.setBounds(310, 310, 20, 20);

        Amount_1.setText("1");
        Background_Gray.add(Amount_1);
        Amount_1.setBounds(310, 190, 20, 20);

        Amount_2.setText("1");
        Background_Gray.add(Amount_2);
        Amount_2.setBounds(310, 230, 20, 20);

        Amount_3.setText("1");
        Background_Gray.add(Amount_3);
        Amount_3.setBounds(310, 270, 30, 20);

        inc_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inc_2.setForeground(new java.awt.Color(91, 74, 132));
        inc_2.setText("+");
        inc_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inc_2MouseClicked(evt);
            }
        });
        Background_Gray.add(inc_2);
        inc_2.setBounds(280, 230, 13, 22);

        dec_1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dec_1.setForeground(new java.awt.Color(91, 74, 132));
        dec_1.setText("-");
        dec_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dec_1MouseClicked(evt);
            }
        });
        Background_Gray.add(dec_1);
        dec_1.setBounds(340, 190, 10, 20);

        dec_2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dec_2.setForeground(new java.awt.Color(91, 74, 132));
        dec_2.setText("-");
        dec_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dec_2MouseClicked(evt);
            }
        });
        Background_Gray.add(dec_2);
        dec_2.setBounds(340, 230, 10, 20);

        inc_3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inc_3.setForeground(new java.awt.Color(91, 74, 132));
        inc_3.setText("+");
        inc_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inc_3MouseClicked(evt);
            }
        });
        Background_Gray.add(inc_3);
        inc_3.setBounds(280, 270, 13, 22);

        inc_4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inc_4.setForeground(new java.awt.Color(91, 74, 132));
        inc_4.setText("+");
        inc_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inc_4MouseClicked(evt);
            }
        });
        Background_Gray.add(inc_4);
        inc_4.setBounds(280, 310, 13, 22);

        dec_3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dec_3.setForeground(new java.awt.Color(91, 74, 132));
        dec_3.setText("-");
        dec_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dec_3MouseClicked(evt);
            }
        });
        Background_Gray.add(dec_3);
        dec_3.setBounds(340, 270, 20, 20);

        dec_4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dec_4.setForeground(new java.awt.Color(91, 74, 132));
        dec_4.setText("-");
        dec_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dec_4MouseClicked(evt);
            }
        });
        Background_Gray.add(dec_4);
        dec_4.setBounds(340, 310, 10, 20);

        getContentPane().add(Background_Gray);
        Background_Gray.setBounds(0, 0, 380, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void disblayProduct(ArrayList<Product> productList) {
        javax.swing.JLabel[] p = {p1, p2, p3, p4};

        resetLabels(p);

        for (int i = 0; i < productList.size(); i++) {
            p[i].setText(productList.get(i).getName() + "    " + productList.get(i).getPrice());

        }
    }

    private void resetLabels(JLabel[] p) {
        for (int i = 0; i < p.length; i++) {
            p[i].setText("");
        }
    }

    private void disblayTotal(int price) {
        totalPrice.setText(price + " SR");
        
    }

    private void ConfirmButtonconfirm(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmButtonconfirm

        if (o.getTotalPrice() != 0) {
            Date_Time x = new Date_Time();
            x.setVisible(true);
            this.dispose();
        } else {
            errorr_empty.setText("you most add Product to continue");
        }

    }//GEN-LAST:event_ConfirmButtonconfirm

    private void backTo_buyProduct(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backTo_buyProduct
        BuyProducts b = new BuyProducts();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backTo_buyProduct
    public int increment_amount(Product p) {
        int amount = p.getAmount();
        amount++;
        p.setAmount(amount);
        return amount;
    }

    public int decrease_amount(Product p) {
        int amount = p.getAmount();
        if (amount > 0) {
            amount--;
            p.setAmount(amount);
        }
        return amount;
    }


    private void inc_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inc_1MouseClicked

        if (o.getSelectedProducts().get(0).getAmount() < 10) {
            
            int total_1 = (increment_amount(o.getSelectedProducts().get(0)));
    
           o.getSelectedProducts().get(0).setAmount(total_1);
          
           o.setTotalPrice();
            Amount_1.setText(  total_1 +"" );
      
            disblayTotal(o.getTotalPrice());
        }


    }//GEN-LAST:event_inc_1MouseClicked

    private void inc_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inc_2MouseClicked
      
        if (o.getSelectedProducts().get(1).getAmount() < 10) {
            
            int total_1 = (increment_amount(o.getSelectedProducts().get(1)));
    
           o.getSelectedProducts().get(1).setAmount(total_1);
          
           o.setTotalPrice();
            Amount_2.setText(  total_1 +"" );
      
            disblayTotal(o.getTotalPrice());
        }

        
        
        
    }//GEN-LAST:event_inc_2MouseClicked

    private void dec_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dec_1MouseClicked
          if (o.getSelectedProducts().get(0).getAmount() > 1 ) {
            
            int total_1 = (decrease_amount(o.getSelectedProducts().get(0)));
    
           o.getSelectedProducts().get(0).setAmount(total_1);
          
           o.setTotalPrice();
            Amount_1.setText(  total_1 +"" );
      
            disblayTotal(o.getTotalPrice());
        }

        
    }//GEN-LAST:event_dec_1MouseClicked

    private void dec_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dec_2MouseClicked
         if (o.getSelectedProducts().get(1).getAmount() > 1 ) {
            
            int total_1 = (decrease_amount(o.getSelectedProducts().get(1)));
    
           o.getSelectedProducts().get(1).setAmount(total_1);
          
           o.setTotalPrice();
            Amount_2.setText(  total_1 +"" );
      
            disblayTotal(o.getTotalPrice());}
    }//GEN-LAST:event_dec_2MouseClicked

    private void inc_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inc_3MouseClicked
        if (o.getSelectedProducts().get(2).getAmount() < 10) {
            
            int total_1 = (increment_amount(o.getSelectedProducts().get(2)));
    
           o.getSelectedProducts().get(2).setAmount(total_1);
          
           o.setTotalPrice();
            Amount_3.setText(  total_1 +"" );
      
            disblayTotal(o.getTotalPrice());
        }
    }//GEN-LAST:event_inc_3MouseClicked

    private void inc_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inc_4MouseClicked
         if (o.getSelectedProducts().get(3).getAmount() < 10) {
            
            int total_1 = (increment_amount(o.getSelectedProducts().get(3)));
    
           o.getSelectedProducts().get(3).setAmount(total_1);
          
           o.setTotalPrice();
            Amount_4.setText(  total_1 +"" );
      
            disblayTotal(o.getTotalPrice());
        }
    }//GEN-LAST:event_inc_4MouseClicked

    private void dec_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dec_3MouseClicked
         if (o.getSelectedProducts().get(2).getAmount() > 1 ) {
            
            int total_1 = (decrease_amount(o.getSelectedProducts().get(2)));
    
           o.getSelectedProducts().get(2).setAmount(total_1);
          
           o.setTotalPrice();
            Amount_3.setText(  total_1 +"" );
      
            disblayTotal(o.getTotalPrice());}
    }//GEN-LAST:event_dec_3MouseClicked

    private void dec_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dec_4MouseClicked
        if (o.getSelectedProducts().get(3).getAmount() > 1 ) {
            
            int total_1 = (decrease_amount(o.getSelectedProducts().get(3)));
    
           o.getSelectedProducts().get(3).setAmount(total_1);
          
           o.setTotalPrice();
            Amount_4.setText(  total_1 +"" );
      
            disblayTotal(o.getTotalPrice());}
    }//GEN-LAST:event_dec_4MouseClicked

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
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AmountTitle;
    private javax.swing.JLabel Amount_1;
    private javax.swing.JLabel Amount_2;
    private javax.swing.JLabel Amount_3;
    private javax.swing.JLabel Amount_4;
    private javax.swing.JLabel Back_label;
    private javax.swing.JPanel Background_Gray;
    private javax.swing.JPanel Background_White;
    private javax.swing.JLabel Cart_Icon;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JLabel Home_Icon_Label;
    private javax.swing.JLabel PageTitle_Label;
    private javax.swing.JLabel PriceTitle;
    private javax.swing.JLabel ProductTitle;
    private javax.swing.JLabel dec_1;
    private javax.swing.JLabel dec_2;
    private javax.swing.JLabel dec_3;
    private javax.swing.JLabel dec_4;
    private javax.swing.JLabel errorr_empty;
    private javax.swing.JLabel inc_1;
    private javax.swing.JLabel inc_2;
    private javax.swing.JLabel inc_3;
    private javax.swing.JLabel inc_4;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel totalPrice;
    // End of variables declaration//GEN-END:variables

}
