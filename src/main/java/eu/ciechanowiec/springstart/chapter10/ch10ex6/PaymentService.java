package eu.ciechanowiec.springstart.chapter10.ch10ex6;

import org.springframework.stereotype.Service;

/**
 * @author Herman Ciechanowiec
 */
@Service
public class PaymentService {

    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
