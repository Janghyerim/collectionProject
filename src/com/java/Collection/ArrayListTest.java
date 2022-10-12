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

	public static void main(String[] args) {  //�迭�� �⺻ 10���� �����̳� ���� ���� �� �� ����.
//		ArrayList list = new ArrayList(20);  //Object Ÿ���� �ٲ�� ����ȯ �����ϴ�.
//		list.add("1");  //������������ �ߺ��� ����Ѵ�.
//		list.add("1");
//		list.add(new Integer(1));  //�⺻���� ��Ƽ�� ������ȯ �ϸ� �����ϴ�.
//		list.add(1);
//		list.add(2);
//		list.add("2");
		
//		list.add("1"); //String -> Object ����ȯ�� �߻�
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
		
//		String str = (String)list.get(0);  //Object -> String ĳ���� ���� ����ȯ
//		System.out.println(str);    //1 ���
		
//		int sum = 0;
//		
//		for(Object obj : list) {  //���� ����
//			String str = (String)obj; //ObjectŸ�� �̹Ƿ� ��Ʈ�� Ÿ�� ĳ���� ���ش�.
//			System.out.println(str);    //1 ~ 5���
//			int num = Integer.parseInt(str);  
//			sum += num;
//		}
//		
//		System.out.println("sum = " + sum);  //�� �� ���
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));  //1 ~ 5���
//		}
//		
//		list.remove(3); //�迭[3]����
//		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));  //1,2,3,5���
//		}
//	    
//		list.clear(); //���� ����
//
		
		/**Stack*/
		
//		Stack st = new Stack();
//		
//		st.push("1");
//		st.push("2");
//		st.push("3");
//		//������ ���� �� ���� �޼ҵ� : push
//		//������ �о�� �� ���� �޼ҵ� : pop  & Queue������ poll�̴�.
//		//���� ��ܿ� �����͸� �ѹ� �о�� �� : peek
//		try {
//			System.out.println((String)st.pop()); //�������� �� �����Ͱ� ���� ������ ���� �����̴�.
//			System.out.println((String)st.pop()); 
//			System.out.println((String)st.pop()); //3,2,1
//			System.out.println((String)st.pop()); //���� ���� ������ ��.
//		}catch(EmptyStackException e) {  //���� ����ó�� �ϱ�
//			System.out.println("Stack�� ����ֽ��ϴ�.");
//		}
//		
//		while(!st.empty()) { //������� ������ ��� �϶���
//			System.out.println((String)st.pop());
//		}
		
		
		/**ArrayList*/
		
//		ArrayList list = new ArrayList();
//		
//		list.add("1"); //String -> Object ����ȯ�� �߻�
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		
//		//iterator : �ݺ��� ����
//		
//		Iterator it = list.iterator();
//		
//		while(it.hasNext()) {  //������ ���� ���� Ȯ��
//			String str = (String)it.next(); //���� ��������� ���� : .next(); / ������Ʈ �̹Ƿ� ĳ���õ� ������Ѵ�.
//			System.out.println(str);
//			
//		}
		
		
		/**Generic*/
		
		//���׸� : �÷��� ��ü�� ������ Ÿ���� ������ų �� ����Ѵ�.
//		ArrayList<Integer> list = new ArrayList<Integer>();    //���� ����
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
//		ArrayList<String> list2 = new ArrayList<String>();   //���� ����
//		
//		list2.add("1"); //String -> Object ����ȯ�� �߻�
//		list2.add("2");
//		list2.add("3");
//		list2.add("4");
//		list2.add("5");
//		
//		list2.get(0);  //���ʸ��� ������Ʈ���� String���� �ٲ�Ŵ� ���� <>���� String ������.
//		
//		Iterator<String> it = list2.iterator();  //���ʸ��� ��Ʈ������ ĳ���õ� ������Ѵ�.
//		
//		while(it.hasNext()) {  //������ ���� ���� Ȯ��
//		String str = it.next(); //���� ��������� ���� : .next(); 
//		System.out.println(str);
//		
//	}
		
		/**Set : �ߺ��Ǵ� �����͸� ���� �ʴ´�.*/
		
//		HashSet set = new HashSet();   //String ����
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
		
//		HashSet set = new HashSet();    //Integer ���� ����
//		
//		set.add("1");
//		set.add("2");
//		set.add("1");
//		set.add("4");
//		set.add(new Integer(1));  //��½� 1,2,1,4 ������ ����� �ǳ� �� ������ ���� Ÿ���� ������ ���ڴ� �ϳ��� ���� �ٸ�Ÿ�� ��Ƽ���� �ϳ����� ��µǴ� ���̴�.
//		
//        System.out.println(set);
		
		
		/**������Ÿ�� ��������*/
		
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
//	    	System.out.println(str);         //1,2,4,5 ���
//	    }

		/**������Ÿ�� ������*/
		
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
//	    	System.out.println(str);         //1,2,4,5 ���
//	    }
		
		
		/**Set ������� �����*/
//		//���� ����� ���������� ��µǴ� �� Set�� Ư¡.
//		
//		Set<Integer> set = new HashSet<Integer>();
//		
//		int[][] bingo = new int [5][5];
//		for(int i=0;set.size()<25;i++) {
//			set.add((int)(Math.random()*50) + 1);
//		}		
//		//System.out.println(set);
//		
//		ArrayList list = new ArrayList(set);  //ArrayList : �����ִ� ���� ����� ����.  new ArrayList(set) �������ְ� ���ø���Ʈ �ϱ� ��Ƽ�����ε� ����Ʈ�� ��ȯ-> ��� ����� �� �پ�������.
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
		
		/**TreeSet : ���� ���ĵǾ�����.*/
		//TreeSet : �ݵ�� ������ ���Ǵ� �ش� Ŭ���� �ȿ��� ���������� �������̵� �Ǿ� �־�� �Ѵ�.
		//implements Comparable (Integer, String.......)
//		TreeSet<Integer> set = new TreeSet<Integer>();
//		set.add(new Integer(2));  //���� ��Ʈ���� �̷��� �����.�ϱ�� ���� ��
//		set.add(5);
//		set.add(1);
//		set.add(4);
//		set.add(3);  //1,2,3,4,5���
//		
//		System.out.println(set);
//		
//		Iterator<Integer> it = set.iterator();
//		
//		while(it.hasNext()) {
//	    	Integer intg = it.next();
//	    	System.out.println(intg);   //1,2,3,4,5 ���� ���
//		}
		
		
		/**Student Ŭ����*/
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
