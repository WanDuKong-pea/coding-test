package com.example.codingtest.backjun.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Q8 {
    public static void main(String[] args) throws IOException {
        Map<Integer,Boolean> students = new HashMap<>();
        for(int i = 1; i<=30; i++){
            students.put(i,false);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int j = 0; j<28; j++){
            int key = Integer.parseInt(br.readLine());
            students.put(key,true);
        }

        for(int k = 1; k<=30; k++){
            if(!students.get(k)) {
                System.out.println(k);
            }
        }
    }
}
