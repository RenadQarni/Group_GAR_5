package ProgramPackage;

import java.util.logging.Logger;

public class User {

    private String Usernme;
    private String Email;
    private String Phone;
    private String Password;
    private static final Logger LOG = Logger.getLogger(User.class.getName());

    public static Logger getLOG() {
        return LOG;
    }

    public User(String Usernme, String Email, String Phone, String Password) {
        this.Usernme = Usernme;
        this.Email = Email;
        this.Phone = Phone;
        this.Password = Password;
    }

    public void setUsernme(String Usernme) {
        this.Usernme = Usernme;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUsernme() {
        return Usernme;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhone() {
        return Phone;
    }

    public String getPassword() {
        return Password;
    }

    public void CreateAccount() {
        //mrthod here
    }

    @Override
    public String toString() {
        return "User{" + "Usernme=" + Usernme + ", Email=" + Email + ", Phone=" + Phone + ", Password=" + Password + '}';
    }
}
