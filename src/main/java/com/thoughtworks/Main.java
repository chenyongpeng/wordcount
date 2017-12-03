package com.thoughtworks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String filePath = "words.txt";
        File txt = new File(filePath);
        WordCount wordCount = new WordCount();
        Map<String, Integer> countMap = new HashMap<String, Integer>();
        String lineAll = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(txt));
            String line = null;
            while ((line = br.readLine()) != null) {
                lineAll = lineAll + line + " ";
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        countMap = wordCount.count(lineAll.trim());
        String result = wordCount.sortMapAndPrint(countMap);
        System.out.println(result);
    }
}
