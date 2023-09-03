package com.example.codingtest.backjun.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 단어 S와 정수 i가 주어졌을 때,
 * S의 i번째 글자를 출력하는 프로그램 작성
 */
public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int i = Integer.parseInt(br.readLine());

        System.out.println(s.charAt(i-1));
    }
}
