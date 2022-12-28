import java.util.ArrayList;

public class EventOrganiser {
    private String Custid;
    private String Custname;
    private String Custaddr;
    private String Custmail;
    private String Custphone;

    public String getCustid() {
        return Custid;
    }

    public void setCustid(String custid) {
        Custid = custid;
    }

    public String getCustname() {
        return Custname;
    }

    public void setCustname(String custname) {
        Custname = custname;
    }

    public String getCustaddr() {
        return Custaddr;
    }

    public String getCustmail() {
        return Custmail;
    }

    public void setCustmail(String custmail) {
        Custmail = custmail;
    }

    public void setCustaddr(String custaddr) {
        Custaddr = custaddr;
    }

    public String getCustphone() {
        return Custphone;
    }

    public void setCustphone(String custphone) {
        Custphone = custphone;
    }

    public void PrintGuests(){
        System.out.println("id : "+this.getCustid());
        System.out.println("nama : "+this.getCustname());
        System.out.println("addr : "+this.getCustaddr());
        System.out.println("email : "+this.getCustmail());
        System.out.println("phone : "+this.getCustphone());
    }


    public EventOrganiser(){
    }
    public EventOrganiser(String Custid, String Custname, String Custaddr, String Custmail, String Custphone){
        this.Custid = Custid;
        this.Custname = Custname;
        this.Custaddr = Custaddr;
        this.Custmail = Custmail;
        this.Custphone = Custphone;
    }
}
