package string.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestDistinctSubstring {
    public int lengthOfLongestSubstring(String s) {
        int count=s.length();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length()-count+1;j++){
                String str=s.substring(j,j+count);
                if(isDistinct(str)){
                    return str.length();
                }
            }
            count--;
        }
        return 0;
    }
    public boolean isDistinct(String s){
        Map<Character,Integer> map = new HashMap<>();
        for(Character ch : s.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
        }
        for(Character key : map.keySet()){
            if(map.get(key)!=1){
                return false;
            }
        }
        return true;
    }
}
