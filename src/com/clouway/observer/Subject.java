package com.clouway.observer;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public interface Subject {
  void register(Observer o);

  void unregister(Observer o);

  void add(Stock stock);

  void sell(Stock stock);

  void notifyObserver(String message);
}
