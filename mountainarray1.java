package java_practice;

public class mountainarray {
public static void mani(String[]args) {
	int arr []= {0,1,0};
	int ans= peakIndexInMountainArray(arr);
	System.out.println(ans);
}

static int peakIndexInMountainArray(int[]arr) {
	int start=0;
	int end=arr.length-1;
	while(start<end) {
		int mid=start+(end-start)/2;
		
		if(arr[mid]>arr[mid+1]) {
			//you are in decreasing part of array
			//this may be ans and but we have to look at left
			//this is why end!=mid -1;
			end=mid;
		}
		
		else {
			// you are in ascending part of array
			start=mid+1;
			
		}
	
		//in the end,start==end and points to the largest peak index
		
	}
	return start;
	
}
}
