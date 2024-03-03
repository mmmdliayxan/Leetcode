package string.easy;

public class TruncateString {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        String sentence="";
        for(int i=0;i<k;i++){
            sentence+=words[i]+" ";
        }
        return sentence.trim();
    }
}
