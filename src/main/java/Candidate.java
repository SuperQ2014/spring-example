/**
 * Created by chaoqiang on 16/6/11.
 */
public class Candidate {

    private String name;
    private String address;

    public Candidate(String address, String name) {
        this.address = address;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
