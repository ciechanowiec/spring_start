package eu.ciechanowiec.springstart.chapter15.ch15ex1;

import org.springframework.web.bind.annotation.*;

/**
 * @author Herman Ciechanowiec
 */
@RestController
public class AccountController {

    private final TransferService transferService;

    public AccountController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping("/transfer")
    public void transferMoney(@RequestBody TransferRequest request) {
        transferService.transferMoney(
                        request.getSenderAccountId(),
                        request.getReceiverAccountId(),
                        request.getAmount());
    }

    @GetMapping("/accounts")
    public Iterable<Account> getAllAccounts(
           @RequestParam(required = false) String name) {
        if (name == null) {
            return transferService.getAllAccounts();
        } else {
            return transferService.findAccountsByName(name.replaceAll("\\+", " "));
        }
    }
}
