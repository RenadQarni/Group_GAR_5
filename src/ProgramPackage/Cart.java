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
        Help_Icon_Label = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(380, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        Background_Gray.setBackground(new java.awt.Color(249, 249, 249));
        Background_Gray.setLayout(null);

        Background_White.setBackground(new java.awt.Color(255, 255, 255));

        Home_Icon_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home.png"))); // NOI18N

        Help_Icon_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/help.png"))); // NOI18N

        Cart_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cart_dark.png"))); // NOI18N

        javax.swing.GroupLayout Background_WhiteLayout = new javax.swing.GroupLayout(Background_White);
        Background_White.setLayout(Background_WhiteLayout);
        Background_WhiteLayout.setHorizontalGroup(
            Background_WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Background_WhiteLayout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(Cart_Icon)
                .addGap(50, 50, 50)
                .addComponent(Home_Icon_Label)
                .addGap(62, 62, 62)
                .addComponent(Help_Icon_Label)
                .addGap(92, 92, 92))
        );
        Background_WhiteLayout.setVerticalGroup(
            Background_WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Background_WhiteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Background_WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cart_Icon)
                    .addGroup(Background_WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Help_Icon_Label)
                        .addComponent(Home_Icon_Label)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Background_Gray.add(Background_White);
        Background_White.setBounds(0, 600, 380, 80);

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
        } else{
            errorr_empty.setText("you most add Product to continue");
        }
        
    }//GEN-LAST:event_ConfirmButtonconfirm

    private void backTo_buyProduct(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backTo_buyProduct
        BuyProducts b = new BuyProducts();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backTo_buyProduct

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
    private javax.swing.JLabel Back_label;
    private javax.swing.JPanel Background_Gray;
    private javax.swing.JPanel Background_White;
    private javax.swing.JLabel Cart_Icon;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JLabel Help_Icon_Label;
    private javax.swing.JLabel Home_Icon_Label;
    private javax.swing.JLabel PageTitle_Label;
    private javax.swing.JLabel PriceTitle;
    private javax.swing.JLabel ProductTitle;
    private javax.swing.JLabel errorr_empty;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel totalPrice;
    // End of variables declaration//GEN-END:variables

    
}
