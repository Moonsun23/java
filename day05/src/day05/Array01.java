package day05;

import java.util.Scanner;  
//Scanner scanner = new Scanner(System.in); Scanner가 없어서 Ctrl+space 후 엔터 누르니 위 import가 떴음

public class Array01 {   //배열
	public static void main(String[] args) {
		// array(자바의 어레이는 많이 쓰지않는다)
		// Arraylist / Map 를 많이 쓴다.
		// 순서 매기기					// 순서가 중요한만큼 반복문을 이용하여 처리하기 적합
		// 인덱스(가 중요) 0 부터 시작한다. 
		// 인덱스에 해당하는 데이터가 있다. class01[0]="정진영"; class01[1]="안현우"
		Scanner scanner = new Scanner(System.in);
		int intArray[] = new int[5];
		int max=0;					// 입력한 양수 중 가장 큰 수를 보고싶을 때
		System.out.println("양수 5개를 입력해주세요.");
		for(int i=0; i<5; i++) {
			intArray[i]= scanner.nextInt();  // 내가 입력하고 싶은 값
		//	System.out.println(intArray[i]); // 결과: console에 양수 5개를 입력해주세요. 후 그 아래 양수 5개를 입력할수있다.
		
			if(intArray[i]>max) {
				max=intArray[i];
				
			}
		}
		System.out.println("입력한 숫자 중에 가장큰 숫자는 "+max+"입니다.");
		scanner.close();
		
		
	}
}
