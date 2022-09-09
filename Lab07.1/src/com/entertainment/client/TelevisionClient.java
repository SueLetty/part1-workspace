package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

public class TelevisionClient {

  public static void main(String[] args) {
    Television tv1 = new Television();
    tv1.setBrand("Samsung");
    tv1.setVolume(125);
    tv1.turnOn();
    tv1.turnOff();
    System.out.printf("%d television instances created&n", Television.getInstanceCount());
    Television tv2 = new Television();
    tv2.setBrand("Sony");
    tv2.setVolume(50);
    tv2.turnOn();
    tv2.turnOff();

    System.out.println(tv1);
    System.out.printf("%d television instances created&n", Television.getInstanceCount());

    Television tv3 = new Television();
    System.out.println(tv3.toString());
    System.out.printf("%d television instances created&n", Television.getInstanceCount());
    Television tv4 = new Television("LG");
    System.out.println(tv4.toString());
    System.out.printf("%d television instances created&n", Television.getInstanceCount());
    Television tv5 = new Television("Onn", 35);
    System.out.println(tv5.toString());
    System.out.printf("%d television instances created&n", Television.getInstanceCount());

    Television tv6 = new Television();
    System.out.println(tv6);
    Television tv7 = new Television("Samsung", 55, DisplayType.LCD);
    System.out.println(tv7);
  }
}
