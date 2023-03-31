import java.util.ArrayList;

// Manual tests for some operations
public class CashTest {
    public static void main(String[] args) {
        CashMachine atm_1 = new CashMachine();
        atm_1.accounts = new ArrayList<>();
        atm_1.title = "MyBank";
        atm_1.accounts.add(new Account("MyBank", "2", 2));
        atm_1.accounts.get(0).usr = new User("Harold", "Davidson", 32, "1520");
        atm_1.accounts.add(new Account("NotMyBank", "3", 920));
        System.out.println(atm_1.withdraw_balance(atm_1.accounts.get(1), 200));
    }
}
