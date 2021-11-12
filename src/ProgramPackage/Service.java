package ProgramPackage;

import java.util.ArrayList;
import static ProgramPackage.MakeAppointment.*;
/**
 *
 * @author renad
 */
public class Service {
    
    private String name;
    private int price;
    private boolean available;
    static ArrayList<Service> services = new ArrayList<>(); // available services

    public Service(String name, int price, boolean available) {
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
        return "\nService{" + "name=" + name + ", price=" + price + '}';
    }
    
    
}
