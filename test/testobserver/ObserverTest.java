package testobserver;

import observer.*;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ObserverTest {
    private Product product;
    private Shop shop;
    private SoldStock sales = new SoldStock();
    private AvailableStock products = new AvailableStock();

    @Before
    public void setUp() throws Exception {
        product = new Product("product", 10.00);
        shop = new Shop();
        shop.register(sales);
        shop.register(products);
    }

    @Test
    public void addingStock() throws Exception {
        shop.add(product);
        shop.add(product);
        int stockSize = products.stockList.size();
        assertThat(stockSize, is(2));
    }

    @Test
    public void sellStock() throws Exception {
        shop.add(product);
        shop.sell(product);
        int availableStock = products.stockList.size();
        int soldStock = sales.stockList.size();
        assertThat(availableStock, is(0));
        assertThat(soldStock, is(1));
    }
}