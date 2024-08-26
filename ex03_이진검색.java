package Heap_Tree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ex03_이진검색 {
	public static void main(String[] args) {
		int arr[] = {5,7,11,15,18,4,29,31,95,70,68,56};
		//정렬 되어 있지 않으면 탐색 안됨 
		// 1.정렬한다 
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int idx =BinSearch.binSearch(arr, n);
		if(idx ==-1) {
			System.out.println("존재하지 않는 수");
		}else {
			System.out.println(String.format("%d수는 arr[%d]에 존재",n,idx));
		}
		
	}
}

class BinSearch{
	static  int  binSearch(int[] a , int key) {
		int p1 = 0;
		int pr = a.length-1 ;
		do {
			int pc = (p1+pr)/2; //(p1+pr) >>>1
			if(a[pc] == key) return pc;
			else if (a[pc]< key) {
				p1= pc+1;
			}else {
				pr = pc-1;
			}
		} while (p1 <=pr);
		return-1;
	}
}