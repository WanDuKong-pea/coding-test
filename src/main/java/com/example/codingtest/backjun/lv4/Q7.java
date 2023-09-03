package com.example.codingtest.backjun.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문자열 s를 입력받은 후 각 문자를 r번 반복해 새 문자열 p를 만든 후 출력
 * 즉 첫번째 문자를 r번 반복, 두번째 문자를 r번 반복하는 식으로 p를 만들면됨.
 */
public class Q7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            char[] chars= s.toCharArray();
            for(char c : chars){
                for(int j=0; j<r;j++){
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
}
