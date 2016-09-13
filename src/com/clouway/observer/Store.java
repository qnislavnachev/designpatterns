package com.clouway.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public class Store implements Subject {
  private HashMap<String, Stock> availableStock = new LinkedHashMap<>();
  private List<Stock> soldOutStock = new ArrayList<>();
  private List<Observer> observers = new ArrayList<>();


  @Override
  public void register(Observer o) {
    observers.add(o);
  }

  @Override
  public void unregister(Observer o) {
    if (observers.contains(o)) {
      observers.remove(o);
    }
  }

  @Override
  public void add(Stock stock) {
    if (availableStock.containsKey(stock.getName())) {
      Double quantity = stock.getQuantity();
      stock.incrementQuantity(quantity);
    }
    availableStock.put(stock.getName(), stock);
    notifyObserver(stock.toString() + " was added to the store.");
  }

  @Override
  public void sell(Stock stock) {
    if (availableStock.containsKey(stock.getName())) {
      Double availableQuantity = availableStock.get(stock.getName()).getQuantity();
      Double quantityToSell = stock.getQuantity();
      if ((availableQuantity - quantityToSell) == 0) {
        soldOutStock.add(stock);
        availableStock.remove(stock.getName());
        notifyObserver(stock.getName() + " was sold out.");
      }
    }

  }

  @Override
  public void notifyObserver(String message) {
    for (Observer observer : observers) {
      observer.update(message);
    }
  }

}
