package eu.ciechanowiec.springstart.chapter15.ch15ex1;

import eu.ciechanowiec.springstart.chapter15.ch15ex1.TransferService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class TransferServiceTest {

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private TransferService transferService;

    @Test
    @DisplayName("Test the amount is transferred " +
                 "from one account to another if no exception occurs.")
    public void testTransferMoney() {
        // given
        Account sender = new Account();
        sender.setId(1);
        sender.setAmount(new BigDecimal(1000));

        Account destination = new Account();
        destination.setId(2);
        destination.setAmount(new BigDecimal(1000));

        BDDMockito.given(accountRepository.findById(sender.getId()))
                  .willReturn(Optional.of(sender));
        BDDMockito.given(accountRepository.findById(destination.getId()))
                  .willReturn(Optional.of(destination));
        // when
        transferService.transferMoney(sender.getId(),
                                      destination.getId(),
                                      new BigDecimal(100));
        // then
        Mockito.verify(accountRepository)
               .changeAmount(1, new BigDecimal(900));
        Mockito.verify(accountRepository)
               .changeAmount(2, new BigDecimal(1100));
    }

    @Test
    public void testTransferMoneyException() {
        Account sender = new Account();
        sender.setId(1);
        sender.setAmount(new BigDecimal(1000));

        BDDMockito.given(accountRepository.findById(1L))
                  .willReturn(Optional.of(sender));
        BDDMockito.given(accountRepository.findById(2L))
                  .willReturn(Optional.empty());
        assertThrows(AccountNotFoundException.class, () ->
                transferService.transferMoney(1, 2, new BigDecimal(100)));

        Mockito.verify(accountRepository, Mockito.never())
               .changeAmount(Mockito.anyLong(), Mockito.any());
    }
}
