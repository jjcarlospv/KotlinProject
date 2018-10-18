package com.example.jc.miprimeraaplicacion;

import java.util.stream.IntStream;

public class Kata {


    public static void main(String [] arg){
        stream().forEach(x->System.out.println(x));
    }


    public static int  isPrime(int i){
        if(i==1) return -1;
        if(i==2 || i==3 || i==5 || i==7 || i==11 || i==13 || i==17 || i==19 || i == 23 || i == 29 || i == 31) return i; // edge cases
        if(i%2==0 || i%3==0) return -1; // edge cases
        int endp = (int)Math.ceil(Math.sqrt(i)/6.0)+2;
        for(int m = 1; m <= endp; m++){
            if(i%(6*m+1)==0 || i%(6*m-1)==0) return -1;
        }
        return i;
    }

    public static IntStream stream() {
        return  IntStream.rangeClosed(2, 9759500).filter(i -> isPrime(i) != -1).filter(i-> i>0);
    }

    public static IntStream streamOld() {
        return  IntStream.rangeClosed(2, 9759500).filter(i ->
                IntStream.rangeClosed(2, (int)(Math.sqrt(i))).allMatch(j -> i%j != 0)
        );
    }


}
