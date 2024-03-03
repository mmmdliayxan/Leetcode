package string.easy;

import java.util.*;
import java.util.ArrayList;

public class KeyboardRow {
    public String[] findWords(String[] words) {

        char[] first = {'q','w','e','r','t','y','u','i','o','p'};
        char[] second = {'a','s','d','f','g','h','j','k','l'};
        char[] third = {'z','x','c','v','b','n','m'};
        int count1;
        int count2;
        int count3;
        List<String> list = new ArrayList<>();
        for(String value : words){
            count1=0;
            count2=0;
            count3=0;
            for(char ch : value.toLowerCase().toCharArray()){
                for(int i=0;i<first.length;i++){
                    if(ch==first[i]){
                        count1++;
                    }
                }
                for(int i=0;i<second.length;i++){
                    if(ch==second[i]){
                        count2++;
                    }
                }
                for(int i=0;i<third.length;i++){
                    if(ch==third[i]){
                        count3++;
                    }
                }
            }
            if(count1!=0&&count2==0&&count3==0||
                    count1==0&&count2!=0&&count3==0||
                    count1==0&&count2==0&&count3!=0
            ){
                list.add(value);

            }
        }

        String[] array = new String[list.size()];
        list.toArray(array);

        return array;

    }
}
