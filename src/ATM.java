// ATM (Cash Machine) interface with sample methods
public interface ATM {
    public double get_balance(Account acc);
    public double top_up_balance(Account acc, double top_up);
    public double withdraw_balance(Account acc, double withdraw);
    public boolean transfer_balance(Account acc_sender, Account acc_recipient, double transfer);
}
