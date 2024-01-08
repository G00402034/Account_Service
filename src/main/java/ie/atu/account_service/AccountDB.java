package ie.atu.account_service;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDB extends JpaRepository<Account, Long> {
    Account findByAccountNumber(String accountNumber);
    Account findByID(long id);
    }

