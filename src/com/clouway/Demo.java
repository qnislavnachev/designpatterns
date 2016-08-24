package com.clouway;

/**
 * @author Vasil Mitov <v.mitov.clouway@gmail.com>
 */
public class Demo {
  public static void main(String[] args) {
    Host host=new Host();
    Organiser organiser=new Organiser();
    System.out.println(host.invite("Denis"));
    System.out.println(host.invite("Vasko"));
    System.out.println(host.invite("Marto"));
    System.out.println(host.invite("Qni"));
    System.out.println(host.uninvite("Qni"));
    System.out.println(organiser.sendInvites());
  }

}
