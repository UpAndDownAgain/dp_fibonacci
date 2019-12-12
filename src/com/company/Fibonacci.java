package com.company;


public class Fibonacci{
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
        long[] arr = new long[n+2];
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i <= n; ++i){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
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

}
