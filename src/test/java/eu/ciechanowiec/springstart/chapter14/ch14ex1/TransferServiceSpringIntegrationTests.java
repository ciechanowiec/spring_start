package eu.ciechanowiec.springstart.chapter14.ch14ex1;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.math.BigDecimal;
import java.util.Optional;

@SpringBootTest
public class TransferServiceSpringIntegrationTests {

    @MockBean
    private AccountRepository accountRepository;

    @Autowired
    private TransferService transferService;

    @Test
    public void transferServiceTransferAmountTest() {
        Account sender = new Account();
        sender.setId(1);
        sender.setAmount(new BigDecimal(1000));

        Account receiver = new Account();
        receiver.setId(2);
        receiver.setAmount(new BigDecimal(1000));

        BDDMockito.when(accountRepository.findById(1L))
                  .thenReturn(Optional.of(sender));
        BDDMockito.when(accountRepository.findById(2L))
                  .thenReturn(Optional.of(receiver));

        transferService.transferMoney(1, 2, new BigDecimal(100));

        Mockito.verify(accountRepository)
               .changeAmount(1, new BigDecimal(900));
        Mockito.verify(accountRepository).changeAmount(2, new BigDecimal(1100));
    }
}