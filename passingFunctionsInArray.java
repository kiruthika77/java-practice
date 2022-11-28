package java_practice;

import java.util.Arrays;

public class passingFunctionsInArray {
  public static void main(String []args) {
	  
	  int [] arr= {1,2,3,4,5};
	  
	  swap(arr,1,3);
	  
	  System.out.println(Arrays.toString(arr));
	  
	  System.out.println(max(arr));
	
	  System.out.println(maxRange(arr,0,3));
  }
  
  static void swap(int []arr,int index1,int index2) {
	  
	  int temp=arr[index1];
	  arr[index1]=arr[index2];
	  arr[index2]=temp;
	  
  }
  
  static int max(int[]arr) {
	  int maxval=arr[0];
	  for(int i=0;i< arr.length;i++) {
		  
		  if(arr[i]>maxval) {
			  maxval=arr[i];
		  }
		  
	  }
	  return maxval;
  }
  

  static int maxRange(int[]arr,int start,int end) {
	  int maxval=arr[start];
	  for(int i=start;i<=end;i++) {
		  
		  if(arr[i]>maxval) {
			  maxval=arr[i];
		  }
		  
	  }
	  return maxval;
  }


}
