package com.example.codingtest.backjun.lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q7 {
    public static final int DIFF_YEAR = 543;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int taiwan = Integer.parseInt(br.readLine());
        int korea = taiwan-DIFF_YEAR;
        System.out.println(korea);
    }
}
