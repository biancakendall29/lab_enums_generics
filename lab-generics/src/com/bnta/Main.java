package com.bnta;

import com.bnta._1.Box;
import com.bnta._2.Pair;

public class Main {

    public static void main(String[] args) {
        Box boxWithoutRestrictions = new Box("Hello");
        Box<Integer> boxForIntegersOnly = new Box(3);

        System.out.println(boxWithoutRestrictions.getT());
        System.out.println(boxForIntegersOnly.getT());

        Pair<String, Integer> pair1 = new Pair<>("", 10);
        Pair<Integer, String> pair2 = new Pair<>(20, "");
        Pair<String, String> pair3 = new Pair<>("", "");

        System.out.println("K is: " + pair1.getK() + " and V is: " + pair1.getV());
        System.out.println("K is: " + pair2.getK() + " and V is: " + pair2.getV());
        System.out.println("K is: " + pair3.getK() + " and V is: " + pair3.getV());
    }

}
