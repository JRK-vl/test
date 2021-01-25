
public class Main {

    public static int findSecondMax(int[] args){
        int firstMax = 0;
        int secondMax = 0;
        for (int i = 0; i < args.length-1; i++) {
            if (args[i] > firstMax){
                secondMax = firstMax;
                firstMax = args[i];
            }
        }
        return secondMax;
    }

    public static void main (String[] args){

        int[]arr = {1,2,3,4,5};
        System.out.println(findSecondMax(arr));

    }
}
