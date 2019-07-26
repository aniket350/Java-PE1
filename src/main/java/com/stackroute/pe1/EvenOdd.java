package com.stackroute.pe1;

import java.util.Scanner;

public class EvenOdd {
    public String checkEvenOdd(int inputValue){
        String finalResult="";
        if(inputValue>=20 && inputValue<=30){
            if(inputValue%2==0){
               finalResult= "Jerry";
            }else{
                finalResult="Tom";
            }
        }else{
            finalResult="Number is not between 20 and 30";
        }
        return finalResult;
    }
}
