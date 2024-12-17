import java.util.ArrayList;

public class RotateArrayKTimes {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 0 ; i < k ; i++){
            temp.add(arr.get(i));
        }
        int n = arr.size();
        for(int i = k; i < n; i++){
            arr.set(i-k,arr.get(i));
        }
        int j = 0;
        for(int i = n-k; i < n; i++){
            arr.set(i, temp.get(j++));
        }
        return arr;
    }
}