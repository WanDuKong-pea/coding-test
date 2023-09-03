package com.example.codingtest.backjun.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 알파벳 소문자로만 이루어진 단어 s가 주어짐. 각각이 알파벳에 대해
 * 단어에 포함되어 있는 경우 처음 등장하는 위치를 포함되어 있지 않은 경우 -1을 출력
 */
public class Q6{
    public static void main(String[] args) throws IOException {
        //a=97 z=122
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        char[] chars = s.toCharArray();


        for(int i=97; i<123; i++){
            int result = -1;
            for(int j=0; j<chars.length; j++){
                if(chars[j]==i){
                    result = j;
                    break;
                }
            }
            System.out.print(result+" ");
        }
    }
}
