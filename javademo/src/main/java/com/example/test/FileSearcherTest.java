package com.example.test;

import com.example.utils.FileSearcher;

import java.util.ArrayList;
import java.util.List;

public class FileSearcherTest {
    public static void main(String[] paramert) {
        //    在此目录中找文件
        //D:\Program Files\feiq\Recv Files
        String baseDIR = "D:/Program Files/feiq/Recv Files/APP";
        //    找扩展名为txt的文件
        String fileName = "*.exe";
        List resultList = new ArrayList();
        FileSearcher.findFiles(baseDIR, fileName, resultList);
        if (resultList.size() == 0) {
            System.out.println("No File Fount.");
        } else {
            for (int i = 0; i < resultList.size(); i++) {
                System.out.println(resultList.get(i)+"*****************");//显示查找结果。
            }
        }
    }
}
