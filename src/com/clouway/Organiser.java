package com.clouway;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public class Organiser {
  private PartyGuestList partyGuestList=PartyGuestList.getInstance();

  public String sendInvites(){
    return "Invites sent to "+partyGuestList.toString();
  }
}
