package day08;

public class StringTest {
	public static void main(String[] args) {
		String str01=new String("Java");
		String str02=new String("Java Script");
		
		System.out.println(str01.length());
		System.out.println(str02.length());
		System.out.println(str01.contains("J")); // J를 가지고 있는지 없는지.. 대소문자도 구분한다. true/false로 나온다.
													// 연결된 글자를 뜻해서 Jv라고 하면 false
		System.out.println(str02.contains("Java"));
		// 연결하고 싶을 때는?
		System.out.println(str01.concat(str02)); 	// concat이라는.. 000 를 사용한다?
				
		String str03="Java, Oracle, Javascript, Jsp, Spring";
		
		String strList[]= str03.split(",");
		
	//	System.out.println(strList[0]); // 문자로 나눠져있는 것을 위 내용을 활용해 결과로 나올 수 있게 함
		
	//	위 출력문 외 다른 방법
		
		for(String str: strList) {				//for-each문
			System.out.print(str+"/");
		}
		System.out.println();
		
		String jumin ="9012122312345";
		System.out.println(jumin.substring(0)); // 첫번째 글자부터 모두 출력...
		System.out.println(jumin.substring(0,6)); // 첫번째부터 6번째 자리까지 모두 출력
		
		// 90년 12월 12일
		
	//	System.out.println((0,1,2)+"년 "+(0,3,4)+"월 "+(0,4,6)+"일"); 내가 쓴 답
		
		String year=jumin.substring(0,2);
		String month= jumin.substring(2,4);
		String date= jumin.substring(4,6);
		System.out.println(year+"년"+month+"월"+date+"일");
		// 위 선언된 변수에 대입된 것을 추출해내려면 결국 각자 다시 선언을 해줘야 하는듯?????
		// 그래서 먼저 String year는 0에서 2번째까지 숫자이고... 두번째 String month는 2~4번째 숫자이고....
		
		
	}
}
