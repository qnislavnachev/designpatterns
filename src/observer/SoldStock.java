package observer;

import java.util.ArrayList;
import java.util.List;

public class SoldStock implements Observer {
    public final List<Product> stockList;

    public SoldStock() {
        stockList = new ArrayList<>();
    }

    public void statistics() {
        System.out.println("Statistic for sold products:");
        for (Product each : stockList) {
            System.out.println(each);
        }
    }

    public void update(Product product, ActionType type) {
        if (ActionType.SELL.equals(type)) {
            System.out.println("Name: " + product.name + ", Price: " + product.price + " was sold !");
            stockList.add(product);
        }
    }
}