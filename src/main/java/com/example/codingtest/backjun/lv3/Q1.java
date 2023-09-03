package com.example.codingtest.backjun.lv3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] numbers = new int[length];

        for(int i = 0;i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }

        int v = sc.nextInt();

        sc.close();

        int cnt =0;
        for(int n : numbers){
            if(n == v){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
