package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();

		// add() 메소드를 이용한 요소의 저장
		arrList.add(40);
		arrList.add(20);
		arrList.add(30);
		arrList.add(10);

		System.out.println("for 문과 get() 메소드를 이용한 요소의 출력");
		
		// for 문과 get() 메소드를 이용한 요소의 출력
		for (int i = 0; i < arrList.size(); i++) {
			System.out.print(arrList.get(i) + " ");
		}

		System.out.println("\n\nremove(1) 메소드를 이용한 요소의 제거\n");
		
		// remove() 메소드를 이용한 요소의 제거
		arrList.remove(1);

		System.out.println("Enhanced for 문과 get() 메소드를 이용한 요소의 출력");
		
		// Enhanced for 문과 get() 메소드를 이용한 요소의 출력
		for (int e : arrList) {
			System.out.print(e + " ");
		}

		System.out.println("\n\nCollections.sort() 메소드를 이용한 요소의 정렬");
		
		// Collections.sort() 메소드를 이용한 요소의 정렬
		Collections.sort(arrList);

		System.out.println("\niterator() 메소드와 get() 메소드를 이용한 요소의 출력");
		
		// iterator() 메소드와 get() 메소드를 이용한 요소의 출력
		Iterator<Integer> iter = arrList.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		
		
		System.out.println("\n\nset() 메소드를 이용한 요소의 변경");
		
		// set() 메소드를 이용한 요소의 변경
		arrList.set(0, 20);

		System.out.println("\nEnhanced for");
		for (int e : arrList) {
			System.out.print(e + " ");
		}


		// size() 메소드를 이용한 요소의 총 개수
		System.out.println("\n\n리스트의 크기 : " + arrList.size());
	}

}
