package com.example.codingtest.backjun.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String star = "*";
        for(int i=1;i<=cnt;i++){
            //System.out.println(star.repeat(i));
        }
    }
}
