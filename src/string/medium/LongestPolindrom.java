package string.medium;

public class LongestPolindrom {
    public static String longestPalindrome(String s) {

        int count=s.length();
        String str;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length()-count+1;j++){
                str=s.substring(j,j+count);
                if(isPolindrom(str)){
                    return str;
                }
            }
            count--;
        }
        return null;
    }

    public static boolean isPolindrom(String str){
        for(int j=0;j<=str.length()/2;j++){
            if(str.charAt(j)!=str.charAt(str.length()-j-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(longestPalindrome("a"));
    }
}
