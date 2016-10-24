package observer;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Observer> observers;
    private ActionType sellType = ActionType.SELL;
    private ActionType addType = ActionType.ADD;

    public Shop() {
        observers = new ArrayList<>();
    }

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void add(Product product) {
        notifyObserver(product, addType);
    }

    public void sell(Product product) {
        notifyObserver(product, sellType);
    }

    public void statistics() {
        for (Observer each : observers) {
            each.statistics();
        }
    }

    private void notifyObserver(Product product, ActionType type) {
        for (Observer each : observers) {
            each.update(product, type);
        }
    }
}