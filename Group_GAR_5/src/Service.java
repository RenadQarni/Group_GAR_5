import java.util.ArrayList;

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
        this.available = available;
        
        if (available = true)
            services.add(this);
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

    public void setAvailable(boolean available) {
        this.available = available;
        if (available = true)
            services.add(this);
        else
            services.remove(this);
    }

    // ------- Getter -------

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public static ArrayList<Service> getAvailableServices(){
        return services;
    }
    
    
}