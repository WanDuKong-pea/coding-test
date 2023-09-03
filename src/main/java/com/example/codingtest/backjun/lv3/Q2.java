package com.example.codingtest.backjun.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        String[] s = br.readLine().split(" ");
        int[] numbers = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();

        for(int i = 0; i<length; i++){
            if(numbers[i] < x){
                System.out.print(numbers[i]+" ");
            }
        }
    }
}
