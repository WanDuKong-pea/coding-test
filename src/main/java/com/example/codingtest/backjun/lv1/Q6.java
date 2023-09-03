package com.example.codingtest.backjun.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] nums = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(nums);
        if(nums[0]==nums[1] && nums[1]==nums[2]){
            System.out.println(10000+nums[0]*1000);
        } else if (nums[0]==nums[1]) {
            System.out.println(1000+nums[0]*100);
        } else if (nums[0]==nums[2]){
            System.out.println(1000+nums[0]*100);
        } else if (nums[1]==nums[2]){
            System.out.println(1000+nums[1]*100);
        } else {
            System.out.println(nums[2]*100);
        }
    }
}
