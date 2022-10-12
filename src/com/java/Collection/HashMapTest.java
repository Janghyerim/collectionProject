package com.java.Collection;

import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		/**
		*제네릭 하다?
		ArrayList<Integer> list = new ArrayList(); //오브젝트 타입의 배열구조
		*<Integer>,<String>...여러 데이터타입을 한가지로 통일시켜 타입을 한가지로 일반화 시키는게 제네릭이다.
		*/
		HashMap<String,String> map = new HashMap<String,String>();   //<String,Integer> 키, 밸류 타입이 달라도 된다.
		map.put("myid","1234"); 
		map.put("asdf","1111");
		map.put("asdf","1234");  //{myid=1234, asdf=1234} -> 마지막 중복데이터가 출력됨.
		map.put("asdf","6666"); 
		
		//keySet() : 키값 전체를 반환한다.
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		//무한반복문 사용
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key); //myid,asdf key값만 출력
		}
		//향상된 포문사용
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("===================");
		
		
		//values() : values전체를 반환한다.
	    Collection<String> values = map.values();
	    Iterator<String> itV = values.iterator();
	    
	    while(itV.hasNext()) {
	    	String value = itV.next();
	    	System.out.println(value);
	    }
	    
	    //키, 밸류 모두 출력하기    entrySet() :Map.Entry 만 기억하기 공식이며 중요하다.
	    Set<Map.Entry<String,String>> entry = map.entrySet();  //<Map.Entry<String,String>> : 인터페이스 안에 인터페이스가 상속된 구조
	    Iterator<Map.Entry<String,String>> itE = entry.iterator();
	    
	    //(1.)무한반복문 while문으로 만들기
	    while(itE.hasNext()) {
	    	Map.Entry<String,String> ent = itE.next();
	    	String key = ent.getKey();
	    	String value = ent.getValue();
	    	
	    	System.out.println("[key]: " + key + ", [value]: " + value);
	    }
	    System.out.println("================");
	    
	    //(2.)향상된 for문으로 만들기
	    for(Map.Entry<String, String> ent : map.entrySet()) {
	    	String key = ent.getKey();
	    	String value = ent.getValue();
	    	System.out.println("[key]: " + key + ", [value]: " + value);
	    }
	    
		
		
//		//map.remove("myid");  //{asdf=1234}출력
//		
//		
//		System.out.println(map);
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("아이디 입력 : ");
//			String id = sc.next();
//			
//			System.out.println("비번 입력 : ");
//			String password = sc.next();
//			
//			//get(key) -> Value값 반환
//			//get("myid") -> "1234"
//			//containKey(key) -> 존재유무 확인(true or false)  containKey(key) : 키값으로만 값 확인    
//			
//			if(!map.containsKey(id)) {
//				System.out.println("아이디를 잘못 입력 하셨습니다. 다시 입력해 주세요.");
//				continue; //조건문에서 다시 실행하는 역할
//			}else {
//				if(!(map.get(id)).equals(password)) {
//					System.out.println("패스워드를 잘못 입력 하셨습니다. 다시 입력해 주세요.");
//				}else {
//					System.out.println("로그인 성공");
//					break;
//				}
//			}
//	
//		} while문 종료
		
		
	}//main문 종료

}//class문 종료
