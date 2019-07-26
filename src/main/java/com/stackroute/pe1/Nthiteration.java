package com.stackroute.pe1;

import java.util.Scanner;

public class Nthiteration {
    int result[]=new int[10000];
    int k=0;
    public int repeatNthTime(int inputValue){
        int count=0;
        for(int i =1; i<=inputValue;i++){
            for(int j=1; j<=i;j++){
               result[k++] = i;
               count++;
            }

        }
        int sum=0;
        for(int i=0;i<count;i++){
            sum=sum*10+result[i];

        }
        System.out.println(sum);
        return sum;
//        return result;
    }

}
