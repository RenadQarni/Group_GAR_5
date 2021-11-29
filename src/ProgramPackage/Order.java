/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramPackage;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author renad
 */
public class Order {

    private Date date;
    private String Time;
    private int totalPrice = 0;
    private ArrayList<Product> selectedProducts = new ArrayList<>();

    static ArrayList<Order> orders = new ArrayList<>(); // list of all orders

    public Order(Date date, String Time, ArrayList<Product> selectedProducts) {
        this.date = date;
        this.Time = Time;
        this.selectedProducts = selectedProducts;
        setTotalPrice();
        orders.add(this);
    }

    public Order() {
    }

    public Date getDate() {
        return date;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public String getTime() {
        return Time;
    }

    public ArrayList<Product> getSelectedProducts() {
        return selectedProducts;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public void setTotalPrice() {
        for (Product p : selectedProducts) {
            totalPrice += p.getPrice() * p.getAmount();
        }

    }

    public void setSelectedProducts(ArrayList<Product> selectedProducts) {
        this.selectedProducts = selectedProducts;
        setTotalPrice();
    }

    public void addProduct(Product p) {
        selectedProducts.add(p);
        setTotalPrice();
    }
    
    public void removeProduct(Product p){
        selectedProducts.remove(p);
        setTotalPrice();
    }

    public void addOrder(Order o) {
        orders.add(o);
    }

    public void removeOrder(Order o) {
        orders.remove(o);
    }

}
