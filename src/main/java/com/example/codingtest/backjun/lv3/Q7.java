package com.example.codingtest.backjun.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] baguni = new int[n];

        for(int i = 0; i<n; i++){
            baguni[i]=i+1;
        }

        StringTokenizer st1;
        for(int r = 0; r<m; r++){
            st1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());

            int temp = baguni[a-1];
            baguni[a-1] = baguni[b-1];
            baguni[b-1] = temp;
        }

        for(int b : baguni){
            System.out.print(b+" ");
        }
    }
}
