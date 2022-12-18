package java_practice;

public class Targetininfinitearray {

	public static void main(String []args) {
		int arr[]= {12,23,24,34,45,67,88,99,100,203,205,277};
		int target=67;
		System.out.println(ans(arr,target));
		
	}
	static int ans(int[]arr,int target) {
		int start=0;
		int end=1;
		
		while(target>arr[end]) {
			int temp=end+1;
			end=end+(end-start+1);
			start=temp;
		}
		return binarySearch(arr,target,start,end);
	}
	
	
	static int binarySearch(int []arr,int target,int start,int end) {
	
		
		
		while(start<=end) {
			
			int mid=start+(end-start)/2;
			if(target<arr[mid]) {
				end=mid-1;
			}
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else {
			return mid;
			}
			
		}
		
		return -1;
	}
	
	
}
