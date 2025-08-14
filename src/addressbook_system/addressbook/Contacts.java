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
