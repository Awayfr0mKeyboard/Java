package c2_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> s1 = new HashSet<>();		// import 추가
		// s1.add(0, "B");     set 은 순서가 없음, index 번호도 없음.
		s1.add("D");
		s1.add("B");
		s1.add("C");
		
		// 순서 또는 구분자가 존재하지 않기 때문에
		// set 은 중복 저장이 불가능
		boolean isAdd = s1.add("C");
		System.out.println("isAdd : " + isAdd);
		System.out.println(s1);
		
		// 중복 데이터인지 hashCode(); , equals() 비교
		String str1 = new String("최기근");
		String str2 = new String("최기근");
		System.out.println(str1 == str2);
		System.out.println(str1.hashCode());
		// 재정의된 hashCode 에 상관없이 실제 저장된 메모리 주소를 정수로 반환
		System.out.println(System.identityHashCode(str1));
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str2));
		
		// Iterator : Set 의 데이터를 순차적으로 접근하게끔 제공되는 클래스
		Iterator<String> iterator = s1.iterator(); 	// import 추가
		
		// 꺼내올 요소(Token)가 존재하면 true,
		// 더 이상 읽을 요소가 없으면 false
		while(iterator.hasNext()) {
			// set 내부를 순회하면서 데이터를 조작할 때 사용
			String s = iterator.next();
			System.out.print(s + " ");
		} // end while
		
		System.out.println();
		boolean isChecked = s1.contains("B");
		System.out.println("isChecked : " + isChecked);
		
		s1.add("A");
		System.out.println(s1);
		
		System.out.println("==============================");
		HashSet<String> s2 = new HashSet<>();
		s2.add("A");
		s2.add("D");
		s2.add("E");
		System.out.println(s2);
		
		// s1 Set 이 가진 데이터를 저장하고 있는 새로운 Set 생성
		Set<String> s3 = new HashSet<>(s1);
		System.out.println(s3);
		System.out.println(s1 == s3);
		
		// s3 : A B C D
		// s2 : A D E
		// '중복을 제외'한 합집합
		s3.addAll(s2);	// s3 Set 에 s2 의 Set data 추가
		// A B C D E
		System.out.println(s3);
		
		Set<String> s4 = new HashSet<>(s1);
		// s4 : A B C D
		// s2 : A D E
		// 교집합
		s4.retainAll(s2);
		System.out.println("s4 : " + s4);
		
		boolean isDeleted = s1.remove("A");
		System.out.println("isDeleted : " + isDeleted);
		System.out.println(s1);
		
		boolean isEmpty = s1.isEmpty();
		System.out.println("isEmpty : " + isEmpty);
		
		s1.clear(); 	// 전체 삭제
		
		System.out.println(s1.isEmpty());
		
		System.out.println("===============================");
		Set<String> hashSet = new HashSet<>();
		hashSet.add("apple");
		hashSet.add("banana");
		hashSet.add("kiwi");
		hashSet.add("melon");
		System.out.println(hashSet);
		
		for (String s : hashSet) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		// 들어간 순서를 보장하는 Set
		Set<String> linkedSet = new LinkedHashSet<>();
		linkedSet.add("apple");
		linkedSet.add("banana");
		linkedSet.add("kiwi");
		linkedSet.add("melon");
		System.out.println(linkedSet);
		
		hashSet.add(null);
		System.out.println(hashSet);
		hashSet.add(null);
		System.out.println(hashSet);
		
	}

}
