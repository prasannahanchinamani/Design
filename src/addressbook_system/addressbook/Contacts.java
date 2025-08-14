package addressbook_system.addressbook;

public class Contacts {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public Contacts(String address, String city, String email, String firstName, String lastName, String phoneNumber, String state, String zip) {
        this.address = address;
        this.city = city;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.state = state;
        this.zip = zip;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Contact Details:\n" +
                "First Name : " + firstName + "\n" +
                "Last Name  : " + lastName + "\n" +
                "Address    : " + address + "\n" +
                "City       : " + city + "\n" +
                "State      : " + state + "\n" +
                "ZIP        : " + zip + "\n" +
                "Phone      : " + phoneNumber + "\n" +
                "Email      : " + email + "\n";
    }
}
