package com.java.Collection;

import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		/**
		*���׸� �ϴ�?
		ArrayList<Integer> list = new ArrayList(); //������Ʈ Ÿ���� �迭����
		*<Integer>,<String>...���� ������Ÿ���� �Ѱ����� ���Ͻ��� Ÿ���� �Ѱ����� �Ϲ�ȭ ��Ű�°� ���׸��̴�.
		*/
		HashMap<String,String> map = new HashMap<String,String>();   //<String,Integer> Ű, ��� Ÿ���� �޶� �ȴ�.
		map.put("myid","1234"); 
		map.put("asdf","1111");
		map.put("asdf","1234");  //{myid=1234, asdf=1234} -> ������ �ߺ������Ͱ� ��µ�.
		map.put("asdf","6666"); 
		
		//keySet() : Ű�� ��ü�� ��ȯ�Ѵ�.
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		//���ѹݺ��� ���
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key); //myid,asdf key���� ���
		}
		//���� �������
		for(String key : map.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("===================");
		
		
		//values() : values��ü�� ��ȯ�Ѵ�.
	    Collection<String> values = map.values();
	    Iterator<String> itV = values.iterator();
	    
	    while(itV.hasNext()) {
	    	String value = itV.next();
	    	System.out.println(value);
	    }
	    
	    //Ű, ��� ��� ����ϱ�    entrySet() :Map.Entry �� ����ϱ� �����̸� �߿��ϴ�.
	    Set<Map.Entry<String,String>> entry = map.entrySet();  //<Map.Entry<String,String>> : �������̽� �ȿ� �������̽��� ��ӵ� ����
	    Iterator<Map.Entry<String,String>> itE = entry.iterator();
	    
	    //(1.)���ѹݺ��� while������ �����
	    while(itE.hasNext()) {
	    	Map.Entry<String,String> ent = itE.next();
	    	String key = ent.getKey();
	    	String value = ent.getValue();
	    	
	    	System.out.println("[key]: " + key + ", [value]: " + value);
	    }
	    System.out.println("================");
	    
	    //(2.)���� for������ �����
	    for(Map.Entry<String, String> ent : map.entrySet()) {
	    	String key = ent.getKey();
	    	String value = ent.getValue();
	    	System.out.println("[key]: " + key + ", [value]: " + value);
	    }
	    
		
		
//		//map.remove("myid");  //{asdf=1234}���
//		
//		
//		System.out.println(map);
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("���̵� �Է� : ");
//			String id = sc.next();
//			
//			System.out.println("��� �Է� : ");
//			String password = sc.next();
//			
//			//get(key) -> Value�� ��ȯ
//			//get("myid") -> "1234"
//			//containKey(key) -> �������� Ȯ��(true or false)  containKey(key) : Ű�����θ� �� Ȯ��    
//			
//			if(!map.containsKey(id)) {
//				System.out.println("���̵� �߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
//				continue; //���ǹ����� �ٽ� �����ϴ� ����
//			}else {
//				if(!(map.get(id)).equals(password)) {
//					System.out.println("�н����带 �߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
//				}else {
//					System.out.println("�α��� ����");
//					break;
//				}
//			}
//	
//		} while�� ����
		
		
	}//main�� ����

}//class�� ����
