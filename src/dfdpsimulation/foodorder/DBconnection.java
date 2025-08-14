package dfdpsimulation.foodorder;

// SRP: This class only manages one instance of the DBconnection object.
public class DBconnection {
    // Single instance (Singleton Pattern)
    private static DBconnection instance;

    // Encapsulated fields
    private String url;
    private String name;
    private String password;

    private DBconnection() {
    }

    public static DBconnection getInstance() {
        if (instance == null) {
            instance = new DBconnection();
        }
        return instance;
    }

    public void configure(String url, String name, String password) {
        this.url = url;
        this.name = name;
        this.password = password;
    }

    public void showMessage() {
        if(url!=null) {
            System.out.println("Database is Connection Successful!...  ");
            System.out.println("WelCome To RB ");
            System.out.println("Eat with Joy...@");
        }
        else
            System.out.println("Establish a Connection.!");
    }
}
