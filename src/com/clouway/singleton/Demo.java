package com.clouway.singleton;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public class Demo {
  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance();
    Singleton singleton1= Singleton.getInstance();
  }
}
