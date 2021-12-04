/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramPackage;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class BuyProducts extends javax.swing.JFrame {

    public static Order o;
    ArrayList<Product> addedProducts = new ArrayList<>();
    Product[] products_list = new Product[4];
    
    // init Icons of interface
    ImageIcon cart = new ImageIcon("src\\Icons\\product_cart.png");
    ImageIcon added_cart = new ImageIcon("src\\Icons\\added_product_cart.png");
    ImageIcon dot_cart = new ImageIcon("src\\Icons\\dot_cart.png");

    public BuyProducts() {
        initComponents();
        
        products_list[0] = new Product("Auto food Dispenser", 100, false, 0);
        products_list[1] = new Product("Auto Pet Water", 150, false, 0);
        products_list[2] = new Product("Super Soft Bed", 200, false, 0);
        products_list[3] = new Product("Smart Pet Coller", 150, false, 0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background_Gray = new javax.swing.JPanel();
        Background_White = new javax.swing.JPanel();
        Home_Icon_Label = new javax.swing.JLabel();
        Cart_Icon = new javax.swing.JLabel();
        PageTitle_Label = new javax.swing.JLabel();
        Food_Label = new javax.swing.JLabel();
        Water_Label = new javax.swing.JLabel();
        Bed_Label = new javax.swing.JLabel();
        collar_cart = new javax.swing.JLabel();
        Price_Smart_Collar = new javax.swing.JLabel();
        Collar_IconLabel = new javax.swing.JLabel();
        Collar_Label = new javax.swing.JLabel();
        Collar_OrangeSquareLabel = new javax.swing.JLabel();
        food_cart = new javax.swing.JLabel();
        Price_auto_food = new javax.swing.JLabel();
        Price_auto_Water = new javax.swing.JLabel();
        Price_Soft_Bed = new javax.swing.JLabel();
        Food_IconLabel = new javax.swing.JLabel();
        Food_OrangeSquareLabel = new javax.swing.JLabel();
        water_cart = new javax.swing.JLabel();
        Water_IconLabel = new javax.swing.JLabel();
        Water_OrangeSquareLabel = new javax.swing.JLabel();
        bed_cart = new javax.swing.JLabel();
        Bed_IconLabel = new javax.swing.JLabel();
        Bed_OrangeSquareLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Back_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        Background_Gray.setBackground(new java.awt.Color(249, 249, 249));
        Background_Gray.setLayout(null);

        Background_White.setBackground(new java.awt.Color(255, 255, 255));

        Home_Icon_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home.png"))); // NOI18N
        Home_Icon_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home_Icon_LabelMouseClicked(evt);
            }
        });

        Cart_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cart_dark.png"))); // NOI18N
        Cart_Icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goTo_cart(evt);
            }
        });

        javax.swing.GroupLayout Background_WhiteLayout = new javax.swing.GroupLayout(Background_White);
        Background_White.setLayout(Background_WhiteLayout);
        Background_WhiteLayout.setHorizontalGroup(
            Background_WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Background_WhiteLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(Cart_Icon)
                .addGap(35, 35, 35)
                .addComponent(Home_Icon_Label)
                .addGap(175, 175, 175))
        );
        Background_WhiteLayout.setVerticalGroup(
            Background_WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Background_WhiteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Background_WhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cart_Icon)
                    .addComponent(Home_Icon_Label))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        Background_Gray.add(Background_White);
        Background_White.setBounds(0, 630, 380, 80);

        PageTitle_Label.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        PageTitle_Label.setForeground(new java.awt.Color(51, 0, 102));
        PageTitle_Label.setText("Products");
        Background_Gray.add(PageTitle_Label);
        PageTitle_Label.setBounds(20, 40, 190, 37);

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
        Bed_Label.setBounds(100, 320, 152, 25);

        collar_cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/product_cart.png"))); // NOI18N
        collar_cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCollar(evt);
            }
        });
        Background_Gray.add(collar_cart);
        collar_cart.setBounds(250, 440, 40, 40);

        Price_Smart_Collar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Price_Smart_Collar.setForeground(new java.awt.Color(255, 255, 255));
        Price_Smart_Collar.setText("150");
        Background_Gray.add(Price_Smart_Collar);
        Price_Smart_Collar.setBounds(110, 440, 51, 20);

        Collar_IconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Collar_1.png"))); // NOI18N
        Background_Gray.add(Collar_IconLabel);
        Collar_IconLabel.setBounds(30, 420, 57, 57);

        Collar_Label.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Collar_Label.setForeground(new java.awt.Color(255, 255, 255));
        Collar_Label.setText("Smart Pet Collar");
        Background_Gray.add(Collar_Label);
        Collar_Label.setBounds(100, 410, 164, 25);

        Collar_OrangeSquareLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Orange_Br.png"))); // NOI18N
        Background_Gray.add(Collar_OrangeSquareLabel);
        Collar_OrangeSquareLabel.setBounds(10, 400, 309, 95);

        food_cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/product_cart.png"))); // NOI18N
        food_cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addFood(evt);
            }
        });
        Background_Gray.add(food_cart);
        food_cart.setBounds(250, 140, 40, 40);

        Price_auto_food.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Price_auto_food.setForeground(new java.awt.Color(255, 255, 255));
        Price_auto_food.setText("100");
        Background_Gray.add(Price_auto_food);
        Price_auto_food.setBounds(110, 150, 51, 20);

        Price_auto_Water.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Price_auto_Water.setForeground(new java.awt.Color(255, 255, 255));
        Price_auto_Water.setText("150");
        Background_Gray.add(Price_auto_Water);
        Price_auto_Water.setBounds(110, 250, 51, 20);

        Price_Soft_Bed.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Price_Soft_Bed.setForeground(new java.awt.Color(255, 255, 255));
        Price_Soft_Bed.setText("200");
        Background_Gray.add(Price_Soft_Bed);
        Price_Soft_Bed.setBounds(110, 350, 51, 20);

        Food_IconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Food2.png"))); // NOI18N
        Food_IconLabel.setPreferredSize(new java.awt.Dimension(70, 70));
        Background_Gray.add(Food_IconLabel);
        Food_IconLabel.setBounds(30, 100, 110, 90);

        Food_OrangeSquareLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Orange_Br.png"))); // NOI18N
        Background_Gray.add(Food_OrangeSquareLabel);
        Food_OrangeSquareLabel.setBounds(10, 100, 320, 95);

        water_cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/product_cart.png"))); // NOI18N
        water_cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addWater(evt);
            }
        });
        Background_Gray.add(water_cart);
        water_cart.setBounds(250, 240, 40, 40);

        Water_IconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Water1.png"))); // NOI18N
        Background_Gray.add(Water_IconLabel);
        Water_IconLabel.setBounds(20, 200, 68, 90);

        Water_OrangeSquareLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Orange_Br.png"))); // NOI18N
        Background_Gray.add(Water_OrangeSquareLabel);
        Water_OrangeSquareLabel.setBounds(10, 200, 310, 95);

        bed_cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/product_cart.png"))); // NOI18N
        bed_cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBed(evt);
            }
        });
        Background_Gray.add(bed_cart);
        bed_cart.setBounds(250, 340, 40, 40);

        Bed_IconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Bed_1.png"))); // NOI18N
        Background_Gray.add(Bed_IconLabel);
        Bed_IconLabel.setBounds(30, 320, 60, 61);

        Bed_OrangeSquareLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Orange_Br.png"))); // NOI18N
        Background_Gray.add(Bed_OrangeSquareLabel);
        Bed_OrangeSquareLabel.setBounds(10, 300, 310, 95);

        jButton1.setBackground(new java.awt.Color(121, 99, 175));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Go To Cart");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goTo_cart(evt);
            }
        });
        Background_Gray.add(jButton1);
        jButton1.setBounds(180, 530, 150, 50);

        Back_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back_arrow.png"))); // NOI18N
        Back_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back_labelbackTo_pre(evt);
            }
        });
        Background_Gray.add(Back_label);
        Back_label.setBounds(10, 10, 14, 24);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background_Gray, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background_Gray, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void addProduct(Product p){
        p.setSelected(true);
        p.setAmount(1);
        addedProducts.add(p);
    }
    
    private void setCartIcon (javax.swing.JLabel b){
        b.setIcon(null);
        b.setIcon(added_cart);
        Cart_Icon.setIcon(dot_cart);
    }
    
    private void addFood(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addFood
        if (products_list[0].isSelected() == false) {
            addProduct(products_list[0]);
            setCartIcon(food_cart);
        }
    }//GEN-LAST:event_addFood

    private void addWater(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addWater
        if (products_list[1].isSelected() == false) {
            addProduct(products_list[1]);
            setCartIcon(water_cart);
        }
    }//GEN-LAST:event_addWater

    private void addBed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBed
        if (products_list[2].isSelected() == false) {
            addProduct(products_list[2]);
            setCartIcon(bed_cart);
        }
    }//GEN-LAST:event_addBed

    private void addCollar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCollar
        if (products_list[3].isSelected() == false) {
            addProduct(products_list[3]);
            setCartIcon(collar_cart);
        }
    }//GEN-LAST:event_addCollar

    private void goTo_cart(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goTo_cart
        o = new Order();
        o.setSelectedProducts(addedProducts);
        // go to cart interface
        Cart c = new Cart();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_goTo_cart

    private void Back_labelbackTo_pre(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_labelbackTo_pre
        Browse_Services X = new Browse_Services();
        X.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Back_labelbackTo_pre

    private void Home_Icon_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_Icon_LabelMouseClicked
        // TODO add your handling code here:
        
         Browse_Services X = new Browse_Services();
        X.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_Home_Icon_LabelMouseClicked

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
    private javax.swing.JLabel Back_label;
    private javax.swing.JPanel Background_Gray;
    private javax.swing.JPanel Background_White;
    private javax.swing.JLabel Bed_IconLabel;
    private javax.swing.JLabel Bed_Label;
    private javax.swing.JLabel Bed_OrangeSquareLabel;
    private javax.swing.JLabel Cart_Icon;
    private javax.swing.JLabel Collar_IconLabel;
    private javax.swing.JLabel Collar_Label;
    private javax.swing.JLabel Collar_OrangeSquareLabel;
    private javax.swing.JLabel Food_IconLabel;
    private javax.swing.JLabel Food_Label;
    private javax.swing.JLabel Food_OrangeSquareLabel;
    private javax.swing.JLabel Home_Icon_Label;
    private javax.swing.JLabel PageTitle_Label;
    private javax.swing.JLabel Price_Smart_Collar;
    private javax.swing.JLabel Price_Soft_Bed;
    private javax.swing.JLabel Price_auto_Water;
    private javax.swing.JLabel Price_auto_food;
    private javax.swing.JLabel Water_IconLabel;
    private javax.swing.JLabel Water_Label;
    private javax.swing.JLabel Water_OrangeSquareLabel;
    private javax.swing.JLabel bed_cart;
    private javax.swing.JLabel collar_cart;
    private javax.swing.JLabel food_cart;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel water_cart;
    // End of variables declaration//GEN-END:variables

}
