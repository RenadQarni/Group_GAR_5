package ProgramPackage;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author renad
 */
public class Appointment {

    private int noOfPets;
    private int totalPrice = 0;
    private Date date;
    private String time;
    private ArrayList<Service> services = new ArrayList<>();
    static ArrayList<Appointment> appointments = new ArrayList<>();

    public Appointment(int noPet, Date date, String time) {
        this.date = date;
        this.time = time;
        appointments.add(this);
    }

    public Appointment() {
        appointments.add(this);
    }

    // ------- Setter -------
    public void setNoPet(int noPet) {
        this.noOfPets = noPet;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    // ------- Getter -------
    public int getNoPet() {
        return noOfPets;
    }

    public Date getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    // ------- Method -------
    public void addService(Service s) {
        services.add(s);
    }

    public static ArrayList<Appointment> ViewAppointment() {
        return appointments;
    }

    public String printServices(ArrayList<Service> s) {
        String servicesInfo = "";
        for (int i = 0; i < s.size(); i++) {
            servicesInfo += s.get(i).toString();
        }
        return servicesInfo;
    }

    public String PetsNo() {

        return "Number of pets: " + noOfPets;

    }

    public String Date() {
        SimpleDateFormat f = new SimpleDateFormat("MMM dd, yyyy");
        return "The selected date is: " + f.format(date);
    }

    public String time() {
        return "The selected time is: " + time;
    }

    public String services() {
        return "The selected services is: " + printServices(services);
    }

}
