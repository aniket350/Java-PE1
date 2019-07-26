package com.stackroute.pe1;
import java.util.Scanner;

public class vowelconsonant {
    String finalReuslt;
    public String checkVowelOrConsonant(String inputValue) {
        for (int i = 0; i < inputValue.length(); i++) {
            char c = inputValue.charAt(i);
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    finalReuslt = "It is a vowel";
                    break;
                default:
                    finalReuslt = "It is a Consonent";
            }
        }
        return finalReuslt;
    }


    public static void main(String[] args) {
        String str = "root";
        String str1="root";

        String str2 = new String("root");
        String str3 = new String("root");

        if(str2.equals(str3)){
            System.out.println("true111");
        }
        else
        {
            System.out.println("false111");
        }

        if(str2 == str3)
        {
            System.out.println("true222");
        }
        else
        {
            System.out.println("false222");
        }
    }

}
