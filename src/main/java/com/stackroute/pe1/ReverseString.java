package com.stackroute.pe1;

public class ReverseString {


        public static String reverseString(String inputValue) {
            String result;
            if(inputValue==null){
                return result = "Insert a String Null value not Null";
            }
            char ch[] = inputValue.toCharArray();
            int i = 0, j = ch.length - 1;
            while (i < j) {
                char tmp = ch[i];
                ch[i] = ch[j];
                ch[j] = tmp;
                i++;
                j--;
            }
            return new String(ch);
        }
}
