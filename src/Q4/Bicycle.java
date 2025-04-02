package Q4;

public class Bicycle {
    // Data Member
    private Owner owner;
    //Constructor: Initializes the data member
    public Bicycle() {
      this.owner=new Owner("Unknown","Unknown");
    }
    public Bicycle(String name,String num) {
        this.owner=new Owner(name,num);
    }

    public Owner getOwner() {
        return owner;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;



}}

