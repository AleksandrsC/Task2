package com.accenture.bootcamp.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner console=new Scanner(System.in);

    public static void main(String[] args) {

        try {
            int a=askUserInt("number A:");
            int b=askUserInt("number B:");
            System.out.printf("result:%s%n", a == b || (a < 0 && b > 0) || (a > 1001 && b > 1001));
        }catch(Exception x){
            x.printStackTrace();
        }

    }

    private static int askUserInt(String prompt){
        System.out.print(prompt);
        try {
            return console.nextInt();
        }catch(InputMismatchException x){
            System.out.println("integer number, please.");
            console.next();
            return askUserInt(prompt);
        }
    }
}
