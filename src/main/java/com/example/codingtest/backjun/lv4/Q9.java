package com.example.codingtest.backjun.lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9 {
    public static String replace(char[] c){
        char temp = c[0];
        c[0]=c[2];
        c[2]=temp;

        return c[0]+""+c[1]+c[2];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char[] c = st.nextToken().toCharArray();
        char[] d = st.nextToken().toCharArray();

        int i = Integer.parseInt(replace(c));
        int j = Integer.parseInt(replace(d));

        if(i>=j){
            System.out.println(i);
        }else {
            System.out.println(j);
        }
    }
}
