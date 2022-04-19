package eu.ciechanowiec.springstart.chapter11.ch11ex1;

import eu.ciechanowiec.springstart.chapter11.ch11payments.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * @author Herman Ciechanowiec
 */
@FeignClient(name = "payments",
             url = "${payments.service.url}")
public interface PaymentsProxy {

    @PostMapping("/payment")
    Payment createPayment(@RequestHeader String requestId,
                          @RequestBody Payment payment);
}
