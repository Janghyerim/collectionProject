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
			return this.ban - tmp.ban;  //오름차순  //0 : 크기가 같은것임 , 양수 : 앞에 값이 큰값임 , 음수 : 뒤에 값이 큰값
			//return tmp.ban - this.ban;  //내림차순
		}
		
		return -1;  // 값이 잘못되었을 때 마이너스로 설정해놓은 것.
	}
	
	


}
