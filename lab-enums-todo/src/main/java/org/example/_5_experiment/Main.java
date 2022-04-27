package org.example._5_experiment;

import org.example._2_basic.PizzaStatus;

public class Main {
    public static void main(String[] args) {
        // TODO 11 experiment - use the implemented enums here, create your own and use, etc.

        PizzaStatus ps = PizzaStatus.DELIVERED;
        switch (ps) {
            case READY:
                System.out.println("Ready");
                break;
            case ORDERED:
                System.out.println("Ordered");
                break;
            case DELIVERED:
                System.out.println("Delivered");
                break;
        }
    }
}
