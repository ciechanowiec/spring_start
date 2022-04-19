package eu.ciechanowiec.springstart.chapter10.ch10ex5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Herman Ciechanowiec
 */
@RestController
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<?> makePayment() {
        try {
            PaymentDetails paymentDetails = paymentService.processPayment();
            /* If calling the service method succeeds,
             * we return an HTTP response with status
             * Accepted and the PaymentDetails
             * instance as a response body: */
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                                 .body(paymentDetails);
        } catch (NotEnoughMoneyException exception) {
            ErrorDetails errorDetails = new ErrorDetails();
            errorDetails.setMessage("Not enough money to make the payment.");
            return ResponseEntity.badRequest()
                                 .body(errorDetails);
        }
    }
}
