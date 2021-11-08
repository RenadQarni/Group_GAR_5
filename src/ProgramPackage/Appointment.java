package ProgramPackage;

import java.util.*;
import static ProgramPackage.MakeAppointment.*;

/**
 *
 * @author renad
 */
public class Appointment {

    private int noPet;
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
        this.noPet = noPet;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    // ------- Getter -------
    public int getNoPet() {
        return noPet;
    }

    public Date getDate() {
        return date;
    }

    public String getTime() {
        return time;
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

        return "Number of pets: " + noPet;

    }

    @Override
    public String toString() {
        return "Appointment{" + "noPet=" + noPet + "\n, date=" + date + ", time=" + time + "\n, services=" + printServices(services) + '}';
    }

        public String Date(){
     
       return "The selected date is: "+date;
    }

    public String time(){
      
       return "The selected time is: "+time;
    }

    public String services(){
        
        return  "The selected services is: "+printServices(services);
    }

}
