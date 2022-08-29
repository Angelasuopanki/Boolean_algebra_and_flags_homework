package com.company;

public class Main {

    public static void main(String[] args) {
        homework4();
    }

    static void homework1() {
        boolean weekday = true;
        boolean vacation = false;
        if (weekday == false)
            System.out.println("sleep in");
        else if (vacation == true)
            System.out.println("sleep in");
        else System.out.println("don't sleep in");
    }

    static void homework2() {
        boolean shining = true;
        int time = 10;
        if (shining == true && time == 10 || time == 11 || time == 12 || time == 13 || time == 14 || time == 15 || time == 16)
            System.out.println("please wear sunscreen");
    }

    static void homework3() {
        int a = 26;
        int b = 36;
        if (a % 10 == b % 10)
            System.out.println("true");
        else
            System.out.println("false");
    }

    static void homework4() {
        boolean found = false;
        int a = 387, b = 6381;
        int val=1;
        while (found = false)
            if (a % val == b % val){
                found = true;
                System.out.println(val);
            }
            else val = val++;
    }

}


