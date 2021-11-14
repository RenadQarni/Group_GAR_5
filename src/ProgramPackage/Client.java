package ProgramPackage;

import ProgramPackage.Appointment;
import java.util.ArrayList;

public class Client {

    private ArrayList<Appointment> appointments = new ArrayList<>();

    public Client() {
  
    }

    public void Makeppointment() {

    }

    public void BrowseServices() {

    }

    public void AskForHelp() {

    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }

    @Override
    public String toString() {
        return "Client{" + "appointments=" + appointments + '}';
    }

}
