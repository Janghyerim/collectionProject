package com.java.Collection;

import java.util.*;
import java.io.*;

public class PropertiesTest { /**getProperty,setProperty*/

	public static void main(String[] args) { //K,V�� �����ϳ� StringŸ�� �ϳ��ۿ� ������.
		
		//Properties : k -> String , v -> String
//		Properties prop = new Properties();
//		
//		prop.setProperty("myid", "1234");
//		prop.setProperty("asdf", "1111");
//		prop.setProperty("asdf", "1234");  
//		
//		String value = prop.getProperty("myid");  //get- ���� �о�ö� ���
//		System.out.println(value);
//		
//		Enumeration e = prop.propertyNames();
//		          //hasMoreElements() : ���� üũ���ִ� ����
//		while(e.hasMoreElements()) {
//			String element = (String)e.nextElement();  //element : key��
//			String value = prop.getProperty(element);
//			System.out.println(value);  //-> 1234 ������ �ߺ������Ͱ� ��µ�.
//		}
		
		
		// name,data : key / ȫ�浿,1234 : value
		Properties prop = new Properties();
		
		try{
			prop.load(new FileInputStream("input.txt"));
		}catch(IOException e){
			System.out.println("������ ������ �����ϴ�.");
			System.exit(0);  //���α׷� ��������
		}
		
		String name = prop.getProperty("name");  //Hong Kil Dong
		String[] data = prop.getProperty("data").split(","); //�迭�̹Ƿ� [] ���ش�.
		
		int max = 0;
		int min = 0;
		int sum = 0;
		 //�̸����,�ƽ��� ���,�ּҰ����,sum�����,��հ� ���
		
		//���ڿ�->���� : Integer.parseInt(���ڿ�);
		//����->���ڿ� : String.ValueOf(����);
		
		for(int i=0;i<data.length;i++) {
			int value = Integer.parseInt(data[i]);  //Integer.parseInt(data[i]); : String Ÿ���� int�� �ٲ��� �� ���
			if(i==0) {
				max = min = value;
			}
			if(max<value) {
				max = value;
			}else if(min>value) {
				min = value;
			}
//			if(min>value) { //min ���� ���� �����Ͽ� ����� �ȵ�.
//			min = value;
//		    }
			sum += value;
		}
		double avg = (double)sum / data.length;
		
		System.out.println("�̸� : "+name);
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
		System.out.println("�հ� : "+sum);
		System.out.println("��հ� : "+avg);
	}

}
