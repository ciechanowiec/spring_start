package eu.ciechanowiec.springstart.chapter11.ch11ex3;

import eu.ciechanowiec.springstart.chapter11.ch11ex2.PaymentsProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @author Herman Ciechanowiec
 */
@Component
public class PaymentProxy {

    private final WebClient webClient;
    @Value("${payments.service.url}")
    private String url;

    @Autowired
    public PaymentProxy(WebClient webClient) {
        this.webClient = webClient;
    }

    Mono

}
