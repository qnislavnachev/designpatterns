package com.clouway;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public class PartyGuestList {
  private List<String> guests =new LinkedList<>();
  private static PartyGuestList instance=null;

  private PartyGuestList(){
    System.out.println("Guest list created.");
  }

  public static PartyGuestList getInstance(){
    if (instance==null){
      instance=new PartyGuestList();
    }
    return instance;
  }
  public void add(String name){
    guests.add(name);
  }
  public boolean containts(String name){
    if(guests.contains(name)){
      return true;
    }
    return false;
  }

  public void remove(String name) {
    guests.remove(name);
  }

  @Override
  public String toString() {
    return  "guests=" + guests +
            '}';
  }
}
