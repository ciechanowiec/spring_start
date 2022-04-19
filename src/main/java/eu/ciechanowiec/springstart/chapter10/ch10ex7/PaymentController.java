package eu.ciechanowiec.springstart.chapter10.ch10ex7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tinylog.Logger;

/**
 * @author Herman Ciechanowiec
 */
@RestController
public class PaymentController {

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment(
            @RequestBody PaymentDetails paymentDetails) {
        Logger.info("Received payment " + paymentDetails.getAmount());
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                             .body(paymentDetails);
    }
}
