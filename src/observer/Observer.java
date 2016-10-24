package observer;

public interface Observer {

    void update(Product product, ActionType type);

    void statistics();
}