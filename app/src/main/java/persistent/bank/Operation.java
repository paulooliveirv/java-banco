package persistent.bank;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;


@Entity
public class Operation {

    @Id
    @GeneratedValue
    private int id;
    private String type;
    private long date;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return type;
    }

    public void setName(String name) {
        this.type = type;
    }
    
    public void setDate(long date){
        this.date = date;
    }

}
