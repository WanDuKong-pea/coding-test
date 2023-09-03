package com.example.codingtest.backjun.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 영어 대소문자와 공백으로 이루어진 문자열이 주어짐 이문자열에 몇개의 단어가 있을까?
 *
 * 첫줄에 영어 대소문자와 공백으로 이루어진 문자열 주어짐. 이문자열의 길이는 1,000,000을
 * 넘지 않음. 단어는 공백 한개로 구분, 공백이 연속해서 나오는 경우 없음
 */
public class Q8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int cnt =0;
        for(String c : s){
            if(!c.equals("")){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
