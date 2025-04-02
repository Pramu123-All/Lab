package Q4;

public class Owner {
    private String ownerName;
    private String phoneNo;


    public Owner(String name, String num) {
       this.ownerName=name;
       this.phoneNo=num;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public   String getPhoneNo() {
        return phoneNo;
    }

    public void setOwnerName(String name) {
        this.ownerName=name;
    }

    public void setPhoneNo(String num) {
        this.phoneNo=num;
    }


}
