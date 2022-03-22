package com.accenture.bootcamp.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	    BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("String:");
        try {
            String inp = console.readLine();
            System.out.println();
            System.out.println("input:" + inp);
        }catch(IOException x){
            System.err.println(x);
        }

    }
}
