package ie.atu.account_service;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



    @Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class Account {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String AccountNumber;
        private String AccountHolderName;
        private long Balance;

        public Account(String accountNumber, String accountHolderName, long balance) {
           AccountNumber = accountNumber;
           AccountHolderName = accountHolderName;
           Balance = balance;
        }
    }

