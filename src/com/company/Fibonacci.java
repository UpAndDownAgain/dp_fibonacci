package com.company;


public class Fibonacci{
    public Fibonacci(){
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

    /**
     * vypocita Nty prvek fibonacciho posloupnosti s pouzitim tabulky
     * @param n prvek k vypoctu
     * @return Nty prvek posloupnosti
     */
    public int calcRekTable(int n){
        int[] arr = new int[n+2];
        arr[0] = 0;
        arr[1] = 1;


    return n;

    }

    /**
     * vypocet Nteho prvku fib posloupnosti nerekurzivne
     * @param
     * @return
     */
    public int calcNerek(int n){
        int[] arr = new int[n+2];
        arr[0] = 0;
        arr[1] = 1;

        for(int i = 2; i <= n; ++i){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}
