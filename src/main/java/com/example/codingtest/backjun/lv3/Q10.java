package com.example.codingtest.backjun.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        //배열 초기화
        int[] baguni = new int[n];
        for(int i = 0; i<n; i++){
            baguni[i] = i+1;
        }

        StringTokenizer st1;
        for(int j=0; j<m; j++){
            st1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st1.nextToken())-1;
            int b = Integer.parseInt(st1.nextToken())-1;

            for(int k=0; k<(b-a+1)/2; k++){
                int temp = baguni[a+k];
                baguni[a+k]=baguni[b-k];
                baguni[b-k]=temp;
            }
        }

        for(int b : baguni){
            System.out.print(b+" ");
        }
    }
}
