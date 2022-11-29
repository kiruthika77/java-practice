package java_practice;

public class linearsearch {
	public static void main(String[]args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int target=5;
		int ans=linearSearch(arr,target);
		System.out.println(ans);
		
		int start=1,end=7;
		boolean ans2=linearSearch2(arr,target,start,end);
		System.out.println(ans2);
	}
	static int linearSearch(int[]arr,int target){
		if(arr.length==0) {
			return -1;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		
		return -1;
	}
	
	static boolean linearSearch2(int[]arr,int target,int start ,int end){
		
		for(int i=start;i<=end;i++) {
			if(arr[i]==target) {
				return true;
			}
		}
		
		return false;
	}

}
