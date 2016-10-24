package observer;

import java.util.ArrayList;
import java.util.List;

public class AvailableStock implements Observer {
    public final List<Product> stockList;

    public AvailableStock() {
        stockList = new ArrayList<>();
    }

    public void statistics() {
        System.out.println("Statistic for available products:");
        for (Product each : stockList) {
            System.out.println(each);
        }
    }

    public void update(Product product, ActionType type) {
        if (ActionType.ADD.equals(type)) {
            System.out.println("Name: " + product.name + ", Price: " + product.price + " was added !");
            stockList.add(product);
            return;
        }
        if (ActionType.SELL.equals(type)) {
            stockList.remove(product);
        }
    }
}