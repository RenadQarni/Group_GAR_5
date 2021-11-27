
package ProgramPackage;

import java.util.ArrayList;

public class Product {

    private String name;
    private int price;
    private boolean selected;
    private int amount;

    public static ArrayList<Product> Products_list = new ArrayList();

    public Product(String name, int price, boolean selected, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.selected = selected;
        Products_list.add(this);
    }

    public String getName() {

        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", selected=" + selected + ", amount=" + amount + '}';
    }

}
