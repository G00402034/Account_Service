package ie.atu.account_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{id}/balance")
    public ResponseEntity<Long> getBalance(@PathVariable long id) {
        long balance = accountService.getBalance(id);
        return ResponseEntity.ok(balance);
    }

    @PutMapping("/{userId}/update-balance")
    public ResponseEntity<String> updateBalance(@PathVariable long userId, @RequestParam long newBalance) {
        accountService.updateBalance(userId, newBalance);
        return ResponseEntity.ok("Balance updated successfully");
    }
}
