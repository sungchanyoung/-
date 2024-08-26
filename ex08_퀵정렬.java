package Heap_Tree;

import java.util.Arrays;

//퀴정렬 - 제귀 함수 자기 자신함수를 호출
public class ex08_퀵정렬 {
public static void main(String[] args) {
	int arr[] = {1,3,4,5,6,0,8,9,10};
	quickSort(arr,0,arr.length-1);
}
static void swap(int a[],int i ,int j) {
	int tmp =a[i];
	a[i] =a[j];
	a[j] = tmp;
	
}
	static void quickSort(int a[], int l, int r) {
		int pl = l;
		int pr =r;
		int pc = (pl+pr)/2;
		do {
			while(a[pl] < a[pc]) pl++;
			while(a[pl] > a[pc]) pr--;
			
			if(pl <= pr) {
				swap(a, pl++, pr--);
			}
			
			System.out.println(Arrays.toString(a));
		} while (pl<=pr);
		if(l < pr)quickSort(a, l, pr);
		if(r > pl)quickSort(a, pl, r);
		System.out.println(Arrays.toString(a));
	}
}
