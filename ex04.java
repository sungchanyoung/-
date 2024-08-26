package Heap_Tree;
//binarySearch();
import java.util.Arrays;
import java.util.Scanner;

public class ex04 {
public static void main(String[] args) {
	int arr[] = {5,7,11,15,18,4,29,31,95,70,68,56};
	//정렬 되어 있지 않으면 탐색 안됨 
	// 1.정렬한다 
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	int idx =Arrays.binarySearch(arr, n);
	if(idx ==-1) {
		System.out.println("존재하지 않는 수");
	}else {
		System.out.println(String.format("%d수는 arr[%d]에 존재",n,idx));
	}
}
}
