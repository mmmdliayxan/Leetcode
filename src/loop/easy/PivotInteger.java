package loop.easy;

public class PivotInteger {
    public static int pivotInteger(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
            int sum2=0;
            for(int j=i;j<=n;j++){
                sum2+=j;
            }
            if(sum==sum2){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n =8;
        System.out.println(pivotInteger(n));
    }
}
