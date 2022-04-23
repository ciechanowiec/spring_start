package eu.ciechanowiec.springstart.chapter12.ch12ex1;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Herman Ciechanowiec
 */
@Repository
public class PurchaseRepository {

    private final JdbcTemplate jdbc;

    public PurchaseRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void storePurchase(Purchase purchase) {
        String sql = "INSERT INTO purchase VALUES (NULL, ?, ?)";
        jdbc.update(sql,
                    purchase.getProduct(),
                    purchase.getPrice());
    }

    public List<Purchase> findAllPurchases() {
        String sql = "SELECT * FROM purchase";

        RowMapper<Purchase> purchaseRowMapper = (resultSet, rowNumber) -> {
            Purchase rowObject = new Purchase();
            rowObject.setId(resultSet.getInt("id"));
            rowObject.setProduct(resultSet.getString("product"));
            rowObject.setPrice(resultSet.getBigDecimal("price"));
            return rowObject;
        };
        return  jdbc.query(sql, purchaseRowMapper);
    }
}
