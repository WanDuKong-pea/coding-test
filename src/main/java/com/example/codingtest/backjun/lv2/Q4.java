package com.example.codingtest.backjun.lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalMoney = Integer.parseInt(br.readLine());
        int totalCount = Integer.parseInt(br.readLine());

        int result = 0;
        for(int i = totalCount; i>0; i--){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int money = Integer.parseInt(st.nextToken());
            int cnt = Integer.parseInt(st.nextToken());
            result += money*cnt;
        }

        System.out.println(totalMoney==result?"Yes":"No");
    }
}
