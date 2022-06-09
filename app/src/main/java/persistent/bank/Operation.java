package persistent.bank;

public class Operation {
    private String type;
    private long date;


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
