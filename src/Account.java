// Bank Account Implementation: provider is the card issuer, title is the bank
public class Account {
    public String title;
    public String provider;
    public double balance;
    public User usr;

    public Account(String title, String provider, double balance) {

        // Essential constructor with defaults
        if (!title.isEmpty()) this.title = "Unnamed Bank";
        else this.title = title;
        this.provider = provider;
        // Check for negative balance
        if (balance >= 0) this.balance = balance;
        else this.balance = 0;
        this.usr = new User("Unnamed", "SecondName", 0, "0000");
    }
}
