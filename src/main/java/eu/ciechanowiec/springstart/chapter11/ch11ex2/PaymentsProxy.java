package eu.ciechanowiec.springstart.chapter11.ch11ex2;

import eu.ciechanowiec.springstart.chapter11.ch11payments.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

/**
 * @author Herman Ciechanowiec
 */
@Component
public class PaymentsProxy {

    private final RestTemplate restTemplate;
    @Value("${payments.service.url}")
    private String paymentsServiceUrl;

    @Autowired
    public PaymentsProxy(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Payment createPayment(Payment payment) {
        String uri = paymentsServiceUrl + "/payment";
        HttpHeaders headers = new HttpHeaders();
        headers.add("requestId", UUID.randomUUID().toString());

        HttpEntity<Payment> httpEntity = new HttpEntity<>(payment, headers);

        ResponseEntity<Payment> responseEntity =
                restTemplate.exchange(uri,
                                      HttpMethod.POST,
                                      httpEntity,
                                      Payment.class);

        return responseEntity.getBody();
    }
}
