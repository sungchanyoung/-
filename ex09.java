package Heap_Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ex09 {
public static void main(String[] args) {
	int arr[] = {1,6,2,4,9,3};
	List<Integer>list = new ArrayList<>();
	list.add(1);
	list.add(6);
	list.add(2);
	list.add(4);
	list.add(9);
	list.add(3);
	
	//배열 정렬
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	
	//COllections 정렬
	Collections.sort(list);
	Collections.sort(list,Collections.reverseOrder());//

}
}
