package com.company;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;

public class Fibonacci{
    public Fibonacci(){
        array = new ArrayList<Integer>();
    }

    /**
     * vypocita N ty prvek fibonacciho posloupnosti rekurzivne
     * @param n prvek k vypoctu
     * @return Nty prvek fibonacciho posloupnosti
     */
    public int calcRek(int n){
        if(n <= 1) {
            return n;
        } else {
            return calcRek(n-1) + calcRek(n-2);
        }
    }
    public int calcRekTable(int n){
        throw new UnsupportedOperationException();
    }
    public int calcNerek(int n){
        throw new UnsupportedOperationException();
    }


    private ArrayList<Integer> array;
}
