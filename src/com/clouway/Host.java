package com.clouway;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public class Host {
  private PartyGuestList partyGuestList=PartyGuestList.getInstance();

  public String invite(String name){
    partyGuestList.add(name);
    return name+" was invited";
  }
  public String uninvite(String name){
    if (partyGuestList.containts(name)){
      partyGuestList.remove(name);
      return name+" was uninvited.";
    }
    return "No such guest on list.";
  }
}
