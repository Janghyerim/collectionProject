package com.java.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class ArrayListTest {

	public static void main(String[] args) {  //배열은 기본 10으로 설정이나 수기 설정 할 수 있음.
//		ArrayList list = new ArrayList(20);  //Object 타입이 바뀌고 형변환 가능하다.
//		list.add("1");  //참조형변수는 중복을 허용한다.
//		list.add("1");
//		list.add(new Integer(1));  //기본형은 인티저 강제변환 하면 가능하다.
//		list.add(1);
//		list.add(2);
//		list.add("2");
		
//		list.add("1"); //String -> Object 형변환이 발생
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
		
//		String str = (String)list.get(0);  //Object -> String 캐스팅 강제 형변환
//		System.out.println(str);    //1 출력
		
//		int sum = 0;
//		
//		for(Object obj : list) {  //향상된 포문
//			String str = (String)obj; //Object타입 이므로 스트링 타입 캐스팅 해준다.
//			System.out.println(str);    //1 ~ 5출력
//			int num = Integer.parseInt(str);  
//			sum += num;
//		}
//		
//		System.out.println("sum = " + sum);  //총 합 출력
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));  //1 ~ 5출력
//		}
//		
//		list.remove(3); //배열[3]제거
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));  //1,2,3,5출력
//		}
//	    
//		list.clear(); //전부 제거
//
		
		/**Stack*/
		
//		Stack st = new Stack();
//		
//		st.push("1");
//		st.push("2");
//		st.push("3");
//		//데이터 넣을 때 쓰는 메소드 : push
//		//데이터 읽어올 때 쓰는 메소드 : pop  & Queue에서는 poll이다.
//		//가장 상단에 데이터를 한번 읽어올 때 : peek
//		try {
//			System.out.println((String)st.pop()); //마지막에 들어간 데이터가 먼저 나오는 스택 구조이다.
//			System.out.println((String)st.pop()); 
//			System.out.println((String)st.pop()); //3,2,1
//			System.out.println((String)st.pop()); //값이 없어 에러가 남.
//		}catch(EmptyStackException e) {  //에러 예외처리 하기
//			System.out.println("Stack이 비어있습니다.");
//		}
//		
//		while(!st.empty()) { //비어있지 않으면 출력 하란뜻
//			System.out.println((String)st.pop());
//		}
		
		
		/**ArrayList*/
		
//		ArrayList list = new ArrayList();
//		
//		list.add("1"); //String -> Object 형변환이 발생
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		
//		//iterator : 반복자 패턴
//		
//		Iterator it = list.iterator();
//		
//		while(it.hasNext()) {  //데이터 존재 유무 확인
//			String str = (String)it.next(); //값을 가지고오는 역할 : .next(); / 오브젝트 이므로 캐스팅도 해줘야한다.
//			System.out.println(str);
//			
//		}
		
		
		/**Generic*/
		
		//제네릭 : 컬렉션 객체의 데이터 타입을 한정시킬 때 사용한다.
//		ArrayList<Integer> list = new ArrayList<Integer>();    //숫자 버전
//		
//		list.add(1);
//		list.add(2);
//		
//		list.get(0);
//		
//		Iterator<Integer> ir = list.iterator();
//		
//		while(ir.hasNext()) {
//			Integer num = ir.next();
//			System.out.println(num);
//		}
//		
//		ArrayList<String> list2 = new ArrayList<String>();   //문자 버전
//		
//		list2.add("1"); //String -> Object 형변환이 발생
//		list2.add("2");
//		list2.add("3");
//		list2.add("4");
//		list2.add("5");
//		
//		list2.get(0);  //제너릭이 오브젝트에서 String으로 바뀐거다 상위 <>값에 String 지정함.
//		
//		Iterator<String> it = list2.iterator();  //제너릭을 스트링으로 캐스팅도 해줘야한다.
//		
//		while(it.hasNext()) {  //데이터 존재 유무 확인
//		String str = it.next(); //값을 가지고오는 역할 : .next(); 
//		System.out.println(str);
//		
//	}
		
		/**Set : 중복되는 데이터를 받지 않는다.*/
		
//		HashSet set = new HashSet();   //String 버전
//		
//		set.add("1");
//		set.add("2");
//		set.add("3");
//		set.add("4");
//		set.add("5");
//		
//		for(Object obj : set) {
//			String str = (String)obj;
//			System.out.println(str);
//		}
		
//		HashSet set = new HashSet();    //Integer 삽입 버전
//		
//		set.add("1");
//		set.add("2");
//		set.add("1");
//		set.add("4");
//		set.add(new Integer(1));  //출력시 1,2,1,4 데이터 출력이 되나 이 이유는 같은 타입의 동일한 숫자는 하나로 보고 다른타입 인티저와 하나씩만 출력되는 것이다.
//		
//        System.out.println(set);
		
		
		/**데이터타입 미지정시*/
		
//		HashSet set = new HashSet(); 
//		
//		set.add("1");
//		set.add("2");
//		set.add("1");
//		set.add("4");
//		set.add("5");
//		
//	    Iterator it = set.iterator();
//	    
//	    while(it.hasNext()) {
//	    	String str = (String)it.next();
//	    	System.out.println(str);         //1,2,4,5 출력
//	    }

		/**데이터타입 지정시*/
		
//		HashSet<String> set = new HashSet<String>(); 
//		
//		set.add("1");
//		set.add("2");
//		set.add("1");
//		set.add("4");
//		set.add("5");
//		
//	    Iterator<String> it = set.iterator();
//	    
//	    while(it.hasNext()) {
//	    	String str = it.next();
//	    	System.out.println(str);         //1,2,4,5 출력
//	    }
		
		
		/**Set 빙고게임 만들기*/
//		//작은 수대로 위에서부터 출력되는 게 Set의 특징.
//		
//		Set<Integer> set = new HashSet<Integer>();
//		
//		int[][] bingo = new int [5][5];
//		for(int i=0;set.size()<25;i++) {
//			set.add((int)(Math.random()*50) + 1);
//		}		
//		//System.out.println(set);
//		
//		ArrayList list = new ArrayList(set);  //ArrayList : 섞어주는 셔플 기능이 있음.  new ArrayList(set) 삽입해주고 셔플리스트 하기 인티저라인도 리스트로 변환-> 출력 결과는 더 다양해진다.
//		Collections.shuffle(list);
//		
//		Iterator<Integer> it = list.iterator();
//		
//		for(int i=0;i<bingo.length;i++) {
//			for(int j=0;j<bingo[i].length;j++) {
//				bingo[i][j] = it.next();
//			}
//		}
//		
//		for(int i=0;i<bingo.length;i++) {
//			for(int j=0;j<bingo[i].length;j++) {
//				System.out.print(bingo[i][j] + "  ");				
//			}
//			System.out.println();
//		}
		
		/**TreeSet : 값이 정렬되어진다.*/
		//TreeSet : 반드시 값으로 사용되는 해당 클래스 안에는 정렬조건이 오버라이딩 되어 있어야 한다.
		//implements Comparable (Integer, String.......)
//		TreeSet<Integer> set = new TreeSet<Integer>();
//		set.add(new Integer(2));  //원래 인트형은 이렇게 써야함.하기는 생략 본
//		set.add(5);
//		set.add(1);
//		set.add(4);
//		set.add(3);  //1,2,3,4,5출력
//		
//		System.out.println(set);
//		
//		Iterator<Integer> it = set.iterator();
//		
//		while(it.hasNext()) {
//	    	Integer intg = it.next();
//	    	System.out.println(intg);   //1,2,3,4,5 세로 출력
//		}
		
		
		/**Student 클래스*/
		TreeSet<Student> set = new TreeSet<Student>();
		
		Student s1 = new Student("kim",1,1,10,10,10);
		Student s2 = new Student("lee",3,1,10,10,10);
		Student s3 = new Student("jang",6,1,10,10,10);
		Student s4 = new Student("seo",9,1,10,10,10);
		Student s5 = new Student("park",5,1,10,10,10);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Student s = (Student)it.next();
			System.out.println(s.toString());
		}
		
	}

}
