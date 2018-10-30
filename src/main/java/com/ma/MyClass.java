package com.ma;

import org.junit.Rule;

/**
 * Hello world!
 *
 */
public class MyClass
{

    public static void main( String[] args )
    {
        outerloop:
        for (int i=0; i < 10; i++) {
            if(i == 5){
                System.out.println("Breaking");
                continue outerloop;
            }
            System.out.println(i + " ");
           /* for (int j=0; j < 5; j++) {
                if (i * j > 6) {
                    System.out.println("Breaking");
                    continue outerloop;
                }
                System.out.println(i + " " + j);
            }*/
        }
        System.out.println("Done");

    }

    public int multiply(int i, int j) {
        return i * j;
    }
}
