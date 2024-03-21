package array.easy;

public class PolindromNumber {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        int[] array = new int[100];
        int t=0;
        while(x!=0){
            array[t++]=x%10;
            x=x/10;
        }
        for(int i=0;i<t/2;i++){
            if(array[i]!=array[t-i-1]){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
