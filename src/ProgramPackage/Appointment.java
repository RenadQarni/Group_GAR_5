package ProgramPackage;

import java.util.*;
import java.time.LocalTime;
import static ProgramPackage.MakeAppointment.*;

/**
 *
 * @author renad
 */
public class Appointment {
    
    private Date date;
    private LocalTime time;
    private ArrayList<Service> services = Service.getAvailableServices();
    static ArrayList<Appointment> appointments = new ArrayList<>();
    
    public Appointment(Date date, LocalTime time) {
        this.date = date;
        this.time = time;
        appointments.add(this);
    }

    public Appointment() {
    }

    // ------- Setter -------
    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    // ------- Getter -------
    public Date getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }
    
    // ------- Method -------
    public static ArrayList<Appointment> ViewAppointment(){
        
        return appointments;
    }
    
}
