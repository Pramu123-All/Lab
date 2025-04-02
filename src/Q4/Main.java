package Q4;


public class Main {
    public static void main(String[] args) {

        Bicycle bike1 = new Bicycle("John","1234567890");

        System.out.println("Owner Name: "+bike1.getOwner().getOwnerName());
        System.out.println("Phone Number: "+bike1.getOwner().getPhoneNo());


    }
}
