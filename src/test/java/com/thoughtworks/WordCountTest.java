package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTest {

    //input: a
    //output: a 1

    @Test
    public void should_get_one_when_input_oneword() throws Exception {
        //given
        String input = "a";
        WordCount wordCount = new WordCount();
        Map<String, Integer> expectCountMap = new HashMap<String, Integer>();
        expectCountMap.put("a", 1);
        //when
        Map<String, Integer> countMap = wordCount.count(input);
        //then
        for (Map.Entry<String, Integer> except : expectCountMap.entrySet()) {
            Integer exceptValue = except.getValue();
            Integer countValue = countMap.get(except.getKey());
            Assert.assertEquals(exceptValue, countValue);
        }
    }


    //input:  a b
    //output:
    //        a 1
    //        b 1
    @Test
    public void should_get_two_when_input_twowords() throws Exception {
        //given
        String input = "a b";
        WordCount wordCount = new WordCount();
        Map<String, Integer> expectCountMap = new HashMap<String, Integer>();
        expectCountMap.put("a", 1);
        expectCountMap.put("b", 1);
        //when
        Map<String, Integer> countMap = wordCount.count(input);
        //then
        for (Map.Entry<String, Integer> except : expectCountMap.entrySet()) {
            Integer exceptValue = except.getValue();
            Integer countValue = countMap.get(except.getKey());
            Assert.assertEquals(exceptValue, countValue);
        }
    }


    //input:  a b b
    //output: a 1
    //        b 2
    @Test
    public void should_get_three_when_input_threewords() throws Exception {
        //given
        String input = "a b b";
        WordCount wordCount = new WordCount();
        Map<String, Integer> expectCountMap = new HashMap<String, Integer>();
        expectCountMap.put("a", 1);
        expectCountMap.put("b", 2);
        //when
        Map<String, Integer> countMap = wordCount.count(input);
        //then
        for (Map.Entry<String, Integer> except : expectCountMap.entrySet()) {
            Integer exceptValue = except.getValue();
            Integer countValue = countMap.get(except.getKey());
            Assert.assertEquals(exceptValue, countValue);
        }
    }


    //input:  a b b
    //output:
    //        b 2
    //        a 1
    @Test
    public void should_get_sortMap_when_input_abb() throws Exception {
        //given
        String input = "a b b";
        String except = "b 2\na 1\n";
        WordCount wordCount = new WordCount();

        //when
        Map<String, Integer> countMap = wordCount.count(input);
        String result = wordCount.sortMapAndPrint(countMap);

        //then
        Assert.assertEquals(except, result);
    }
}
