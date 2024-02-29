package array.easy;

public class NumIdenticalPairs {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(String value : operations){
            if(value.equals("--X")||value.equals("X--")){
                X=X-1;
            }
            else {
                X=X+1;
            }
        }
        return X;

    }
}
