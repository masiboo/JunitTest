package com.ma;

class Min{

    public static void main(String args [ ]) {

        int min = 50;

        min(min, 40, 20);

        System.out.println(" Minimum of 20, 40 and 50 is " + min); }

    static void min(int min, int a, int b) {
        if (a > b) {
            min = b;
        } else {
            min = a;
        }
    }

}