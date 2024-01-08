package ie.atu.account_service;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Account {

    @Entity
    @Data
    @NoArgsConstructor
    public class Account {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String accountNumber;
        private String accountHolderName;
        private long balance;

        public Account(String accountNumber, String accountHolderName, long balance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
        }
}
