package com.company;


import java.util.ArrayList;

public class Fibonacci{
    Fibonacci(){
        prepTable(3);
    }
    private long[] table;

    /**
     * vypocita N ty prvek fibonacciho posloupnosti rekurzivne
     * @param n prvek k vypoctu
     * @return Nty prvek fibonacciho posloupnosti
     */
    public long calcRek(int n){
        if(n <= 1) {
            return n;
        } else {
            return calcRek(n-1) + calcRek(n-2);
        }
    }

    /**
     * vypocita Nty prvek fibonacciho posloupnosti s pouzitim tabulky
     * @param n prvek k vypoctu
     * @return Nty prvek posloupnosti
     */
    public long calcRekTable(int n){
        if(n <= 1) return n;

        if(table.length <= n){
            prepTable(n+1);
        }
        if(table[n] == -1){
            table[n] = calcRekTable(n-1) + calcRekTable(n-2);
        }
        return table[n];
    }

    /**
     * vypocet Nteho prvku fib posloupnosti nerekurzivne
     * @param n prvek k vypoctu
     * @return hodnota Nteho prvku
     */
    public long calcNerek(int n) {
        if(n <= 1) return n;

        long f = 0;
        long s = 1;
        long value = 1;

        for(int i = 2; i <= n ; ++i){
            value = f + s;
            f = s;
            s = value;
        }
        return value;
    }
    private void prepTable(int n){
        table = new long[n];
        table[0] = 0;
        table[1] = 1;

        for(int i = 2; i < n; ++i){
            table[i] = -1;
        }
    }

}
