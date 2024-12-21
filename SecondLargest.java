
public class SecondLargest {
	public static int findSecondLargest(int n, int[] arr) {
		int mx1,mx2;
		if(arr[0] > arr[1]){
			mx1 = arr[0];
			mx2 = arr[1];
		}
		else{
			mx1 = arr[1];
			mx2 = arr[0];
		}
        
		for(int i = 2; i < arr.length; i++){
			if(mx1 < arr[i]){
				mx2 = mx1;
				mx1 = arr[i];
			}
			if(mx2 < arr[i] && mx1 > arr[i]){
				mx2 = arr[i];
			}

		}
		
		if(mx1 == mx2) return -1;
		
		return mx2;
	}
}