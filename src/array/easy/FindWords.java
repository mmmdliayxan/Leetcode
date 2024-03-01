package array.easy;

import java.util.ArrayList;
import java.util.List;

public class FindWords {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<words.length;i++){
            if(words[i].contains(String.valueOf(x))){
                list.add(i);
            }
        }
        return list;
    }
}
