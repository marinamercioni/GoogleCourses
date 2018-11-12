package com.sample;

import java.util.Arrays;
import java.util.Scanner;

public class loto {
    public Scanner scanner = new Scanner(System.in);
    public int[] getIntgers(){
        int number=6;
        System.out.println("Enter " + number + "integer values. \r");
        int[] values = new int[number];
        for (int i=0; i<values.length; i++){
            values[i]=scanner.nextInt();
        }
        System.out.println("you typed \n"+ Arrays.toString(values));
        return values;
    }
}