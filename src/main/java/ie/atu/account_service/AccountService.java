package ie.atu.account_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountDB accountDB;

    @Autowired
    public AccountService(AccountDB accountDB) {
        this.accountDB = accountDB;
    }

    public long getBalance(long id) {
        // Assuming you have a method findById in AccountDB
        Account account = accountDB.findByID(id);
        return account.getBalance();
    }

    public void updateBalance(long id, long newBalance) {
        // Assuming you have a method findById in AccountDB
        Account account = accountDB.findByID(id);

        // Update the balance
        account.setBalance(newBalance);

        // Save the updated account
        accountDB.save(account);
    }
}