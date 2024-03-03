package string.easy;

public class IsomorphicString {
    public static boolean isIsomorphic(String s, String t) {
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){

                if(s.charAt(j)==s.charAt(i)&&t.charAt(j)!=t.charAt(i)){
                    return false;
                }
                if(s.charAt(j)!=s.charAt(i)&&t.charAt(j)==t.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("bgfh", "baba"));
    }
}
