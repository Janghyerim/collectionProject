package com.java.Collection;

import java.util.*;
import java.io.*;

public class PropertiesTest { /**getProperty,setProperty*/

	public static void main(String[] args) { //K,V는 동일하나 String타입 하나밖에 못쓴다.
		
		//Properties : k -> String , v -> String
//		Properties prop = new Properties();
//		
//		prop.setProperty("myid", "1234");
//		prop.setProperty("asdf", "1111");
//		prop.setProperty("asdf", "1234");  
//		
//		String value = prop.getProperty("myid");  //get- 값을 읽어올때 사용
//		System.out.println(value);
//		
//		Enumeration e = prop.propertyNames();
//		          //hasMoreElements() : 값을 체크해주는 역할
//		while(e.hasMoreElements()) {
//			String element = (String)e.nextElement();  //element : key값
//			String value = prop.getProperty(element);
//			System.out.println(value);  //-> 1234 마지막 중복데이터가 출력됨.
//		}
		
		
		// name,data : key / 홍길동,1234 : value
		Properties prop = new Properties();
		
		try{
			prop.load(new FileInputStream("input.txt"));
		}catch(IOException e){
			System.out.println("지정한 파일이 없습니다.");
			System.exit(0);  //프로그램 강제종료
		}
		
		String name = prop.getProperty("name");  //Hong Kil Dong
		String[] data = prop.getProperty("data").split(","); //배열이므로 [] 써준다.
		
		int max = 0;
		int min = 0;
		int sum = 0;
		 //이름출력,맥스값 출력,최소값출력,sum값출력,평균값 출력
		
		//문자열->숫자 : Integer.parseInt(문자열);
		//숫자->문자열 : String.ValueOf(숫자);
		
		for(int i=0;i<data.length;i++) {
			int value = Integer.parseInt(data[i]);  //Integer.parseInt(data[i]); : String 타입을 int로 바꿔줄 때 사용
			if(i==0) {
				max = min = value;
			}
			if(max<value) {
				max = value;
			}else if(min>value) {
				min = value;
			}
//			if(min>value) { //min 값은 따로 지정하여 출력이 안됨.
//			min = value;
//		    }
			sum += value;
		}
		double avg = (double)sum / data.length;
		
		System.out.println("이름 : "+name);
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
		System.out.println("합계 : "+sum);
		System.out.println("평균값 : "+avg);
	}

}
