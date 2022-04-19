package eu.ciechanowiec.springstart.chapter11.ch11payments;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.tinylog.Logger;

import java.util.UUID;

/**
 * @author Herman Ciechanowiec
 */
@RestController
public class PaymentsController {

    @PostMapping("/payment")
    public ResponseEntity<Payment> createPayment(
            @RequestHeader String requestId,
            @RequestBody Payment payment) {
        Logger.info("Received a request with an ID " + requestId
                    + "; Payment amount: " + payment.getAmount());
        payment.setId(UUID.randomUUID().toString());
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("requestId", requestId)
                .body(payment);
    }
}
