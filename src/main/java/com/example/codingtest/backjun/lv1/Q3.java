package com.example.codingtest.backjun.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3 {
    public static final int MINUS_MINUTE=45;
    public static final int HOUR_TO_MINUTE = 60;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        int totalMinute = hour*HOUR_TO_MINUTE+minute;
        int resultTimeMinute = totalMinute-MINUS_MINUTE;

        if(resultTimeMinute<0){
            System.out.println("23 "+(HOUR_TO_MINUTE+resultTimeMinute));
        }else{
            System.out.println(resultTimeMinute/HOUR_TO_MINUTE+" "+resultTimeMinute%HOUR_TO_MINUTE);
        }
    }
}
