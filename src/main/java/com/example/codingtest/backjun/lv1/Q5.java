package com.example.codingtest.backjun.lv1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        int cookingMinute = Integer.parseInt(br.readLine());

        int resultHour = (hour*60+minute+cookingMinute)/60;
        int resultMinute = (hour*60+minute+cookingMinute)%60;

        if(resultHour>23){
            resultHour -= 24;
        }

        System.out.println(resultHour+" "+ resultMinute);

    }
}
