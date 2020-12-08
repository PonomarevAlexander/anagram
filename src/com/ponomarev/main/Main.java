package com.ponomarev.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringModifer stringModifer = new StringModifer();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("q")) {
                scanner.close();
                break;
            }  
            else {
                System.out.println(stringModifer.reverseString(input));
                System.out.println();
            }      
        }
    }
}