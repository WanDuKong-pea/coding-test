package com.example.codingtest.backjun.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Q4 {
    public static void main(String[] args) throws IOException {
        Map<Integer,Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        for(int i = 1; i<10;i++){
            int num = Integer.parseInt(br.readLine());
            map.put(num,i);
            max = Math.max(max,num);
        }
        System.out.println(max);
        System.out.println(map.get(max));
    }
}
