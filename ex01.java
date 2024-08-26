package Heap_Tree;
import java.util.*;
public class ex01 {

	public static void main(String[] args) {
		/*
		 * tree 구조 :이진 트리 구조여러개의 노드가 트리 형태로 연결된 구조 
		 * Treeset(중복 허용 하지 않는다 )
		 * 
		 *  Map:<k,v>으로 구성 k=중복 안됨 , v = 중복 허용 ex(로그인 ) 
		 */
		Map<String,Object>map  = new HashMap<>();
		List<Map<String,Object>> list =  new ArrayList<>();
		map.put("no",1);
		map.put("title", "제목");
		map.put("cn","내용1");
		map.put("cn", 1);
		list.add(map);
		map = new HashMap<>();
		map.put("no",2);
		map.put("title", "제목2");
		map.put("cn","내용3");
		map.put("cn", 100);
		
		list.add(map);
		System.out.println(list.toString());
		System.out.println(list.size());
		
		
		for(int i=0; i<list.size(); i++) {
			// 리스트 안에 맵으로 구성 
			Map<String, Object>rs = list.get(i);
			int no = (int)rs.get("no");
			String title = (String)rs.get("title");
			String cn =  (String)rs.get("cn");
			int cnt = (int)rs.get("cnt");
			System.out.printf("번호: %d,제목:%s, 내용:%s,조회수:%d, \n",no,title,cn,cnt);
		}
		
	}

}
