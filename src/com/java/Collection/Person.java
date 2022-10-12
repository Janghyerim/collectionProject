package com.java.Collection;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@AllArgsConstructor
@ToString
@EqualsAndHashCode  //롬복 이것만 달아주면 하기 공식 필요없음.

public class Person {
	String name;
	int age;
	
//	//같은 값을 한번만 출력하고 싶을 때 해쉬코드와 이퀄스 오버라이딩이 필요하다. 
//	@Override   
//	public int hashCode() {
//		return(this.name + this.age).hashCode();
//		}
//
//
//	@Override
//	public boolean equals(Object obj) {
//		Person another = (Person)obj;
//		return this.name.equals(another.name) && this.age == another.age;
//		
//	}
	
}