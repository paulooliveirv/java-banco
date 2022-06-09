package persistent.bank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;


    private String name;
    private String email;
    private String phone;

    //geters and setters;

    

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = name;
    }

    //geters and setters for email;
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //geters and setters for telefone;
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void Pessoa () {
        this.name = "";
        this.email = "";
        this.phone = "";
    }
    

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

}
