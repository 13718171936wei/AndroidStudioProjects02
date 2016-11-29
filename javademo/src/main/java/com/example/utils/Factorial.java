package com.example.utils;

/**
 * Created by 行走的力量 on 2016/11/29.
 */

/**
 * 需求：求1+2!+3!+...+20!的和
 */
public class Factorial {

    public static void main(String[] args) {
        //方式一:循环
        double sum = 0;
        double an = 1;

        for (int i = 0; i < 21; i++) {
            an = 1;
            for (int j = 1; j <= i; j++) {
                an *= j;
            }
            sum += an;
        }

        System.out.println(sum);
        System.out.println(recursion1(20));
    }


    //方式二：递归（推荐方式）
    private static double recursion1(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += recursion2(i);
        }
        return sum;
    }

    static double recursion2(int n) {
        if (n <= 1)
            return 1;
        else
            return n * recursion2(n - 1);
    }
}
