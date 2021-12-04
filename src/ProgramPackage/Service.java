package ProgramPackage;

import java.util.ArrayList;
/**
 *
 * @author renad
 */
public class Service {
    
    private String name;
    private int price;
    static ArrayList<Service> services = new ArrayList<>();

    public Service(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Service() {
    }

    // ------- Setter -------
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   

    // ------- Getter -------

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

  
    public static ArrayList<Service> getAvailableServices(){
        return services;
    }

    @Override
    public String toString() {
        return " " + name + " " + price + "SR\n";
    }
    
    
}
