package com.stackroute.pe1;

import java.util.Scanner;

public class Charactertype {

    public static void main(String[] args) {

        //Taking Character from user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text ");
        char ch = sc.next().charAt(0);
        System.out.println("Your Entered text is ==>  " + ch);

        // Programme Logic

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is in small letter ");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is in CAPITAL letter ");
        } else if(ch>='0' && ch<= '9'){
            System.out.println(ch + " is digit ");
        }else{
            System.out.println(ch + " is symbol ");
        }
    }
}

