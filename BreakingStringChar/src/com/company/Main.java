package com.company;

public class Main {

    public static void main(String[] args) {

            String str = "River";

            // Creating array of string length
            char[] ch = str.toCharArray();

            // Copy character by character into array
            for (int i = 1; i < 2; i++) {
                int j = ch.length - 2;

              char  temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;


            }

            // Printing content of array
            for (char c : ch) {
                System.out.println(c);
            }
        }

    }

