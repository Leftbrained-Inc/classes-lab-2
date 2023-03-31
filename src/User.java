// Class for a user of an account, the client
public class User {
    public String name;
    public String second_name;
    public int id;
    public String pin_code;

    // Basic constructor
    public User(String name, String second, int id, String code) {
        this.name = name;
        this.second_name = second;
        this.id = id;
        this.pin_code = code;
    }
}

