package com.example.codingtest.backjun.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] bagunis = new int[n];

        StringTokenizer st1;
        for(int r=0; r<m; r++){
            st1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());
            int c = Integer.parseInt(st1.nextToken());

            for(int i=a-1; i<b; i++ ){
                bagunis[i]=c;
            }
        }

        for(int b : bagunis){
            System.out.print(b+" ");
        }
    }
}
