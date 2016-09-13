package com.clouway.singleton;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public class Singleton {
  private static Singleton instance=null;

  private Singleton(){
    System.out.println("Singleton was created.");
  }

  public static Singleton getInstance(){
    if (instance==null){
      instance=new Singleton();
    }
    return instance;
  }
}
