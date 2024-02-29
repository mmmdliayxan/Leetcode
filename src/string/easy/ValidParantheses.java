package string.easy;

import java.util.Scanner;
import java.util.Stack;

public class ValidParantheses {
    public static boolean isValid(String s) {

        Stack<Character> characters = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                characters.push(s.charAt(i));
            } else  {
                if(characters.isEmpty()){
                    return false;
                }
                else {
                    char ch = characters.pop();
                    char c = s.charAt(i);
                    if (!((ch == '(' && c == ')') || (ch == '[' && c == ']') || (ch == '{' && c == '}'))) {
                        return false;
                    }
                }
            }
        }
        return characters.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.next();
        System.out.println(isValid(s));
    }
}
