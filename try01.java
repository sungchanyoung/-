package Heap_Tree;

import java.util.Arrays;
import java.util.Iterator;

public class try01 {
	public static void main(String[] args) {
// 정렬 알고리즘은 컴퓨터 순서를 정렬하는 규칙  
//	버블 정렬 : 앞에서 부터 두개씩  바로 자기옆에 있는 애랑 필요에서 
//	작은 값을 앞으로 큰값을 뒤로 바꾸면서 배열에 끝까지 반복해서 정렬하는 방법이다 
//시간의 복잡도 o(n*n) - n*n제곱이다 
	int arr[] = {1,3,4,5,6,7,8,9,10};
	//클래스를 이용하여 버블 정렬  만들기
	bubbleSort(arr);
	System.out.println(Arrays.toString(arr));
	
	}
	static void swap(int a[],int i , int j) {// 매개변수 하나는 배열 나머지 변수 
		//두개의 변수의값을 서로 바꾸고 싶으면 변수 새개로 만들어서  서로 담고 넣고 해야한다 .
		int temp = a[i];
		a[i] =a[j];
		a[j] =temp;
	}
	static void bubbleSort(int a[] ){
		for(int i =0; i<a.length;i++) {
			for(int j =i+1; j<a.length; j++) {
				//j=0으로 설정하면 비교 가 안됨
				if(a[i]> a[j]) {
					swap(a, i, j);
				}
			}
	}
	
	}
}
