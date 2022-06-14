package com.opdracht;

public class Main {

    public static void main(String[] args) {
        int gold = 10;

        String result = silver(gold);

        System.out.println(result);
    }
    public static String silver(int gold) {
        int amountSilver = gold * 1000;

        return gold + " gold is gelijk aan "+ amountSilver + " silver";
    }
}
