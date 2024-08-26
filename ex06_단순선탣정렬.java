package Heap_Tree;

import java.util.Arrays;

public class ex06_단순선탣정렬 {
public static void main(String[] args) {
	// 단순 선택 정렬 
	int arr[] = {1,3,4,5,6,0,8,9,10};
	selectionSort(arr);
}
	static void swap(int a[],int i ,int j) {
		int tmp =a[i];
		a[i] =a[j];
		a[j] = tmp;

}
	static void selectionSort( int a[]) {
		for(int i = 0; i<a.length-1; i++) {
			int min =i;// 배열의 순번 
			for(int j = i+1; i<a.length+1; j++) {// 최솟값을 구하기 
				if(a[j] < a[min]) min=j;
			}
			swap(a,i,min);
			System.out.println(Arrays.toString(a));
		}
	}
}
