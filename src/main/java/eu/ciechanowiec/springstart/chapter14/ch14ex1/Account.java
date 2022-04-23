package eu.ciechanowiec.springstart.chapter14.ch14ex1;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

/**
 * @author Herman Ciechanowiec
 */
public class Account {

    @Id
    private long id;
    private String name;
    private BigDecimal amount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
