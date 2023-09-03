package com.example.codingtest.backjun.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 주어졌을때 주어진 글자의
 * 아스키 코드값을 출력하는 프로그램
 */
public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println((int)s.charAt(0));
    }
}
