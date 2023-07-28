import java.util.ArrayList;


// PROGRAM TO RETURN THE INDICES IN AN ARRAYLIST DURING SEARCHING


public class linearSearchusingRecursion{
    public static void main(String[] args){
        int[]arr = {4, 2, 3, 4, 5, 4, 4};

        System.out.println(findAllIndex2(arr, 4, 0));
    }
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }

        // this will contain answer for the function call only

        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index +1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}