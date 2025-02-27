public abstract class People implements Payable {
    private String name, ID;
    private Email email;
    private Address address;
    private int phoneNum;

    public People() {
        name = "";
        ID = "";
        email = null;
        address = null;
        phoneNum = 0;
    }

    // Copy constructor
    public People(People other) {
        this.name = other.name;
        this.ID = other.ID;
        this.email = other.email;
        this.address = other.address;
        this.phoneNum = other.phoneNum;
    }

    public People(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public abstract String Display();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = new Email(email);
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }
}
