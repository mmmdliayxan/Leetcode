package string.easy;

import java.util.Scanner;

public class FirstOccurence {
    public static int strStr(String haystack, String needle) {

        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            String s= haystack.substring(i,i+needle.length());
            if(s.equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(strStr(s1, s2));
    }
}
