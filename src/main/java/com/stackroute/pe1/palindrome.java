package com.stackroute.pe1;

public class palindrome {

    public String checkPalindrome(long inputValue) {

        long result=0;
        long sum=0;
        long value;
        String finalResult="";
        int length = (int)(Math.log10(inputValue)+1);
        //System.out.println("Length of integer is --" + length);

        while(length >= 0)
        {
           value = inputValue %10;
           if(value%2==0){
             sum = sum+value;
           }
           result = 0*10+ inputValue;
           inputValue = inputValue/10;
           length--;
        }
        if(result==inputValue)
        {
            //checking weather the sum is greater than 25 or not
            if(sum>25){
                finalResult="Greater than 25";
            }else {
                finalResult="Not greater than 25";
            }
        }else
            {
            finalResult="Failue, not a palindrome";
        }

        return  finalResult;
    }
}

