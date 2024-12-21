// Problem statement
// You have been given an integer array/list 'ARR' of size 'N'. Write a solution to check if it could become non-decreasing by modifying at most 1 element.
// We define an array as non-decreasing, if ARR[i] <= ARR[i + 1] holds for every i (0-based) such that (0 <= i <= N - 2).



public class NonDecreasingArray {
    public static boolean isPossible(int[] arr, int n) {
		// Write your code here.
		int c = 0;
		for(int i = 0; i < arr.length - 1; i++){
			if(arr[i] > arr[i+1]){
				c++;
				if(i - 1 < 0){
					continue;
				}else if(i + 2 >= n){
					continue;
				}
				else{
					if(arr[i+2] < arr[i]){
						if(arr[i+1] > arr[i+2]){
							c++;
							break;
						}else if(arr[i+1] < arr[i-1]){
							c++;
							break;	
						}else{
							continue;
						}
					}else{
						arr[i+1] = arr[i];
					}
					
				}
			}
		}
		if( c > 1 ) return false;
		return true;
	}
}
