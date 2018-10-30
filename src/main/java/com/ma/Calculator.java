package com.ma;

public class Calculator {

    CalclualtorService calclualtorService;

    public Calculator(CalclualtorService calclualtorService){
        this.calclualtorService = calclualtorService;
    }

    public int add(int a, int b){
     //   return  a+b;
        return calclualtorService.add(a,b);
    }
}
