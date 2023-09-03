package com.example.codingtest.backjun.lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q9 {
    private static final int DIVISOR = 42;

    public static void main(String[] args) throws IOException {

        int[] mod = new int[10];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i<mod.length; i++){
            int dividend  = Integer.parseInt(br.readLine());
            mod[i] = dividend % DIVISOR;
        }

        Arrays.sort(mod);

        int value = -1;
        int cnt = 0;
        for(int i=0; i<mod.length; i++){
            if(mod[i]!=value){
                value=mod[i];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
