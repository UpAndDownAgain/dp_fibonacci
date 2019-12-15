package com.company;

public class Fibonacci{
    Fibonacci(){
        table = new long[10];
        table[0] = 0;
        table[1] = 1;

        for(int i = 2; i < 10; ++i){
            table[i] = -1;
        }
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
            resizeTable(n+1);
        }
        if(table[n] == -1){
            return table[n] = calcRekTable(n-1) + calcRekTable(n-2);
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

    /**
     * pomocna trida pro zvetseni velikosti table
     * vytvori novy table do ktereho nasledne prekopiruje uz vypoctene hodnoty
     * @param n velikost noveho table
     */
    private void resizeTable(int n){
        long[] tmp = table;
        table = new long[n];
        int i = 0;
        for(; i < tmp.length; ++i){
            table[i] = tmp[i];
        }
        for(;i < table.length; ++i){
            table[i] = -1;
        }
    }

}
