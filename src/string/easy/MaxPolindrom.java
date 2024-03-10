package string.easy;

import java.util.ArrayList;
import java.util.List;

public class MaxPolindrom {
    public static String longestPalindrome(String s) {
        List<String> subStrList = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.length()==1){
                subStrList.add(s);
            }
            else{
                for(int j=i+1;j<=s.length();j++){
                    String subStr = s.substring(i,j);
                    subStrList.add(subStr);
                }
            }
        }
        List<String> polindromList = new ArrayList<>();
        for(int i=0;i<subStrList.size();i++){
            String str = subStrList.get(i);
            int count=0;
            for(int j=0;j<=str.length()/2;j++){
                if(str.charAt(j)!=str.charAt(str.length()-j-1)){
                    count++;
                }
            }
            if(count==0){
                polindromList.add(str);
            }
        }
        int max=polindromList.get(0).length();
        String maxStr="";
        for(int i=0;i<polindromList.size();i++){
            int j = polindromList.get(i).length();
            if(j>max){
                max=j;
            }
        }
        for(int i=0;i<polindromList.size();i++){
            int j = polindromList.get(i).length();
            if(j==max){
                maxStr=polindromList.get(i);
            }
        }
        return maxStr;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("a"));
    }
}
