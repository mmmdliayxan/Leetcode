package string.easy;

import java.util.Arrays;

public class SortString {
    public String sortSentence(String s) {
        String[] strArr = s.split(" ");
        int[] array = new int[strArr.length];
        for(int i=0;i<strArr.length;i++){
            array[i]=Integer.parseInt(strArr[i].substring(strArr[i].length()-1));
        }
        Arrays.sort(array);
        StringBuilder sentence= new StringBuilder();
        for(int i=0;i<array.length;i++){
            for(String value:strArr){
                if(array[i]==Integer.parseInt(value.substring(value.length()-1))){
                    if(i<array.length-1){
                        sentence.append(value, 0, value.length() - 1).append(" ");}
                    else{
                        sentence.append(value, 0, value.length() - 1);
                    }
                }
            }
        }
        return sentence.toString();
    }
}
