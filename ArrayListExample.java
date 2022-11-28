package java_practice;
import java.util.*;

public class ArrayListExample {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	
	ArrayList<Integer> list=new ArrayList<Integer>();
	
	for(int i=0;i<5;i++) {
		list.add(sc.nextInt());
		
	}
	
	for(int i=0;i<5;i++) {
		System.out.println(list.get(i));
	}
	
	System.out.println(list.contains(4));
	
	list.set(0, 99);
	
	list.remove(2);
	
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
}

	
	
}
