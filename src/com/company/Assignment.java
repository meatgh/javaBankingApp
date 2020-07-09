package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Assignment {

    public static void main(String[] args) {

        factorial2(4);
    }

    public static void factorial2(int n) {
        if (n > 0) {
            if(n>0){
                factorial2(n-1);
                System.out.print(n-1+" ");
                factorial2(n-1);
            }
        }


    }

}
