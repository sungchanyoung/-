package Heap_Tree;

import java.util.Arrays;
import java.util.Iterator;

public class ex05_버블정렬 {
	public static void main(String[] args) {
		int arr[] = {1,3,4,5,6,7,8,9,10};
		bubbleSort(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	static void swap(int a[],int i ,int j) {
		int tmp =a[i];
		a[i] =a[j];
		a[j] = tmp;
		
	}
	static void bubbleSort(int a[]) {
		for(int i=0; i<a.length; i++ ) {
			for(int j =i +1; j<a.length;j++) {
				if(a[i]> a[j]) {
					swap(a,i,j);
				}
			}
		}
	}
}
