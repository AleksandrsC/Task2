package com.accenture.bootcamp.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader console=new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        try {
            int a=Integer.parseInt(askUser("number A:"));
            int b=Integer.parseInt(askUser("number B:"));
            System.out.printf("result:%s%n", a == b || (a < 0 && b > 0) || (a > 1001 && b > 1001));
        }catch(IOException x){

            System.err.println(x);
        }

    }

    private static String askUser(String prompt) throws IOException {
        System.out.print(prompt);
        return console.readLine();
    }
}
