package com.java.Collection;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Student implements Comparable {
	String name;
	int ban;
	int no;
	int kor,eng,math;
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAvg() {
		return getTotal() / 3.0f;
	}

	@Override
	public int compareTo(Object o) {
		
		if(o instanceof Student) {
			Student tmp = (Student)o;
			return this.ban - tmp.ban;  //��������  //0 : ũ�Ⱑ �������� , ��� : �տ� ���� ū���� , ���� : �ڿ� ���� ū��
			//return tmp.ban - this.ban;  //��������
		}
		
		return -1;  // ���� �߸��Ǿ��� �� ���̳ʽ��� �����س��� ��.
	}
	
	


}