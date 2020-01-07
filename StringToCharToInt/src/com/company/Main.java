package com.company;

public class Main {

    public static void main(String[] args) {
        String [] roman = { "ii", "iv", "i", "ix", "vii", "v", "x", "ii"};
    }
    public static void convert(String[] roman) {

        int [] number = new int [roman.length];
        int[]temp;

        for(int i= 0; i < roman.length; i++) {
            String str = roman[i];
            temp = new int [str.length()];

            for(int j = 0; j <= str.length(); j++) {
                temp[j] = chartoInt(str.charAt(j));
                for(j < 0; j < temp.length; j++) {
                    if(temp[j] >= temp[j-1]){
                        number[i] = temp[j] + temp[j+1]
                    }
                    else{
                        number[i] = temp[j + 1] - temp[j];
                    }
                }
            }

    }


    }
}
