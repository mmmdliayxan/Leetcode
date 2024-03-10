package array.medium;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> doubleList = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String value : strs){
           char[] chrArr = value.toCharArray();
           Arrays.sort(chrArr);
           String sortedWord= Arrays.toString(chrArr);
            if(!map.containsKey(sortedWord)){
                List<String> valueList= new ArrayList<>();
                valueList.add(value);
                map.put(sortedWord,valueList);
            }
            else{
                map.get(sortedWord).add(value);
            }
        }

        for(String key : map.keySet()){
            doubleList.add(map.get(key));
        }


        return doubleList;

    }
}
