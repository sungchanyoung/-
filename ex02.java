package Heap_Tree;

import java.util.Scanner;

public class ex02 {
public static void main(String[] args) {
	/*
	 * 선형 검색과 이진 검색 
	 * 선형 검색 : 요소가 직선 모양으로 늘어선 배열에서 원하는 키값을 갖는 요소를 만날때 까지 
	 */
	int arr[] = {6,4,8,2,3,1};
	Scanner sc= new Scanner(System.in);
	int n =  sc.nextInt();
	int idx = SequenceSearch.sequenceSearch(arr, n);
	if(idx ==-1) {
		System.out.println("존재 하지않는 수");
	}else {
		System.out.println(String.format("%d수는 arr[%d]에존재",n,idx));
	}
}
}
class SequenceSearch{
	//new 메모리 영역에 올려준다 static을 쓰면 new가 필요가 없다
	static int sequenceSearch(int[]a, int key) {
		for(int i =0; i<a.length; i++) {
			if(key ==a[i]) return i;
		}
		return -1;
	}
}