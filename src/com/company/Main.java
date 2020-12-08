package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        int countMax = 0;
        for (int i=0; i<len-1; i++){
            int count = 1;
            for (int j=i+1; j<len; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>countMax)
                countMax = count;
        }
        System.out.println(len-countMax);
    }
}
