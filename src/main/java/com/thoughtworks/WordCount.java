package com.thoughtworks;

import java.util.*;

public class WordCount {

    public Map<String, Integer> count(String input) {

        Map<String, Integer> countMap = new HashMap<String, Integer>();
        String[] wordArray = input.split("\\s");
        for (String word : wordArray) {
            if (countMap.get(word) != null) {
                countMap.put(word, countMap.get(word) + 1);
            } else {
                countMap.put(word, 1);
            }
        }
        return countMap;
    }

    public String sortMapAndPrint(Map<String, Integer> inputCountMap) {
        String result = "";

        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(inputCountMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> m1, Map.Entry<String, Integer> m2) {
                return m2.getValue() - m1.getValue();
            }
        });
        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i).getKey() + " " + list.get(i).getValue();
            result = result + item + "\n";
        }
        return result;
    }

}
