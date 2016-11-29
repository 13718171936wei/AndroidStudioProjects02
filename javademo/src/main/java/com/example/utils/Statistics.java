package com.example.utils;

/**
 * Created by 行走的力量 on 2016/11/29.
 */


/**
 * 需求:输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 */

import java.util.Scanner;

public class Statistics {

    public static void main(String[] args) {
        int letter = 0;
        int space = 0;
        int digit = 0;
        int other = 0;

        Scanner in = new Scanner(System.in);//输入一个字符串
        System.out.println("请输入一个字符串：");
        String str = in.nextLine();

        char[] ch = str.toCharArray();//字符串转换成字符数组

        //方式一：
//        while (i < str.length()) {
//            if (ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z') {
//                letter++;//统计英文字符个数
//            } else if (ch[i] == '') {
//                space++;//统计空格个数
//            } else if (ch[i] >= '0' && ch[i] <= '9') {
//                digit++;//统计数字个数
//            }else{
//                other++;//统计其他字符个数
//            }
//        }

        //方式二：
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else if (Character.isDigit(ch[i])) {
                digit++;
            } else {
                other++;
            }
        }
        System.out.println("输入的字符串中共有字母：" + letter);
        System.out.println("输入的字符串中共有空格：" + space);
        System.out.println("输入的字符串中共有数字：" + digit);
        System.out.println("输入的字符串中共有其他字符：" + other);
    }
}
