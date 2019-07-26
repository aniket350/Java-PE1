package com.stackroute.pe1;
import java.util.Scanner;

public class RepeatLastInput {
            String finalResult="";

            public String repeatLastInputNumberTimes(String inputvalue, int number) {

                int length=inputvalue.length();
                for (int i = 0; i <number ; i++) {
                    int temp=length-number;
                    do {
                         char result = inputvalue.charAt(temp);
                         finalResult=finalResult+result;
                         temp++;
                    }while (length!=temp);
                }return finalResult;
            }
        }
