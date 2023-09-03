package com.example.codingtest.backjun.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        float[] score =  new float[cnt];
        float max = 0;
        float avg = 0;

        for(int i=0; i<score.length; i++){
            score[i]=Float.parseFloat(st.nextToken());
            max = Math.max(max,score[i]);
        }

        for(int i = 0; i<score.length;i++){
            avg += (score[i]/max*100)/cnt;
        }
        System.out.println(avg);
    }
}
