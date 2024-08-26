package Heap_Tree;

import java.util.Arrays;

public class ex07_삽입정렬 {
public static void main(String[] args) {
	int arr[] = {1,3,4,5,6,0,8,9,10};
	insertSort(arr);
}
	static void insertSort(int a[]) {
		for(int i =1; i<a.length; i++) {
			int j;
			int tmp=a[i];
			for(j=i; j>0 && a[j-1]> tmp; j--) {
				a[j] =a[j-1];
			}
			a[j] = tmp;
			
			System.out.println(Arrays.toString(a));
		}
	}
}
