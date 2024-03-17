package string.medium;

public class ReverseWords {
    public String reverseWords(String s) {
        String[] reverseString = s.trim().split(" ");
        StringBuilder sb  = new StringBuilder();
        for(int i=reverseString.length-1 ;i>=0;i--){
            if(!(reverseString[i].isEmpty())){
                sb.append(reverseString[i]).append(" ");}
        }
        return sb.toString().trim();
    }
}
