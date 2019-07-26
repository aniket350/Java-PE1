package com.stackroute.pe1;

import java.util.Scanner;

public class Sortingnumber {

        public String sortNumber(int inputValue) {
            int i = 0;
            int temp;
            int sum = 0;
            int[] arr = new int[12];
            do {
                arr[i] = inputValue % 10;
                if (arr[i] % 2 == 0) {
                    sum += arr[i];
                }
                inputValue /= 10;
                i++;
            } while (inputValue != 0);
            for (int k = 0; k < i; k++) {
                for (int j = k + 1; j < i; j++) {
                    if (arr[k] < arr[j]) {
                        temp = arr[k];
                        arr[k] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            if (sum > 15) {
                return ("greater than 25");
            } else
                return ("Not greater than 25");
        }
    }
