package com.example.codingtest.backjun.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * n개의 숫자가 공백없이 쓰여있음 이 숫자를 모두 합해서 출력하는 프로그램 작성
 * 첫줄에 숫자 개수, 둘째 줄에 숫자 n개가 공백없이 주어짐
 */
public class Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int result = 0;
        for(int i=0; i<n; i++){
            result += s.charAt(i)-'0';
        }

        System.out.println(result);
    }
}
